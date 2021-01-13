package interfaceex.remocon;

public class RemoteControlTest {

	public static void main(String[] args) {
		RemoteControl tv = new TV();
		tv.turnOn();
		tv.setVolume(12); //최대 10
		tv.setVolume(6);
		tv.setMute(true); //음소거
		tv.setMute(false);
		RemoteControl.changeBattery();
		tv.turnOff();
		
		System.out.println("===========");
		RemoteControl au = new Audio();
		au.turnOn();
		au.setVolume(4); //최소 0
		au.setVolume(-5);
		au.setMute(true); //음소거
		au.setMute(false);
		RemoteControl.changeBattery();
		au.turnOff();
	}

}
