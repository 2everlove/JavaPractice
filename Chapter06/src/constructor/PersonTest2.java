package constructor;

public class PersonTest2 {

	public static void main(String[] args) {
		// person 자료형 사용하기
		Person son = new Person();
							//생성자
		
		//자료 입력
		son.name = "안민상";
		son.height = 181F;
		son.weight = 64F;
		
		//자료 출력
		son.showInfo();
		
		//매개변수가 있는 생성자
		Person chu = new Person("추", 180.3F, 75.5F);
		chu.showInfo();

	}

}
