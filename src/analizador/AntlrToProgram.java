package analizador;

import antlr.parsBaseVisitor;
import antlr.parsParser;

import java.util.ArrayList;
import java.util.List;

public class AntlrToProgram extends parsBaseVisitor<Program>{

    public List<String> semanticErrors;

    @Override
    public Program visitProgram(parsParser.ProgramContext ctx) {
        Program prog = new Program();

        semanticErrors = new ArrayList<>();
        AntlrToExpression parsVisitor = new AntlrToExpression(semanticErrors);
        for (int i = 0; i < ctx.getChildCount(); i++) {
                prog.addExpression(parsVisitor.visit(ctx.getChild(i)));
        }

        return prog;
    }
}
