package stream;

import java.util.Arrays;

public class FromArrayExample {

	public static void main(String[] args) {
		//String형 배열 선언
		String[] fruit = {"apple","peach","banna"};
		
		System.out.println("===Enhanced For===");
		for(String name : fruit) {
			System.out.println(name);
		}
		
		System.out.println("===Stream===");
		//Stream 형 - Consumer형이라 한번 사용하면 사용못함, 다시 사용하려면 다시 선언해줘야함 // str = Arrays.stream(fruit);
//		Stream<String> str = Arrays.stream(fruit);
//		str.forEach(f -> System.out.println(f));
		Arrays.stream(fruit).forEach(f->System.out.println(f)); //축약형
		//stream(T[])의 매개변수로 배열이 전달됨
		
		System.out.println("===int array===");
		//int형 배열
		int[] num = {1,2,3,4,5};
		Arrays.stream(num).forEach(n->System.out.println(n));
		
		//합계 및 개수 구하기
		int sum = Arrays.stream(num).sum();
		int count = (int) Arrays.stream(num).count(); //count가 long형이므로 cast로 (int)형으로 변환
		
		System.out.println("배열의 합계 : "+sum);
		System.out.println("배열의 개수 : "+count);
		
	}

}
