package innerinterface;

public class CallListener implements Button.OnClickListener{
	//Button 클래스의 OnClickListener 인터페이스를 구현한 클래스
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
	
}
