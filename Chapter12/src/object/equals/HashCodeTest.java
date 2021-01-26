package object.equals;

public class HashCodeTest {

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		//"abc"문자열의 해쉬코드 값
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		@SuppressWarnings("deprecation")
		Integer i1 = new Integer(20);
		@SuppressWarnings("deprecation")
		Integer i2 = new Integer(20);
		
		//20의 해쉬코드 값
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		Book b1 = new Book(101, "개미");
		Book b2 = new Book(101, "개미");
		
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
	}

}
