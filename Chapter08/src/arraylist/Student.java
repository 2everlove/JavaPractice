package arraylist;

import java.util.ArrayList;

import refclass.Subject;

public class Student {
	int studentID;
	String studentName;
	
	ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject(); //과목 객체 생성
		subject.setSubjectName(name);
		subject.setScorePoint(score);
		subjectList.add(subject); // 과목객체를 ArrayList에 저장
	}
	
	
	public void showInfo() {		
		int total = 0;
		double avg = 0.0;		
		for(Subject subject : subjectList) {
			total += subject.getScorePoint();
			System.out.printf("학생 %s의 %s 과목 점수는 %d점이다.\n",
					studentName,subject.getSubjectName(), subject.getScorePoint());
		}
		avg = (float)total / subjectList.size();
		System.out.printf("학생 %s의 총점은 %d점이고, 평균은 %.2f입니다.\n",studentName,total,avg);
				}
//	public void showSubScorInfo() {
//		//String sc = 0;
//		for(int i=0; i<subjectList.size(); i++) {
//			subjectList.toString();
//		}
//		
//		for(Subject subject2 : subjectList) {
//			System.out.println(subject2.getSubjectName());
//		}

}
