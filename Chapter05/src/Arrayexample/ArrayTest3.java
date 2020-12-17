package Arrayexample;

public class ArrayTest3 {

	public static void main(String[] args) {
		// 정수형 배열 연산 - 총점과 평균
		int[] arr = {90, 70, 80, 100}; //정수형 배열 arr에 4개의 정수 저장
		int i,j, temp;
		int sum = 0;
		double avg = 0.0;
		
		//배열의 값 더하기
		for(i=0; i<arr.length; i++) {
			sum = sum + arr[i]; //누적 더하기
			System.out.println(sum);
		}
		avg = ((double)sum / arr.length);
		System.out.println("--------");
		System.out.println("배열의 합계 : " + sum);
		System.out.println("배열의 평균 : " + avg);
		
		for(i=1; i<arr.length; i++) {
			temp = arr[i];
			j=0;
			for(j=i-1; j>=0; j--) {
				if(arr[j]>temp) {
					arr[j+1] = arr[j];
				} else {
					break;
				}
			}
			arr[j+1] = temp;
		}
		for(int a : arr) {
			System.out.printf("%d ", a);
		}
		
	}
	

}
