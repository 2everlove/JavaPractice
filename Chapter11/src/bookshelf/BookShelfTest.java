package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		
		//�ڷ� �߰�
		shelfQueue.enQueue("�̻�1");
		shelfQueue.enQueue("�̻�2");
		shelfQueue.enQueue("�̻�3");
		shelfQueue.enQueue("�ڹ����α׷��� �Թ�1");
		shelfQueue.enQueue("�ڹ����α׷��� �Թ�2");
		shelfQueue.enQueue("�ڹ����α׷��� �Թ�3");
		shelfQueue.enQueue("�ڹ����α׷��� �Թ�4");
		shelfQueue.enQueue("�ڹ����α׷��� �Թ�5");
		
		//����� ����
		System.out.printf("����� ���� : %d��\n", shelfQueue.getSize());
		
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
		
		//����� ����
		System.out.printf("����� ���� : %d��\n", shelfQueue.getSize());
	}

}
