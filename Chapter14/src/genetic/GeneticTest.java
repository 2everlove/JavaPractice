package genetic;

import java.util.ArrayList;

public class GeneticTest {

	public static void main(String[] args) {
		/*
		 * //ArrayList 사용 ArrayList list = new ArrayList();
		 * 
		 * //요소 저장 list.add("귤"); list.add("감"); list.add("배");
		 * 
		 * //요소 가져오기 String fruit = (String) list.get(2); //타입 변환 //타입 변환을 해야 함(Object
		 * -> String) System.out.println(fruit);
		 */
		
		//제너틱 프로그래밍
		ArrayList<String> list = new ArrayList<>();
		
		//요소 저장 
		list.add("귤"); 
		list.add("감"); 
		list.add("배");
		
		//요소 가져오기 
		String fruit = (String) list.get(2); //타입 변환 
		//타입 변환을 해야 함(Object -> String) 
		System.out.println(fruit);
	}

}
