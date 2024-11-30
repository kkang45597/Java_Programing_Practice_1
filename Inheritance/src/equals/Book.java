package equals;

public class Book {
    String ISBN;
    
    public Book() { }
    
    public Book(String isbn) { 
    	ISBN = isbn;
    }
    
    public String getISBN() { 
        return ISBN;
    }
    
    // 동등성: 동일한 문자열 값을 가지는 지 확인
    public boolean equals(Object obj) {
        if (obj instanceof Book)
            return ISBN.equals(((Book) obj).getISBN()); 
        else
            return false;
    }
}
