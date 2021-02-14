package stream.customer;

import java.util.ArrayList;
//import java.util.List;
import java.util.stream.Stream;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> list = new ArrayList<>();
//		List<Customer> list = Arrays.asList(
//				new Customer("�����", 40, 3000),
//				new Customer("��ȥ��", 19, 5000),
//				new Customer("�ٰ���", 31, 10000));
		
		list.add(new Customer("�����", 40, 100));
		list.add(new Customer("��ȥ��", 19, 300));
		list.add(new Customer("�ٰ���", 31, 500));
		
		System.out.println("**** ����� ������� ��� ****");
//		
		Stream<Customer> stream = list.stream();
		list.stream()
			.map(c->c.getName()) //��Ī ����
			.forEach(s->System.out.println(s));
		int total = stream.mapToInt(c->c.getCost())
			.sum();
		System.out.println("�� ���� ����� "+total+"���� �Դϴ�.");
		
		System.out.println("*** 20�� �̻� �� ����� �����Ͽ� ��� ***");
		list.stream()
			.filter(c->c.getAge() >= 20) //����
			.map(c->c.getName())
			.sorted() //����
			.forEach(s->System.out.println(s));
	}

}
