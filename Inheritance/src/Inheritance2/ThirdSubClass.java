package Inheritance2;

public class ThirdSubClass extends SecondSubClass {

//	public ThirdSubClass() {
//		super();
//	}
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
