package collection.set;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<>();
	}
	
	//ȸ�� �߰�
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	//ȸ�� ���
	public void showAllMember() {
		for(Member member : hashSet) { //������ �����Ƿ� get(i)�� �������� -> ��� for 
			System.out.println(member);
		}
		System.out.println(); //���� ���
	}
	
	//ȸ�� ����
	public boolean removeMember(int memberNum) {
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempMemberNum = member.getMemberNum(); //ȸ����ȣ�� �ӽú����� ����
			if(tempMemberNum == memberNum) { // �ӽú����� ���� ���� �ܺκ������� ���� memberNum�� ���ؼ� �´ٸ�
				hashSet.remove(member); //��ü ����
				return true;
			}
		}
		System.out.println(memberNum+"�� �������� �ʽ��ϴ�.");
		return false;
	}

	@Override
	public String toString() {
		return "" + hashSet;
	}
	
	
	
}
