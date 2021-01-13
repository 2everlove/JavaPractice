package bookshelf;

import java.util.ArrayList;

public class BookShelf implements Queue{
	//BookShelf - 자료를 관리하는 class
	
	protected ArrayList<String> shelf = new ArrayList<>();;
	
	@Override
	public void enQueue(String title) {
		shelf.add(title); //자료 추가
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
