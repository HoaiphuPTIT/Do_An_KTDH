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
	
	public Point quay(Point A, int goc) {
		int[][] defMatrix = {{A.x, A.y, 1}};
		
		Point C = new Point();
		
		MatrixTransform mt = new MatrixTransform();
		defMatrix = mt.rotateMatrix(defMatrix, goc);
		
		C.x = defMatrix[0][0];
		C.y = defMatrix[0][1];
		
		return C;
	}
}
