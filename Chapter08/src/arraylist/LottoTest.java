package arraylist;

import java.util.ArrayList;

public class LottoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];

		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
		}
		for(int a : lotto)
		System.out.printf("%d ", a);
		System.out.println();
		//ArrayList·Î ±¸Çö
		
		ArrayList<Integer> lotto2 = new ArrayList<>();
		for (int i=0; i<6; i++) {
			lotto2.add((int)(Math.random()*45)+1);
		}
		for(int i=0; i<lotto2.size(); i++) {
			Integer list = lotto2.get(i);
			System.out.print(list + " ");
		}
			
	}
	


}
