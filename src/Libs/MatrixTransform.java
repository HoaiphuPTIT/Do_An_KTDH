package Libs;

public class MatrixTransform {
	private int[][] translation = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
	private int[][] rotation = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
	
	public MatrixTransform() {
		super();
	}
	
	public int[][] translationMatrix(int[][] defMatrix, Point tr){
		this.translation[2][0] = tr.x;
		this.translation[2][1] = tr.y;
		
		int[][] C = new int[1][3];
		
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 3; j++) {
				C[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					C[i][j] = C[i][j] + defMatrix[i][k] * this.translation[k][j];
					System.out.println("["+i+"]"+"["+j+"]=" + C[i][j]);
				}
			}
		}
		return C;
	}
}
