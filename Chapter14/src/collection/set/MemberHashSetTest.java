package collection.set;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberSet = new MemberHashSet();
		
		//객체 생성
		memberSet.addMember(new Member(1001, "네이버"));
		memberSet.addMember(new Member(1002, "카카오"));
		memberSet.addMember(new Member(1003, "엔씨소프트"));
		memberSet.addMember(new Member(1001, "네이버")); //중복저장
		
		//목록 조회
		memberSet.showAllMember();
		
		memberSet.removeMember(1003);
		
		memberSet.showAllMember();
		System.out.println(memberSet);
	}

}
