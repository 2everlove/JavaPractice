package classexam;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Person p1 = new Person();
		
		//object�� getClass() ���
		Class<?> pClass1 = p1.getClass();
		System.out.println(pClass1.getName()); // Ŭ���� ���� �̸� ��� classexam.Person
		
		//���� class����(������ �� ����) ����
		Class<?> pClass2 = Person.class;
		System.out.println(pClass2.getName()); // Ŭ���� ���� �̸� ��� classexam.Person
		
		//Ŭ���� �̸����� �������� - ����ó�� �ʿ� - web���� �ſ� ���� ����
		Class<?> pClass3 = Class.forName("classexam.Person");
		System.out.println(pClass3.getName()); // Ŭ���� ���� �̸� ��� classexam.Person
	}

}
