package gamelevel;

public class Player {
	private PlayerLevel level;
	
	public Player() {
		level = new Beginner();
		level.showLevelMessage();
	}
	
	public void upgradePlayerLevel(PlayerLevel level) { //�Ű������� ������
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
	
}
