package template;

public abstract class Car { // �߻�Ŭ����
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	//template method ����
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();		
	}
}
