package template;

public abstract class Car { // 추상클래스
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//template method 정의
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();		
	}
}
