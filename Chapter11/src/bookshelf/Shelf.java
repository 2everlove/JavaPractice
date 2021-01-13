package bookshelf;

import java.util.ArrayList;

public class Shelf { //ArrayList 자료
	protected ArrayList<String> shelf;
	
	
	//constructor에서 ArrayList generate
	public Shelf() {
		shelf = new ArrayList<>();
	}
	
	
	//요소 개수 세는 method
	public int getCount() {
		return shelf.size();
	}
}
