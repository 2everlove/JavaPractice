package innerclass;


class OutClass {
	int num =10;
	static int sNum = 20;
	
	static class InClass{ //정적 내부 클래스
		int inNum=100;
		static int sInNum = 200;
		
		void inTest() {
//			System.out.println(num+"(외부 클래스의 인스턴스 변수 사용)");
			System.out.println(sNum+"(외부 클래스의 정적 변수 사용)");
			System.out.println(inNum+"(내부 클래스의 인스턴스 변수 사용)");
			System.out.println(sInNum+"(내부 클래스의 정적 변수 사용)");
		}
		static void sTest() {
//			System.out.println(num+"(외부 클래스의 인스턴스 변수 사용)");
			System.out.println(sNum+"(외부 클래스의 정적 변수 사용)");
//			System.out.println(inNum+"(내부 클래스의 인스턴스 변수 사용)");
			System.out.println(sInNum+"(내부 클래스의 정적 변수 사용)");
		}
	}
}


public class StaticInnerClassTest {

	public static void main(String[] args) {
		OutClass.InClass in = new OutClass.InClass();
		System.out.println("***정적 내부 클래스의 일반 메서드 호출***");
		in.inTest();
		System.out.println("***정적 내부 클래스의 정적 메서드 호출***");
//		in.sTest();
		OutClass.InClass.sTest(); //외부클래스.내부클래스로 직접 접근
	}

}
