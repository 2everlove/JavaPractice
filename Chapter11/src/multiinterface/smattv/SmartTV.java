package multiinterface.smattv;

public class SmartTV implements RemoteControl, Searchable {
	
	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url+"À» °Ë»öÇÕ´Ï´Ù.");
	}

	@Override
	public void turnOn() {
		System.out.println("SmartTV¸¦ ÄÕ´Ï´Ù.");
	}

	@Override
	public void turnOff() {
		System.out.println("SmartTV¸¦ ²ü´Ï´Ù.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("TV º¼·ý : "+this.volume);
	}
	
}
