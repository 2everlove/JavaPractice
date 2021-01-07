package inheritance.customer.copy;

public class VIPCustomer extends Customer{
	private int agentID; // 전문 상담원
	double saleRatio; //구매 할인율
	
	public VIPCustomer() {
		super(); //생략가능
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1; //구매할인율 10%
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); //부모의 멤버 변수
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	@Override //method 재정의 - 오버라이드
	public int calPrice(int price) {
		//할인 가격 = 가격 * 구매할인율
		bonusPoint = (int)(price*bonusRatio);
		price = price - (int)(price*saleRatio);
		return price;
	}
	
	public int getAgentID() {
		return agentID;
	}
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	//전문상담원 추가에 따른 showInfo 재정의
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 전문 상담원 ID는 [" + agentID + "]입니다.";
	}
	
	
	
	
}
