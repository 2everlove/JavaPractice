package multiinterface.myinterface;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mine = new MyClass();
		
//		mine.x();
//		mine.y();
//		mine.myMethod();
		System.out.println("myClass�� ���� �������̽� ������ ����ȯ ��");
		X xClass = mine;
		xClass.x();
		
		Y yClass = mine;
		yClass.y();
		
		System.out.println("���� ����� iClass ���");
		MyInterface iClass = mine;
		iClass.x();
		iClass.y();
		iClass.myMethod();
	}

}
