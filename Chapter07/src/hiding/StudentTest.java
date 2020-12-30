package hiding;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student lee = new Student();
		//lee.name = "이아인"; // private 변수이므로 접근 불가
		lee.setName("이아인");
		System.out.println("이름 : "+lee.getName());
	}
	
}
