package inheritance.customer.copy;

import java.util.ArrayList;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	ArrayList<Customer> customerList;
	
	public Customer() { //기본 생성자
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		customerList = new ArrayList<>();
	}
	
	public void addCustomer(String grade, int price) {
		Customer client = new Customer();
		client.setCustomerGrade(grade);
		client.calPrice(price);
		customerList.add(client);
	}
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}	
	public void setCustomerName(String customerName) {
		this.customerName  = customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade  = customerGrade;
	}
	
	public int calPrice(int price) {
		bonusPoint = (int)(price*bonusRatio);
		return price;
	}
	public int getPrice(int price) {
		return price;
	}
	
	public String showCustomerInfo() {
		return "[" + customerName + "] 님의 등급은 ["+customerGrade+"]"
				+ "이며, 보너스 포인트는 ["+bonusPoint+"]입니다.";
	}
	//하다말음
	public void showGradeBuyInfo() {
		int total = 0;
		double avg = 0.0;
		for(Customer c : customerList) {
			total += c.getPrice(bonusPoint);
		}
		System.out.println("고객분들의");
	}
	
	
}
