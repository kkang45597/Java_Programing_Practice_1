package javaprogrammingunitexam0722;

import java.time.LocalDate;

public class Book {
	private String bookId;
	private String title;
	private String author;
	private String category;
	private boolean isAvailable;
	
	// 기본 생성자
	// code를 작성하세요
	public Book() { }
	
	// 모든 필드를 초기화하는 생성자
	// code를 작성하세요
	public Book(String bookId, String title, String author, String category, boolean isAvailable) { 
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.category = category;
		this.isAvailable = isAvailable;
	}
	
	// getter와 setter 메서드
	String getterBookId() {
		return bookId;
	}
	String getterTitle() {
		return title;
	}
	String getterAuthor() {
		return author;
	}
	String getterCategory() {
		return category;
	}
	boolean getterIsAvailable() {
		return isAvailable;
	}
	
	void setter(String bookId, String title, String author, String category, boolean isAvailable) {
//	void setter(String bookId, String title, String author, String category) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.category = category;
		this.isAvailable = isAvailable;
	}

	// toString 메서드
	// code를 작성하세요
	@Override
	public String toString() {
		return bookId + "\n" + title + "\n" + author + "\n" + category + "\n" + isAvailable;
	}

	//
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public Book get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
