/**
 * 
 */
package Libs;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author 
 *
 */
public class CreateGrP {
	
	private int size; // khoang cach moi dong ke
	private boolean[][] maTranPixel; // ma tran xac dinh diem can put
	
	public CreateGrP(int maxX, int maxY) {
		super();
		this.size = 6;
		this.maTranPixel = new boolean[maxX + 1][maxY + 1];
	}

	// phuong thuc nay de ve grid 
 	public void drawPixel(Graphics g, int w, int h) {
 		g.setColor(Color.LIGHT_GRAY);
         for(int i = 0; i < w / size; i++){	// moi o pixel cach nhau = size
             for(int j = 0; j < h / size; j++){
                 g.drawRect(i * size, j * size, size, size);	// ve 1 o pixel co kich thuoc = size tai toa do i, j
                 if(maTranPixel[i][j] == true){	// xac dinh diem can put
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
 	
 	public void putPixel(int x, int y) {
 		maTranPixel[x][y] = true;
 	}
 	
 	public void setMaTranPixel(int maxX, int maxY) {
 		for (int i = 0; i < maxX; i++) {
            for (int j = 0; j < maxY; j++) {
            	maTranPixel[i][j] = false;
            }
        }
 	}
 	
 	
}
