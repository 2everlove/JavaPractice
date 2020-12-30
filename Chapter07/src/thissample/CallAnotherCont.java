package thissample;

class Person {
	String name;
	int age;
	
	Person() { //this를 사용해 Person(String, int) 생성자를 호출
		this("이름없음", 1);
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() { //반환형은 클래스형
		return this;
	}
	
}

public class CallAnotherCont {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person noName = new Person();
		System.out.println(noName.name+", "+noName.age);
		
		System.out.println(noName);
		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName.returnItSelf());
	}

}
