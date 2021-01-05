package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student lee = new Student(101, "이양파");
		lee.addSubject("국어", 95);
		lee.addSubject("수학", 72);
		lee.showInfo();
		
		Student park = new Student(102, "박하늘");
		park.addSubject("수학", 80);
		park.addSubject("국어", 90);
		park.showInfo();
	}

}
