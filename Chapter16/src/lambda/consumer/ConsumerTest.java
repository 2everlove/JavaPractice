package lambda.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public class ConsumerTest {

	public static void main(String[] args) {
		//�Լ��� �������̽� ��� - �Ű����� 1��
		Consumer<String> consumer = t -> System.out.println(t+" 8");
		consumer.accept("Java");
		
		//�Ű����� 2��
		BiConsumer<String, String> biConsumer = (t,v) -> System.out.println(t+" "+v);
		biConsumer.accept("Java", "8");
		
		//�Ű����� �Ǽ�
		DoubleConsumer doubleConsumer = d -> System.out.println("Java "+(int)d);
		doubleConsumer.accept(8.0);
	}

}
