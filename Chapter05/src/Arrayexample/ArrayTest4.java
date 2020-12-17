package Arrayexample;

public class ArrayTest4 {

	public static void main(String[] args) {
		// 실수형 배열 생성&연산
		double[] data = new double[5];
		int i;
		double total = 0.0, times = 0.0;
		
		//저장
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		//배열의 크기
		System.out.printf("배열의 길이 : %d개\n", data.length);
		
		//출력
		
		for(i=0; i<data.length; i++) {
			System.out.println(data[i]);
			total += data[i];
			times *= data[i];
		}
		System.out.println("총합 : " + total);
		System.out.println("총곱 : " + times);
	}
	

}
