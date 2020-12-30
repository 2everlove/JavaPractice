package cooperation;

public class MainClass {

	public static void main(String[] args) {
		// 사람이 버스&지하철을 탄다.
		Person lee = new Person("이양파", 10000);
		Person son = new Person("손흥민", 20000);
		Bus bus100 = new Bus(100);
		Subway subway2 = new Subway(2);
		
		lee.takeBus(bus100);
		lee.takeSubway(subway2);
		lee.showInfo();		
		bus100.showInfo();
		System.out.println();
		son.takeSubway(subway2);
		son.showInfo();
		subway2.showInfo();
	}

}
