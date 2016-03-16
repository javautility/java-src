package com.test.java.lambda;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ankit.goyal This class shows basic use of
 *         {@link java.util.function.BiConsumer} functional interface
 */

public class BiConsumer {
	public static void main(String[] args) {

		/**
		 * use of diamond operator to initialize a map
		 */
		final Map<Integer, String> map = new HashMap<>();

		/**
		 * putting some value into map
		 */
		map.put(1, "a");
		map.put(2, "b");
		
		/**
		 * old way of iterating a map using Map.Entry
		 */
		for (Map.Entry<Integer, String> entryMap : map.entrySet()) {
			System.out.println("Key = " + entryMap.getKey() + " Value = " + entryMap.getValue());
		}
		
		/**
		 * new way of iterating a map using java lambda expression
		 */
		map.forEach((key, value) -> System.out.println("Key = " + key + " Value = " + value));

	}
}
