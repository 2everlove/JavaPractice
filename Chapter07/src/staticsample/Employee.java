package staticsample;

public class Employee {
	private static int serialNum = 1000;
	int companyID;
	String name;
	
	public Employee() {
		serialNum++;
		companyID=serialNum;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		//String name = "kim"; //name이 static변수가 아니라서 못씀
		Employee.serialNum = serialNum;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
