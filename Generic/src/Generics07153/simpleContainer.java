package Generics07153;

import java.util.ArrayList;
import java.util.List;

public class simpleContainer<T> implements container<T> {
	
	List<T> ltem;

	@Override
	public T get(T index) {
		return (T)ltem;
	}

	@Override
	public void add(T value) {
		ltem.add(value);
	}
	
	public static void main(String[] args) {
		
	}
}
