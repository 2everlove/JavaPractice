package template;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new AICar(); //부모 클래스형으로 자동 형변환
		MannualCar yourCar= new MannualCar();
		
		myCar.run();
		System.out.println();
		yourCar.run();
	}

}
