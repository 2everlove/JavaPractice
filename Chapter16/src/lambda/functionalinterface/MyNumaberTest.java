package lambda.functionalinterface;

public class MyNumaberTest {

	public static void main(String[] args) {
		MyNumber max;
		max=(x,y)->{
			int result = (x>y)?x:y;
			return result;			
		};
		System.out.println(max.getMax(10, 20));
		
		//단축표기 - return,중괄호 생략가능
		max=(x,y)-> x>y?x:y;
		System.out.println(max.getMax(25, 20));
	}

}
