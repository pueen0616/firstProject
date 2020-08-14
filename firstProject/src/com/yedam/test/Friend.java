package com.yedam.test;

public class Friend {
	 String name;
	 String num;
	 int age;
	 
	 public String Friend() {
			return "이름은 (" + name + ") 나이는 (" + age + ") 번호는 (" + num + ")";
		}
	 
	//생성자
		public Friend(String name, int age, String num) {
			this.age = age;
			this.name = name;
			this.num = num;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNum() {
			return num;
		}

		public void setNum(String num) {
			this.num = num;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
}
