package interfaceex.vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		Driver a1 = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		a1.Drive(taxi);
		a1.Drive(bus);
		//�Ű������� ��ü�� ����
		a1.Drive(new Bus());
		a1.Drive(new Taxi());
	}

}
