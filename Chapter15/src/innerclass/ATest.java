package innerclass;

class A{
	A(){
		System.out.println("A ��ü�� ������");
	}
	
	class B{//���� Ŭ����
		B(){
			System.out.println("B ��ü�� ������");
		}
	}
	
	static class C{
		C(){
			System.out.println("C ��ü�� ������");
		}
	}
	
	void method() {
		class D{
			D(){
				System.out.println("D ��ü�� ������");
			}
		}
		D d = new D();
	}
}

public class ATest {
	
	

	public static void main(String[] args) {
		A a = new A(); //�ܺ� Ŭ����
		
		A.B b = a.new B(); //���� Ŭ���� B�� ��ü
		
		A.C c = new A.C(); //���� ���� Ŭ���� C�� ��ü
		
		a.method();
	}

}
