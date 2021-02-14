package lambda;

@FunctionalInterface
interface PrintString{
	public void showString(String str);
}

public class LambdaTest {

	public static void main(String[] args) {
		PrintString lambdaPrint = s -> System.out.println(s);
		lambdaPrint.showString("Hello, Java");
		
		//PrintSting method ȣ��
		PrintString(lambdaPrint);
		
		//returnPrint() ȣ��
		PrintString str = returnPrint();
		str.showString("Hello, Java");
	}
	
	public static void PrintString(PrintString p) { //�Լ��� �������̽��� �Ű������� ���
		p.showString("Hello, Java");
	}
	
	public static PrintString returnPrint() {
		return s->System.out.println(s); //���ٽ��� ����
	}

}
