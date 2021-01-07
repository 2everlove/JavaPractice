package customermanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerTest {

	public static void main(String[] args) {
		//고객 관리 테스트
		//ArrayList 생성
		ArrayList<Customer> customerList = new ArrayList<>();
		
		//고객 생성
		Customer customerLee = new Customer (10010, "이순신");
		Customer customerKim = new Customer (10010, "김흥돌");
		Customer customerLyu = new GOLDCustomer (10010, "류성룡");
		Customer customerHahn = new GOLDCustomer (10010, "한석봉");
		Customer customerAhn = new VIPCustomer (10010, "안민상", 1004);
		
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerLyu);
		customerList.add(customerHahn);
		customerList.add(customerAhn);
			
		System.out.println("\n======== 고객 정보 출력 ========");
		
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calPrice(price);
			System.out.printf("%s님이 %,d원을 지불하셨습니다.\n", customer.getCustomerName(), cost);
		}
		
		for(int i=0;i<customerList.size(); i++) {
			Customer customer = customerList.get(i);
			System.out.println(customer.showCustomerInfo());
		}
		Scanner sc = new Scanner(System.in);
		
		//grade별 point합산
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
