package collection;

public class Member {
	private int memberNum; //회원 아이디
	private String memberName; //회원 이름
	
	public Member(int memberNum, String memberName) {
		this.memberNum = memberNum;
		this.memberName = memberName;
	}
	//get(),set() // set()은 생성자에서 설정해줘서 솔직히 필요없음
	public int getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
	
	//toString 재정의
	@Override
	public String toString() {
		return "회원 번호 : "+memberNum + ", 회원 이름 : " + memberName;
	}
	
	@Override
	public int hashCode() { //hashCode 재정의
		return memberNum;
	}
	
	@Override
	public boolean equals(Object obj) { //equals재정의
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(this.memberNum == member.memberNum) { //외부에서 입력한 회원번호와 멤버 회원 번호가 같으면
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
}
