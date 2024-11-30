package interface240705;

public enum Direction {

	LEFT(1), RIGHT(2), FOWARD(3), BACKWARD(4);
	
	int value;
	
	// Illegal modifier for the enum constructor; only private is permitted.
//	public Direction (int value) {
	
	private Direction (int value) {
		this.value = value;
	}
	
	public int getDirectionValue() {
		return this.value;
	}
}
