package innerclass;

public class OuterTest {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.getRunnable().run();
		
		System.out.println("\n===interface형으로 형변환===");
		//Interface형으로 형변환
		Runnable runner = outer.getRunnable();
		runner.run();
	}

}
