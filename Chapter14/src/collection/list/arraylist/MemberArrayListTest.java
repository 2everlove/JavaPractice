package collection.list.arraylist;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		//按眉 积己
		Member member2 = new Member(1001, "颊蕊刮");
		Member member3 = new Member(1002, "冠瘤己");
		Member lee = new Member(1001,"颊蕊刮"); //吝汗 倾侩
		
		
		//按眉 历厘
		memberArrayList.addMember(new Member(1000, "救刮惑")); //按眉 历厘 & 积己
		memberArrayList.addMember(member2);
		memberArrayList.addMember(member3);
		memberArrayList.addMember(lee);
		
		//按眉 格废
		memberArrayList.showAllMember();
		
		//按眉 昏力
		memberArrayList.removerMember(member3.getMemberNum());
		
		memberArrayList.showAllMember();
		
		memberArrayList.removerMember(1004);
		
		memberArrayList.showAllMember();
		
	}

}
