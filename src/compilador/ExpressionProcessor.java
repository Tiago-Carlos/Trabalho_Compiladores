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
                valuesBool.remove(add.getId());
                valuesBool.put(add.getId(), result);
                evaluations.add(e.toString() + ") = " + result);
            }
            else {
                String input = e.toString();
                float result = getEvalResults(e);
                evaluations.add(input + ") = " + result);
            }
        }
        return evaluations;
    }

    private float getEvalResults(Expression e) {
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
                result = 0;
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
            result = left%right;
        }
        else if (e instanceof AtribuicaoOperacao add) {
            result = getEvalResults(add.getOperacao());
            if (valuesInt.containsKey(add.getId())) {
                valuesInt.put(add.getId(), Math.round(result));
            }
            else {
                valuesFloat.remove(add.getId());
                valuesFloat.put(add.getId(), result);
            }
        }
        return result;
    }

    private String getAtriResults(Expression e) {
        String result = "VAZIO";
        if (e instanceof AtribuicaoInt atr) {
            if (valuesInt.containsKey(atr.getId())) {
                valuesInt.remove(atr.getId());
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
                valuesFloat.remove(atr.getId());
                result = "Float [" + atr.getId() + "] recebeu o valor " + atr.getValue();
                valuesFloat.put(atr.getId(), atr.getValue());
            }
            else {
                result = "(linha " + atr.getLine() + ") - ERRO - " + getTipo(atr.getId()) +
                        " [" + atr.getId() + "] nao pode receber o valor " + atr.getValue();
            }
        }
        else if (e instanceof AtribuicaoString atr) {
            if (valuesString.containsKey(atr.getId())) {
                valuesString.remove(atr.getId());
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
                valuesBool.remove(atr.getId());
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
            float left;
            float right;
            if (valuesInt.containsKey(temp.getLeft())) {
                left = valuesInt.get(temp.getLeft());
            }
            else {
                left = valuesFloat.get(temp.getLeft());
            }
            if (valuesInt.containsKey(temp.getRight())) {
                right = valuesInt.get(temp.getRight());
            }
            else {
                right = valuesFloat.get(temp.getRight());
            }
            result = (left==right);
        }
        else if (e instanceof Diferente temp) {
            float left;
            float right;
            if (valuesInt.containsKey(temp.getLeft())) {
                left = valuesInt.get(temp.getLeft());
            }
            else {
                left = valuesFloat.get(temp.getLeft());
            }
            if (valuesInt.containsKey(temp.getRight())) {
                right = valuesInt.get(temp.getRight());
            }
            else {
                right = valuesFloat.get(temp.getRight());
            }
            result = (left!=right);
        }
        else if (e instanceof MaiorQue temp) {
            float left;
            float right;
            if (valuesInt.containsKey(temp.getLeft())) {
                left = valuesInt.get(temp.getLeft());
            }
            else {
                left = valuesFloat.get(temp.getLeft());
            }
            if (valuesInt.containsKey(temp.getRight())) {
                right = valuesInt.get(temp.getRight());
            }
            else {
                right = valuesFloat.get(temp.getRight());
            }
            result = (left>right);
        }
        else if (e instanceof MenorQue temp) {
            float left;
            float right;
            if (valuesInt.containsKey(temp.getLeft())) {
                left = valuesInt.get(temp.getLeft());
            }
            else {
                left = valuesFloat.get(temp.getLeft());
            }
            if (valuesInt.containsKey(temp.getRight())) {
                right = valuesInt.get(temp.getRight());
            }
            else {
                right = valuesFloat.get(temp.getRight());
            }
            result = (left<right);
        }
        else if (e instanceof MaiorIgual temp) {
            float left;
            float right;
            if (valuesInt.containsKey(temp.getLeft())) {
                left = valuesInt.get(temp.getLeft());
            }
            else {
                left = valuesFloat.get(temp.getLeft());
            }
            if (valuesInt.containsKey(temp.getRight())) {
                right = valuesInt.get(temp.getRight());
            }
            else {
                right = valuesFloat.get(temp.getRight());
            }
            result = (left>=right);
        }
        else if (e instanceof MenorIgual temp) {
            float left;
            float right;
            if (valuesInt.containsKey(temp.getLeft())) {
                left = valuesInt.get(temp.getLeft());
            }
            else {
                left = valuesFloat.get(temp.getLeft());
            }
            if (valuesInt.containsKey(temp.getRight())) {
                right = valuesInt.get(temp.getRight());
            }
            else {
                right = valuesFloat.get(temp.getRight());
            }
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
