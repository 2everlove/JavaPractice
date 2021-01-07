package inheritance.engineer;

public class Engineer extends Person {
	
	public Engineer(String name, int age, int companyID) {
		super(name, age);
		this.companyID = companyID;
		// TODO Auto-generated constructor stub
	}
	private int companyID;
	
	public int getCompanyID() {
		return companyID;
	}
	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}
	
	public String showPersonInfo() {
		return +Engineer.getAge()+"님의 나이는이며, 사번은"+companyID;
	}
}
