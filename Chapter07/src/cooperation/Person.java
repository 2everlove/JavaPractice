package cooperation;

public class Person {
	String name;
	int money;
	int age;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1250);
		this.money -= 1250;
	}
	
	public void showInfo() {
		System.out.printf("%s님의 남은돈은 %,d원입니다.\n", name, money);
	}
}
