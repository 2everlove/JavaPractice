package lambda.functionalinterface;

public class FuncInterfaceTest {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		//람다식 표기
		fi=()->{
			String str = "Hello World";
			System.out.println(str);
		}; //세미콜론 필수
		fi.method();
		
		//단축 표기
		fi=()->System.out.println("Hello World!!"); //중괄호 생략가능
		fi.method();
	}
}
