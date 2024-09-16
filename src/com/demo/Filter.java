package com.demo;

import java.util.function.Predicate;

public class Filter {

	public static Predicate<String> nameStartingWithPrefix(String string) {
		// TODO Auto-generated method stub
		return n -> n.startsWith(string);
	}

}
