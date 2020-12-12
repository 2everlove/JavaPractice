package variable;

import java.text.DecimalFormat;

public class Sample01 {

	public static void main(String[] args) {
		// 변수 사용하기
		char ch = 'm'; //변수 선언과 초기화 (문자형 변수 ch 만들기 및 'm'을 저장)
		ch ='L';
		
		int price = 15000; //정수형 변수 price 생성 및 15000 대입
		System.out.println(ch + "사이즈, "  + price +"원"); // '+'는 연결연산자
		
		DecimalFormat myFormatter = new DecimalFormat("###,###");
		System.out.println(myFormatter.format(price)+"원");
		

		
		// 문자열 변수 사용
		String name = "손흥민";
		name = "박인비";
		name = "이양파";

		System.out.println(name);
	}

}
