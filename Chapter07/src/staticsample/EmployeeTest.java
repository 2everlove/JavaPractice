package staticsample;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("��׷�");
		System.out.println(employee.name + ", ��� : "+employee.companyID);
		
		Employee employee2 = new Employee();
		employee2.setName("�ȿ���");
		System.out.println(employee2.name + ", ��� : "+employee2.companyID);
		
		Employee.setSerialNum(50);
		System.out.println(Employee.getSerialNum());
	}

}
