package math;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		// ���� Ÿ�ڰ���
		String[] data = {"bear", "dog", "cat", "duck", "cow", "pig","eagle","monkey",
				"lion", "tiger", "horse", "elephant"};
		int n = 1; //���� ��ȣ
		long millisecond = 0; //java���� 1�ʴ� 1000�̶� long���� ����, 1s(ms) -> 1000
								//, currentTimeMillis()��ȯ���� long��
		
		System.out.println("���� Ÿ�� ����");
		Scanner sc = new Scanner(System.in);
		millisecond = System.currentTimeMillis();
//		while(true) {
//			if)
//		
		for(int i=1; i<data.length; i++) {
			//�ܾ� ����
			System.out.println("���� "+ n);
			int rnd = (int) (Math.random()*data.length);
			String question = data[rnd];
			System.out.println(question);
			
			String answer = sc.next();
			
			while(true) {
				if(answer.equals(question)) {
					System.out.println("�����Դϴ�.");
					n++;
					break;
				} else {
					System.out.println("�����Դϴ�.");
					answer = sc.next();
				}
			}
			millisecond = System.currentTimeMillis() - millisecond; //�ҿ�ð� = ����ð� - ���۽ð�
			System.out.println("���� �ҿ� �ð� : " + (float)millisecond/1000 + "sec");
		}
		millisecond = System.currentTimeMillis() - millisecond; //�ҿ�ð� = ����ð� - ���۽ð�
		System.out.println("���� �Ѽҿ� �ð� : " + (float)millisecond/1000 + "sec");
		sc.close();		
	}

}
