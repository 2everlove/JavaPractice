package object.clone;

public class CircleTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle c1 = new Circle(10, 20, 50);
		System.out.println(c1);
		
		//circle °´Ã¼ º¹»ç
		Circle c2 = (Circle) c1.clone();
		System.out.println("\n=== c2 ===");
		System.out.println(c2);
	}

}
