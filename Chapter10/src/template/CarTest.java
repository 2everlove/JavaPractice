package template;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new AICar(); //�θ� Ŭ���������� �ڵ� ����ȯ
		MannualCar yourCar= new MannualCar();
		
		myCar.run();
		System.out.println();
		yourCar.run();
	}

}
