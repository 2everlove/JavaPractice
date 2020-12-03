
public class array {

	public static void main(String[] args) {
		int [] score = new int[20];
		
		for(int i=0; i<score.length; i++)
			score[i] = i+1;
		int temp = 0;
		int j = 0;
		
		for(int i=0; i<100; i++) {
			j = (int)(Math.random() * 20);
		temp = score[0];
		score[0] = score[j];
		score[j] = temp;
		}
		for(int i=0; i<5; i++)
			System.out.println(score[i]+" ");
	}

}
