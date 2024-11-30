package com.intheest.inhertance1;

public class RectanglePlus implements Relatable {
	
	public int width = 0;
    public int height = 0;
    public Point origin;

    public RectanglePlus() {
        origin = new Point(0, 0);
    }
    public RectanglePlus(Point p) {
        origin = p;
    }
    public RectanglePlus(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    public RectanglePlus(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    public int getArea() {
        return width * height;
    }
    
// ==========================================================================    
    public int isLargerThan(Relatable other) {
        RectanglePlus otherRect = (RectanglePlus)other;
        if (this.getArea() < otherRect.getArea())
            return -1;
        else if (this.getArea() > otherRect.getArea())
            return 1;
        else
            return 0;               
    }
    
// ==========================================================================
//    public static Relatable findLargest(Relatable object1, Relatable object2) {
//    	if (object1.isLargerThan(object2) > 0) { return object1; }
//    	else { return object2; }
//    	
//    }
//    public static Relatable findSmallest(Relatable object1, Relatable object2) {
//    	if (object1.isLargerThan(object2) < 0) { return object1; }
//    	else { return object2; }
//    	
//    }
//    public static boolean isEqual(Relatable object1, Relatable object2) {
//    	if (object1.isLargerThan(object2) == 0) { return true; }
//    	else { return false; }
//    	
//    }
// ==========================================================================
    public static Object findLargest(Object object1, Object object2) {
		Relatable obj1 = (Relatable)object1;
		Relatable obj2 = (Relatable)object2;
		if ((obj1).isLargerThan(obj2) > 0)
			return object1;
		else 
			return object2;
		}
	
	public static Object findSmallest(Object object1, Object object2) {
		Relatable obj1 = (Relatable)object1;
		Relatable obj2 = (Relatable)object2;
		if ((obj1).isLargerThan(obj2) < 0)
			return object1;
		else 
			return object2;
	}

	public static boolean isEqual(Object object1, Object object2) {
		Relatable obj1 = (Relatable)object1;
		Relatable obj2 = (Relatable)object2;
		if ( (obj1).isLargerThan(obj2) == 0)
			return true;
		else 
			return false;
	}
// ==========================================================================
	
	public static void main(String[] args) {
		
		Relatable rect1 = new RectanglePlus(50,100);
		Relatable rect2 = new RectanglePlus(50,50);
	
		Relatable test1 = (Relatable)findLargest(rect1, rect2);
		Relatable test2 = (Relatable)findSmallest(rect1, rect2);
		boolean test3 = isEqual(rect1, rect2);	
		
	}
}
