package overide.airplane;

public class AirPlaneTest {

	public static void main(String[] args) {
//		AirPlane a1 = new AirPlane();
//		a1.fly();
		
		SuperSonicAirPlane a2 = new SuperSonicAirPlane();
		a2.takeOff();
		a2.fly();
		a2.flyMode = SuperSonicAirPlane.getSuperSonic();
		//class �̸����� ���� ���� - static ����̹Ƿ�..
		a2.fly();
		a2.flyMode = SuperSonicAirPlane.getNormal();
		a2.fly();
		a2.land();
	}

}
