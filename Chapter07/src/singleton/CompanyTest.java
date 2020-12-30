package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company company1 = Company.getCompany();
		Company company2 = Company.getCompany();
		
		System.out.println(company1==company2);
		System.out.println(company1);
		System.out.println(company2);
	}

}
