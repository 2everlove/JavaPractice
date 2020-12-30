package singleton;

public class Company {
	private static Company instance = new Company();
	
	private Company() {} // constructor를 1개만 create (private)
	
	
	//instance에 access하기 위한 get() method 구현
	public static Company getCompany() {
		if(instance == null) { // company 1개
			instance = new Company();
		}
		return instance;
	}
}
