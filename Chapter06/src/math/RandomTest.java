package math;

import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] word = {"나","너","우리","세계","우주"};
		int rnd = (int) (Math.random()*word.length);
		String temp = word[rnd];
		System.out.println(temp);
		String key=sc.nextLine();
//		if(key temp) {
//			System.out.println("정답입니다.");
//		} else {
//			System.out.println("오답입니다.");
//		}
		
		
	}

}
