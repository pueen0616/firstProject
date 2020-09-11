package com.yedam.cond;

public class ForExample {
	public static void main(String[] args) {
		int sum = 0;
		sum += 1;
		sum += 1;
		sum += 1;
		System.out.println("최종 결과는 " + sum);
		
		for (int i=0; i<100; i++) {
			
			sum += i;
		
		}
		System.out.println(sum);
		
		// 1 ~ 10 범위의 수 합계
		sum = 0;
		
		for (int i=1; i<10; i++) {
			sum += i;
		}
		System.out.println("1 ~ 10 합 : " + sum);
	}
}
