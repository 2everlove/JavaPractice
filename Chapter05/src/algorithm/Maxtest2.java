package algorithm;

public class Maxtest2 {

	public static void main(String[] args) {
		// 최대값의 위치 번호 찾기
		int[] num = {3, 6, 9, 7, 4, 1};
		int maxIndex = 0; //0번째 위치 설정
		
		for(int i=1; i<num.length; i++) {
			if(num[i]>num[maxIndex]) {
				maxIndex = i;
			}
		}
		System.out.println("max index: num["+maxIndex+"]");
		System.out.println("max : "+num[maxIndex]);
	}

}
