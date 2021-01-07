package customermanagement;

public class GOLDCustomer extends Customer { //상속받으면 부모하고 다른거만 정의!
	
	double saleRatio;
	
	public GOLDCustomer() {
		super();
		initCustomer();
	}
	
	public GOLDCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		initCustomer();
	}
	
	private void initCustomer() {
		customerGrade = "GOLD";
		bonusRatio = 0.02; //bonus 적립율 2%
		saleRatio = 0.1; //구매할인율 10%
	}
	
	@Override
	public int calPrice(int price) {
		bonusPoint = (int)(price*bonusRatio);
		price = price - (int)(price*saleRatio); //할인가격 = 가격 - 할인할 가격
		return price;
	}
	
}
