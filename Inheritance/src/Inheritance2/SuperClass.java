package Inheritance2;

public class SuperClass {
	
//	public SuperClass() {
//		super();
//	}
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
