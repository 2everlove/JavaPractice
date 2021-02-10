package collection.set;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberSet = new MemberHashSet();
		
		//��ü ����
		memberSet.addMember(new Member(1001, "���̹�"));
		memberSet.addMember(new Member(1002, "īī��"));
		memberSet.addMember(new Member(1003, "��������Ʈ"));
		memberSet.addMember(new Member(1001, "���̹�")); //�ߺ�����
		
		//��� ��ȸ
		memberSet.showAllMember();
		
		memberSet.removeMember(1003);
		
		memberSet.showAllMember();
		System.out.println(memberSet);
	}

}
