package com.yedam.classes.exam;

public class MemberServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member[] members = new Member[3];
		members[0] = new Member("홍길동", "hong");
		members[0].setPassword("hong1234");

		members[1] = new Member("김현동", "Dong");
		members[1].setPassword("dong1234");

		members[2] = new Member("허성준", "June");
		members[2].setPassword("june1234");

		// 로그인 정보..
		Member mem1 = new Member("허성준", "June");
		mem1.setPassword("june1234");

		for (int i = 0; i < members.length; i++) {
			MemberService mService = new MemberService();
			boolean result = mService.login(mem1.getId(), mem1.getPassword());
			if (result) {
				System.out.println(mem1.getName() + "님이 로그인 되었습니다. 비밀번호는 " + mem1.getPassword() + "");
				break;
			} else {
				System.out.println("id 또는 password가 올바르지 않습니다.");
				break;
			}
		}
	}
}
