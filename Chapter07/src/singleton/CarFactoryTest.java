package singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getCarFactory();
		Car mySonata = factory.creatCar();
		Car yourSonata = factory.creatCar();
		System.out.println("�� �� ��ȣ : "+mySonata.getCarNum()); //10001
		System.out.println("�� �� ��ȣ : "+yourSonata.getCarNum()); //10002
	}

}
