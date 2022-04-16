package expression;

import antlr.parsBaseVisitor;
import antlr.parsParser;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

public class AntlrToExpression extends parsBaseVisitor<Expression>{

    private List<String> vars; // Stores Variables
    private List<String> semanticErrors;

    public AntlrToExpression(List<String> semanticErrors) {
        vars = new ArrayList<>();
        this.semanticErrors = semanticErrors;
    }

    @Override
    public Expression visitDeclaracaoInt(parsParser.DeclaracaoIntContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;
        String id = ctx.getChild(1).getText();
        // Mantendo uma lista de variaveis para reportar erros
        if (vars.contains(id)) {
            semanticErrors.add("Error: variable " + id + " already declared! (" + line + ", " + column + ")");
        }
        else {
            vars.add(id);
        }
        String type = ctx.getChild(0).getText();
        return new DeclarationInt(id, type);
    }

    @Override
    public Expression visitDeclaracaoFloat(parsParser.DeclaracaoFloatContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;
        String id = ctx.getChild(1).getText();
        // Mantendo uma lista de variaveis para reportar erros
        if (vars.contains(id)) {
            semanticErrors.add("Error: variable " + id + " already declared! (" + line + ", " + column + ")");
        }
        else {
            vars.add(id);
        }
        String type = ctx.getChild(0).getText();
        return new DeclarationFloat(id, type);
    }

    @Override
    public Expression visitDeclaracaoString(parsParser.DeclaracaoStringContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;
        String id = ctx.getChild(1).getText();
        // Mantendo uma lista de variaveis para reportar erros
        if (vars.contains(id)) {
            semanticErrors.add("Error: variable " + id + " already declared! (" + line + ", " + column + ")");
        }
        else {
            vars.add(id);
        }
        String type = ctx.getChild(0).getText();
        return new DeclarationString(id, type);
    }

    @Override
    public Expression visitDeclaracaoBool(parsParser.DeclaracaoBoolContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;
        String id = ctx.getChild(1).getText();
        // Mantendo uma lista de variaveis para reportar erros
        if (vars.contains(id)) {
            semanticErrors.add("Error: variable " + id + " already declared! (" + line + ", " + column + ")");
        }
        else {
            vars.add(id);
        }
        String type = ctx.getChild(0).getText();
        return new DeclarationBool(id, type);
    }

    @Override
    public Expression visitAtribuirNum(parsParser.AtribuirNumContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;
        String id = ctx.getChild(3).getText();
        // Mantendo uma lista de variaveis para reportar erros
        if (!vars.contains(id)) {
            semanticErrors.add("Error: variavel " + id + " nao foi declarada! (" + line + ", " + column + ")");
        }
        else {
            vars.add(id);
        }
        int value = Integer. parseInt(ctx.getChild(1).getText());
        return new AtribuicaoInt(id, value);
    }

    @Override
    public Expression visitAtribuirString(parsParser.AtribuirStringContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;
        String id = ctx.getChild(3).getText();
        // Mantendo uma lista de variaveis para reportar erros
        if (!vars.contains(id)) {
            semanticErrors.add("Error: variavel " + id + " nao foi declarada! (" + line + ", " + column + ")");
        }
        else {
            vars.add(id);
        }
        String value = ctx.getChild(1).getText();
        return new AtribuicaoString(id, value);
    }

    @Override
    public Expression visitAtribuirBool(parsParser.AtribuirBoolContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;
        String id = ctx.getChild(3).getText();
        // Mantendo uma lista de variaveis para reportar erros
        if (!vars.contains(id)) {
            semanticErrors.add("Error: variavel " + id + " nao foi declarada! (" + line + ", " + column + ")");
        }
        else {
            vars.add(id);
        }
        boolean value = Boolean.parseBoolean(ctx.getChild(1).getText());
        return new AtribuicaoBool(id, value);
    }

    @Override
    public Expression visitAtribuirFloat(parsParser.AtribuirFloatContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;
        String id = ctx.getChild(3).getText();
        // Mantendo uma lista de variaveis para reportar erros
        if (!vars.contains(id)) {
            semanticErrors.add("Error: variavel " + id + " nao foi declarada! (" + line + ", " + column + ")");
        }
        else {
            vars.add(id);
        }
        Float value = Float.parseFloat(ctx.getChild(1).getText().replace(",", "."));
        return new AtribuicaoFloat(id, value);
    }

@Override
    public Expression visitAtribuirOperation(parsParser.AtribuirOperationContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;
        String id = ctx.getChild(3).getText();
        // Mantendo uma lista de variaveis para reportar erros
        if (!vars.contains(id)) {
            semanticErrors.add("Error: variavel " + id + " nao foi declarada! (" + line + ", " + column + ")");
        }
        else {
            vars.add(id);
        }
        return new AtribuicaoOperacao(id, visit(ctx.getChild(1)));
    }

    @Override
    public Expression visitAtribuirComparation(parsParser.AtribuirComparationContext ctx) {
        return super.visitAtribuirComparation(ctx);
    }

    @Override
    public Expression visitMaiorQue(parsParser.MaiorQueContext ctx) {
        return super.visitMaiorQue(ctx);
    }

    @Override
    public Expression visitMenorQue(parsParser.MenorQueContext ctx) {
        return super.visitMenorQue(ctx);
    }

    @Override
    public Expression visitMaiorIgual(parsParser.MaiorIgualContext ctx) {
        return super.visitMaiorIgual(ctx);
    }

    @Override
    public Expression visitMenorIgual(parsParser.MenorIgualContext ctx) {
        return super.visitMenorIgual(ctx);
    }

    @Override
    public Expression visitIgual(parsParser.IgualContext ctx) {
        return super.visitIgual(ctx);
    }

    @Override
    public Expression visitDiferente(parsParser.DiferenteContext ctx) {
        return super.visitDiferente(ctx);
    }

    @Override
    public Expression visitAddition(parsParser.AdditionContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new Addition(left, right);
    }

    @Override
    public Expression visitMultiplication(parsParser.MultiplicationContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new Multiplication(left, right);
    }

    @Override
    public Expression visitSubtraction(parsParser.SubtractionContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new Subtraction(left, right);
    }

    @Override
    public Expression visitNumber(parsParser.NumberContext ctx) {
        String numText = ctx.getChild(0).getText();
        int num = Integer.parseInt(numText);
        return new Number(num);
    }

    @Override
    public Expression visitModulo(parsParser.ModuloContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new Modulo(left, right);
    }

    @Override
    public Expression visitDivision(parsParser.DivisionContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new Division(left, right);
    }

    @Override
    public Expression visitID(parsParser.IDContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;

        String id = ctx.getChild(0).getText();
        if (!vars.contains(id)) {
            semanticErrors.add("Error: variable " + id + " not declared (" + line + ", " + column + ")");
        }
        return new Variable(id);
    }
}
