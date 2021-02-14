package lambda.functionalinterface;

public class FuncInterfaceTest2 {

	public static void main(String[] args) {
		MyFuncInterface2 fi = (x,y)->{
			int result = x+y+5;
			System.out.println(result);
		};
		fi.method(5,5);
		
//		//단축 표기
//		fi=x,y->System.out.println(x+y+5); //매개변수가 2개면 (x,y) 형태로 해야함
//		fi.method(10);
		
		//익명 객체 구현 - 람다식 x
		fi = new MyFuncInterface2() {
			
			@Override
			public void method(int x,int y) {
				System.out.println(x+y+100);
			}
		};
		fi.method(10,10);
		
	}
}
