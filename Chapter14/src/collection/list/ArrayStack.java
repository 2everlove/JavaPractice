package collection.list;

import java.util.ArrayList;

class MyStack{
	private ArrayList<String> arrayStack;
	
	public MyStack() {
		arrayStack = new ArrayList<>();
	}
	
	//넣기 method
	public void push(String data) { //외부의 매개변수
		arrayStack.add(data);
	}
	
	//빼기 method
	public String pop() {
		int len = arrayStack.size();
		if(len==0) {
			System.out.println("스택이 비었습니다.");
			return null; //"null이 출력"
		}
		return arrayStack.remove(len-1); //top부터 꺼내옴 1,2,3 -> 3,2,1 순으로 꺼내짐
		//return arrayStak.remove(0); --> queue방식으로 꺼낼때 씀 1,2,3 -> 1,2,3 순으로 꺼내짐
	}
	
	//isEmpty() - 비어있는 method
	public boolean isEmpty() {
		if(arrayStack.size()==0) { //비어있음
			return true;
		}
		return false;
	}

}

public class ArrayStack {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		//객체 생성
		stack.push("돼지"); //1
		stack.push("소"); //2
		stack.push("말"); //3
		
		//객체 빼기
//		System.out.println(stack.pop()); //3
//		System.out.println(stack.pop()); //2
//		System.out.println(stack.pop()); //1
//		System.out.println(stack.pop()); //null
		
		
		while(!stack.isEmpty()) { //여러개면 while문이 편함
			String animal = stack.pop();
			System.out.println(animal);
		}
	}

}
