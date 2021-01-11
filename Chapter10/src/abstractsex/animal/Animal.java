package abstractsex.animal;

public abstract class Animal {
	public void eat() {
		System.out.println("먹는다");
	}
	
	public void sleep() {
		System.out.println("잔다");
	}
	
	public abstract void cry(); //method에 abstract가 붙으면 class에도 반드시 abstract를 넣어야함.
}
