package multiinterface.customer;

public interface Buy {
	
	public void buy(); // 추상 메서드
	
	default void order() { //default 구현 메서드
		System.out.println("구매 주문 하기");
	}
}
