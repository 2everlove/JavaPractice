package inheritance.car;

public class Taxi extends Car {
	int passenger;
	
	public Taxi(String brand, int cc, int passenger){
		super(brand, cc);
		this.passenger = passenger;
	}
	
	public void showInfo() {
		System.out.println("Â÷Á¾ : "+brand+", ¹è±â·® : "+cc+", ½Â°´¼ö : "+passenger);
	}
}
