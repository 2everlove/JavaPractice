package collection.list.arraylist;

import java.util.ArrayList;

public class MemberArrayList {
	private ArrayList<Member> arrayList = new ArrayList<>();
	
	//ȸ���߰� method
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//ȸ����� method
	public void showAllMember() {
		for(int i=0;i<arrayList.size();i++) {
			Member member =arrayList.get(i);
			System.out.println(member);
		}
	}
	
	//ȸ������ method
	public boolean removerMember(int memberNum) { //�Ű����� - ȸ�� ��ȣ
		for(int i=0;i<arrayList.size();i++) {
			Member member = arrayList.get(i); //arrayList���� Member������
			int tempNum = member.getMemberNum(); //�ӽú����� ȸ�� ��ȣ ����
			if(tempNum == memberNum) { //�ܺ��� �Էµ� ��ȣ�� ��ü�� ����� ��ȣ�� ���ٸ�
				arrayList.remove(i); //�ش� ȸ����ȣ�� ��ü ����
				return true;
			}	
		}
		System.out.println(memberNum+"�� �������� �ʽ��ϴ�.");
		return false;
	}
	
//	//ȸ������ method
//		public void removerMember(int memberNum) { //�Ű����� - ȸ�� ��ȣ
//			for(int i=0;i<arrayList.size();i++) {
//				Member member = arrayList.get(i); //arrayList���� Member������
//				int tempNum = member.getMemberNum(); //�ӽú����� ȸ�� ��ȣ ����
//				if(tempNum == member.getMemberNum()) { //�ܺ��� �Էµ� ��ȣ�� ��ü�� ����� ��ȣ�� ���ٸ�
//					arrayList.remove(i); //�ش� ȸ����ȣ�� ��ü ����
//				}
//			}
//			System.out.println(memberNum+"�� �������� �ʽ��ϴ�.");
//			
//		}
	
}
