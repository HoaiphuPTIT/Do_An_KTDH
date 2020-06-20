/**
 * 
 */
package Libs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 
 *
 */
public class CreateGrP {
	
	private int size; // khoang cach moi dong ke
	private boolean[][] maTranPixel; // ma tran xac dinh diem can put
	private int[][] maTranMau;
	private Color color;
	
	public CreateGrP(int maxX, int maxY) {
		super();
		this.size = 6;
		this.maTranPixel = new boolean[maxX + 1][maxY + 1];
		this.maTranMau = new int[maxX + 1][maxY + 1];
		this.color = Color.BLACK;
	}

	// phuong thuc nay de ve grid 
 	public void drawPixel(Graphics g, int w, int h) {
 		g.setColor(Color.LIGHT_GRAY);
         for(int i = 0; i < w / size; i++){	// moi o pixel cach nhau = size
             for(int j = 0; j < h / size; j++){
                 g.drawRect(i * size, j * size, size, size);	// ve 1 o pixel co kich thuoc = size tai toa do i, j
                 if(maTranPixel[i][j] == true && this.maTranMau[i][j] != Color.BLACK.getRGB()){	// xac dinh diem can put
                	 this.maTranMau[i][j] = this.color.getRGB();
                	 g.setColor(this.color);
                     g.fillRect(i * size - 2, j * size - 2, 5, 5);	// put 1 diem tai toa do i, j co kich thuoc = 6 ---- i, j tru 3: lui diem can put vao giao giua 2 doan thang trong grid
                     g.setColor(Color.LIGHT_GRAY);
                 }
             }
         }
         
         // to lai mau duong bien
         for(int i = 0; i < w / size; i++){	// moi o pixel cach nhau = size
             for(int j = 0; j < h / size; j++){
                 if(maTranPixel[i][j] == true && this.maTranMau[i][j] == Color.BLACK.getRGB()){	// xac dinh diem can put
                	 this.maTranMau[i][j] = this.color.getRGB();
                	 g.setColor(Color.BLACK);
                     g.fillRect(i * size - 2, j * size - 2, 5, 5);	// put 1 diem tai toa do i, j co kich thuoc = 6 ---- i, j tru 3: lui diem can put vao giao giua 2 doan thang trong grid
                     g.setColor(Color.LIGHT_GRAY);
                 }
             }
         }
         g.setColor(Color.RED);
         g.drawLine(w / 2 + 1, 0, w / 2 + 1, h);
         g.drawLine(0, h / 2 - 1, w, h / 2 - 1);
 	}
 	
 	public void putPixel(int x, int y, Color c) {
 		this.maTranPixel[x][y] = true;
 		this.maTranMau[x][y] = c.getRGB();
 		this.color = c;
 	}
 	
 	public void setMaTranPixel(int maxX, int maxY) {
 		for (int i = 0; i < maxX; i++) {
            for (int j = 0; j < maxY; j++) {
            	maTranPixel[i][j] = false;
            	maTranMau[i][j] = Color.GRAY.getRGB();
            }
        }
 	}

	 // to mau theo bien
	 public void toMauBien(int x, int y, Color c){
		int x1, x2;
		// to mau nua duoi
		do {
			x1 = x;
			x2 = x;
			
			while(maTranMau[x1 - 1][y] != Color.BLACK.getRGB()) {
				x1--;
				
			}
				
			while(maTranMau[x2 + 1][y] != Color.BLACK.getRGB()) {
				x2++;
				
			}
			for(int i = x1; i <= x2; i++){
				putPixel(i, y, c);
				
			}
			while(maTranMau[x1][y + 1] == Color.BLACK.getRGB()) {
				x1++;
				
			}
				
			if(x1 <= x2){
				x = x1;
				y = y + 1;
			}
		} while(x1 <= x2);
		
		// to mau nua tren
		do {
			x1 = x;
			x2 = x;
			
			while(maTranMau[x1 - 1][y] != Color.BLACK.getRGB()) {
				x1--;
				
			}
				
			while(maTranMau[x2 + 1][y] != Color.BLACK.getRGB()) {
				x2++;
				
			}
			for(int i = x1; i <= x2; i++){
				putPixel(i, y, c);
			}
			while(maTranMau[x1][y - 1] == Color.BLACK.getRGB()) {
				x1++;
				
			}
				
			if(x1 <= x2){
				x = x1;
				y = y - 1;
			}
		} while(x1 <= x2);
	 }
}
