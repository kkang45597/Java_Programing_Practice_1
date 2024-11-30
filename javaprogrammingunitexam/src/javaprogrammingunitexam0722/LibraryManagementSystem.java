package javaprogrammingunitexam0722;

import java.util.*;
import java.time.LocalDate;

public class LibraryManagementSystem {
    private Library<Book> bookLibrary;
    private Library<BorrowRecord> borrowLibrary;
    private List<Member> members;
    private Scanner scanner;

    // 각 필드 초기화 생성자 구현
    // code를 작성하세요
    public LibraryManagementSystem() {
    	 this.bookLibrary = new Library<>();
    	 this.borrowLibrary = new Library<>();
    	 
    	 this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        LibraryManagementSystem system = new LibraryManagementSystem();
        system.run();
    }

    public void run() {
        while (true) {
            System.out.println("메뉴:");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 조회");
            System.out.println("3. 도서 수정");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 회원 등록");
            System.out.println("6. 회원 조회");
            System.out.println("7. 회원 수정");
            System.out.println("8. 회원 삭제");
            System.out.println("9. 도서 대여");
            System.out.println("10. 도서 반납");
            System.out.println("11. 도서 검색");
            System.out.println("0. 종료");
            System.out.print("선택: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 줄바꿈 문자 소비

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewBook();
                    break;
                case 3:
                    updateBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    addMember();
                    break;
                case 6:
                    viewMember();
                    break;
                case 7:
                    updateMember();
                    break;
                case 8:
                    deleteMember();
                    break;
                case 9:
                    borrowBook();
                    break;
                case 10:
                    returnBook();
                    break;
                case 11:
                    searchBooks();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }
    }

    private void addBook() {
        System.out.print("도서ID: ");
        String bookId = scanner.nextLine();
        System.out.print("제목: ");
        String title = scanner.nextLine();
        System.out.print("저자: ");
        String author = scanner.nextLine();
        System.out.print("카테고리: ");
        String category = scanner.nextLine();

        // 위 로컬 변수를 활용해서 bookLibrary에 아이템을 추가하는 코드를
        // 작성하세요
        // code를 작성하세요
        
        bookLibrary.addItem(bookId, title, author, category, true);
        
        System.out.println("도서가 등록되었습니다.");
    }

    private void viewBook() {
        System.out.print("도서ID: ");
        String bookId = scanner.nextLine();

        // 위 bookId 로컬 변수로 bookLibrary에서 검색하는 코드를 작성하세요.
        // code 를 작성하세요
        
        List<Book> books = bookLibrary.searchItem(bookId);
        
        
        if (books.isEmpty()) {
            System.out.println("해당 도서ID의 도서가 없습니다.");
        } else {
            books.forEach(System.out::println);
        }
        
    }

    private void updateBook() {
        System.out.print("도서ID: ");
        String bookId = scanner.nextLine();

        // 위 bookId 로컬 변수로 bookLibrary에서 검색하는 코드를 작성하세요.
        // code를 작성하세요
        
        
//        List<Book> books = bookLibrary.searchItem(bookId);
        

//        if (books.isEmpty()) {
//            System.out.println("해당 도서ID의 도서가 없습니다.");
//            return;
//        }

//        Book book = books.get(0);
        System.out.print("새 제목: ");
        String title = scanner.nextLine();
        System.out.print("새 저자: ");
        String author = scanner.nextLine();
        System.out.print("새 카테고리: ");
        String category = scanner.nextLine();

        // 해당 도서의 정보를 수정하는 코드를 작성하세요
        // code를 작성하세요

        System.out.println("도서 정보가 수정되었습니다.");
    }

    private void deleteBook() {
        System.out.print("도서ID: ");
        String bookId = scanner.nextLine();
        // 위 bookId 로컬 변수로 bookLibrary에서 검색하는 코드를 작성하세요.
        // code를 작성하세요
        
        List<Book> books = bookLibrary.searchItem(bookId);
        
        if (books.isEmpty()) {
            System.out.println("해당 도서ID의 도서가 없습니다.");
            return;
        }

        // 해당 도서를 삭제하는 코드를 작성하세요
        // code를 작성하세요
        
        bookLibrary.deleteItem(bookId);

        System.out.println("도서가 삭제되었습니다.");
    }

    private void addMember() {
        System.out.print("이름: ");
        String name = scanner.nextLine();
        System.out.print("이메일: ");
        String email = scanner.nextLine();
        System.out.print("회원ID: ");
        String memberId = scanner.nextLine();
        members.add(new Member(name, email, memberId));
        System.out.println("회원이 등록되었습니다.");
    }

    private void viewMember() {
        System.out.print("회원ID: ");
        String memberId = scanner.nextLine();

        // 해당 멤버를 검색하는 코드를 작성하세요
        // code를 작성하세요
        
//        List<Member> member = bookLibrary.searchItem(memberId); // ...이거
        
        
        System.out.println("해당 회원ID의 회원이 없습니다.");
    }

    private void updateMember() {
        System.out.print("회원ID: ");
        String memberId = scanner.nextLine();
        for (Member member : members) {
            // code를 작성하세요
        }
        System.out.println("해당 회원ID의 회원이 없습니다.");
    }

    private void deleteMember() {
        System.out.print("회원ID: ");
        String memberId = scanner.nextLine();
        for (Member member : members) {
            // code를 작성하세요
        }
        System.out.println("해당 회원ID의 회원이 없습니다.");
    }

    private void borrowBook() {
        System.out.print("회원ID: ");
        String memberId = scanner.nextLine();
        Member member = null;
        for (Member m : members) {
//            if (m.getMemberId().equals(memberId)) {
        	if (m.getter().equals(memberId)) {
                member = m;
                break;
            }
        }
        if (member == null) {
            System.out.println("해당 회원ID의 회원이 없습니다.");
            return;
        }

        // code를 작성하세요

        System.out.println("도서가 대여되었습니다.");
    }

    private void returnBook() {
        System.out.print("도서ID: ");
        String bookId = scanner.nextLine();
//        List<BorrowRecord> records = borrowLibrary.searchItems(record -> record.getBook().getBookId().equals(bookId) 
//        		&& record.getReturnDate() == null);
        List<BorrowRecord> records = borrowLibrary.searchItems(record -> record.getterBook().getterBookId().equals(bookId) 
        		&& record.getterReturnDate() == null);
        if (records.isEmpty()) {
            System.out.println("해당 도서ID의 대여 기록이 없습니다.");
            return;
        }

        // code를 작성하세요

        System.out.println("도서가 반납되었습니다.");
    }

    private void searchBooks() {
        System.out.println("검색 조건을 선택하세요:");
        System.out.println("1. 제목");
        System.out.println("2. 저자");
        System.out.println("3. 카테고리");
        System.out.print("선택: ");


        int choice = scanner.nextInt();
        scanner.nextLine(); // 줄바꿈 문자 소비

        switch (choice) {
            case 1:
                System.out.print("제목: ");
                String title = scanner.nextLine();
//                List<Book> booksByTitle = bookLibrary.searchItems(book -> book.getTitle().equalsIgnoreCase(title));
                List<Book> booksByTitle = bookLibrary.searchItems(book -> book.getterTitle().equalsIgnoreCase(title));
                booksByTitle.forEach(System.out::println);
                break;
            case 2:
                System.out.print("저자: ");
                String author = scanner.nextLine();
//                List<Book> booksByAuthor = bookLibrary.searchItems(book -> book.getAuthor().equalsIgnoreCase(author));
                List<Book> booksByAuthor = bookLibrary.searchItems(book -> book.getterAuthor().equalsIgnoreCase(author));
                booksByAuthor.forEach(System.out::println);
                break;
            case 3:
                System.out.print("카테고리: ");
                String category = scanner.nextLine();
//                List<Book> booksByCategory = bookLibrary.searchItems(book -> book.getCategory().equalsIgnoreCase(category));
                List<Book> booksByCategory = bookLibrary.searchItems(book -> book.getterCategory().equalsIgnoreCase(category));
                booksByCategory.forEach(System.out::println);
                break;
            default:
                System.out.println("잘못된 선택입니다.");
        }
    }
}
