package Inheritance2;

public class FourthSubClass extends ThirdSubClass implements Cloneable {
	
	// Cloneable는 마커 인터페이스로 내용이 없다, 하지만 Cloneable 를 사용한다는 것을 알리기 위해 사용한다.

//	public FourthSubClass() {
//		super();
//	}
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
