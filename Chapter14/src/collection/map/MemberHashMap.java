package collection.map;

import java.util.HashMap;
import java.util.Set;

import collection.Member;

public class MemberHashMap {
	private HashMap<Integer, String> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	//ȸ���߰�
	public void addMember(Member member) {
		hashMap.put(member.getMemberNum(), member.getMemberName());
	}
	
	//�����ȸ
	public void showAllMember() {
		/*Iterator<Integer> ir = hashMap.keySet().iterator();
		//Iterator<key>
		while(ir.hasNext()) {
			Integer key = ir.next();
			String value = hashMap.get(key);
			System.out.println(key+", "+value );
		}*/
		Set<Integer> keyset = hashMap.keySet();
		for(Integer key : keyset) {
			Member member = new Member(key, hashMap.get(key));
			System.out.println(member);
		}
		
//		for (Integer key : hashMap.keySet() ) {
//			System.out.println(key +", " + hashMap.get(key));
//		}
	}
	//��� ����
	public boolean removeMember(int memberNum) {
		if(hashMap.containsKey(memberNum)) { //�Ű��� ���� memberNum�� �����Ѵٸ�
			hashMap.remove(memberNum); //memberNum�� �Ű��� ����
			return true;
		}
		System.out.println("'"+memberNum+"'�� �������� �ʽ��ϴ�.");
		return false;
	}

	@Override
	public String toString() {
		return "" + hashMap; //String ���̶� ""�� ���ڸ� �־������
	}	
}
	
