package innerclass;

public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student("¾Æ¹Ì°í");
		Student.Score score = student1.new Score(90, 80);
//		score.eng = 90;
//		score.math = 80;
		score.showInfo();
	}

}
