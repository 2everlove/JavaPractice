package method;

public class SayHello {
	//sayHello() 메소드 만들기 - 반환 자료가 없다.(void)
	public static void sayHello() {
		System.out.println("Hello~ ");
	}
	
	//sayHello2() 메소드 만들기 -> 매개 변수(전달하는 변수)가 있는 메서드
	public static void sayHello2(String name) {
		System.out.println("Hello~ " + name);
	}

	public static void main(String[] args) {

		sayHello(); // sayHello() 메서드 호출
		
		sayHello2("안민상"); // sayHello2() 메서드 호출
		
		sayHello2("steve");

	}

}
