package collection.list;

import java.util.Stack;

class Coin{
	private int money; //���� �ݾ�
	
	public Coin(int money) { //set����
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
}


public class CoinStackTest {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>(); //stack�� queue�� �ٸ��� class�Ƿ� new ���� ����
		
		//��ü ����
		Coin coin500 = new Coin(500);
		Coin coin100 = new Coin(100);
		Coin coin50 = new Coin(50);
		Coin coin10 = new Coin(10);
		
		//��ü �ֱ�
		coinBox.push(coin500); //1
		coinBox.push(coin100); //2
		coinBox.push(coin50);  //3
		coinBox.push(coin10);  //4
		
		//��ü ������
//		System.out.println(coinBox.pop().getMoney()); //4
		while(!coinBox.isEmpty()) { //isEmpty() - boolean //������� ������ ����
			Coin coin = coinBox.pop();
			System.out.println("������ ���� : "+coin.getMoney()+"��");
		}
		
	}

}
