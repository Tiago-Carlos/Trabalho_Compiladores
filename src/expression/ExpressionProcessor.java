package expression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpressionProcessor {
    List<Expression> list;
    public Map<String, Integer> values; // Tabela de símbolos para guardar valores de variáveis

    public ExpressionProcessor(List<Expression> list) {
        this.list = list;
        values = new HashMap<>();
    }

    public List<String> getEvaluationResults() {
        List<String> evaluations = new ArrayList<>();

        for(Expression e : list) {
            if (e instanceof VariableDeclaration) {
                VariableDeclaration decl = (VariableDeclaration) e;
                values.put(decl.id, decl.value);
            }
            else {
                String input = e.toString();
                int result = getEvalResults(e);
                evaluations.add(input + " is " + result);
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
            result = values.get(var.id);
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
        return result;
    }
}
