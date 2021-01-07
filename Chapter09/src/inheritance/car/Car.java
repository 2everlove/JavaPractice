package inheritance.car;

public class Car {
	String brand;
	int cc;
	
	public Car(String brand, int cc) {
		this.brand = brand;
		this.cc = cc;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
