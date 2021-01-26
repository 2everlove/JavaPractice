package object.equals;

public class EqualsTest {

	public static void main(String[] args) {
		//String의 인스턴스 비교
		String name1 = new String("삼성");
		String name2 = new String("삼성");
		
		//메모리 주소 동일 여부
		System.out.println(name1==name2); //false
		
		//문자열 값 동일 여부
		System.out.println(name1.equals(name2)); //true
		
		//Book의 인스턴스 비교
		Book book1 = new Book(101, "한강");
		Book book2 = new Book(101, "한강");
		
		System.out.println(book1==book2);
		
		System.out.println(book1.equals(book2));
		
	}

}
