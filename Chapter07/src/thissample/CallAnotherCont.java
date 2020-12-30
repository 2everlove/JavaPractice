package thissample;

class Person {
	String name;
	int age;
	
	Person() { //this�� ����� Person(String, int) �����ڸ� ȣ��
		this("�̸�����", 1);
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() { //��ȯ���� Ŭ������
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
