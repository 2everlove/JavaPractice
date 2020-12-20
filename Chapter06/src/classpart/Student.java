package classpart;

public class Student { //학생 클래스
	int studentID; //학번
	String name; //이름
	int grade;
	String address;
	
	public Student() { //기본 생성자이므로 생략 가능
		
	}
	
	public Student(int num) { //기본 생성자이므로 생략 가능
		studentID = num;
	}
	
	//메서드 만들기 - showInfo()
	public void showInfo() {
		System.out.println("학번 : " + studentID);
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println("주소 : " + address);
	}

}
