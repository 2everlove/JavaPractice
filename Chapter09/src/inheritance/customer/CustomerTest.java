package inheritance.customer;

public class CustomerTest {

	public static void main(String[] args) {
		// 일반 고객 추가
		Customer lee = new Customer();
		lee.setCustomerName("이양파");
		
		// 물건 가격
		int price = 10000;
		int leePrice = lee.calPrice(price);
		
		System.out.printf("구매 가격 : %,d원\n", leePrice);
		System.out.println(lee.showCustomerInfo());
		
		// VIP 고객 추가
		VIPCustomer jang = new VIPCustomer();
		jang.setCustomerName("장봐요");
		
		// 전문상담원 추가
		jang.setAgentID(1004);
		int jangPrice = jang.calPrice(price);
		
		System.out.printf("구매 가격 : %,d원\n", jangPrice);
		System.out.println(jang.showCustomerInfo());
		
		//매개변수 넣는 type 일반 고객 추가
		Customer ja = new Customer(20201222, "자야돼");
		int jaPrice = ja.calPrice(price);
		System.out.printf("구매 가격 : %,d원\n", jaPrice);
		System.out.println(ja.showCustomerInfo());
		
		//매개변수 넣는 type vip고객 추가
		Customer ahn = new VIPCustomer(20201223, "안민상", 1004);
		//묵시적 클래스 형 변환으로 실행
		//method는 자식method가 호출
		int ahnPrice = ahn.calPrice(price);
		System.out.printf("구매 가격 : %,d원\n", ahnPrice);
		System.out.println(ahn.showCustomerInfo());
		
	}

}
