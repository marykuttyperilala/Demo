package com.demo;

import java.util.Arrays;

public class ReverseStr {
	
	public static void strReverse() {
		String str = "abcde";
		char[] arr = str.toCharArray();
		String[] strArr = {"hai","hello","dear","what","where"};
		int len = strArr.length;
		for(int i=0; i<len/2; i++) {
			String temp = strArr[i];
			strArr[i] = strArr[len-1-i];
			strArr[len-1-i]=temp;
			}
	//System.out.println(new String(strArr));
	System.out.println(Arrays.toString(strArr));
	}
	
	public static void main(String[] args) {
		strReverse();
	}

}
