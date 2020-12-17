package Arrayexample;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[3];
		int i;
				
		//nu.length가 배열의 길이(개수)
				System.out.printf("배열의 길이 : %d개\n", num.length);
				
		//배열에 값을 저장
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		
		for(i=0; i<num.length; i++)
			System.out.println(num[i]);
	}

}
