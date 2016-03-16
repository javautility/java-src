package com.test.java.lambda;

import java.util.ArrayList;
import java.util.List;

public class Predicate {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);

		list1.stream().filter(n -> n > 1).forEach(l -> System.out.println(l));

		list1.forEach(l -> System.out.println(l));
	}
}
