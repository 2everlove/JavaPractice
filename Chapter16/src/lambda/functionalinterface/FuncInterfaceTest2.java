package lambda.functionalinterface;

public class FuncInterfaceTest2 {

	public static void main(String[] args) {
		MyFuncInterface2 fi = (x,y)->{
			int result = x+y+5;
			System.out.println(result);
		};
		fi.method(5,5);
		
//		//���� ǥ��
//		fi=x,y->System.out.println(x+y+5); //�Ű������� 2���� (x,y) ���·� �ؾ���
//		fi.method(10);
		
		//�͸� ��ü ���� - ���ٽ� x
		fi = new MyFuncInterface2() {
			
			@Override
			public void method(int x,int y) {
				System.out.println(x+y+100);
			}
		};
		fi.method(10,10);
		
	}
}
