package interfaceex.vehicle;

public class Driver {
	public void Drive(Vehicle veh) { //매개변수의 다형성
		veh.run();
	}
}
