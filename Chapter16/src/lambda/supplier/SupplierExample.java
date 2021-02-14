package lambda.supplier;

import java.util.function.IntSupplier;

public class SupplierExample {

	public static void main(String[] args) {
		//Supplier �Լ��� �������̽�
		//IntSupplier -> �Ű����� ����, ���ϰ��� ����
		IntSupplier intSupplier = () -> (int) (Math.random()*6)+1;

		int diceN = intSupplier.getAsInt();
		System.out.println("�ֻ��� �� : "+diceN);
	}

}
