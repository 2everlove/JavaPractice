package refclass;

//import java.util.ArrayList;

public class Subject {
	String subjectName;
	int scorePoint;
	
//	ArrayList<Student> studentList;
//	
//	public Subject(String subjectName, int scorePoint) {
//		this.subjectName = subjectName;
//		this.scorePoint = scorePoint;
//		studentList = new ArrayList<>();
//	}
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public int getScorePoint() {
		return scorePoint;
	}
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	
//	public void addScore(String name, int score) {
//		Student student = new Student(name); //과목 객체 생성
//		student.setSubjectName(name);
//		student.setScorePoint(score);
//		subjectList.add(subject); // 과목객체를 ArrayList에 저장
//	}
//	
//	public void showInfo() {		
//		int total = 0;
//		double avg = 0.0;		
//		for(Student name : subjectList) {
//			total += subject.getScorePoint();
//			System.out.printf("학생 %s의 %s 과목 점수는 %d점이다.\n",
//					studentName,subject.getSubjectName(), subject.getScorePoint());
//		}
//		avg = (float)total / subjectList.size();
//		System.out.printf("학생 %s의 총점은 %d점이고, 평균은 %.2f입니다.\n",studentName,total,avg);
	
//	public void showSubjectInfo() {
//		int subjectTotal = 0;
//		double subjectAvg = 0.0;
//		Scanner sc = new Scanner(System.in);
//		for(grade :)
//		if (subjectList.contains(sc)) {
//		}
}
