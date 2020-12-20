package method;

public class OneUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = oneUp(10, 5);
		System.out.println("반환값 : " + num);

	}
	public static int oneUp(int x, int y) { //정수형 반환 메서드
		x = x + y;
		return x;
	}

}
