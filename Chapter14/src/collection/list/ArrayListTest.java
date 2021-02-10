package collection.list;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> vegeList = new ArrayList<>();
		//순서가 있고, 중복 허용
		
		//객체 저장
		vegeList.add("양파");
		vegeList.add("마늘");
		vegeList.add("감자");
		
		System.out.println(vegeList); // []로 print
		
		//객체 개수
		int number = vegeList.size();
		System.out.printf("총 객체 수 : %d개\n", +number);
		
		//특정 위치 객체 추가
		vegeList.add(2, "고추");
		vegeList.add("마늘");
		
		//조회
		System.out.println(vegeList);
		
		//특정 객체 조회
		System.out.println("0번 객체 : "+vegeList.get(0));
		
		//객체 수정
		vegeList.set(1, "상추");
		
		//목록 조회
		for(int i=0;i<vegeList.size();i++) {
			String vegetable = vegeList.get(i);
			System.out.println(vegetable);
		}
		System.out.println("==");
		
		//삭제
		vegeList.remove(3);
		
		//목록조회
		for(String v : vegeList) {
			System.out.println(v);
		}
		
		
	}

}
