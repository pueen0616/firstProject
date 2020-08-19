package com.yedam.classes;

class ExtendClass extends FinalClass{
	
}

public class MainEx  {

	final int age = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Friend fr = new Friend(); //인스턴스
			fr.getAge(); 			  //인스턴스 메소드
			
			Calculator.add(10, 10);   //정적 메소드
			
			final int val = 10;		  //상수 선언(값이 고정)
	
//			MainEx ex = new MainEx();
//			ex.age = 20;
	}
}
