package com.yedam.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Counsumer타입 : 매개값을 받아서 return값 없이 출력한다.
		
		//제네릭 람다식 푼거
		Consumer<String> consumer = new Consumer<String>() {
			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t + "님 반갑습니다.");
			} //제네릭타입
			
		};
		consumer.accept("최재영");
		
		//제네릭 람다식
		Consumer<String> consumer1 = (t) -> {
			System.out.println(t + "님 반갑습니다.");
		};
		consumer1.accept("최재영");
		
		//BiConsumer<String, String>
		BiConsumer<String, String> biCon = (a, b) -> {
			System.out.println(a + "는" + b);
		};
		biCon.accept("나", "현동");
		
		//BiConsumer<Int, Int>
		BiConsumer<Integer, Integer> biInt = (a, b) -> {
			System.out.println(a * b);
		};
		biInt.accept(53333, 37);
		}
	}
