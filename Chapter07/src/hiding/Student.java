package hiding;

public class Student {
	int studentID;
	private String name;
	int grade;
	String address;
	
	public Student() { //기본 생성자 - 매개변수 없으면 생략가능
		
	}

	public void setName(String name) { //set + 멤버변수이름(첫글자 대문자)
		this.name = name;
		//같은 클래스 내부이므로 사용가능
	}	
	
	public String getName() { //get + 멤버변수이름(첫글자 대문자)
		return name;
	}
}
