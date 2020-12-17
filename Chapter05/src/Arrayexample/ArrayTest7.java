package Arrayexample;

public class ArrayTest7 {

	public static void main(String[] args) {
		// 문자열 배열 생성 및 알파벳 저장
		String[] comLang = new String[4];
		int i;
		//저장
		comLang[0] = "Java";
		comLang[1] = "C++";
		comLang[2] = "Python";
		comLang[3] = "Javascript";
		
		//
		for(i=0; i<comLang.length; i++) {
			System.out.println(comLang[i]);
		}
		System.out.println("=============");
		
		//향상된 for문
		for(String lang : comLang) { //자료형 변수(int or String) : 배열 이름
			System.out.println(lang); //출력 = 변수
		}
		
	}
	

}
