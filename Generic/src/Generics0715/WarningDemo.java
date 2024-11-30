package Generics0715;

public class WarningDemo {
	public static void main(String[] args){
		Box<Integer> bi;
		bi = createBox();
	}

	static Box createBox(){
		return new Box();
	}
}
