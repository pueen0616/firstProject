package com.yedam.classes;

public class Person {
		//필드
		String name;
		int age;
		
		//이름 같은 생성자 여러개 가능하나 매개값이나 타입이 달라야 함
		//생성자 : class 이름과 같음, 매개값이 없음
		public Person() { // 매개값이 생성자를 기본생성자(defalut Constructor)
//			name = "anonymous";
//			age = 10;
		}
		
		public Person(String name) {
			this.name = name;
			
		}
		
		//생성자 : 매개값을 받겟다 
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
		//메소드 
		public String introduce() {
			return "이름은 " + name + "나이는 " + age + "과는 ";
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
}
