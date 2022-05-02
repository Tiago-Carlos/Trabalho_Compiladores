package compiler;

import antlr.parsLexer;
import antlr.parsParser;
import compilador.AntlrToProgram;
import compilador.ExpressionProcessor;
import compilador.Program;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class CompilerApp {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.print("Usage: file name\n");
        }
        else {
            String local = args[0];
            String fileName = local;
            parsParser parser = getParser(fileName);

            // Obter arvore
            ParseTree antlrAST = parser.prog();

            // Cria um visitor que converte a parse tree em program/expresson object
            AntlrToProgram progVisitor = new AntlrToProgram();

            // Passa pela árvore gerada, buscando por erros sintáticos
            Program prog = progVisitor.visit(antlrAST);

            // Se não forem encontrados erros semânticos, passa pros erros semânticos
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

    // Método que executa o lexer e o parser sobre o arquivo de entrada
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
