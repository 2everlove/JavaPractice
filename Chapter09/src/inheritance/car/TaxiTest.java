package inheritance.car;

public class TaxiTest {

	public static void main(String[] args) {
		Taxi taxi1 = new Taxi("소나타", 200, 3);
		taxi1.showInfo();
		
		Taxi taxi2 = new Taxi("그랜져", 400, 1);
		taxi2.showInfo();
	}

}
