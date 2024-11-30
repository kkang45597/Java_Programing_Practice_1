package com.intheest.ihertance5;

//import com.intheest.ihertance5.OuterClass.nonStaticNestedClass;


class SubClass extends OuterClass {
	
	public static void main(String[] args) {
		
		SubClass Sub = new SubClass();
		nonStaticNestedClass nsnc = Sub.new nonStaticNestedClass();
		
	}
}

public class OuterClass {
	
	public class nonStaticNestedClass { // 비정적 중첩 클래스는 그냥 내부(Inner) 클래스이다.
		
		public nonStaticNestedClass() { // 디폴트 생성자 (constructor)
			
		}
		
		public nonStaticNestedClass(int number) { // 파라미터 생성자 (constructor)
			
		}
	}
}
