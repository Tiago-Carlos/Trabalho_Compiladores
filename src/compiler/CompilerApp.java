package compiler;

import antlr.parsLexer;
import antlr.parsParser;
import expression.AntlrToProgram;
import expression.Expression;
import expression.ExpressionProcessor;
import expression.Program;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class CompilerApp {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.print("Usage: file name\n");
        }
        else {
            String local = args[0] + " " +args[1];
            String fileName = local;
            parsParser parser = getParser(fileName);

            ParseTree antlrAST = parser.prog();

            // Cria um visitor pra convertes a parse tree em program/expresson object
            AntlrToProgram progVisitor = new AntlrToProgram();

            Program prog = progVisitor.visit(antlrAST);

            if (progVisitor.semanticErrors.isEmpty()) {
                ExpressionProcessor ep = new ExpressionProcessor(prog.expressions);
                for(String evaluation:ep.getEvaluationResults()) {
                    System.out.println(evaluation);
                }
            }
            else {
                for(String err: progVisitor.semanticErrors) {
                    System.out.println(err);
                }
            }
        }
    }

    private static parsParser getParser(String fileName) {
        parsParser parser = null;
        try {
            CharStream input = CharStreams.fromFileName(fileName);
            parsLexer lexer = new parsLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new parsParser(tokens);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return parser;
    }
}