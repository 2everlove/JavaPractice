package twodemension;

public class ClacScore {

	public static void main(String[] args) {
		// �л� 5���� ����, ���� ���� ���
		int[][] score = {
				{91, 79},
				{80, 50},
				{76, 60},
				{90, 40},
				{80, 81}
		};
		int[] total = {0, 0};
		int i,j;
		double[] avg = {0.0, 0.0};
		
		for(i=0; i<score.length; i++) {
			for(j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+" ");
			}
			System.out.println();
		}
		for(i=0; i<score.length; i++) {
			total[0] += score[i][0];
			total[1] += score[i][1];
		}
		System.out.println("�������� �հ� : "+total[0]);
		System.out.println("�������� �հ� : "+total[1]);
		
		avg[0] = (double)total[0]/score.length;
		avg[1] = (double)total[1]/score.length;
		System.out.println("�������� ��� : "+avg[0]);
		System.out.println("�������� ��� : "+avg[1]);
		
	}

}
