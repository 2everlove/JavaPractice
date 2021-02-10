package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> fruitSet = new HashSet<>(); //그냥 Set으로 구현이 안되므로 new HashSet을 생성해줘야함
		
		//객체저장
		fruitSet.add("귤"); //1
		fruitSet.add("배"); //2
		fruitSet.add("사과"); //3
		fruitSet.add("감"); //4
		fruitSet.add("수박"); //5
		fruitSet.add("귤"); //6
		
		//객체 조회
		System.out.println(fruitSet);
		
		//목록 조회(순회)
		Iterator<String> ir = fruitSet.iterator();
		while(ir.hasNext()) { //객체를 가지고 있다면
			String fruit = ir.next(); //하나씩 가져옴
			System.out.println(fruit);
		}
		
		//객체 삭제
		fruitSet.remove("감");
		
		System.out.println(fruitSet);
		System.out.println("과일의 총 개수 : "+fruitSet.size());
	}

}
