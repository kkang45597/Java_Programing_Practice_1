package interface240705;

public interface groupinterface extends interface1, interface2, interface3 {

	final float PI = 3.12345f;
	
	String groupedFunc (Double x);
	
	default public void helloWorld(int x, int y) {
		System.out.printf("GroupedInterface default helloworld : x=%d, y=%d \n", x, y);
	}
}
