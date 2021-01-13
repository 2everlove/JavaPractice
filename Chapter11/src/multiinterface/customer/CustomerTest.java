package multiinterface.customer;

public class CustomerTest {

	public static void main(String[] args) {
		//Customer 객체 생성
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		System.out.println();
		
		//Buy 인터페이스형으로 객체 생성
		Buy buyer = customer; //자동 형변환
		buyer.buy();
		buyer.order(); //최종 재정의 된 method로 출력
		
		
		System.out.println();
		//Sell 인터페이스형으로 생성
		Sell seller = customer;
		seller.sell();
		seller.order();
	}

}
