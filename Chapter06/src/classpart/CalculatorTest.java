package classpart;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		int num1 = 10, num2 = 4;
		
		int add = calc.add(num1, num2);
		int sub = calc.sub(num1, num2);
		int mul = calc.mul(num1, num2);
		int div = calc.div(num1, num2);
		
				
		System.out.println("더하기 : " + calc.add(num1, num2));
		System.out.println("빼기 : " + calc.sub(num1, num2));
		System.out.println("곱하기 : " + calc.mul(num1, num2));
		System.out.println("나누기 : " + calc.div(num1, num2));
		
		System.out.println();
		
		System.out.println("더하기 : " + add);
		System.out.println("빼기 : " + sub);
		System.out.println("곱하기 : " + mul);
		System.out.println("나누기 : " + div);
	}

}
