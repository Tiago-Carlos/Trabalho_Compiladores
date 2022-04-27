package analizador;

import analizador.atribuicao.*;
import analizador.comparacao.*;
import analizador.declaracao.DeclarationBool;
import analizador.declaracao.DeclarationFloat;
import analizador.declaracao.DeclarationInt;
import analizador.declaracao.DeclarationString;
import analizador.expressao.*;

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
        while (this.list.remove(null)) {}
        valuesInt = new HashMap<>();
        valuesBool = new HashMap<>();
        valuesFloat = new HashMap<>();
        valuesString = new HashMap<>();
    }

    public List<String> getEvaluationResults() {
        List<String> evaluations = new ArrayList<>();

        for(Expression e : list) {
            if (e instanceof DeclarationInt decl) {
                System.out.println(" - Declarado INT " + decl.id + " = " + decl.value);
                valuesInt.put(decl.id, decl.value);
            }
            else if (e instanceof DeclarationBool decl) {
                System.out.println(" - Declarado BOOl " + decl.id + " = " + decl.value);
                valuesBool.put(decl.id, decl.value);
            }
            else if (e instanceof DeclarationFloat decl) {
                System.out.println(" - Declarado FLOAT " + decl.id + " = " + decl.value);
                valuesFloat.put(decl.id, decl.value);
            }
            else if (e instanceof DeclarationString decl) {
                System.out.println(" - Declarado STRING " + decl.id + " = " + decl.value);
                valuesString.put(decl.id, decl.value);
            }
            else if ((e instanceof AtribuicaoInt)
                 || (e instanceof AtribuicaoFloat)
                 || (e instanceof AtribuicaoString)
                 || (e instanceof AtribuicaoBool)){
                evaluations.add(getAtriResults(e));
            }
            else if (e instanceof AtribuicaoComparacao add) {
                boolean result = getCompResults(add.getComparacao());
                valuesBool.put(add.getId(), result);
                evaluations.add(e.toString() + ") = " + result);
            }
            else {
                String input = e.toString();
                int result = getEvalResults(e);
                evaluations.add(input + ") = " + result);
            }
        }
        return evaluations;
    }

    private int getEvalResults(Expression e) {
        int result = 0;
        if (e instanceof Number num) {
            result = num.num;
        }
        else if (e instanceof Variable var) {
            result = valuesInt.get(var.id);
        }
        else if (e instanceof Addition add) {
            int left = getEvalResults(add.getLeft());
            int right = getEvalResults(add.getRight());
            result = left+right;
        }
        else if (e instanceof Subtraction add) {
            int left = getEvalResults(add.getLeft());
            int right = getEvalResults(add.getRight());
            result = left-right;
        }
        else if (e instanceof Multiplication add) {
            int left = getEvalResults(add.getLeft());
            int right = getEvalResults(add.getRight());
            result = left*right;
        }
        else if (e instanceof Division add) {
            int left = getEvalResults(add.getLeft());
            int right = getEvalResults(add.getRight());
            result = left/right;
        }
        else if (e instanceof Modulo add) {
            int left = getEvalResults(add.getLeft());
            int right = getEvalResults(add.getRight());
            result = left%right;
        }
        else if (e instanceof AtribuicaoOperacao add) {
            result = getEvalResults(add.getOperacao());
            valuesInt.put(add.getId(), result);
        }
        return result;
    }

    private String getAtriResults(Expression e) {
        String result = "VAZIO";
        if (e instanceof AtribuicaoInt atr) {
            if (valuesInt.containsKey(atr.getId())) {
                int value = valuesInt.remove(atr.getId());
                result = "Int [" + atr.getId() + "] recebeu o valor " + atr.getValue();
                valuesInt.put(atr.getId(), atr.getValue());
            }
            else {
                result = "(linha " + atr.getLine() + ") - ERRO - " + getTipo(atr.getId()) +
                        " [" + atr.getId() + "] nao pode receber o valor " + atr.getValue();
            }
        }
        else if (e instanceof AtribuicaoFloat atr) {
            if (valuesFloat.containsKey(atr.getId())) {
                float value = valuesInt.remove(atr.getId());
                result = "Float [" + atr.getId() + "] recebeu o valor " + atr.getValue();
                valuesFloat.put(atr.getId(), atr.getValue());
            }
            else {
                result = "(linha " + atr.getLine() + ") - ERRO - " + getTipo(atr.getId()) +
                        " [" + atr.getId() + "] nao pode receber o valor " + atr.getValue();
            }
        }
        else if (e instanceof AtribuicaoString atr) {
            if (valuesFloat.containsKey(atr.getId())) {
                String value = valuesString.remove(atr.getId());
                result = "String [" + atr.getId() + "] recebeu o valor " + atr.getValue();
                valuesString.put(atr.getId(), atr.getValue());
            }
            else{
                result = "(linha " + atr.getLine() + ") - ERRO - " + getTipo(atr.getId()) +
                        " [" + atr.getId() + "] nao pode receber o valor " + atr.getValue();
            }
        }
        else if (e instanceof AtribuicaoBool atr) {
            if (valuesBool.containsKey(atr.getId())) {
                Boolean value = valuesBool.remove(atr.getId());
                result = "Bool [" + atr.getId() + "] recebeu o valor " + atr.isValue();
                valuesBool.put(atr.getId(), atr.isValue());
            }
            else {
                result =  "(linha " + atr.getLine() + ") - ERRO - " + getTipo(atr.getId()) + " [" + atr.getId() +
                        "] nao pode receber o valor " + atr.isValue();
            }
        }
        return result;
    }

    private boolean getCompResults(Expression e) {
        boolean result = false;
        if (e instanceof Igual temp) {
            int left = valuesInt.get(temp.getLeft());
            int right = valuesInt.get(temp.getRight());
            result = (left==right);
        }
        else if (e instanceof Diferente temp) {
            int left = valuesInt.get(temp.getLeft());
            int right = valuesInt.get(temp.getRight());
            result = (left!=right);
        }
        else if (e instanceof MaiorQue temp) {
            int left = valuesInt.get(temp.getLeft());
            int right = valuesInt.get(temp.getRight());
            result = (left>right);
        }
        else if (e instanceof MenorQue temp) {
            int left = valuesInt.get(temp.getLeft());
            int right = valuesInt.get(temp.getRight());
            result = (left<right);
        }
        else if (e instanceof MaiorIgual temp) {
            int left = valuesInt.get(temp.getLeft());
            int right = valuesInt.get(temp.getRight());
            result = (left>=right);
        }
        else if (e instanceof MenorIgual temp) {
            int left = valuesInt.get(temp.getLeft());
            int right = valuesInt.get(temp.getRight());
            result = (left<=right);
        }
        return result;
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
