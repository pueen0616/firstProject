package com.yedam.practice;

import java.util.Arrays;

public class MemberExample2 {
	static class Car {
		public String model;
		
		public Car(String model){
			this.model = model;
		}
	}
	
	public class Member implements Cloneable{
		 String name;
		 int age;
		 int[] scores;
		 Car car;
		
		public Member(String name, int age, int[] scores, Car car) {
			super();
			this.name = name;
			this.age = age;
			this.scores = scores;
			this.car = car;
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			Member cloned = (Member) super.clone();
			cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
			cloned.car = new Car(this.car.model);
			return cloned;
		}
		
		public Member getMember() {
			Member cloned = null;
			
			try {
				cloned = (Member) clone();
			}catch(CloneNotSupportedException e) {
				e.printStackTrace();
			}
			return cloned;
		}
	}
	
	public static void main(String[] args) {

		MemberExample2 me2 = new MemberExample2();
		Member original = me2.new Member("홍길동", 25, new int[] {90, 90}, new Car("소나타"));
		
		Member cloned = original.getMember();
		cloned.scores[0] = 100;
		cloned.car.model = "그랜저";
		
		System.out.println("복제 객체의 필드값 : ");
		System.out.println("name : " + cloned.name);
		System.out.println("age : " + cloned.age);
		System.out.print("scores : {");
		for(int i=0; i<cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i==(cloned.scores.length))? "" : ",,, ");
			
		}
		System.out.println("} ");
		System.out.println("car: " + cloned.car.model);
		
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("name : " + original.name);
		System.out.println("age : " + original.age);
		System.out.print("scores : {");
		for(int i=0; i<original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print((i==(original.scores.length))? "" : ",,, ");
			
		}
		System.out.println("} ");
		System.out.println("car: " + original.car.model);
	}
}

