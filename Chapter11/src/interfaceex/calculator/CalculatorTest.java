package interfaceex.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		MyCalculator calc = new MyCalculator();
		
		int a=10, b=5, c=0;
		
		System.out.println(calc.add(a,b));
		System.out.println(calc.sub(a,b));
		System.out.println(calc.mul(a,b));
		System.out.println(calc.div(a,b));
		System.out.println(calc.div(a,c));
		
	}

}
