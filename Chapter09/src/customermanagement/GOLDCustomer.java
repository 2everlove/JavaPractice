package customermanagement;

public class GOLDCustomer extends Customer { //��ӹ����� �θ��ϰ� �ٸ��Ÿ� ����!
	
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
		bonusRatio = 0.02; //bonus ������ 2%
		saleRatio = 0.1; //���������� 10%
	}
	
	@Override
	public int calPrice(int price) {
		bonusPoint = (int)(price*bonusRatio);
		price = price - (int)(price*saleRatio); //���ΰ��� = ���� - ������ ����
		return price;
	}
	
}
