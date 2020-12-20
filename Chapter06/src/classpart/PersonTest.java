package classpart;

class Person1{
	String name;
	int age;
	char gender;	
}

public class PersonTest {

	public static void main(String[] args) {
		// 사람 클래스 사용하기
		Person1 person = new Person1(); //person -> 힙 메모리에 사용됨(주소)
		Person1 personLee = new Person1();
		
		person.age = 30;
		person.gender = 'M';
		person.name = "안민상";
		
		System.out.println("이름 : " + person.age);
		System.out.println("나이 : " + person.gender);
		System.out.println("성별 : " + person.name);
		System.out.println();
		//
		personLee.age = 30;
		personLee.gender = 'M';
		personLee.name = "안민상";
		
		System.out.println("이름 : " + personLee.age);
		System.out.println("나이 : " + personLee.gender);
		System.out.println("성별 : " + personLee.name);
		
		
		//student의 주소 알아보기 (메모리주소 알아보기)
		System.out.println(person);
		System.out.println(personLee);
		System.out.println(person==personLee);
		System.out.println(person.age==personLee.age);
	}

}
