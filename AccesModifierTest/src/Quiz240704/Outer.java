package Quiz240704;

public class Outer {
//	 private int data = 30;
	 private static int data = 30;
	    static class Inner {
	        void display() {
	             System.out.println(data);  // 이 줄은 컴파일 오류가 발생합니다.
	        }
	    }
	    public static void main(String[] args) {
	        Outer.Inner inner = new Outer.Inner();
	        inner.display();
	    }
}
