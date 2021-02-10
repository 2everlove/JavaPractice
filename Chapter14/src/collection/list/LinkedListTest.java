package collection.list;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<>();
		//연결리스트
		
		//객체 추가
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		//조회
		System.out.println(myList);
		
		//특정 위치에 추가
		myList.add(2, "D");
		System.out.println(myList);
		
		//연결리스트의 맨 뒤에 추가
		myList.addLast("E"); //queue의 push()와 같다.
		System.out.println(myList);
		
		//연결리스트의 맨 앞에 제거
		myList.removeFirst(); //매개변수가 없다, queue의 pop()과 같다.
		System.out.println(myList);
		
	}

}
