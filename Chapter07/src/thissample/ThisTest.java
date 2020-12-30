package thissample;

class BirthDay {
	int day;
	int month;
	int year;
	
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisTest {

	public static void main(String[] args) {
		// this
		BirthDay bDay = new BirthDay();
		bDay.year = 2020;
		System.out.println(bDay);
		System.out.println(bDay.getYear());
		bDay.printThis();
		
	}

}
