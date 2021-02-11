package innerinterface;

import innerinterface.Button.OnClickListener;

public class ButtonTest {

	public static void main(String[] args) {
		Button button = new Button();
		//CallListener 클래스의 객체 생성 - 매개변수 전달
		button.setListener(new CallListener());
		button.touch();
		
		button.setListener(new MessageListener());
		button.touch();
		
		button.setListener(new Button.OnClickListener() {

			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다.");
			}
			
		});
		button.touch();
		
		//익명 객체 - 검색 기능
		button.setListener(new OnClickListener() { //import로 Button 클래스 부름
			
			@Override
			public void onClick() {
				System.out.println("검색을 합니다.");
			}
		});
		button.touch();
		
	}

}
