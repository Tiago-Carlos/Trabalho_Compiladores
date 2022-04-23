// Generated from /home/tiago/IdeaProjects/Trabalho_Compiladores/par.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link parParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface parVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link parParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(parParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link parParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(parParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link parParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(parParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link parParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(parParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link parParser#oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(parParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link parParser#oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(parParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link parParser#oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(parParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link parParser#oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(parParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link parParser#oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulo(parParser.ModuloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link parParser#oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(parParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ID}
	 * labeled alternative in {@link parParser#oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitID(parParser.IDContext ctx);
}