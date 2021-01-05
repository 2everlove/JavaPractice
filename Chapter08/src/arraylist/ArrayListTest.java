package arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// ArrayList를 생성하여 String class형 요소 저장
		ArrayList<String> fruitList = new ArrayList<>();
		
		//String class형 elements 저장 - add()
		fruitList.add("사과");
		fruitList.add("바나나");
		fruitList.add("파인애플");
		fruitList.add("포도");
		
		//개수 - size()
		System.out.printf("리스트의 개수 : %d개\n", fruitList.size());
		
		System.out.println("\n=whole print=");
		//element position print - get()
		for(int i=0; i<fruitList.size(); i++) {
			String fruit = fruitList.get(i);
			System.out.println("과일 이름 : "+fruit);
		}
		System.out.println("\n=enhanced for=");
		for(String fruit1 : fruitList)
			System.out.println(fruit1);
		
		//element remove 
		System.out.println("\n=remove=");
		fruitList.remove(0);
		System.out.println(fruitList.get(0));
		System.out.println(fruitList.get(2));
		
		
	}

}
