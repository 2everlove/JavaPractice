package collection.map;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		//��ü �߰�&����
		memberHashMap.addMember(new Member(1001, "���̹�"));
		memberHashMap.addMember(new Member(1002, "īī��"));
		memberHashMap.addMember(new Member(1003, "LG����"));
		memberHashMap.addMember(new Member(1002, "�Ｚ����"));
		
		// ��� ��ȸ
		memberHashMap.showAllMember();
		
		System.out.println("==��ü ����==");
		//��ü ����
		memberHashMap.removeMember(1006);
		memberHashMap.showAllMember();
		
		System.out.println(memberHashMap);
		
		
	}

}
