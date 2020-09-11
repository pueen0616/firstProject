package com.yedam.lambda;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, String> func1 = (str) -> {
			return str + "is nothing";
		};
		String result = func1.apply("something");
		System.out.println(result);
		
		
		Function<String, Integer> func2 = (str) -> {
			return str.length(); // str의 크기를 return
		};
		int len = func2.apply("Hello"); // 5글자 길이
		System.out.println(len);
	}

}
