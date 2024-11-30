package javaprogrammingunitexam0722;

import java.util.*;
import java.util.function.Predicate;

public class Library <T> {
	private List<T> items;
	
	// 기본 생성자
	// code를 작성하세요
	public Library() { 
		this.items = new ArrayList<>();
	}
	
	// 아이템 추가 메서드
	// code를 작성하세요
	public void addItem(String bookId, String title, String author, String category, boolean isAvailable) {
//		List<T> bookDesc = new ArrayList<>();
//		bookDesc.add((T)bookId);
//		bookDesc.add((T)title);
//		bookDesc.add((T)author);
//		bookDesc.add((T)category);
//		items.addAll(bookDesc);
		
		Book book = new Book(bookId, title, author, category, true);
		items.add((T)book);
		
	}
	
	// 아이템 삭제 메서드
	// code를 작성하세요
	
	public void deleteItem(String bookId) {
		
		for (T item : items) {
			Book book = (Book) item;
			if(book.getterBookId().equals(bookId)) {
				items.remove(book);
				break;
			}
		}
	}
	
	
	// 아이템 조회 메서드
	// code를 작성하세요
	
	public List<T> searchItem(String bookId) {
		
		List<T> itemReturn = new ArrayList<>();
		
		for (T item : items) {
			Book book = (Book) item;
			if(book.getterBookId().equals(bookId)) {
				itemReturn.add(item);
			}
		}
		return itemReturn;
	}
	
	// 검색 메서드
	public List<T> searchItems(Predicate<T> condition) {
		// code를 작성하세요
		
		// 진짜 모르겠네
		
		return items;
	}

	// toString 메서드
	// code를 작성하세요
	@Override
	public String toString() {
		return "Library [items: " + items + "]";
	}
	

}
