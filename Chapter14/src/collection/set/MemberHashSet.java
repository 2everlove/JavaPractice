package collection.set;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<>();
	}
	
	//회원 추가
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	//회원 목록
	public void showAllMember() {
		for(Member member : hashSet) { //순서가 없으므로 get(i)를 쓰지않음 -> 향상 for 
			System.out.println(member);
		}
		System.out.println(); //한줄 띄기
	}
	
	//회원 삭제
	public boolean removeMember(int memberNum) {
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempMemberNum = member.getMemberNum(); //회원번호를 임시변수에 넣음
			if(tempMemberNum == memberNum) { // 임시변수에 넣은 값과 외부변수에서 넣은 memberNum을 비교해서 맞다면
				hashSet.remove(member); //객체 삭제
				return true;
			}
		}
		System.out.println(memberNum+"이 존재하지 않습니다.");
		return false;
	}

	@Override
	public String toString() {
		return "" + hashSet;
	}
	
	
	
}
