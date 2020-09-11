package com.yedam.practice;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class NewExample {
	Member mem;
	
	class Member {
		String id;
		
		Member(String id){
			this.id = id;
		}
		
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			if(obj instanceof Member) {
			Member mem = (Member) obj;
			return id.equals(mem.id);
			} else {
				return false;
			}
		}
		
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return Objects.hash(id);
//			return super.hashCode();

		}
	}
	 public static int hashCode(Object a[]) {
	        if (a == null)
	            return 0;

	        int result = 1;

	        for (Object element : a)
	            result = 31 * result + (element == null ? 0 : element.hashCode());

	        return result;
	    }
	 
	public void printMember() {
		Member m1 = new Member("hong");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewExample n1 = new NewExample(); //밖에 있는 클래스 먼저 선언
		Member m1 = n1.new Member("hong"); //new 앞에 n1 붙여서 선언
		Member m2 = n1.new Member("hong");
		System.out.println(m1.equals(m2));
		
		System.out.println(Objects.hash("hhh"));
		
		Set<Member> set = new HashSet<>(); //Set 중복값을 받지 않겠다.
		set.add(m1);
		set.add(m2);
		
		for(Member m : set) {
		System.out.println(m.id);
		}
	}
}
