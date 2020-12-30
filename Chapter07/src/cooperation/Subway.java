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
		System.out.printf("지하철 %d호선의 수입은 %,d원이고, 승객수는 %d명 입니다.\n", line, income, passangerCount);
	}
}
