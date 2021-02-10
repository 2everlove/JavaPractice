package collection.list;

import java.util.ArrayList;

class MyStack{
	private ArrayList<String> arrayStack;
	
	public MyStack() {
		arrayStack = new ArrayList<>();
	}
	
	//�ֱ� method
	public void push(String data) { //�ܺ��� �Ű�����
		arrayStack.add(data);
	}
	
	//���� method
	public String pop() {
		int len = arrayStack.size();
		if(len==0) {
			System.out.println("������ ������ϴ�.");
			return null; //"null�� ���"
		}
		return arrayStack.remove(len-1); //top���� ������ 1,2,3 -> 3,2,1 ������ ������
		//return arrayStak.remove(0); --> queue������� ������ �� 1,2,3 -> 1,2,3 ������ ������
	}
	
	//isEmpty() - ����ִ� method
	public boolean isEmpty() {
		if(arrayStack.size()==0) { //�������
			return true;
		}
		return false;
	}

}

public class ArrayStack {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		//��ü ����
		stack.push("����"); //1
		stack.push("��"); //2
		stack.push("��"); //3
		
		//��ü ����
//		System.out.println(stack.pop()); //3
//		System.out.println(stack.pop()); //2
//		System.out.println(stack.pop()); //1
//		System.out.println(stack.pop()); //null
		
		
		while(!stack.isEmpty()) { //�������� while���� ����
			String animal = stack.pop();
			System.out.println(animal);
		}
	}

}
