package refclass;

public class Student {
	static int studentID = 100;
	String studentName;
	Subject korean; //����
	Subject math; //
	
	public Student(String studentName) {
		this.studentName = studentName;
		korean = new Subject(); //korean ����
		math = new Subject(); //math ����
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
		System.out.printf("�л� %s(%d)�� ���� ������ %d���̰�, ���� ������ %d���̴�.\n",
				studentName,studentID,korean.scorePoint,math.scorePoint);
	}
	
}
