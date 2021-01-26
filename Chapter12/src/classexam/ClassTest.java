package classexam;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Person p1 = new Person();
		
		//object의 getClass() 사용
		Class<?> pClass1 = p1.getClass();
		System.out.println(pClass1.getName()); // 클래스 파일 이름 출력 classexam.Person
		
		//직접 class파일(컴파일 된 파일) 대입
		Class<?> pClass2 = Person.class;
		System.out.println(pClass2.getName()); // 클래스 파일 이름 출력 classexam.Person
		
		//클래스 이름으로 가져오기 - 예외처리 필요 - web에서 매우 자주 쓰임
		Class<?> pClass3 = Class.forName("classexam.Person");
		System.out.println(pClass3.getName()); // 클래스 파일 이름 출력 classexam.Person
	}

}
