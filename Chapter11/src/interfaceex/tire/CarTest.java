package interfaceex.tire;

public class CarTest {

	public static void main(String[] args) {
		Car a1 = new Car();
		a1.run();
		
		//앞 바퀴 2개 금타이어로 교체
		System.out.println("==타이어 교체==");
		a1.frontLeft = new KumTire();
		a1.frontRight = new KumTire();
		a1.run();
	}

}
