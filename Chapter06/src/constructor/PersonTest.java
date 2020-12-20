package constructor;

public class PersonTest {

	public static void main(String[] args) {
		// person 자료형 사용하기
		Person person = new Person("안민상");
							//생성자
		//person.name = "안민상";
		person.height = 181F;
		person.weight = 64F;
		
		person.showInfo();

	}

}
