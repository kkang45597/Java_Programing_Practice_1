package javaprogrammingunitexam0722;

import java.time.LocalDate;

public class BorrowRecord {
	private Book book;
	private Member member;
	private LocalDate borrowDate;
	private LocalDate returnDate;
	// 기본 생성자
	// code를 작성하세요
	public BorrowRecord() { }

	// 모든 필드를 초기화하는 생성자
	// code를 작성하세요
	public BorrowRecord(Book book, Member member, LocalDate borrowDate, LocalDate returnDate) {
		this.book = book;
		this.member = member;
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
	}
	
	// getter와 setter 메서드
	// code를 작성하세요
	Book getterBook () {
		return book;
	}
	Member getterMember() {
		return member;
	}
	LocalDate getterBorrowDate() {
		return borrowDate;
	}
	LocalDate getterReturnDate() {
		return returnDate;
	}
	
	void setter(Book book, Member member, LocalDate borrowDate, LocalDate returnDate) {
		this.book = book;
		this.member = member;
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
	}
	
	// toString 메서드
	// code를 작성하세요
	@Override
	public String toString() {
		return book + "\n" + member + "\n" + borrowDate + "\n" + returnDate;
	}
}
