package multiinterface.smattv;

public class SmartTVTest {

	public static void main(String[] args) {
		SmartTV s1 = new SmartTV();
		s1.turnOn();
		s1.search("youtube");
		s1.setVolume(-1);
		s1.setVolume(12);
		s1.setMute(true);
		s1.setMute(false);
		RemoteControl.changeBattery();
		s1.turnOff();
	}

}
