// Generated from C:/Users/tiago/IdeaProjects/Trabalho Compiladores\pars.g4 by ANTLR 4.9.2

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link parsParser}.
 */
public interface parsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link parsParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(parsParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link parsParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(parsParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclaracaoInt}
	 * labeled alternative in {@link parsParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoInt(parsParser.DeclaracaoIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclaracaoInt}
	 * labeled alternative in {@link parsParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoInt(parsParser.DeclaracaoIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclaracaoFloat}
	 * labeled alternative in {@link parsParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoFloat(parsParser.DeclaracaoFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclaracaoFloat}
	 * labeled alternative in {@link parsParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoFloat(parsParser.DeclaracaoFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclaracaoString}
	 * labeled alternative in {@link parsParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoString(parsParser.DeclaracaoStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclaracaoString}
	 * labeled alternative in {@link parsParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoString(parsParser.DeclaracaoStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclaracaoBool}
	 * labeled alternative in {@link parsParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoBool(parsParser.DeclaracaoBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclaracaoBool}
	 * labeled alternative in {@link parsParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoBool(parsParser.DeclaracaoBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtribuirNum}
	 * labeled alternative in {@link parsParser#atri}.
	 * @param ctx the parse tree
	 */
	void enterAtribuirNum(parsParser.AtribuirNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtribuirNum}
	 * labeled alternative in {@link parsParser#atri}.
	 * @param ctx the parse tree
	 */
	void exitAtribuirNum(parsParser.AtribuirNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtribuirString}
	 * labeled alternative in {@link parsParser#atri}.
	 * @param ctx the parse tree
	 */
	void enterAtribuirString(parsParser.AtribuirStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtribuirString}
	 * labeled alternative in {@link parsParser#atri}.
	 * @param ctx the parse tree
	 */
	void exitAtribuirString(parsParser.AtribuirStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtribuirBool}
	 * labeled alternative in {@link parsParser#atri}.
	 * @param ctx the parse tree
	 */
	void enterAtribuirBool(parsParser.AtribuirBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtribuirBool}
	 * labeled alternative in {@link parsParser#atri}.
	 * @param ctx the parse tree
	 */
	void exitAtribuirBool(parsParser.AtribuirBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtribuirFloat}
	 * labeled alternative in {@link parsParser#atri}.
	 * @param ctx the parse tree
	 */
	void enterAtribuirFloat(parsParser.AtribuirFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtribuirFloat}
	 * labeled alternative in {@link parsParser#atri}.
	 * @param ctx the parse tree
	 */
	void exitAtribuirFloat(parsParser.AtribuirFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtribuirComparation}
	 * labeled alternative in {@link parsParser#atri}.
	 * @param ctx the parse tree
	 */
	void enterAtribuirComparation(parsParser.AtribuirComparationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtribuirComparation}
	 * labeled alternative in {@link parsParser#atri}.
	 * @param ctx the parse tree
	 */
	void exitAtribuirComparation(parsParser.AtribuirComparationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtribuirOperation}
	 * labeled alternative in {@link parsParser#atri}.
	 * @param ctx the parse tree
	 */
	void enterAtribuirOperation(parsParser.AtribuirOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtribuirOperation}
	 * labeled alternative in {@link parsParser#atri}.
	 * @param ctx the parse tree
	 */
	void exitAtribuirOperation(parsParser.AtribuirOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MaiorQue}
	 * labeled alternative in {@link parsParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterMaiorQue(parsParser.MaiorQueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MaiorQue}
	 * labeled alternative in {@link parsParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitMaiorQue(parsParser.MaiorQueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MenorQue}
	 * labeled alternative in {@link parsParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterMenorQue(parsParser.MenorQueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MenorQue}
	 * labeled alternative in {@link parsParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitMenorQue(parsParser.MenorQueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MaiorIgual}
	 * labeled alternative in {@link parsParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterMaiorIgual(parsParser.MaiorIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MaiorIgual}
	 * labeled alternative in {@link parsParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitMaiorIgual(parsParser.MaiorIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MenorIgual}
	 * labeled alternative in {@link parsParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterMenorIgual(parsParser.MenorIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MenorIgual}
	 * labeled alternative in {@link parsParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitMenorIgual(parsParser.MenorIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Igual}
	 * labeled alternative in {@link parsParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterIgual(parsParser.IgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Igual}
	 * labeled alternative in {@link parsParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitIgual(parsParser.IgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Diferente}
	 * labeled alternative in {@link parsParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterDiferente(parsParser.DiferenteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Diferente}
	 * labeled alternative in {@link parsParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitDiferente(parsParser.DiferenteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link parsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddition(parsParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link parsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddition(parsParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link parsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(parsParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link parsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(parsParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link parsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(parsParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link parsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(parsParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link parsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(parsParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link parsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(parsParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link parsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterModulo(parsParser.ModuloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link parsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitModulo(parsParser.ModuloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link parsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivision(parsParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link parsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivision(parsParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ID}
	 * labeled alternative in {@link parsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterID(parsParser.IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ID}
	 * labeled alternative in {@link parsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitID(parsParser.IDContext ctx);
}