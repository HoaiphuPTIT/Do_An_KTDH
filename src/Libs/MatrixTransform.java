package Libs;

public class MatrixTransform {
	private int[][] translation = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
	private int[][] rotation = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
	private int[][] raito = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
	
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
					
				}
			}
		}
		return C;
	}
	
	public int[][] rotateMatrix(int[][] defMatrix, double goc){
		
		this.rotation[0][0] = (int) (Math.round(Math.cos(goc)));
		this.rotation[0][1] = (int) (Math.round(Math.sin(goc)));
		this.rotation[1][0] = -(int) (Math.round(Math.sin(goc)));
		this.rotation[1][1] = (int) (Math.round(Math.cos(goc)));
		//System.out.println(this.rotation[0][0]);
		int[][] C = new int[1][3];
		
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 3; j++) {
				C[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					C[i][j] = C[i][j] + defMatrix[i][k] * this.translation[k][j];
					//System.out.println("["+i+"]"+"["+j+"]=" + C[i][j]);
				}
			}
		}
		return C;
	}
	
	public int[][] ratioMatrix(int[][] defMatrix, Point tr){
		this.translation[0][0] = tr.x;
		this.translation[1][1] = tr.y;
		
		int[][] C = new int[1][3];
		
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 3; j++) {
				C[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					C[i][j] = C[i][j] + defMatrix[i][k] * this.translation[k][j];
					
				}
			}
		}
		return C;
	}
}
