package singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getCarFactory();
		Car mySonata = factory.creatCar();
		Car yourSonata = factory.creatCar();
		System.out.println("내 차 번호 : "+mySonata.getCarNum()); //10001
		System.out.println("니 차 번호 : "+yourSonata.getCarNum()); //10002
	}

}
