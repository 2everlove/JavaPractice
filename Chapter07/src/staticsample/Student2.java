package staticsample;

public class Student2 {
	static int serialNum = 1000;
	int studentID;
	String name;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getName( ) {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
