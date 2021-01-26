package classexam;

public class Person {
	private String name;
	private int age;
	
	public Person() {}
	public Person(String name) {
		this.name = name;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//get()/set() ���� - alt+shift+s -> generate getter/setter ->�������� get/set �� �ϴ°��� ��Ģ!
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
