package collection;

public class Member {
	private int memberNum; //ȸ�� ���̵�
	private String memberName; //ȸ�� �̸�
	
	public Member(int memberNum, String memberName) {
		this.memberNum = memberNum;
		this.memberName = memberName;
	}
	//get(),set() // set()�� �����ڿ��� �������༭ ������ �ʿ����
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
	
	
	
	//toString ������
	@Override
	public String toString() {
		return "ȸ�� ��ȣ : "+memberNum + ", ȸ�� �̸� : " + memberName;
	}
	
	@Override
	public int hashCode() { //hashCode ������
		return memberNum;
	}
	
	@Override
	public boolean equals(Object obj) { //equals������
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(this.memberNum == member.memberNum) { //�ܺο��� �Է��� ȸ����ȣ�� ��� ȸ�� ��ȣ�� ������
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
}
