package Inheritance2;

public class SecondSubClass extends SuperClass {

//	public SecondSubClass() {
//		super();
//	}
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
