package abstractsex.animal;

public abstract class Animal {
	public void eat() {
		System.out.println("�Դ´�");
	}
	
	public void sleep() {
		System.out.println("�ܴ�");
	}
	
	public abstract void cry(); //method�� abstract�� ������ class���� �ݵ�� abstract�� �־����.
}
