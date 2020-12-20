package math;

public class MathTest {

	public static void main(String[] args) {
		// Math class�� method ����ϱ�
		// abs ���ϱ�
		int a = -4;
		int b = 4;
		double c = 5.5;
		
		int v1 = Math.abs(a); //abs() static���̹Ƿ� Ŭ���� �̸����� ���� ����
		System.out.println("���밪 : "+v1);
		
		long v2 = Math.round(c); //round()�� ��ȯ���� long�̹Ƿ� ������ �ڷ����� long�̴�.
		System.out.println("�ݿø���(int) : "+v2);
		
		double v3 = Math.floor(c);
		System.out.println("������ : "+v3);
		
		double v4 = Math.ceil(c);
		System.out.println("�ݿø���(double) : "+v4);
		
		int v5 = Math.max(a, b);
		System.out.println("max : "+v5);
		
		double rand = Math.random(); // 0.0>= rand<1
		System.out.println("random : "+rand);
		
		//random()�� method�� �̿��ؼ� �ֻ��� �����ϱ�
		int dic = (int) (Math.random()*6) + 1; //0~5����
		
		System.out.println("�ֻ��� �� : "+dic);
		
		
		
		
	}

}
