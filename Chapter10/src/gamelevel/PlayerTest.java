package gamelevel;

public class PlayerTest {

	public static void main(String[] args) {
		Player a1 = new Player();
		a1.play(1);
		
		//�߱��� ����
		AdvancedLevel aLevel = new AdvancedLevel();
		a1.upgradePlayerLevel(aLevel);
		a1.play(1);
		
		//����� ����
		SuperLevel sLevel = new SuperLevel();
		a1.upgradePlayerLevel(sLevel);
		a1.play(1);
		
	}

}
