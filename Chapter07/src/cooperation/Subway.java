package cooperation;

public class Subway {
	int line;
	int passangerCount;
	int income;
	
	public Subway (int line) {
		this.line = line;
	}
	
	public void take(int income) {
		this.income += income;
		passangerCount++;
	}
	
	public void showInfo() {
		System.out.printf("����ö %dȣ���� ������ %,d���̰�, �°����� %d�� �Դϴ�.\n", line, income, passangerCount);
	}
}
