package interfaceex.tire;

public class Car2Test {

	public static void main(String[] args) {
		Car2 a1 = new Car2();
		a1.run();
		
		//�� ���� 2�� ��Ÿ�̾�� ��ü
		System.out.println("==Ÿ�̾� ��ü==");
		a1.tires[0] = new KumTire();
		a1.tires[1] = new KumTire();
		
		a1.run();
	}

}
