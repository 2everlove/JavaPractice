package method;

class Gugudan{
	//gugudan 출려 매서드 만들기 (인스턴스형 메서드 -> new 필요 | static형 메서드)
	public void gugudan(int dan) { //int dan = scanner와 같은 기능(함수 입력기능 -> 매개변수)
		System.out.println("구구단을 출력합니다.");
		for(int i=1; i<10; i++) {
			System.out.println(dan + "X" + i + "=" + (dan*i));
		}
		//return;  --void가 있으면 반환할 값이 없기때문에 return 이 필요없다.
	}
}

public class GugudanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gugudan gu = new Gugudan();

		gu.gugudan(7);		
	}

}
