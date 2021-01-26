package object.equals;

public class HashCodeTest {

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		//"abc"���ڿ��� �ؽ��ڵ� ��
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		@SuppressWarnings("deprecation")
		Integer i1 = new Integer(20);
		@SuppressWarnings("deprecation")
		Integer i2 = new Integer(20);
		
		//20�� �ؽ��ڵ� ��
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		Book b1 = new Book(101, "����");
		Book b2 = new Book(101, "����");
		
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
	}

}
