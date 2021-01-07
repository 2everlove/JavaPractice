package virtualfuction;

public class TestA {
	int num;
	
	public void aaa() {
		System.out.println("aaa() 출력");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestA a1 = new TestA(); //스택 메모리 공간에 위치
		a1.num = 10; //힙메모리 공간 위치
		a1.aaa();//데이터 영역 메모리 공간 위치 (static변수도 여기에 위치한다.)
		System.out.println(a1);
		
		TestA a2 = new TestA();
		a2.num = 20;
		a2.aaa();
		System.out.println(a2);
	}
	

}
