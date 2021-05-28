package algorithm;

public class Maxtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {3, 6, 9, 7, 4, 1};
		int max = num[0];
		for(int i=1; i<num.length; i++) {
			if(num[i]>max) {
				max = num[i];
			}
		}
		System.out.println("max : "+max);
	}

}
