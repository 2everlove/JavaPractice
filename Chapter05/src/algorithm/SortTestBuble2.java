package algorithm;

public class SortTestBuble2 {

	public static void main(String[] args) {
		// 오름차순 정렬 - 버블 정렬 방식
		char[] alphabets = {'N', 'E', 'T', 'C', 'X', 'B', 'Z', 'D', 'A'};
		char temp;
		int i,j;
		for(i=0; i<alphabets.length; i++) {
			for(j=0; j<alphabets.length-1; j++) {
				if(alphabets[j]>alphabets[j+1]) {
					temp = alphabets[j+1];
					alphabets[j+1] = alphabets[j];
					alphabets[j] = temp;
				}
			}
		}
		for(char ch : alphabets) {
			System.out.println((int)ch +", "+ch);
		}
	}

}
