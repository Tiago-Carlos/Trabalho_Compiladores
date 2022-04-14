// Generated from C:/Users/tiago/IdeaProjects/Trabalho Compiladores/src/antlr\par.g4 by ANTLR 4.9.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link parParser}.
 */
public interface parListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link parParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(parParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link parParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(parParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link parParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(parParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link parParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(parParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link parParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(parParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link parParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(parParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link parParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(parParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link parParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(parParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link parParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterOper(parParser.OperContext ctx);
	/**
	 * Exit a parse tree produced by {@link parParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitOper(parParser.OperContext ctx);
}