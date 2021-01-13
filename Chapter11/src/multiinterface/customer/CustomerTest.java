package multiinterface.customer;

public class CustomerTest {

	public static void main(String[] args) {
		//Customer ��ü ����
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		System.out.println();
		
		//Buy �������̽������� ��ü ����
		Buy buyer = customer; //�ڵ� ����ȯ
		buyer.buy();
		buyer.order(); //���� ������ �� method�� ���
		
		
		System.out.println();
		//Sell �������̽������� ����
		Sell seller = customer;
		seller.sell();
		seller.order();
	}

}
