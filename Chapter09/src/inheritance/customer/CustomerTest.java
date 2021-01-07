package inheritance.customer;

public class CustomerTest {

	public static void main(String[] args) {
		// �Ϲ� �� �߰�
		Customer lee = new Customer();
		lee.setCustomerName("�̾���");
		
		// ���� ����
		int price = 10000;
		int leePrice = lee.calPrice(price);
		
		System.out.printf("���� ���� : %,d��\n", leePrice);
		System.out.println(lee.showCustomerInfo());
		
		// VIP �� �߰�
		VIPCustomer jang = new VIPCustomer();
		jang.setCustomerName("�����");
		
		// �������� �߰�
		jang.setAgentID(1004);
		int jangPrice = jang.calPrice(price);
		
		System.out.printf("���� ���� : %,d��\n", jangPrice);
		System.out.println(jang.showCustomerInfo());
		
		//�Ű����� �ִ� type �Ϲ� �� �߰�
		Customer ja = new Customer(20201222, "�ھߵ�");
		int jaPrice = ja.calPrice(price);
		System.out.printf("���� ���� : %,d��\n", jaPrice);
		System.out.println(ja.showCustomerInfo());
		
		//�Ű����� �ִ� type vip�� �߰�
		Customer ahn = new VIPCustomer(20201223, "�ȹλ�", 1004);
		//������ Ŭ���� �� ��ȯ���� ����
		//method�� �ڽ�method�� ȣ��
		int ahnPrice = ahn.calPrice(price);
		System.out.printf("���� ���� : %,d��\n", ahnPrice);
		System.out.println(ahn.showCustomerInfo());
		
	}

}
