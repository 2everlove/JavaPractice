package variablescope;



public class LocalVariable {
	
	static int y;
	
	//지연변수의 범위
	public  static int func1() {
		int x = 1; // 지역변수 x 선언
		x += 1;
		return x;
	}
	
	public static int func3() {
		y += 2;
		return y;
	}
	
	public static void main(String[] args) {
		
		System.out.println(func1());
		System.out.println(func1());
		//x의 생존범위 - 호출된 후 반환값을 주고 메모리에서 해제(소멸)
		
		//func1()의 x 변수 호출
		//System.out.println(x); 소멸해서 호출 불가
		
		System.out.println();
		
		
		System.out.println(func3());
		System.out.println(func3());
		System.out.println(func3());
		System.out.println(func3());
		System.out.println(func3());
		System.out.println(y);
		System.out.println(10==y);
		
		System.out.println(StaticVariable.func2());
		System.out.println(StaticVariable.func2());

	}

}
