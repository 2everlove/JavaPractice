package lambda.supplier;

import java.util.function.IntSupplier;

public class SupplierExample {

	public static void main(String[] args) {
		//Supplier 함수형 인터페이스
		//IntSupplier -> 매개값이 없고, 리턴값이 있음
		IntSupplier intSupplier = () -> (int) (Math.random()*6)+1;

		int diceN = intSupplier.getAsInt();
		System.out.println("주사위 눈 : "+diceN);
	}

}
