package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student lee = new Student(101, "�̾���");
		lee.addSubject("����", 95);
		lee.addSubject("����", 72);
		lee.showInfo();
		
		Student park = new Student(102, "���ϴ�");
		park.addSubject("����", 80);
		park.addSubject("����", 90);
		park.showInfo();
	}

}
