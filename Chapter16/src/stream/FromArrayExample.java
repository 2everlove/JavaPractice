package stream;

import java.util.Arrays;

public class FromArrayExample {

	public static void main(String[] args) {
		//String�� �迭 ����
		String[] fruit = {"apple","peach","banna"};
		
		System.out.println("===Enhanced For===");
		for(String name : fruit) {
			System.out.println(name);
		}
		
		System.out.println("===Stream===");
		//Stream �� - Consumer���̶� �ѹ� ����ϸ� ������, �ٽ� ����Ϸ��� �ٽ� ����������� // str = Arrays.stream(fruit);
//		Stream<String> str = Arrays.stream(fruit);
//		str.forEach(f -> System.out.println(f));
		Arrays.stream(fruit).forEach(f->System.out.println(f)); //�����
		//stream(T[])�� �Ű������� �迭�� ���޵�
		
		System.out.println("===int array===");
		//int�� �迭
		int[] num = {1,2,3,4,5};
		Arrays.stream(num).forEach(n->System.out.println(n));
		
		//�հ� �� ���� ���ϱ�
		int sum = Arrays.stream(num).sum();
		int count = (int) Arrays.stream(num).count(); //count�� long���̹Ƿ� cast�� (int)������ ��ȯ
		
		System.out.println("�迭�� �հ� : "+sum);
		System.out.println("�迭�� ���� : "+count);
		
	}

}
