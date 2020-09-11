package com.yedam.classes;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child("홍길동", 15, 10);
		child.getName(); //부모 Parent getNamE()
		child.getAge();
		child.getGrade();
		
		Parent parent = new Child("김유신", 20, 20); //상속관계
		parent.getName();
		parent.getAge();
//		parent.getGrade(); //자식은 사용 불가
		
		Vehicle v1 = new Taxi();
		//v1.run();
		v1 = new Bus();
		//v1.run();
		
		Driver driver = new Driver();
		driver.drive(new Taxi());
		driver.drive(new Bus());
		
		Parent parent1 = new Parent();
		System.out.println(parent1.toString());
	}
}
