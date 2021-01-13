package interfaceex.remocon;

public class RemoteControlTest {

	public static void main(String[] args) {
		RemoteControl tv = new TV();
		tv.turnOn();
		tv.setVolume(12); //�ִ� 10
		tv.setVolume(6);
		tv.setMute(true); //���Ұ�
		tv.setMute(false);
		RemoteControl.changeBattery();
		tv.turnOff();
		
		System.out.println("===========");
		RemoteControl au = new Audio();
		au.turnOn();
		au.setVolume(4); //�ּ� 0
		au.setVolume(-5);
		au.setMute(true); //���Ұ�
		au.setMute(false);
		RemoteControl.changeBattery();
		au.turnOff();
	}

}
