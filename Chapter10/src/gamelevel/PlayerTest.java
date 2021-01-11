package gamelevel;

public class PlayerTest {

	public static void main(String[] args) {
		Player a1 = new Player();
		a1.play(1);
		
		//중급자 생성
		AdvancedLevel aLevel = new AdvancedLevel();
		a1.upgradePlayerLevel(aLevel);
		a1.play(1);
		
		//고급자 생성
		SuperLevel sLevel = new SuperLevel();
		a1.upgradePlayerLevel(sLevel);
		a1.play(1);
		
	}

}
