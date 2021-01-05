package refclass;

public class Student {
	static int studentID = 100;
	String studentName;
	Subject korean; //과목
	Subject math; //
	
	public Student(String studentName) {
		this.studentName = studentName;
		korean = new Subject(); //korean 생성
		math = new Subject(); //math 생성
		studentID++;
	}
	
	//korean method
	public void koreanSubject(String name, int score) {
		korean.setSubjectName(name);
		korean.setScorePoint(score);
	}
	//math method
	public void mathSubject(String name, int score) {
		math.setSubjectName(name);
		math.setScorePoint(score);
	}
	
	public void showInfo() {
		System.out.printf("학생 %s(%d)의 국어 점수는 %d점이고, 수학 점수는 %d점이다.\n",
				studentName,studentID,korean.scorePoint,math.scorePoint);
	}
	
}
