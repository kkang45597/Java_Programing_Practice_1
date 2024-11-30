package Inheritance2;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException { // 예외 처리 (던지기와 try catch)
		
		FourthSubClass subClass4 = new FourthSubClass();
		
		// subClass4.clone() 을 호출할 수 없는 이유는, Object 는 clone 에 대해 porteced 이기 때문이다.
		// FourthSubClass 의 패키지는 Inheritance2.FourthSubClass
		// Object 의 패키지는 java.lang.Object
		// 서로 다른 패키지에서 상속을 했기 때문에 인스턴스 메서드로 사용을 해야한다.
		
		Object obj = new FourthSubClass();
		FourthSubClass cloneSubClass4 = (FourthSubClass) subClass4.clone(); // clone()을 사용하려면 예외처리가 필수다.
		System.out.println(cloneSubClass4);
	}

}
