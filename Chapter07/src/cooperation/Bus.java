package cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int income;
	
	public Bus(int busNumber) { //버스번호로 생성
		this.busNumber = busNumber;
	}
	
	public void take(int income) {
		this.income += income; //수입증가
		passengerCount++; //승객 1명 증가
	}
	
	public void showInfo() {
		System.out.printf("버스 %d번의 수입은 %,d원이고, 승객수는 %d명 입니다.\n", busNumber, income, passengerCount);
	}
}
