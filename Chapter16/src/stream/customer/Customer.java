package stream.customer;

public class Customer {
	private String name;
	private int age;
	private int cost;
	
	public Customer(String name, int age, int cost) {
		this.name = name;
		this.age = age;
		this.cost = cost;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getCost() {
		return cost;
	}
}
