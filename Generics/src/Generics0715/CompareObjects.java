package Generics0715;

public class CompareObjects<T> {
	
    T check;
    
    public CompareObjects(T t) { 
    	check = t;
    }
    
    public T getObject() { 
        return check;
    }
	
	public boolean equals(Object obj) {
        if (obj instanceof CompareObjects)
            return check.equals(((CompareObjects) obj).getObject()); 
        else
            return false;
    }
}
