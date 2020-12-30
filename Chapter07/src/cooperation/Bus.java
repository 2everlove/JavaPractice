package cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int income;
	
	public Bus(int busNumber) { //������ȣ�� ����
		this.busNumber = busNumber;
	}
	
	public void take(int income) {
		this.income += income; //��������
		passengerCount++; //�°� 1�� ����
	}
	
	public void showInfo() {
		System.out.printf("���� %d���� ������ %,d���̰�, �°����� %d�� �Դϴ�.\n", busNumber, income, passengerCount);
	}
}
