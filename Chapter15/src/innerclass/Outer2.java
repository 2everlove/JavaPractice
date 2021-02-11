package innerclass;

public class Outer2 {
	int outNum = 100;
	static int sNum = 200;
	
	//클래스 이름이 없는 객체
	Runnable runner = new Runnable(){
		int localNum = 20;	//익명 클래스
		
		@Override
		public void run() {
			localNum=30;
			System.out.println(outNum+"(외부 클래스의 인스턴스 변수)");
			System.out.println(sNum+"(외부 클래스의 정적 변수)");
			System.out.println(localNum+"(내부 클래스의 인스턴스 변수)");
		}
		
	}; //세미콜론 붙여야함
}
