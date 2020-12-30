package singleton;

public class Company {
	private static Company instance = new Company();
	
	private Company() {} // constructor�� 1���� create (private)
	
	
	//instance�� access�ϱ� ���� get() method ����
	public static Company getCompany() {
		if(instance == null) { // company 1��
			instance = new Company();
		}
		return instance;
	}
}
