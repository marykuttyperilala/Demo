package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMap {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("kalyan");
		list.add("ajay");
		list.add("vijay");
		list.add("kumar");
		list.add("ravi");
		
		Map map = new HashMap();
		for(int i=0; i<list.size(); i++) {
			map.put(i, list.get(i));
		}
System.out.println(map);
	}
}
