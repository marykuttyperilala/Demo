package com.demo;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
	
	public static void findDupChar() {
		//with two set object
		String str = "abcdeac";
		char[] c = str.toCharArray();
		int len = c.length;
		
		Set<Character> set = new HashSet<>();
		Set<Character> dup = new HashSet<>();
		for(int i=0;i<len; i++) {
			if(set.contains(c[i]))
				dup.add(c[i]);
			set.add(c[i]);
		}
		System.out.println(dup);
	}
	
	public static void findDupChars() {
		//with a single set object
		String str = "abcdeac";
		char[] c = str.toCharArray();
		int len = c.length;
		
		Set<Character> set = new HashSet<>();
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(c[i]==c[j]) {
					set.add(c[j]);
					break;
				}
			}
		}
		System.out.println(set);
		
	}
	public static void main(String[] args) {
		findDupChar();
		findDupChars();
	}

}
