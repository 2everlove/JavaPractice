package staticsample;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("장그래");
		System.out.println(employee.name + ", 사번 : "+employee.companyID);
		
		Employee employee2 = new Employee();
		employee2.setName("안영이");
		System.out.println(employee2.name + ", 사번 : "+employee2.companyID);
		
		Employee.setSerialNum(50);
		System.out.println(Employee.getSerialNum());
	}

}
