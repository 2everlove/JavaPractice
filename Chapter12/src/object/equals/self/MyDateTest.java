package object.equals.self;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate d1 = new MyDate(9,18,2004);
		MyDate d2 = new MyDate(9,18,2004);
		System.out.println(d1.equals(d2));
	}

}
