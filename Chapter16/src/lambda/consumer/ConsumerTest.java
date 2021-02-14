package lambda.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public class ConsumerTest {

	public static void main(String[] args) {
		//함수적 인터페이스 사용 - 매개변수 1개
		Consumer<String> consumer = t -> System.out.println(t+" 8");
		consumer.accept("Java");
		
		//매개변수 2개
		BiConsumer<String, String> biConsumer = (t,v) -> System.out.println(t+" "+v);
		biConsumer.accept("Java", "8");
		
		//매개변수 실수
		DoubleConsumer doubleConsumer = d -> System.out.println("Java "+(int)d);
		doubleConsumer.accept(8.0);
	}

}
