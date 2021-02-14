package stream.customer;

import java.util.ArrayList;
//import java.util.List;
import java.util.stream.Stream;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> list = new ArrayList<>();
//		List<Customer> list = Arrays.asList(
//				new Customer("가즈아", 40, 3000),
//				new Customer("나혼자", 19, 5000),
//				new Customer("다같이", 31, 10000));
		
		list.add(new Customer("가즈아", 40, 100));
		list.add(new Customer("나혼자", 19, 300));
		list.add(new Customer("다같이", 31, 500));
		
		System.out.println("**** 고객명단 순서대로 출력 ****");
//		
		Stream<Customer> stream = list.stream();
		list.stream()
			.map(c->c.getName()) //매칭 개념
			.forEach(s->System.out.println(s));
		int total = stream.mapToInt(c->c.getCost())
			.sum();
		System.out.println("총 여행 비용은 "+total+"만원 입니다.");
		
		System.out.println("*** 20세 이상 고객 명단을 정렬하여 출력 ***");
		list.stream()
			.filter(c->c.getAge() >= 20) //필터
			.map(c->c.getName())
			.sorted() //정렬
			.forEach(s->System.out.println(s));
	}

}
