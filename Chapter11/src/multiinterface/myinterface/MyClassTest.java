package multiinterface.myinterface;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mine = new MyClass();
		
//		mine.x();
//		mine.y();
//		mine.myMethod();
		System.out.println("myClass는 상위 인터페이스 형으로 형변환 됨");
		X xClass = mine;
		xClass.x();
		
		Y yClass = mine;
		yClass.y();
		
		System.out.println("다중 상속한 iClass 출력");
		MyInterface iClass = mine;
		iClass.x();
		iClass.y();
		iClass.myMethod();
	}

}
