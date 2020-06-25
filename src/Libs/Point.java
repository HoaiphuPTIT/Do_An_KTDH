/**
 * 
 */
package Libs;

/**
 * @author HoaiphuLam
 *
 */
public class Point {
	public int x;
	public int y;
	public int z;
	
	public Point() {
		super();
		x = -1;
		y = -1;
		z = -1;
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Point(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
