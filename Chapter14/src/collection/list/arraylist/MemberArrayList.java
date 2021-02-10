package collection.list.arraylist;

import java.util.ArrayList;

public class MemberArrayList {
	private ArrayList<Member> arrayList = new ArrayList<>();
	
	//회원추가 method
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//회원목록 method
	public void showAllMember() {
		for(int i=0;i<arrayList.size();i++) {
			Member member =arrayList.get(i);
			System.out.println(member);
		}
	}
	
	//회원삭제 method
	public boolean removerMember(int memberNum) { //매개변수 - 회원 번호
		for(int i=0;i<arrayList.size();i++) {
			Member member = arrayList.get(i); //arrayList에서 Member가져옴
			int tempNum = member.getMemberNum(); //임시변수에 회원 번호 저장
			if(tempNum == memberNum) { //외부의 입력된 번호와 객체제 저장된 번호가 같다면
				arrayList.remove(i); //해당 회원번호의 객체 삭제
				return true;
			}	
		}
		System.out.println(memberNum+"가 존재하지 않습니다.");
		return false;
	}
	
//	//회원삭제 method
//		public void removerMember(int memberNum) { //매개변수 - 회원 번호
//			for(int i=0;i<arrayList.size();i++) {
//				Member member = arrayList.get(i); //arrayList에서 Member가져옴
//				int tempNum = member.getMemberNum(); //임시변수에 회원 번호 저장
//				if(tempNum == member.getMemberNum()) { //외부의 입력된 번호와 객체제 저장된 번호가 같다면
//					arrayList.remove(i); //해당 회원번호의 객체 삭제
//				}
//			}
//			System.out.println(memberNum+"가 존재하지 않습니다.");
//			
//		}
	
}
