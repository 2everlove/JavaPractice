package wrapper;

import java.util.ArrayList;

public class IntegerTest {

	public static void main(String[] args) {
		
//		Integer num1 = new Integer(100);
		Integer num1 = 100;
		int num2 = 200;
		int sum = num1.intValue()+num2;
				//Integer(ũ��) -> int��(�۴�) - ��ڽ�
		System.out.println(sum);
		
		//parseInt()�� method - ���ڸ� ���ڷ� ��ȯ
		int n1 = Integer.parseInt("300");  //����ڽ�(int->Integer�� �ٲ�)
		System.out.println(n1);
		
		//ValueOf() method - ���ڳ� ���ڸ� ���ڷ� ��ȯ (String->Integer)
		Integer n2 = Integer.valueOf("1000");
		System.out.println(n2);
		
		//ArrayList���� ����ϱ�
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		
		for (int i=0; i<numbers.size();i++) {
			Integer num = numbers.get(i);
			System.out.println(num);
		}
		
//		for(int a : numbers) {
//			System.out.println(numbers);
//		}
	}

}
