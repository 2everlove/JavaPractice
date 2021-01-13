package interfaceex.calculator;

public class MyCalculator implements Calculator {

	@Override
	public int add(int n1, int n2) {
		return n1+n2;
	}

	@Override
	public int sub(int n1, int n2) {
		return n1-n2;
	}

	@Override
	public int mul(int n1, int n2) {
		return n1*n2;
	}

	@Override
	public int div(int n1, int n2) {
		if(n2 != 0) {
			return n1/n2;
		} else
		return ERROR;
	}
	
	public void showInfo() {
		System.out.println("정수형 계산기입니다.");
	}

}
