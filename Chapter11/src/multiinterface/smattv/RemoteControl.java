package multiinterface.smattv;

public interface RemoteControl {
	
	//interface const
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//abstract method
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//default method - ���� method
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("���Ұ�");
		} else {
			System.out.println("���Ұ� ����");
		}
	}
	
	static void changeBattery() {
		System.out.println("������ ��ȯ");
	}
	
	
	
}
