package singleton;

public class CarFactory {
	private static CarFactory instance;
	
	private CarFactory() {};
	
	public static CarFactory getCarFactory() {
		if(instance == null)
			instance = new CarFactory();
		return instance;
	}
	
	//공장에서 자동차를 만드는 method
	public Car creatCar() {
		Car car = new Car(); //Car instance 생성
		return car;
	}
}
