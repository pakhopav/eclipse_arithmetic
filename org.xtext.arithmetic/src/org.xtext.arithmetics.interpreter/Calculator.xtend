/*******************************************************************************
 * Copyright (c) 2015, 2017 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.xtext.arithmetics.interpreter

import com.google.common.collect.ImmutableMap
import com.google.common.collect.Maps
import java.math.BigDecimal
import java.math.RoundingMode
import emf.arithmetics.ArithmeticsPackage

import emf.arithmetics.DeclaredParameter
import emf.arithmetics.Definition
import emf.arithmetics.Div
import emf.arithmetics.Expression
import emf.arithmetics.FunctionCall
import emf.arithmetics.Minus
import emf.arithmetics.Multi
import emf.arithmetics.NumberLiteral
import emf.arithmetics.Plus

/**
 * an interpreter for instances of EClasses of the {@link ArithmeticsPackage}.
 * It internally uses a polymorphic dispatcher to dispatch between the implementations for the different EClasses.
 */
class Calculator {

	def BigDecimal evaluate(Expression obj) {
		return evaluate(obj, ImmutableMap.<String, BigDecimal>of())
	}

	def BigDecimal evaluate(Expression obj, ImmutableMap<String, BigDecimal> values) {
		return internalEvaluate(obj, values)
	}

	def dispatch protected internalEvaluate(NumberLiteral e, ImmutableMap<String, BigDecimal> values) {
		e.value
	}

	/**
	 * @param values the currently known values by name
	 */
	def dispatch protected BigDecimal internalEvaluate(FunctionCall e, ImmutableMap<String, BigDecimal> values) {
		if (e.func instanceof DeclaredParameter) {
			return values.get(e.func.name)
		}
		switch d : e.func {
			Definition: {
				var params = Maps.newHashMap
				for (var int i = 0; i < e.args.size; i++) {
					var declaredParameter = d.args.get(i)
					var evaluate = evaluate(e.args.get(i), values)
					params.put(declaredParameter.getName(), evaluate)
				}
				return evaluate(d.expr, ImmutableMap.copyOf(params))
			}
		}
	}

	def dispatch protected BigDecimal internalEvaluate(Plus plus, ImmutableMap<String, BigDecimal> values) {
		evaluate(plus.left, values) + evaluate(plus.right, values)
	}

	def dispatch protected BigDecimal internalEvaluate(Minus minus, ImmutableMap<String, BigDecimal> values) {
		evaluate(minus.left, values) - evaluate(minus.right, values)
	}

	def dispatch protected BigDecimal internalEvaluate(Div div, ImmutableMap<String, BigDecimal> values) {
		evaluate(div.left, values).divide(evaluate(div.right, values), 20, RoundingMode.HALF_UP)
	}

	def dispatch protected BigDecimal internalEvaluate(Multi multi, ImmutableMap<String, BigDecimal> values) {
		evaluate(multi.left, values) * evaluate(multi.right, values)
	}
}
