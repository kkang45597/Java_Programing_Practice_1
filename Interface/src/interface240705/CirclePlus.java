package interface240705;

import java.awt.Point;

public class CirclePlus implements Relatable {

	public int width = 0;
    public int height = 0;
    public Point origin;
	
    public CirclePlus() {
        origin = new Point(0, 0);
    }
    public CirclePlus(Point p) {
        origin = p;
    }
    public CirclePlus(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    public CirclePlus(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }
    public int getArea() {
//        return width * height;
    	int area;
    	area = (int)((width/2) * 3.14);
    	return area;
    }
    
	@Override
	public int isLargerThan(Relatable other) {
		CirclePlus otherRect = (CirclePlus)other;
		if (this.getArea() < otherRect.getArea()) {
			return -1;
		}
			
		else if (this.getArea() > otherRect.getArea()) {
			return 1;
		}
		else {
			 return 0;
		}
	}

}
