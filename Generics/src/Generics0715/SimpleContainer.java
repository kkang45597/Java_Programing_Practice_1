package Generics0715;

import java.util.ArrayList;
import java.util.List;

public class SimpleContainer<T> implements Container<T>{
	
	List<T> item;
	
	public SimpleContainer(List<T> item) {
		this.item = item;
	}
	
	@Override
	public void add(T element) {
		item.add(element);
	}
	
	@Override
	public T get(int index) {
		return item.get(index);
	}
}
