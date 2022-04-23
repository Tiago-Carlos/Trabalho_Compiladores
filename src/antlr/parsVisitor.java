// Generated from /home/tiago/IdeaProjects/Trabalho_Compiladores/pars.g4 by ANTLR 4.10.1

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link parsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface parsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link parsParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(parsParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclaracaoInt}
	 * labeled alternative in {@link parsParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoInt(parsParser.DeclaracaoIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclaracaoFloat}
	 * labeled alternative in {@link parsParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoFloat(parsParser.DeclaracaoFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclaracaoString}
	 * labeled alternative in {@link parsParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoString(parsParser.DeclaracaoStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclaracaoBool}
	 * labeled alternative in {@link parsParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoBool(parsParser.DeclaracaoBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtribuirNum}
	 * labeled alternative in {@link parsParser#atri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuirNum(parsParser.AtribuirNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtribuirString}
	 * labeled alternative in {@link parsParser#atri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuirString(parsParser.AtribuirStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtribuirBool}
	 * labeled alternative in {@link parsParser#atri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuirBool(parsParser.AtribuirBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtribuirFloat}
	 * labeled alternative in {@link parsParser#atri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuirFloat(parsParser.AtribuirFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtribuirComparation}
	 * labeled alternative in {@link parsParser#atri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuirComparation(parsParser.AtribuirComparationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtribuirOperation}
	 * labeled alternative in {@link parsParser#atri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuirOperation(parsParser.AtribuirOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MaiorQue}
	 * labeled alternative in {@link parsParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaiorQue(parsParser.MaiorQueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MenorQue}
	 * labeled alternative in {@link parsParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenorQue(parsParser.MenorQueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MaiorIgual}
	 * labeled alternative in {@link parsParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaiorIgual(parsParser.MaiorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MenorIgual}
	 * labeled alternative in {@link parsParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenorIgual(parsParser.MenorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Igual}
	 * labeled alternative in {@link parsParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgual(parsParser.IgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Diferente}
	 * labeled alternative in {@link parsParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiferente(parsParser.DiferenteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link parsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(parsParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link parsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(parsParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link parsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(parsParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link parsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(parsParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link parsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulo(parsParser.ModuloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link parsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(parsParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ID}
	 * labeled alternative in {@link parsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitID(parsParser.IDContext ctx);
}