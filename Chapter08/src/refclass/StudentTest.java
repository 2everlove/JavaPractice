package refclass;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student park = new Student("�ڸ���");
		park.koreanSubject("����", 95);
		park.mathSubject("����", 80);
		park.showInfo();
		
		Student lee = new Student("���ϴ�");
		lee.koreanSubject("����", 90);
		lee.mathSubject("����", 85);
		lee.showInfo();
	}

}
