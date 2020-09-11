package com.yedam.cond;

public class whileExample {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
			sum += i;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
		
		int a = 2;
		int b = 1;
			
			while (b < 10) {
				System.out.println(a + " * " + b + " = " + (a * b));
				b++;
				
				
			}	a++;
				b=1;
		}
	}

