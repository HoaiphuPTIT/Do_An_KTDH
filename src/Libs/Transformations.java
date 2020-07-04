/**
 * 
 */
package Libs;

/**
 * @author HoaiphuLam
 *
 */
public class Transformations {
	
	public Point tinhTien(Point A, Point tr) {
		int[][] defMatrix = {{A.x, A.y, 1}};
		
		Point C = new Point();
		
		MatrixTransform mt = new MatrixTransform();
		defMatrix = mt.translationMatrix(defMatrix, tr);
		
		C.x = defMatrix[0][0];
		C.y = defMatrix[0][1];
		
		return C;
	}
	
	public Point quay(Point A, double goc) {
		int[][] defMatrix = {{A.x, A.y, 1}};
		
		Point C = new Point();
		
		MatrixTransform mt = new MatrixTransform();
		defMatrix = mt.rotateMatrix(defMatrix, goc);
		
		C.x = defMatrix[0][0];
		C.y = defMatrix[0][1];
		
		return C;
	}
	
	public Point quay2(Point A, double deg) {
		Point B = new Point();
		B.x = (int)(Math.round(A.x * Math.cos(deg) - A.y * Math.sin(deg)));
		B.y = (int)(Math.round(A.x * Math.sin(deg) + A.y * Math.cos(deg)));
		System.out.println(B.x + ", " + B.y);
		return B;
	}
	
	public Point tyLe(Point A, Point tr) {
		int[][] defMatrix = {{A.x, A.y, 1}};
		
		Point C = new Point();
		
		MatrixTransform mt = new MatrixTransform();
		defMatrix = mt.ratioMatrix(defMatrix, tr);
		
		C.x = defMatrix[0][0];
		C.y = defMatrix[0][1];
		
		return C;
	}
	
	public Point tyLe2(Point A, Point tr) {
		A.x = tr.x * A.x;
		A.y = tr.y * A.y;
		return A;
	}
	
	public Point doiXung(Point E, Point M) {
		Point _M = new Point();
		
			_M.x = 2 * E.x - M.x;
			_M.y = 2 * E.y - M.y;
		
		return _M;
	}
}
