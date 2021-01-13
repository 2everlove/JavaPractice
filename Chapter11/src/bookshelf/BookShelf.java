package bookshelf;

import java.util.ArrayList;

public class BookShelf implements Queue{
	//BookShelf - �ڷḦ �����ϴ� class
	
	protected ArrayList<String> shelf = new ArrayList<>();;
	
	@Override
	public void enQueue(String title) {
		shelf.add(title); //�ڷ� �߰�
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return shelf.size();
	}
	
}
