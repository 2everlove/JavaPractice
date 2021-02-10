package collection.list;

import java.util.Stack;

class Coin{
	private int money; //동전 금액
	
	public Coin(int money) { //set역할
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
}


public class CoinStackTest {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>(); //stack은 queue와 다르게 class므로 new 생성 가능
		
		//객체 생성
		Coin coin500 = new Coin(500);
		Coin coin100 = new Coin(100);
		Coin coin50 = new Coin(50);
		Coin coin10 = new Coin(10);
		
		//객체 넣기
		coinBox.push(coin500); //1
		coinBox.push(coin100); //2
		coinBox.push(coin50);  //3
		coinBox.push(coin10);  //4
		
		//객체 꺼내기
//		System.out.println(coinBox.pop().getMoney()); //4
		while(!coinBox.isEmpty()) { //isEmpty() - boolean //비어있지 않으면 실행
			Coin coin = coinBox.pop();
			System.out.println("꺼내논 동전 : "+coin.getMoney()+"원");
		}
		
	}

}
