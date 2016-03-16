package com.test.java.lambda;

import java.util.ArrayList;
import java.util.List;

public class Consumer {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("a");
		list.add("b");

		list.forEach(l -> System.out.println(l));
		list.forEach((String l) -> System.out.println(l));
		list.forEach((l) -> System.out.println(l));
		list.forEach(System.out::println);

	}

}
