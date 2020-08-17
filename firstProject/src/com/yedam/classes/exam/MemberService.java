package com.yedam.classes.exam;

public class MemberService {

	public boolean login(String id, String password) {
		Member[] members = new Member[3];
		members[0] = new Member("홍길동", "hong");
		members[0].setPassword("hong1234");

		members[1] = new Member("김현동", "Dong");
		members[1].setPassword("dong1234");

		members[2] = new Member("허성준", "June");
		members[2].setPassword("june1234");
		
		boolean result = false;
		for (int i = 0; i < members.length; i++) {
			if (id.equals(members[i].getId()) 
					&& password.equals(members[i].getPassword())){
				result = true;
				break;
			} else {
				result = false;
				
			}
		}
		return result;
	}

	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
