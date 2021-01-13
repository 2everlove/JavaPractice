package interfaceex.calculator;

public interface Calculator {
	
	int add(int n1, int n2); //abstract method
	int sub(int n1, int n2);
	int mul(int n1, int n2);
	int div(int n1, int n2);
	int ERROR = -999; //변수 -> 상수로 전환됨
}
