package com.demo;

import java.util.function.Function;

public class Mapper {

	public static Function<String,CharactersCount> getDistinctCharactersCount() {
		// TODO Auto-generated method stub
		return s -> new CharactersCount(s, (int)s.chars().distinct().count());
	}

}
