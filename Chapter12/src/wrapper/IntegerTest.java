package wrapper;

import java.util.ArrayList;

public class IntegerTest {

	public static void main(String[] args) {
		
//		Integer num1 = new Integer(100);
		Integer num1 = 100;
		int num2 = 200;
		int sum = num1.intValue()+num2;
				//Integer(크다) -> int형(작다) - 언박싱
		System.out.println(sum);
		
		//parseInt()의 method - 문자를 숫자로 변환
		int n1 = Integer.parseInt("300");  //오토박싱(int->Integer로 바꿈)
		System.out.println(n1);
		
		//ValueOf() method - 숫자나 문자를 숫자로 변환 (String->Integer)
		Integer n2 = Integer.valueOf("1000");
		System.out.println(n2);
		
		//ArrayList에서 사용하기
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
