package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVSStream {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("������","������","�ٻＺ");
		//asList()�� ArrayList�� add() ��ɰ� ����
		System.out.println("===Iterator===");
		//Iterator Ŭ���� ���
		Iterator<String> ir = list.iterator();
		while(ir.hasNext()) {
			String name = ir.next();
			System.out.println(name);
		}
		
		System.out.println("===Stream===");
		//Stream Ŭ���� -> ���ٽ����� ǥ��
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name));
	}

}
