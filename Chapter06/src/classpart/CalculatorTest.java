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
		
				
		System.out.println("���ϱ� : " + calc.add(num1, num2));
		System.out.println("���� : " + calc.sub(num1, num2));
		System.out.println("���ϱ� : " + calc.mul(num1, num2));
		System.out.println("������ : " + calc.div(num1, num2));
		
		System.out.println();
		
		System.out.println("���ϱ� : " + add);
		System.out.println("���� : " + sub);
		System.out.println("���ϱ� : " + mul);
		System.out.println("������ : " + div);
	}

}
