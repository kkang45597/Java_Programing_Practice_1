package anotherPackage;
//import myPackage.Parent;
import myPackage.mySubPackage.Child;
public class AnotherPackageClass {
	
//	public final static float pi = 3.1294884f;
//	private int x;
//	
//	public void accessProtectedMember() {
//		Child child = new Child();
//		child.accessProtectedMember();
//		
//
//	}
	
	public static void main(String[] args) {
		Child child = new Child();
		child.accessProtectedMember();
		
//		Parent parent = new Parent();
//		System.out.println(parent.protectedField); // 컴파일 에러
//		parent.protectedMethod(); // 컴파일 에러
	}
}
