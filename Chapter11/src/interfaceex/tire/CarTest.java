package interfaceex.tire;

public class CarTest {

	public static void main(String[] args) {
		Car a1 = new Car();
		a1.run();
		
		//�� ���� 2�� ��Ÿ�̾�� ��ü
		System.out.println("==Ÿ�̾� ��ü==");
		a1.frontLeft = new KumTire();
		a1.frontRight = new KumTire();
		a1.run();
	}

}
