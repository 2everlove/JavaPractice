package arraylist;

import java.util.ArrayList;

import array.Book;

public class BookArrayList {

	public static void main(String[] args) {
		// ����Ʈ ����
		ArrayList<Book> library = new ArrayList<>();
		
		/*
		//Book ��ü ����
		Book book1 = new Book("�̻�1" , "����ȣ");
		Book book2 = new Book("�̻�2" , "����ȣ");
		Book book3 = new Book("�̻�3" , "����ȣ");
		
		//Book ��ü�� ArrayList�� ����
		library.add(book1);
		library.add(book2);
		library.add(book3);
		*/
		library.add(new Book("�̻�1", "����ȣ"));
		library.add(new Book("�̻�2", "����ȣ"));
		library.add(new Book("�̻�3", "����ȣ"));
		
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
