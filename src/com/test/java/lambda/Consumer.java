package com.test.java.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ankit.goyal This class shows basic use of
 *         {@link java.util.function.Consumer} functional interface
 */
public class Consumer {

	public static void main(String[] args) {

		/**
		 * use of diamond operator to initialize a list
		 */
		final List<String> list = new ArrayList<>();

		/**
		 * adding some value into map
		 */
		list.add("a");
		list.add("b");

		/**
		 * old way of iterating a list using Iterator
		 */
		Iterator<String> iterator = list.iterator();
		if (iterator.hasNext()) {
			System.out.println("Value = " + iterator.next());

		}

		/**
		 * old way of iterating a list using for loop
		 */
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		/**
		 * old way of iterating a list using for enhanced for loop
		 */
		for (String temp : list) {
			System.out.println(temp);
		}

		/**
		 * old way of iterating a list using while loop
		 */
		int j = 0;
		while (j < list.size()) {
			System.out.println(list.get(j));
			j++;
		}

		/**
		 * new way of iterating a map using java lambda expression with type
		 */
		list.forEach((String l) -> System.out.println(l));

		/**
		 * new way of iterating a map using java lambda expression without type
		 */
		list.forEach((l) -> System.out.println(l));

		/**
		 * new way of iterating a map using java lambda expression without type
		 * and bracket
		 */
		list.forEach(l -> System.out.println(l));

		/**
		 * new way of iterating a map using java lambda expression method
		 * reference
		 */
		list.forEach(System.out::println);

	}
}
