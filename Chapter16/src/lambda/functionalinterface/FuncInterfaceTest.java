package lambda.functionalinterface;

public class FuncInterfaceTest {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		//���ٽ� ǥ��
		fi=()->{
			String str = "Hello World";
			System.out.println(str);
		}; //�����ݷ� �ʼ�
		fi.method();
		
		//���� ǥ��
		fi=()->System.out.println("Hello World!!"); //�߰�ȣ ��������
		fi.method();
	}
}
