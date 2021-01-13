package interfaceex.tire;

public class Car2Test {

	public static void main(String[] args) {
		Car2 a1 = new Car2();
		a1.run();
		
		//앞 바퀴 2개 금타이어로 교체
		System.out.println("==타이어 교체==");
		a1.tires[0] = new KumTire();
		a1.tires[1] = new KumTire();
		
		a1.run();
	}

}
