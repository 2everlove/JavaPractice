package singleton;

public class CarFactory {
	private static CarFactory instance;
	
	private CarFactory() {};
	
	public static CarFactory getCarFactory() {
		if(instance == null)
			instance = new CarFactory();
		return instance;
	}
	
	//���忡�� �ڵ����� ����� method
	public Car creatCar() {
		Car car = new Car(); //Car instance ����
		return car;
	}
}
