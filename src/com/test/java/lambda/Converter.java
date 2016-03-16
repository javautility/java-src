package com.test.java.lambda;

import java.util.function.BiFunction;

public class Converter {
	public static void main(String[] args) {

		Converter calculator = new Converter();
		int result = calculator.calc((a, b) -> (a * b), 3, 5);

		System.out.println(result);
	}

	public int calc(BiFunction<Integer, Integer, Integer> bi, Integer i1, Integer i2) {
		return bi.apply(i1, i2);
	}
}
