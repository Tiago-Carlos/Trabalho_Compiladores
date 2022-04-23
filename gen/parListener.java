// Generated from /home/tiago/IdeaProjects/Trabalho_Compiladores/par.g4 by ANTLR 4.10.1
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
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link parParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterAddition(parParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link parParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitAddition(parParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link parParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(parParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link parParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(parParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link parParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(parParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link parParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(parParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link parParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterNumber(parParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link parParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitNumber(parParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link parParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterModulo(parParser.ModuloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link parParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitModulo(parParser.ModuloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link parParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterDivision(parParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link parParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitDivision(parParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ID}
	 * labeled alternative in {@link parParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterID(parParser.IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ID}
	 * labeled alternative in {@link parParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitID(parParser.IDContext ctx);
}