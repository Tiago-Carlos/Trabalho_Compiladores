package expression;

import antlr.ExprBaseVisitor;
import antlr.ExprParser;

import java.util.ArrayList;
import java.util.List;

public class AntlrToProgram extends ExprBaseVisitor<Program>{

    public List<String> semanticErrors;

    @Override
    public Program visitProgram(ExprParser.ProgramContext ctx) {
        Program prog = new Program();

        semanticErrors = new ArrayList<>();
        AntlrToExpression exprVisitor = new AntlrToExpression(semanticErrors);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (i == ctx.getChildCount()-1) {
                // Ultimo filho é EOF
            }
            else {
                prog.addExpression(exprVisitor.visit(ctx.getChild(i)));
            }
        }

        return prog;
    }
}
