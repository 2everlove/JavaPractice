package inheritance.engineer;

public class Person {
	private static String name;
	private static int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
