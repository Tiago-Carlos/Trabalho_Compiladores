// Generated from C:/Users/tiago/IdeaProjects/Trabalho Compiladores\par.g4 by ANTLR 4.9.2
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
	 * Visit a parse tree produced by {@link parParser#oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper(parParser.OperContext ctx);
}