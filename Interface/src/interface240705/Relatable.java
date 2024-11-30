package interface240705;

public interface Relatable {
	public int isLargerThan(Relatable other);
	
	public static Object findLargest(Object object1, Object object2) {
 	   Relatable obj1 = (Relatable)object1;
 	   Relatable obj2 = (Relatable)object2;
 	   if ((obj1).isLargerThan(obj2) > 0)
//			return object1;
			return true;
		else 
//			return object2;
			return false;
 	}
	
	public static Object findSmallest(Object object1, Object object2) {
		Relatable obj1 = (Relatable)object1;
		Relatable obj2 = (Relatable)object2;
		if ((obj1).isLargerThan(obj2) < 0)
//			return object1;
			return true;
		else 
//			return object2;
			return false;
	}

	public static boolean isEqual(Object object1, Object object2) {
		Relatable obj1 = (Relatable)object1;
		Relatable obj2 = (Relatable)object2;
		if((obj1).isLargerThan(obj2) == 0)
			return true;
		else 
			return false;
	}
}
