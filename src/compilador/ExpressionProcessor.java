package compilador;

import compilador.atribuicao.*;
import compilador.comparacao.*;
import compilador.declaracao.DeclarationBool;
import compilador.declaracao.DeclarationFloat;
import compilador.declaracao.DeclarationInt;
import compilador.declaracao.DeclarationString;
import compilador.expressao.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpressionProcessor {
    List<Expression> list;
    public Map<String, Integer> valuesInt; // Tabela de símbolos para guardar valores de variáveis
    public Map<String, Boolean> valuesBool;
    public Map<String, Float> valuesFloat;
    public Map<String, String> valuesString;
    public ExpressionProcessor(List<Expression> list) {
        this.list = new ArrayList<>(list);
        //while (this.list.remove(null)) {}
        valuesInt = new HashMap<>();
        valuesBool = new HashMap<>();
        valuesFloat = new HashMap<>();
        valuesString = new HashMap<>();
    }

    public List<String> getEvaluationResults() {
        List<String> evaluations = new ArrayList<>();
        for(Expression e : list) {
            if (e == null) {
                // Aqui só vai entrar linhas com erro de etapas anteriores, e as linhas :DECLARACAO e :ATRIBUICAO
            }
            else if (e instanceof DeclarationInt decl) {
                System.out.println("Declarado INT " + decl.id);
                valuesInt.put(decl.id, decl.value);
            }
            else if (e instanceof DeclarationBool decl) {
                System.out.println("Declarado BOOL " + decl.id);
                valuesBool.put(decl.id, decl.value);
            }
            else if (e instanceof DeclarationFloat decl) {
                System.out.println("Declarado FLOAT " + decl.id);
                valuesFloat.put(decl.id, decl.value);
            }
            else if (e instanceof DeclarationString decl) {
                System.out.println("Declarado STRING " + decl.id);
                valuesString.put(decl.id, decl.value);
            }
            else if ((e instanceof AtribuicaoInt)
                 || (e instanceof AtribuicaoFloat)
                 || (e instanceof AtribuicaoString)
                 || (e instanceof AtribuicaoBool)){
                evaluations.add(getAtriResults(e));
            }
            else if (e instanceof AtribuicaoComparacao add) {
                if (valuesBool.containsKey(add.getId())) {
                    try {
                        boolean result = getCompResults((Comparacao) add.getComparacao());
                        //valuesBool.remove(add.getId());
                        //valuesBool.put(add.getId(), result);
                        evaluations.add("(bool)    " + e);
                    }
                    catch (Exception err) {
                        evaluations.add(err.getMessage());
                    }
                }
                else {
                    evaluations.add((char)27 + "[31m"+"(linha " + add.getLine() + ") - ERRO - Operação ilegal - " + add.getId()
                            + "é do tipo"  + getTipo(add.getId())  + (char)27 + "[00;00m");
                }
            }
            else if (e instanceof AtribuicaoOperacao add) {
                if (valuesInt.containsKey(add.getId())) {
                    try  {
                        float result = getEvalResults(add.getOperacao());
                        evaluations.add("(integer) " + add);
                        //valuesInt.remove(add.getId());
                        //valuesInt.put(add.getId(), Math.round(result));
                    }
                    catch (Exception err) {
                        evaluations.add(err.getMessage());
                    }
                }
                else if (valuesFloat.containsKey(add.getId())) {
                    try  {
                        float result = getEvalResults(add.getOperacao());
                        evaluations.add("(float)   " + add);
                        //valuesFloat.remove(add.getId());
                        //valuesFloat.put(add.getId(), result);
                    }
                    catch (Exception err) {
                        evaluations.add(err.getMessage());
                    }
                }
                else {
                    evaluations.add((char)27 + "[31m"+"(linha " + add.getLine() + ") - ERRO - Operação ilegal - " + add.getId()
                            + " é do tipo "  + getTipo(add.getId()) +  (char)27 + "[00;00m");
                }
            }
        }
        return evaluations;
    }

    private float getEvalResults(Expression e) throws Exception {
        float result = 0;
        if (e instanceof Number num) {
            result = num.num;
        }
        else if (e instanceof Variable var) {
            if (valuesInt.containsKey(var.id)) {
                result = valuesInt.get(var.id);
            }
            else if (valuesFloat.containsKey(var.id)){
                result = valuesFloat.get(var.id);
            }
            else {
                throw new Exception((char)27 + "[31m"+"(linha " + var.getLine() + ") - ERRO - Operação ilegal - " + var.getId()
                        + " é do tipo " + getTipo(var.getId())  + (char)27 + "[00;00m");
            }
        }
        else if (e instanceof Addition add) {
            float left = getEvalResults(add.getLeft());
            float right = getEvalResults(add.getRight());
            result = left+right;
        }
        else if (e instanceof Subtraction add) {
            float left = getEvalResults(add.getLeft());
            float right = getEvalResults(add.getRight());
            result = left-right;
        }
        else if (e instanceof Multiplication add) {
            float left = getEvalResults(add.getLeft());
            float right = getEvalResults(add.getRight());
            result = left*right;
        }
        else if (e instanceof Division add) {
            float left = getEvalResults(add.getLeft());
            float right = getEvalResults(add.getRight());
            result = left/right;
        }
        else if (e instanceof Modulo add) {
            float left = getEvalResults(add.getLeft());
            float right = getEvalResults(add.getRight());
            result = left % right;
        }
        return result;
    }

    private String getAtriResults(Expression e) {
        String result = "VAZIO";
        if (e instanceof AtribuicaoInt atr) {
            if (valuesInt.containsKey(atr.getId())) {
                //valuesInt.remove(atr.getId());
                result = "(integer) [" + atr.getId() + "] recebeu o valor " + atr.getValue();
                //valuesInt.put(atr.getId(), atr.getValue());
            }
            else {
                result = (char)27 + "[31m" +"(linha " + atr.getLine() + ") - ERRO - " + getTipo(atr.getId()) +
                        " [" + atr.getId() + "] nao pode receber o valor " + atr.getValue() + (char)27 + "[00;00m";
            }
        }
        else if (e instanceof AtribuicaoFloat atr) {
            if (valuesFloat.containsKey(atr.getId())) {
                //valuesFloat.remove(atr.getId());
                result = "(float)   [" + atr.getId() + "] recebeu o valor " + atr.getValue();
                //valuesFloat.put(atr.getId(), atr.getValue());
            }
            else {
                result = (char)27 + "[31m" + "(linha " + atr.getLine() + ") - ERRO - " + getTipo(atr.getId()) +
                        " [" + atr.getId() + "] nao pode receber o valor " + atr.getValue() + (char)27 + "[00;00m";
            }
        }
        else if (e instanceof AtribuicaoString atr) {
            if (valuesString.containsKey(atr.getId())) {
                //valuesString.remove(atr.getId());
                result = "(string)  [" + atr.getId() + "] recebeu o valor " + atr.getValue();
                //valuesString.put(atr.getId(), atr.getValue());
            }
            else{
                result = (char)27 + "[31m" + "(linha " + atr.getLine() + ") - ERRO - " + getTipo(atr.getId()) +
                        " [" + atr.getId() + "] nao pode receber o valor " + atr.getValue() + (char)27 + "[00;00m";
            }
        }
        else if (e instanceof AtribuicaoBool atr) {
            if (valuesBool.containsKey(atr.getId())) {
                //valuesBool.remove(atr.getId());
                result = "(bool)    [" + atr.getId() + "] recebeu o valor " + atr.isValue();
                //valuesBool.put(atr.getId(), atr.isValue());
            }
            else {
                result = (char)27 + "[31m" + "(linha " + atr.getLine() + ") - ERRO - " + getTipo(atr.getId()) + " [" + atr.getId() +
                        "] nao pode receber o valor " + atr.isValue() + (char)27 + "[00;00m";
            }
        }
        return result;
    }

    private boolean getCompResults(Comparacao e) throws Exception {
        float left;
        float right;
        if (valuesInt.containsKey(e.getLeft())) {
            left = valuesInt.get(e.getLeft());
        }
        else if (valuesFloat.containsKey(e.getLeft())) {
            left = valuesInt.get(e.getLeft());
        }
        else {
            throw new Exception((char)27 + "[31m"+"(linha " + e.getLine() + ") - ERRO - Operação ilegal - " + e.getLeft()
                    + " é do tipo " + getTipo(e.getLeft()) + (char)27 + "[00;00m");
        }
        if (valuesInt.containsKey(e.getRight())) {
            right = valuesInt.get(e.getRight());
        }
        else if (valuesFloat.containsKey(e.getRight())) {
            right = valuesFloat.get(e.getRight());
        }
        else {
            throw new Exception((char)27 + "[31m"+"(linha " + e.getLine() + ") - ERRO - Operação ilegal - " + e.getRight()
                    + " é do tipo " + getTipo(e.getRight())  + (char)27 + "[00;00m");
        }
        if (e instanceof Igual) {
            return (left==right);
        }
        else if (e instanceof Diferente) {
            return (left!=right);
        }
        else if (e instanceof MaiorQue) {
            return (left>right);
        }
        else if (e instanceof MenorQue) {
            return (left<right);
        }
        else if (e instanceof MaiorIgual) {
            return (left>=right);
        }
        else if (e instanceof MenorIgual) {
            return (left<=right);
        }
        return false;
    }

    private String getTipo(String id) {
        String ret = "";
        if (valuesInt.containsKey(id)) {
            ret = "int";
        }
        else if (valuesFloat.containsKey(id)){
            ret = "float";
        }
        else if (valuesBool.containsKey(id)) {
            ret = "bool";
        }
        else {
            ret = "string";
        }
        return ret;
    }
}
