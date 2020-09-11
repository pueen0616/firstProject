package com.yedam.generic;

import com.yedam.classes.Person;
import com.yedam.classes.Utils;

public class ProductExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product<String, Person> pr1 = new Product<>();
		pr1.setModel(new Person());
		pr1.setType("유형");
		
		Product<String, Integer> p1 = new Product<>();
		p1.setModel(10);
		p1.setType("최재영");
		
		Product<String, Integer> p2 = new Product<>();
		p1.setModel(27);
		p1.setType("김현동");
		
		System.out.println(p1.getType()+ p1.getModel());
		
		boolean tof = Utils.compare(p1, p2);
		if(tof)
			System.out.println("논리적으로 동등");
		else
			System.out.println("논리적으로 다름.");
	}
}
