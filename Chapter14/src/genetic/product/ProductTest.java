package genetic.product;

public class ProductTest {

	public static void main(String[] args) {
		//TV����
		Product<TV,String> product1 = new Product<>();
		product1.setKind(new TV());
		product1.setModel("SmartTV");
		
		String tvModel = product1.getModel();
		System.out.println(tvModel+"�Դϴ�.");
		
		//Car����
		Product<Car, String> car1 = new Product<>();
		car1.setKind(new Car());
		car1.setModel("ElectronicCar");
		
		String carModel = car1.getModel();
		System.out.println(carModel+"�Դϴ�.");
	}

}
