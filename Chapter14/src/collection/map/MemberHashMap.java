package collection.map;

import java.util.HashMap;
import java.util.Set;

import collection.Member;

public class MemberHashMap {
	private HashMap<Integer, String> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	//회원추가
	public void addMember(Member member) {
		hashMap.put(member.getMemberNum(), member.getMemberName());
	}
	
	//목록조회
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
	//목록 삭제
	public boolean removeMember(int memberNum) {
		if(hashMap.containsKey(memberNum)) { //매개로 들어온 memberNum을 포함한다면
			hashMap.remove(memberNum); //memberNum을 매개로 삭제
			return true;
		}
		System.out.println("'"+memberNum+"'이 존재하지 않습니다.");
		return false;
	}

	@Override
	public String toString() {
		return "" + hashMap; //String 형이라 ""라도 문자를 넣어줘야함
	}	
}
	
