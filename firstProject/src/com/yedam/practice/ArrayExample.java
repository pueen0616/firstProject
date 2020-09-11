package com.yedam.practice;

import java.util.Arrays;


class User implements Comparable<User>{
	String name;
	int grade;
	
	public User(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}

	@Override
	public int compareTo(User o) { //o.grade - this.grade를 비교하겠다.
		// TODO Auto-generated method stub
		return o.grade - this.grade; //
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", grade=" + grade + "]";
	}
	
	
}

public class ArrayExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Hong", "Park", "Choi"};
		for(int i=0; i<names.length; i++) {
		System.out.print(" " + names[i]);
		}
		
		System.out.println();
		
		//정렬
		Arrays.sort(names);
		for(String s : names) {
			System.out.print(" " + s);
		}
		///////////////////////////////////////////////////////////
		System.out.println();
		
		User[] users = {new User("uesr1", 1), new User("user2", 2),
					    new User("user3", 3)};
		
		Arrays.sort(users);
			for(User s : users) {
			System.out.println(s.toString());
				} 
			}
		}
