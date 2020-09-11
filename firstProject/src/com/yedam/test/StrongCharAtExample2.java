package com.yedam.test;

public class StrongCharAtExample2 {

	public static void main(String[] args) {
		String[] sp = {"*", "-", "/"};
		
		for(int i = 0; i < sp.length; i++) {
		
		}
		// TODO Auto-generated method stub
		String str1 = "010102-345678";
		System.out.println(str1.replace("-", "").charAt(6));
	    if(str1.replace("-", "").charAt(6) == '3') {
	    	System.out.println("남자");
	    }
	    
	    String str2 = "010102345678";
		System.out.println(str1.replace("-", "").charAt(6));
	}
	
	public static void Gender() {
		
	}
}
