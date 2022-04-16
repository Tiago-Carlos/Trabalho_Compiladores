package expression;

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
            if (e instanceof DeclarationInt) {
                DeclarationInt decl = (DeclarationInt) e;
                System.out.println(" - Declarado INT " + decl.id + " = " + decl.value);
                valuesInt.put(decl.id, decl.value);
            }
            else if (e instanceof DeclarationBool) {
                DeclarationBool decl = (DeclarationBool) e;
                System.out.println(" - Declarado BOOl " + decl.id + " = " + decl.value);
                valuesBool.put(decl.id, decl.value);
            }
            else if (e instanceof DeclarationFloat) {
                DeclarationFloat decl = (DeclarationFloat) e;
                System.out.println(" - Declarado FLOAT " + decl.id + " = " + decl.value);
                valuesFloat.put(decl.id, decl.value);
            }
            else if (e instanceof DeclarationString) {
                DeclarationString decl = (DeclarationString) e;
                System.out.println(" - Declarado STRING " + decl.id + " = " + decl.value);
                valuesString.put(decl.id, decl.value);
            }
            else if ((e instanceof AtribuicaoInt)
                 || (e instanceof AtribuicaoFloat)
                 || (e instanceof AtribuicaoString)
                 || (e instanceof AtribuicaoBool)){
                evaluations.add(getAtriResults(e));
            }
            else if (e instanceof AtribuicaoComparacao) {
                AtribuicaoComparacao add = (AtribuicaoComparacao) e;
                boolean result = getCompResults(add.comparacao);
                valuesBool.put(add.id, result);
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
        if (e instanceof  Number) {
            Number num = (Number) e;
            result = num.num;
        }
        else if (e instanceof Variable) {
            Variable var = (Variable) e;
            result = valuesInt.get(var.id);
        }
        else if (e instanceof Addition) {
            Addition add = (Addition) e;
            int left = getEvalResults(add.left);
            int right = getEvalResults(add.right);
            result = left+right;
        }
        else if (e instanceof Subtraction) {
            Subtraction add = (Subtraction) e;
            int left = getEvalResults(add.left);
            int right = getEvalResults(add.right);
            result = left-right;
        }
        else if (e instanceof Multiplication) {
            Multiplication add = (Multiplication) e;
            int left = getEvalResults(add.left);
            int right = getEvalResults(add.right);
            result = left*right;
        }
        else if (e instanceof Division) {
            Division add = (Division) e;
            int left = getEvalResults(add.left);
            int right = getEvalResults(add.right);
            result = left/right;
        }
        else if (e instanceof Modulo) {
            Modulo add = (Modulo) e;
            int left = getEvalResults(add.left);
            int right = getEvalResults(add.right);
            result = left%right;
        }
        else if (e instanceof AtribuicaoOperacao) {
            AtribuicaoOperacao add = (AtribuicaoOperacao) e;
            result = getEvalResults(add.operacao);
            valuesInt.put(add.id, result);
        }
        return result;
    }

    private String getAtriResults(Expression e) {
        String result = "VAZIO";
        if (e instanceof AtribuicaoInt atr) {
            result = "Int [" + atr.id + "] recebeu o valor " + atr.value;
            valuesInt.put(atr.id, atr.value);
        }
        else if (e instanceof AtribuicaoFloat atr) {
            result = "Float [" + atr.id + "] recebeu o valor " + atr.value;
            valuesFloat.put(atr.id, atr.value);
        }
        else if (e instanceof AtribuicaoString atr) {
            result = "String [" + atr.id + "] recebeu o valor "+ atr.value;
            valuesString.put(atr.id, atr.value);
        }
        else if (e instanceof AtribuicaoBool atr) {
            result = "Bool [" + atr.id + "] recebeu o valor " + atr.value;
            valuesBool.put(atr.id, atr.value);
        }
        return result;
    }

    private boolean getCompResults(Expression e) {
        boolean result = false;
        if (e instanceof Igual temp) {
            int left = valuesInt.get(temp.left);
            int right = valuesInt.get(temp.right);
            result = (left==right);
        }
        else if (e instanceof Diferente temp) {
            int left = valuesInt.get(temp.left);
            int right = valuesInt.get(temp.right);
            result = (left!=right);
        }
        else if (e instanceof MaiorQue temp) {
            int left = valuesInt.get(temp.left);
            int right = valuesInt.get(temp.right);
            result = (left>right);
        }
        else if (e instanceof MenorQue temp) {
            int left = valuesInt.get(temp.left);
            int right = valuesInt.get(temp.right);
            result = (left<right);
        }
        else if (e instanceof MaiorIgual temp) {
            int left = valuesInt.get(temp.left);
            int right = valuesInt.get(temp.right);
            result = (left>=right);
        }
        else if (e instanceof MenorIgual temp) {
            int left = valuesInt.get(temp.left);
            int right = valuesInt.get(temp.right);
            result = (left<=right);
        }
        return result;
    }
}
