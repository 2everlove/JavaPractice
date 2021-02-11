package innerclass;

class A{
	A(){
		System.out.println("A °´Ã¼°¡ »ý¼ºµÊ");
	}
	
	class B{//³»ºÎ Å¬·¡½º
		B(){
			System.out.println("B °´Ã¼°¡ »ý¼ºµÊ");
		}
	}
	
	static class C{
		C(){
			System.out.println("C °´Ã¼°¡ »ý¼ºµÊ");
		}
	}
	
	void method() {
		class D{
			D(){
				System.out.println("D °´Ã¼°¡ »ý¼ºµÊ");
			}
		}
		D d = new D();
	}
}

public class ATest {
	
	

	public static void main(String[] args) {
		A a = new A(); //¿ÜºÎ Å¬·¡½º
		
		A.B b = a.new B(); //³»ºÎ Å¬·¡½º BÀÇ °´Ã¼
		
		A.C c = new A.C(); //Á¤Àû ³»ºÎ Å¬·¡½º CÀÇ °´Ã¼
		
		a.method();
	}

}
