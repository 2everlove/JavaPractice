package customermanagement;

public class VIPCustomer extends Customer{
	private int agentID; // ���� ����
	double saleRatio; //���� ������
	
	public VIPCustomer() {
		super(); //��������
		initCustomer();
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); //�θ��� ��� ����
		this.agentID = agentID;
		initCustomer();
	}
	
	private void initCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1; //���������� 10%
	}
	
	@Override //method ������ - �������̵�
	public int calPrice(int price) {
		//���� ���� = ���� * ����������
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
	
	//�������� �߰��� ���� showInfo ������
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " ���� ���� ID�� [" + agentID + "]�Դϴ�.";
	}
	
	
	
	
}
