/**
 * 
 */
package Libs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.HashMap;
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
	
	public CreateGrP(int maxX, int maxY) {
		super();
		this.size = 6;
		this.maTranPixel = new boolean[maxX + 1][maxY + 1];
		this.maTranMau = new int[maxX + 1][maxY + 1];
	}

	// phuong thuc nay de ve grid 
 	public void drawPixel(Graphics g, int w, int h, int chon) {
 		g.setColor(Color.LIGHT_GRAY);
 		
         for(int i = 0; i < w / size; i++){	// moi o pixel cach nhau = size
             for(int j = 0; j < h / size; j++){
                 g.drawRect(i * size, j * size, size, size);	// ve 1 o pixel co kich thuoc = size tai toa do i, j
                 
            	 if(maTranPixel[i][j] == true && this.maTranMau[i][j] == Color.RED.getRGB()){	// xac dinh diem can put
                	 g.setColor(Color.RED);
                	 g.fillRect(i * size - 2, j * size - 2, 5, 5);	// put 1 diem tai toa do i, j co kich thuoc = 6 ---- i, j tru 3: lui diem can put vao giao giua 2 doan thang trong grid
                     g.setColor(Color.LIGHT_GRAY);
                 }
            	 else if(maTranPixel[i][j] == true && this.maTranMau[i][j] == Color.GREEN.getRGB()){	// xac dinh diem can put
                	 g.setColor(Color.GREEN);
                	 g.fillRect(i * size - 2, j * size - 2, 5, 5);	// put 1 diem tai toa do i, j co kich thuoc = 6 ---- i, j tru 3: lui diem can put vao giao giua 2 doan thang trong grid
                     g.setColor(Color.LIGHT_GRAY);
                 } 
            	 else if(maTranPixel[i][j] == true && this.maTranMau[i][j] == Color.BLUE.getRGB()){	// xac dinh diem can put
                	 g.setColor(Color.BLUE);
                	 g.fillRect(i * size - 2, j * size - 2, 5, 5);	// put 1 diem tai toa do i, j co kich thuoc = 6 ---- i, j tru 3: lui diem can put vao giao giua 2 doan thang trong grid
                     g.setColor(Color.LIGHT_GRAY);
                 }
            	 else if(maTranPixel[i][j] == true && this.maTranMau[i][j] == Color.CYAN.getRGB()){	// xac dinh diem can put
                	 g.setColor(Color.CYAN);
                	 g.fillRect(i * size - 2, j * size - 2, 5, 5);	// put 1 diem tai toa do i, j co kich thuoc = 6 ---- i, j tru 3: lui diem can put vao giao giua 2 doan thang trong grid
                     g.setColor(Color.LIGHT_GRAY);
                 }
            	 else if(maTranPixel[i][j] == true && this.maTranMau[i][j] == Color.ORANGE.getRGB()){	// xac dinh diem can put
                	 g.setColor(Color.ORANGE);
                	 g.fillRect(i * size - 2, j * size - 2, 5, 5);	// put 1 diem tai toa do i, j co kich thuoc = 6 ---- i, j tru 3: lui diem can put vao giao giua 2 doan thang trong grid
                     g.setColor(Color.LIGHT_GRAY);
                 } 
            	 else if(maTranPixel[i][j] == true && this.maTranMau[i][j] == Color.WHITE.getRGB()){	// xac dinh diem can put
                	 g.setColor(Color.WHITE);
                	 g.fillRect(i * size - 2, j * size - 2, 5, 5);	// put 1 diem tai toa do i, j co kich thuoc = 6 ---- i, j tru 3: lui diem can put vao giao giua 2 doan thang trong grid
                     g.setColor(Color.LIGHT_GRAY);
                 }
            	 else if(maTranPixel[i][j] == true && this.maTranMau[i][j] == Color.DARK_GRAY.getRGB()){	// xac dinh diem can put
                	 g.setColor(Color.DARK_GRAY);
                	 g.fillRect(i * size - 2, j * size - 2, 5, 5);	// put 1 diem tai toa do i, j co kich thuoc = 6 ---- i, j tru 3: lui diem can put vao giao giua 2 doan thang trong grid
                     g.setColor(Color.LIGHT_GRAY);
                 }
            	 else if(maTranPixel[i][j] == true && this.maTranMau[i][j] == Color.YELLOW.getRGB()){	// xac dinh diem can put
                	 g.setColor(Color.YELLOW);
                	 g.fillRect(i * size - 2, j * size - 2, 5, 5);	// put 1 diem tai toa do i, j co kich thuoc = 6 ---- i, j tru 3: lui diem can put vao giao giua 2 doan thang trong grid
                     g.setColor(Color.LIGHT_GRAY);
                 }
             }
         }
         
         // to lai mau duong bien
         if(chon == 2) {
        	 for(int i = 0; i < w / size; i++){	// moi o pixel cach nhau = size
                 for(int j = 0; j < h / size; j++){
                     if(maTranPixel[i][j] == true && this.maTranMau[i][j] == Color.BLACK.getRGB()){	// xac dinh diem can put
                    	 //this.maTranMau[i][j] = this.color.getRGB();
                    	 g.setColor(Color.BLACK);
                         g.fillRect(i * size - 2, j * size - 2, 5, 5);	// put 1 diem tai toa do i, j co kich thuoc = 6 ---- i, j tru 3: lui diem can put vao giao giua 2 doan thang trong grid
                         g.setColor(Color.LIGHT_GRAY);
                     }
                 }
             }
         }
         
         g.setColor(Color.RED);
         if(chon == 1) {
        	 g.drawLine(w / 2 + 1, 0, w / 2 + 1, h);
             g.drawLine(0, h / 2 - 7, w, h / 2 - 7);
         }
         else if(chon == 2) {
        	 g.drawLine(w / 2 + 1, 0, w / 2 + 1, h / 2 - 7);
        	 g.drawLine(w / 2 + 1, h / 2 - 7, w, h / 2 - 7);
        	 g.drawLine(0, h, w / 2 + 1, h / 2 - 7);
         }
         
         
 	}
 	
 	public void putPixel(int x, int y, Color c) {
 		try {
 			this.maTranPixel[x][y] = true;
 	 		this.maTranMau[x][y] = c.getRGB();
 		}
 		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		
 		
		
 		
 	}
 	public void reputPixel(int x, int y) {
 		try {
 			this.maTranPixel[x][y] = false;
 	 		this.maTranMau[x][y] = Color.LIGHT_GRAY.getRGB();
 		}
 		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
 	}
 	
 	public void setMaTranPixel(int maxX, int maxY) {
 		for (int i = 0; i < maxX; i++) {
            for (int j = 0; j < maxY; j++) {
            	maTranPixel[i][j] = false;
            	maTranMau[i][j] = Color.LIGHT_GRAY.getRGB();
            }
        }
 	}

	 // to mau theo bien
	 public void toMauBien(int x, int y, Color c){
		int x1, x2;
		// to mau nua duoi
		try {
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
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		
	 }


}
