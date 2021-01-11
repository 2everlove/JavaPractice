package finalex;

public class Constant {
	int num = 10; //variable
	final int MAX = 100; //const
	String name;
	
	public static void main(String[] args) {
		Constant cons = new Constant();
		cons.num = 20;
		//cons.MAX = 200; //final이 붙어서 수정 불가
		
		System.out.println(cons.num);
		System.out.println(cons.MAX);
	}
}
