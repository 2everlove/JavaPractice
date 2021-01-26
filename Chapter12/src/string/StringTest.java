package string;

public class StringTest {

	public static void main(String[] args) {
		
		String na1 = new String("김판서");
		String na2 = new String("김판서");
		
		System.out.println(na1==na2); //false - heap memory라서 address가 다름
		System.out.println(na1.equals(na2)); //true - already overriding
		
		String na3 = "abcd";
		String na4 = "abcd";
		
		System.out.println(na3==na4); //true - memory가 상수풀에 위치해서 address가 같다고 나옴
		System.out.println(na3.equals(na4)); //true
		
	}

}
