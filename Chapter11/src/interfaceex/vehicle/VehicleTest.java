package interfaceex.vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		Driver a1 = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		a1.Drive(taxi);
		a1.Drive(bus);
		//매개변수로 객체를 전달
		a1.Drive(new Bus());
		a1.Drive(new Taxi());
	}

}
