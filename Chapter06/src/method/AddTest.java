package method;

public class AddTest {
	//전역변수(global) - 누적되는 값
	// 두 수를 더하는 메서드(매개변수가 2개임)
	public static int add(int n1, int n2) { //static형 메서드 - new가 필요없다.
		//지역변수 - 사라지는 값 - stack
		int result;
		result = n1 + n2;
		return result;
	}

	public static void main(String[] args) {
		// add() 함수 호출
		int num1 = 10, num2 = -10;
		int sum = add(num1, num2);
		System.out.println("합계 : " + (double)sum);
	}

}
