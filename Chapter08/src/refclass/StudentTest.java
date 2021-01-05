package refclass;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student park = new Student("박마늘");
		park.koreanSubject("국어", 95);
		park.mathSubject("수학", 80);
		park.showInfo();
		
		Student lee = new Student("이하늘");
		lee.koreanSubject("국어", 90);
		lee.mathSubject("수학", 85);
		lee.showInfo();
	}

}
