package Quiz05;

class Box<T> {
	double doubleValue;
}

public class NumberBox<T extends Number> extends Box<T> {

	public T getDoubleValue(T doubleValue) {
		return doubleValue;
	}
}
