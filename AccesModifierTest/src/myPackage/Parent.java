package myPackage;

public class Parent {
	
	protected String protectedField; // protected 맴버 변수
	
	public Parent() { // protected 생성자
		this.protectedField = "Protected Field";
	}
	protected void protectedMethod() { // protected 메서드
		System.out.println("This is Protected Method");
	}
}
