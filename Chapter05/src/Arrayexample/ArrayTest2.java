package Arrayexample;

public class ArrayTest2 {

	public static void main(String[] args) {
		// 정수형 배열의 연산
		int[] num = new int[] {10, 20, 30};
		int i;
				
		//nu.length가 배열의 길이(개수)
				System.out.printf("배열의 길이 : %d개\n", num.length);
		
		//인덱싱 - 접근해서 값을 보는 것
		System.out.println(num[1]);
		
		//배열의 연산
		System.out.println(num[2] + 100);
		System.out.println(num[2]);
		System.out.println("-----------");
		//반복문으로 출력
		for(i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		System.out.println("-----------");
		//값을 수정, 변경
		num[2] = 230;
		System.out.println(num[2]);
		boolean compa;
		compa = (num[1] == 10);
		System.out.println(compa); // false
	}
	

}
