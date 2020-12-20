package variablescope;



public class StaticVariable {
	
	static int x;
	
	//정적(static)의 범위
		
	public static int func2() {
		x += 2;
		return x;
	}
	
	public static void main(String[] args) {
		
		System.out.println(func2());
		System.out.println(func2());
		System.out.println(func2());
		System.out.println(func2());
		System.out.println(func2());
		System.out.println(x);
		System.out.println(10==x);
		
		System.out.println(LocalVariable.func1());
		System.out.println(LocalVariable.func1());
		
		//x의 범위 - 호출된 후에도 소멸하지 않고 값을 유지하며
		//프로그램이 종료되어야 소멸한다.
	}

}
