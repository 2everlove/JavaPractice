package innerclass;

public class OuterTest {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.getRunnable().run();
		
		System.out.println("\n===interface������ ����ȯ===");
		//Interface������ ����ȯ
		Runnable runner = outer.getRunnable();
		runner.run();
	}

}
