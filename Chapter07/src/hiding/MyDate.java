package hiding;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if (month == 2) {
			if(day<1 || day>28) {
				if(day==29) {
					if((year%4)==0 && (year%100)!=0 || (year%400)==0) {
						System.out.println("윤년입니다.");
						this.day = day;
					} else {
						System.out.println("날짜 오류입니다.");
					}
				}else {
					System.out.println("날짜 오류입니다.");
				}
			} else {
				this.day = day;
			}
		} else {
			this.day = day;
		}
	}

	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
