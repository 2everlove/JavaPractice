package array;

public class Employee {
	int companyID;
	String name;
	
	public Employee(int companyID, String name) {
		this.companyID = companyID;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("��� : "+companyID+", �̸� : "+name);
	}
	
}
