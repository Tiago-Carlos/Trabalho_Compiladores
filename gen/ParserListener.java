// Generated from C:/Users/tiago/IdeaProjects/Trabalho Compiladores\Parser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserParser}.
 */
public interface ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserParser#prule}.
	 * @param ctx the parse tree
	 */
	void enterPrule(ParserParser.PruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#prule}.
	 * @param ctx the parse tree
	 */
	void exitPrule(ParserParser.PruleContext ctx);
}