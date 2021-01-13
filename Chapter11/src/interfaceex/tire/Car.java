package interfaceex.tire;

public class Car {
	Tire frontLeft = new HanTire(); //member variable(object) =field
	Tire frontRight = new HanTire();
	Tire bakeLeft = new HanTire();
	Tire bakcRight = new HanTire();
	
	public void run() {
		frontLeft.roll(); //"roll" method
		frontRight.roll();
		bakeLeft.roll();
		bakcRight.roll();
	}
}
