package multiinterface.smattv;

public interface RemoteControl {
	
	//interface const
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//abstract method
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//default method - 구현 method
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("음소거");
		} else {
			System.out.println("음소거 해제");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지 교환");
	}
	
	
	
}
