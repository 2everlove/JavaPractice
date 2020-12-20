package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person() {  //기본 생성자 - 매개변수가 없으면 생략가능
		// System.out.println("운동선수 프로필\n"); //얘가 먼저 출력됨
	
	}
	
	public Person(String na) {  //외부에서 입력(전달) 변수
		name = na;
	}
	
	public Person(String na, float hei, float wei) {  //외부에서 입력(전달) 변수
		name = na; //외부변수의 초기화
		height = hei;
		weight = wei;
	}
	
	//정보 출력 method
	public void showInfo() {
		System.out.println("이름 : "+ name + "\n키 : "+height+"\n몸무게 : "+ weight + "\n");
	}
}

