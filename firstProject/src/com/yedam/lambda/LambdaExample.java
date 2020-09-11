package com.yedam.lambda;

//함수적인터페이스(functional Interface)
interface MyFunctionalInterface {
	public void run(); // 추상메소드 (abstract method)
}

class MyFuncClass implements MyFunctionalInterface {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("ruuuuuuuuuun");
	}

}

public class LambdaExample {
	public static void main(String[] args) {
		MyFunctionalInterface myintf = () -> {
			System.out.println("run");
		};
		myintf.run();
		
		//줄인거
		ShowContent sc = (String content) -> {
			System.out.println("내용은 " + content + " 입니다.");
		};
		sc.show("바나나");
		
		//안줄인거
		ShowContent sc2 = new ShowContent() {

			@Override
			public void show(String content) {
				// TODO Auto-generated method stub
				System.out.println("내용은 " + content + " 입니다.");
			}
		};
		sc2.show("바나나");
		
		
		//Calculate 람다
		Calculate cal = (a, b) -> 
		 a+b;
		System.out.println("결과 : " + cal.sum(5, 7));
		
		//Calculate 푼거
		Calculate cal2 = new Calculate() {

			@Override
			public int sum(int a, int b) {
				// TODO Auto-generated method stub
				int sum = a+b;
				System.out.println("결과 : " + sum);
				return sum;
			}
		};
		cal2.sum(5, 7);
	}
}
