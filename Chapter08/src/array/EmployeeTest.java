package array;

public class EmployeeTest {

	public static void main(String[] args) {
		//Employee class-type object array create
		Employee[] employee = new Employee[5];


		//instance가 가리키는 address value print
		for(int i=0; i<employee.length; i++) {
			System.out.println(employee[i]); //null -> vacant
		}
		
		employee[0] = new Employee(10, "김연아");
		employee[1] = new Employee(11, "박지성");
		employee[2] = new Employee(12, "추신수");
		employee[3] = new Employee(13, "손흥민");
		employee[4] = new Employee(14, "박완비");
		
		for(int i=0; i<employee.length; i++) {
			employee[i].showInfo();
		}
		System.out.println("\nEnhanced for");
		for (Employee e : employee) {
			e.showInfo();
		}
		
	}

}
