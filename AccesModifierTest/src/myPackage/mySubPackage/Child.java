package myPackage.mySubPackage;
import myPackage.Parent;
public class Child extends Parent {
	
	public void accessProtectedMember() {
		System.out.println(protectedField);
		this.protectedMethod();
	}
}
