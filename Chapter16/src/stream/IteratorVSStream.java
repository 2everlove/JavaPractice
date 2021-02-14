package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVSStream {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("가애플","나엘지","다삼성");
		//asList()는 ArrayList의 add() 기능과 같음
		System.out.println("===Iterator===");
		//Iterator 클래스 사용
		Iterator<String> ir = list.iterator();
		while(ir.hasNext()) {
			String name = ir.next();
			System.out.println(name);
		}
		
		System.out.println("===Stream===");
		//Stream 클래스 -> 람다식으로 표현
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name));
	}

}
