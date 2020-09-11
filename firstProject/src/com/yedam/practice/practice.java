package com.yedam.practice;

public class practice {
	
	class Min {
		public int min(int a, int b) {
			return (a<b) ? a : b;
		}
	}
	
	class Double {
		public double dob(double c, double d) {
			
			return (c<d) ? c : d;		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = Math.min(39, 25);
		double result2 = Math.min(24.6, 3.8);
		System.out.println(result);
		System.out.println(result2);
		int a = 10;
		int b = 12;
	}
}
