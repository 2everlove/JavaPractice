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
		Subject subject = new Subject(); //���� ��ü ����
		subject.setSubjectName(name);
		subject.setScorePoint(score);
		subjectList.add(subject); // ����ü�� ArrayList�� ����
	}
	
	
	public void showInfo() {		
		int total = 0;
		double avg = 0.0;		
		for(Subject subject : subjectList) {
			total += subject.getScorePoint();
			System.out.printf("�л� %s�� %s ���� ������ %d���̴�.\n",
					studentName,subject.getSubjectName(), subject.getScorePoint());
		}
		avg = (float)total / subjectList.size();
		System.out.printf("�л� %s�� ������ %d���̰�, ����� %.2f�Դϴ�.\n",studentName,total,avg);
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
