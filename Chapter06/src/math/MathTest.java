package math;

public class MathTest {

	public static void main(String[] args) {
		// Math class의 method 사용하기
		// abs 구하기
		int a = -4;
		int b = 4;
		double c = 5.5;
		
		int v1 = Math.abs(a); //abs() static형이므로 클래스 이름으로 직접 접근
		System.out.println("절대값 : "+v1);
		
		long v2 = Math.round(c); //round()의 반환형이 long이므로 변수의 자료형도 long이다.
		System.out.println("반올림값(int) : "+v2);
		
		double v3 = Math.floor(c);
		System.out.println("버림값 : "+v3);
		
		double v4 = Math.ceil(c);
		System.out.println("반올림값(double) : "+v4);
		
		int v5 = Math.max(a, b);
		System.out.println("max : "+v5);
		
		double rand = Math.random(); // 0.0>= rand<1
		System.out.println("random : "+rand);
		
		//random()의 method를 이용해서 주사위 구현하기
		int dic = (int) (Math.random()*6) + 1; //0~5까지
		
		System.out.println("주사위 눈 : "+dic);
		
		
		
		
	}

}
