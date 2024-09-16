package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeftRotation {
	
	public static void rotaiton() {
		
	//integer array
		int[] intArray = {1,2,3,4,5};
		// rotate with 2 positions
		int len = intArray.length;
		
		for(int i=0; i<2; i++) {
			int j, temp;
			temp = intArray[0];
			for(j = 0; j< len-1; j++) {
				intArray[j] = intArray[j+1];
			}
			intArray[j]=temp;
		}
		
		for(int x : intArray) {
			System.out.println(x);
		}
	}
	
	public static void stringRotation() {
		
	//integer array
		String str = "abcde";
		char[] charArray = str.toCharArray();
		// rotate with 2 positions
		int len = charArray.length;
		
		for(int i=0; i<2; i++) {
			int j;
			char temp;
			temp = charArray[0];
			for(j = 0; j< len-1; j++) {
				charArray[j] = charArray[j+1];
			}
			charArray[j]=temp;
		}
		
		System.out.println(String.valueOf(charArray));
		System.out.println(new String(charArray));
	}
	
	// convert array as list
	public static void arrayToList() {
		int[] array = {1,2,3,4,5};
		List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
		System.out.println(list);
	}
	
	
	public static void main(String[] args) {
		rotaiton();
		stringRotation();
		arrayToList();
	}

}
