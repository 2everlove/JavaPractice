package collection.map;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		//객체 추가&저장
		memberHashMap.addMember(new Member(1001, "네이버"));
		memberHashMap.addMember(new Member(1002, "카카오"));
		memberHashMap.addMember(new Member(1003, "LG전자"));
		memberHashMap.addMember(new Member(1002, "삼성전자"));
		
		// 목록 조회
		memberHashMap.showAllMember();
		
		System.out.println("==객체 삭제==");
		//객체 삭제
		memberHashMap.removeMember(1006);
		memberHashMap.showAllMember();
		
		System.out.println(memberHashMap);
		
		
	}

}
