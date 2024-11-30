package world;
import hello.X;
public class Y extends X {
	public void accessProtectedMember() { // 서브클래스 내에서는 protected 멤버에 접근 가능
		System.out.println(protectedField);
		protectedMethod();
	}
	public static void main(String[] args) {
		Y y = new Y();
		y.accessProtectedMember();
		
		// 다른 패키지에서 상속받지 않은 클래스는 protected 멤버에 접근 불가
//		X x = new X();
//        System.out.println(x.protectedField); // 컴파일 오류
//        x.protectedMethod(); // 컴파일 오류
	}
}