/*
 * generated by Xtext 2.22.0
 */
package org.xtext.arithmetic.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ArithmeticAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/arithmetic/parser/antlr/internal/InternalArithmetic.tokens");
	}
}
