package math;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		// 영어 타자게임
		String[] data = {"bear", "dog", "cat", "duck", "cow", "pig","eagle","monkey",
				"lion", "tiger", "horse", "elephant"};
		int n = 1; //문제 번호
		long millisecond = 0; //java에서 1초는 1000이라서 long으로 세팅, 1s(ms) -> 1000
								//, currentTimeMillis()반환형이 long형
		
		System.out.println("영어 타자 연습");
		Scanner sc = new Scanner(System.in);
		millisecond = System.currentTimeMillis();
//		while(true) {
//			if)
//		
		for(int i=1; i<data.length; i++) {
			//단어 랜덤
			System.out.println("문제 "+ n);
			int rnd = (int) (Math.random()*data.length);
			String question = data[rnd];
			System.out.println(question);
			
			String answer = sc.next();
			
			while(true) {
				if(answer.equals(question)) {
					System.out.println("정답입니다.");
					n++;
					break;
				} else {
					System.out.println("오답입니다.");
					answer = sc.next();
				}
			}
			millisecond = System.currentTimeMillis() - millisecond; //소요시간 = 종료시간 - 시작시간
			System.out.println("게임 소요 시간 : " + (float)millisecond/1000 + "sec");
		}
		millisecond = System.currentTimeMillis() - millisecond; //소요시간 = 종료시간 - 시작시간
		System.out.println("게임 총소요 시간 : " + (float)millisecond/1000 + "sec");
		sc.close();		
	}

}
