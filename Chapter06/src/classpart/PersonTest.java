package classpart;

class Person1{
	String name;
	int age;
	char gender;	
}

public class PersonTest {

	public static void main(String[] args) {
		// ��� Ŭ���� ����ϱ�
		Person1 person = new Person1(); //person -> �� �޸𸮿� ����(�ּ�)
		Person1 personLee = new Person1();
		
		person.age = 30;
		person.gender = 'M';
		person.name = "�ȹλ�";
		
		System.out.println("�̸� : " + person.age);
		System.out.println("���� : " + person.gender);
		System.out.println("���� : " + person.name);
		System.out.println();
		//
		personLee.age = 30;
		personLee.gender = 'M';
		personLee.name = "�ȹλ�";
		
		System.out.println("�̸� : " + personLee.age);
		System.out.println("���� : " + personLee.gender);
		System.out.println("���� : " + personLee.name);
		
		
		//student�� �ּ� �˾ƺ��� (�޸��ּ� �˾ƺ���)
		System.out.println(person);
		System.out.println(personLee);
		System.out.println(person==personLee);
		System.out.println(person.age==personLee.age);
	}

}
