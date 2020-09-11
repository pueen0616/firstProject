package com.yedam.classes;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.setName("김현동");
		p1.setAge(25);
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		Person KHD = new Person();
		KHD.setName("김현동");
		KHD.setAge(27);
		Person CJY = new Person();
		CJY.setName("최재영");
		CJY.setAge(27);
		
		System.out.println(KHD.getAge() == CJY.getAge());
		System.out.println(KHD.introduce());
		System.out.println(CJY.introduce());
		
		Person[] pAry = {KHD, CJY};
		for(int i=0; i<pAry.length; i++) {
			pAry[i].introduce();
			System.out.println(pAry[i].introduce());
		}
		
		Person anoy = new Person("허성준", 23);
		anoy.name = "최형준";
		anoy.age = 98;
		System.out.println(anoy.introduce());
		

		Person mhj = new Person("민해주", 20);
		mhj.setName("김시무");
		System.out.println(mhj.introduce());
		
	}
}