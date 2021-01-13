package bookshelf;

public interface Queue {
	
	public void enQueue(String title); //책 추가
	
	public String deQueue(); // 책 꺼내기(삭제) - 반환값이 필요 -> return
	
	public int getSize(); //요소의 개수
}
