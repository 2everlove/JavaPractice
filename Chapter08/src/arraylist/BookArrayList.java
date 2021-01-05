package arraylist;

import java.util.ArrayList;

import array.Book;

public class BookArrayList {

	public static void main(String[] args) {
		// 리스트 생성
		ArrayList<Book> library = new ArrayList<>();
		
		/*
		//Book 객체 생성
		Book book1 = new Book("미생1" , "윤태호");
		Book book2 = new Book("미생2" , "윤태호");
		Book book3 = new Book("미생3" , "윤태호");
		
		//Book 객체를 ArrayList에 저장
		library.add(book1);
		library.add(book2);
		library.add(book3);
		*/
		library.add(new Book("미생1", "윤태호"));
		library.add(new Book("미생2", "윤태호"));
		library.add(new Book("미생3", "윤태호"));
		
		//whole print
		for(int i = 0; i<library.size(); i++) {
			Book book = library.get(i);
			System.out.println(book.showInfo());
		}
		System.out.println("=enhanced for=");
		for(Book book : library)
			System.out.println(book.showInfo());
		
	}

}
