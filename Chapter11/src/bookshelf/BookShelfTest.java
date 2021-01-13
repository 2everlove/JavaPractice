package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		
		//자료 추가
		shelfQueue.enQueue("미생1");
		shelfQueue.enQueue("미생2");
		shelfQueue.enQueue("미생3");
		shelfQueue.enQueue("자바프로그래밍 입문1");
		shelfQueue.enQueue("자바프로그래밍 입문2");
		shelfQueue.enQueue("자바프로그래밍 입문3");
		shelfQueue.enQueue("자바프로그래밍 입문4");
		shelfQueue.enQueue("자바프로그래밍 입문5");
		
		//요소의 개수
		System.out.printf("요소의 개수 : %d개\n", shelfQueue.getSize());
		
		for(int i = shelfQueue.getSize(); i<=shelfQueue.getSize(); i--) {
			if (i>0) {
				System.out.println(shelfQueue.deQueue());
			} else {
				break;
			}
			
		}
//		System.out.println(shelfQueue.deQueue());
//		System.out.println(shelfQueue.deQueue());
//		System.out.println(shelfQueue.deQueue());
//		System.out.println(shelfQueue.deQueue());
		
		//요소의 개수
		System.out.printf("요소의 개수 : %d개\n", shelfQueue.getSize());
	}

}
