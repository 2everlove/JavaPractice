package gamelevel;

public abstract class PlayerLevel { //abstract class
	public abstract void run(); //abstract method
	public abstract void jump();
	public abstract void turn();	
	public abstract void showLevelMessage(); //constructor에서 자동으로 나오게 생성
	
	//template method 정의
	public final void go(int count) { // count -점프횟수
		run();
		for(int i =1; i<=count; i++) {
			int sum = 0;
			sum += i;
			jump();
		}
		
		turn();
	}
}
