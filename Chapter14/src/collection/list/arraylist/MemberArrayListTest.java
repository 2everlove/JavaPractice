package collection.list.arraylist;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		//��ü ����
		Member member2 = new Member(1001, "�����");
		Member member3 = new Member(1002, "������");
		Member lee = new Member(1001,"�����"); //�ߺ� ���
		
		
		//��ü ����
		memberArrayList.addMember(new Member(1000, "�ȹλ�")); //��ü ���� & ����
		memberArrayList.addMember(member2);
		memberArrayList.addMember(member3);
		memberArrayList.addMember(lee);
		
		//��ü ���
		memberArrayList.showAllMember();
		
		//��ü ����
		memberArrayList.removerMember(member3.getMemberNum());
		
		memberArrayList.showAllMember();
		
		memberArrayList.removerMember(1004);
		
		memberArrayList.showAllMember();
		
	}

}
