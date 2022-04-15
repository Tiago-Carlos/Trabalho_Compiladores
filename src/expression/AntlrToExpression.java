package expression;

import antlr.ExprBaseVisitor;
import antlr.ExprParser;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

public class AntlrToExpression extends ExprBaseVisitor<Expression>{

    private List<String> vars; // Stores Variables
    private List<String> semanticErrors;

    public AntlrToExpression(List<String> semanticErrors) {
        vars = new ArrayList<>();
        this.semanticErrors = semanticErrors;
    }

    @Override
    public Expression visitDeclaration(ExprParser.DeclarationContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();
        // Mantendo uma lista de variaveis para reportar erros
        if (vars.contains(id)) {
            semanticErrors.add("Error: variable " + id + " already declared! (" + line + ", " + column + ")");
        }
        else {
            vars.add(id);
        }
        String type = ctx.getChild(2).getText();
        int value = Integer.parseInt(ctx.NUM().getText());
        return new VariableDeclaration(id, type, value);
    }

    @Override
    public Expression visitVariable(ExprParser.VariableContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;

        String id = ctx.getChild(0).getText();
        if (!vars.contains(id)) {
            semanticErrors.add("Error: variable " + id + " not declared (" + line + ", " + column + ")");
        }
        return new Variable(id);
    }

    @Override
    public Expression visitNumber(ExprParser.NumberContext ctx) {
        String numText = ctx.getChild(0).getText();
        int num = Integer.parseInt(numText);
        return new Number(num);
    }

    @Override
    public Expression visitMultiplication(ExprParser.MultiplicationContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new Multiplication(left, right);
    }

    @Override
    public Expression visitAddition(ExprParser.AdditionContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new Addition(left, right);
    }

    @Override
    public Expression visitDivision(ExprParser.DivisionContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new Division(left, right);
    }

    @Override
    public Expression visitModule(ExprParser.ModuleContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new Modulo(left, right);
    }
}
