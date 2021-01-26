package object.tostring;

public class BookTest {

	public static void main(String[] args) {
		String name = new String("¹Úº¸°Ë");
		String name1 = "¼ÕÈï¹Î";
		System.out.println(name.toString());
		System.out.println(name1);
		
		Book b1 = new Book(101, "°³¹Ì");
//		b1.showInfo();
//		System.out.println(b1.showI());
		System.out.println(b1);
	}

}
