package bookshelf;

import java.util.ArrayList;

public class Shelf { //ArrayList �ڷ�
	protected ArrayList<String> shelf;
	
	
	//constructor���� ArrayList generate
	public Shelf() {
		shelf = new ArrayList<>();
	}
	
	
	//��� ���� ���� method
	public int getCount() {
		return shelf.size();
	}
}
