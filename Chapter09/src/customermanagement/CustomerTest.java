package customermanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerTest {

	public static void main(String[] args) {
		//�� ���� �׽�Ʈ
		//ArrayList ����
		ArrayList<Customer> customerList = new ArrayList<>();
		
		//�� ����
		Customer customerLee = new Customer (10010, "�̼���");
		Customer customerKim = new Customer (10010, "���ﵹ");
		Customer customerLyu = new GOLDCustomer (10010, "������");
		Customer customerHahn = new GOLDCustomer (10010, "�Ѽ���");
		Customer customerAhn = new VIPCustomer (10010, "�ȹλ�", 1004);
		
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerLyu);
		customerList.add(customerHahn);
		customerList.add(customerAhn);
			
		System.out.println("\n======== �� ���� ��� ========");
		
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calPrice(price);
			System.out.printf("%s���� %,d���� �����ϼ̽��ϴ�.\n", customer.getCustomerName(), cost);
		}
		
		for(int i=0;i<customerList.size(); i++) {
			Customer customer = customerList.get(i);
			System.out.println(customer.showCustomerInfo());
		}
		Scanner sc = new Scanner(System.in);
		
		//grade�� point�ջ�
		String grade = sc.nextLine();
		int total = 0;
		double avg = 0.0;
		for (Customer customer : customerList) {
			if(grade.equals(customer.getCustomerGrade())) {
				total += customer.bonusPoint; 
			}			
			System.out.println(customer.getCustomerGrade()+", "+total);
		}
		sc.close();
	}

}
