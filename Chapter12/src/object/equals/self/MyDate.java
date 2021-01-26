package object.equals.self;

public class MyDate {
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day =day;
		this.month =month;
		this.year =year;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {
			MyDate mydate = (MyDate) obj;
			if(this.day==mydate.day &&this.month==mydate.month&&this.year==mydate.year)
				return true;
		}
		return false;
	}
	
}
