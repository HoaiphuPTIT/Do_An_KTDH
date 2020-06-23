/**
 * 
 */
package Libs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

/**
 * @author HoaiphuLam
 *
 */
public class BasicEntities extends CreateGrP{
	
	public BasicEntities(int maxX, int maxY) {
		super(maxX, maxY);
		// TODO Auto-generated constructor stub
	}
	
	// vẽ eclipse
	public void put4Pixel(int xc, int yc, int r1, int r2) {
		super.putPixel(xc+r1, yc+r2, Color.BLACK);
		super.putPixel(xc-r1, yc+r2, Color.BLACK);
		super.putPixel(xc+r1, yc-r2, Color.BLACK);
		super.putPixel(xc-r1, yc-r2, Color.BLACK);
 	}
 	
 	public void midPointEclip(int xc, int yc, int A, int B) {
 		
 		int x, y, fx, fy, a2, b2, p;
 	    x = 0;
 	    y = B;
 	    a2 = A * A;
 	    b2 = B * B;
 	    fx = 0;
 	    fy = 2 * a2 * y;
 	  	put4Pixel(xc, yc, x, y);
 	    p = (int) Math.round(b2 - (a2 * B) + (0.25 * a2)); //p=b2 - a2*b +a2/4
 	    int t = 0;
 	    while(fx < fy)
 	    {
 	    	t++;
 	        x++;
 	        fx += 2 * b2;
 	        if(p < 0)
 	        {
 	            p += b2 * (2 * x + 3); //p=p + b2*(2x +3)
 	        }
 	        else
 	        {
 	            y--;
 	            p += b2*(2*x +3) + a2*(2- 2*y); //p=p +b2(2x +3) +a2(2-2y)
 	            fy -= 2*a2;
 	        }
// 	        if(t % 9 < 5) {
// 	        	super.putPixel(xc+x, yc-y);
// 	        	super.putPixel(xc-x, yc-y);
// 	        }
 	        super.putPixel(xc+x, yc-y, Color.BLACK);
        	super.putPixel(xc-x, yc-y, Color.BLACK);
 	        super.putPixel(xc+x, yc+y, Color.BLACK);
 	        super.putPixel(xc-x, yc+y, Color.BLACK);
 	    }
 	    p = (int) Math.round(b2*(x +0.5)*(x +0.5) + a2*(y-1)*(y-1) - a2*b2);
 	    
 	    while(y > 0)
 	    {
 	    	t++;
 	        y--;
 	        fy -= 2*a2;
 	        if(p >=0)
 	        {
 	            p += a2*(3-2*y); //p=p +a2(3-2y)
 	        }
 	        else
 	        {
 	            x++;
 	            fx += 2*b2;
 	            p += b2*(2*x +2) +a2*(3- 2*y); //p=p+ b2(2x +2) + a2(3-2y)
 	        }
// 	        if(t % 9 < 5) {
// 	        	super.putPixel(xc+x, yc-y);
// 	        	super.putPixel(xc-x, yc-y);
//	        }
 	        super.putPixel(xc+x, yc-y, Color.BLACK);
        	super.putPixel(xc-x, yc-y, Color.BLACK);
 	        super.putPixel(xc+x, yc+y, Color.BLACK);
 	        super.putPixel(xc-x, yc+y, Color.BLACK);
 	    }
 	}
 	
 	
 	// vẽ đường tròn
 	public void put8Pixel(int xc, int yc, int x, int y) {
 		super.putPixel(x + xc, y + yc, Color.BLACK);
 		super.putPixel(-x + xc, y + yc, Color.BLACK);
 		super.putPixel(x + xc, -y + yc, Color.BLACK);
 		super.putPixel(-x + xc, -y + yc, Color.BLACK);
 		super.putPixel( y + xc, x + yc, Color.BLACK);
 		super.putPixel(-y + xc, x + yc, Color.BLACK);
 		super.putPixel(y + xc, -x + yc, Color.BLACK);
 		super.putPixel(-y + xc, -x + yc, Color.BLACK);
 	}
 	
 	public void midPointDTron(int xc, int yc, int r) {
 		int x = 0; int y = r;
 	    int f = 1 - r;
 	    put8Pixel(xc, yc, x, y);
 	    while (x < y)
 	    {
 	        if (f < 0) f += x * 2 + 3;
 	        else
 	        {
 	            y--;
 	            f += ((x - y) * 2) + 5;
 	        }
 	        x++;
 	        put8Pixel(xc, yc, x, y);
 	    }
 	}
 	
 	public void midPointDTNetdut(int xc, int yc, int r) {
 		int x = 0; int y = r;
 	    int f = 1 - r;
 	    put8Pixel(xc, yc, x, y);
 	    int k = 1, h = 1; // k là đoạn không vẽ, h là khoảng trống giữa các đoạn đã vẽ
 	    while (x < y)
 	    {
 	    	k++;
 	        if (f < 0) f += x*2 + 3;
 	        else
 	        {
 	            y--;
 	            f += ((x - y)*2) + 5;
 	        }
 	        if(k != 3) { 
 	        	put8Pixel(xc, yc, x, y);
 	        }
 	        else if (k == 3){ // đây là đoạn không cần put pixel; nghĩa là khi đã put 3 pixel thì không cần put 2 pixel kế tiếp nên h = 2
 	        	k--;
 	        	h++;
 	        	if(h == 2) { // khi đủ khoảng trống giữa các đoạn đã vẽ thì reset k và h về 0 rồi tiếp tục như vậy
 	        		k = 0;
 	        		h = 0;
 	        	}
 	        }
 	        x++;
 	    }
 	}
 	
 	
 	// vẽ đường thẳng
 	public void dtDDA(int x1, int y1, int x2, int y2){
        int dX = x2 - x1, dY = y2 - y1;
        float steps = Math.max(Math.abs(dX), Math.abs(dY));
        float xInc = dX / steps;
        float yInc = dY / steps;
        
        float x = x1, y = y1;
        
        super.putPixel(x1, y1, Color.BLACK);
        
        int k = 0;
        while(k < steps){
            k++;
            x += xInc;
            y += yInc;
            
            super.putPixel(Math.round(x), Math.round(y), Color.BLACK);
        }
    }
 	
 	public void netDutDDA(int x1, int y1, int x2, int y2){
        int dX = x2 - x1, dY = y2 - y1;
        float steps = Math.max(Math.abs(dX), Math.abs(dY));
        float xInc = dX / steps;
        float yInc = dY / steps;
        
        float x = x1, y = y1;
        
        super.putPixel(x1, y1, Color.BLACK);
        
        int k = 0, j = 0, h = 0; // j là đoạn không vẽ, h là khoảng trống giữa các đoạn đã vẽ
        while(k < steps){
            k++; j++;
            x += xInc;
            y += yInc;
//            if(k % 4 == 0) {
//            	continue;
//            }
//            super.putPixel(Math.round(x), Math.round(y));
            if(j != 4) {
            	super.putPixel(Math.round(x), Math.round(y), Color.BLACK);
            }
            else if(j == 4) { // tới đoạn không cần vẽ
            	//maTranPixel[Math.round(x)][Math.round(y)] = false;
            	j--; h++; 
            	if(h == 2) { // khi đủ khoảng trống giữa các đoạn đã vẽ thì reset j và h về 0 rồi vẽ tiếp 
            		j = 0;
            		h = 0;
            	}
            }
        }
    }
 	
 	public void netChamGach(int x1, int y1, int x2, int y2) {
 		int dX = x2 - x1, dY = y2 - y1;
        float steps = Math.max(Math.abs(dX), Math.abs(dY));
        float xInc = dX / steps;
        float yInc = dY / steps;
        
        float x = x1, y = y1;
        
        super.putPixel(x1, y1, Color.BLACK);
        
        int k = 0, j = 0, h = 0; // j là đoạn không vẽ, h là khoảng cách giữa các đoạn đã vẽ
        while(k < steps){
            k++; j++;
            x += xInc;
            y += yInc;
            if(j != 4) {
            	super.putPixel(Math.round(x), Math.round(y), Color.BLACK);
            }
            else if(j == 4) {
            	//maTranPixel[Math.round(x)][Math.round(y)] = false;
            	j--; h++;
            	if(h == 5) {
            		j = 0;
            		h = 0;
            	}
            	if(h == 3) {
            		super.putPixel(Math.round(x), Math.round(y), Color.BLACK);
            	}
            }
        }
        super.putPixel(x2, y2, Color.BLACK);
 	}
 	
 	public void net2ChamGach(int x1, int y1, int x2, int y2) {
 		int dX = x2 - x1, dY = y2 - y1;
        float steps = Math.max(Math.abs(dX), Math.abs(dY));
        float xInc = dX / steps;
        float yInc = dY / steps;
        
        float x = x1, y = y1;
        
        super.putPixel(x1, y1, Color.BLACK);
        
        int k = 0, j = 0, h = 0; // j là đoạn không vẽ, h là khoảng cách giữa các đoạn đã vẽ
        while(k < steps){
            k++; j++;
            x += xInc;
            y += yInc;
            if(j != 4) {
            	super.putPixel(Math.round(x), Math.round(y), Color.BLACK);
            }
            else if(j == 4) {
            	//maTranPixel[Math.round(x)][Math.round(y)] = false;
            	j--; h++;
            	if(h == 5) {
            		j = 0;
            		h = 0;
            	}
            	if(h == 2 || h == 4) {
            		super.putPixel(Math.round(x), Math.round(y), Color.BLACK);
            	}
            }
        }
        super.putPixel(x2, y2, Color.BLACK);
 	}
 	
 	
 	// vẽ mũi tên
 	public void muiTen(int x1, int y1, int x2, int y2) {
 		double atan = Math.atan2(y2 - y1, x2 - x1) + 3.14;
 		double degrees = 0.5;
 		int lengthArr = 15;
 		int xa, ya, xb, yb;
 		xa = (int) (x2 + lengthArr * Math.cos(atan - degrees));
 		ya = (int) (y2 + lengthArr * Math.sin(atan - degrees));
 		xb = (int) (x2 + lengthArr * Math.cos(atan + degrees));
 		yb = (int) (y2 + lengthArr * Math.sin(atan + degrees));
 		if(xa < 0 || xa > 128 || ya < 0 || ya > 68 || xb < 0 || xb > 128 || yb < 0 || yb > 68) {
 			JOptionPane.showMessageDialog(null, "2 cánh mũi tên ở ngoài hệ tọa độ nên không thể vẽ!", "Alert!", JOptionPane.WARNING_MESSAGE);
 		}
 		else {
 			dtDDA(x1, y1, x2, y2);
 	 		dtDDA(xa, ya, x2, y2);
 	 		dtDDA(xb, yb, x2, y2);
 	 		dtDDA(xa, ya, xb, yb);
 		}
 		
 	}
 	
 	// vẽ hình chữ nhật
 	public void hcnDDA(int x1, int y1, int x2, int y2) {
 		int x = x2,y = y1;
 		dtDDA(x1, y1, x, y);
 		dtDDA(x, y1, x2, y2);
 		x = x1;
 		y = y2;
 		dtDDA(x2, y2, x, y);
 		dtDDA(x, y, x1, y1);
 	}
 	
 	// 
 	public void ve2D1(Point tam, Point dinh, Point trai, Point phai, int a, int b) throws InterruptedException {
 		int size = 20;
 		// ve duong tron
 		midPointDTron(tam.x, tam.y, size);
 		// ve kim dong ho
 		super.putPixel(tam.x,  tam.y, Color.BLACK);
 		dtDDA(tam.x, tam.y, tam.x - 15, tam.y - 3); // kim phut
 		dtDDA(tam.x, tam.y, tam.x, tam.y + 7); // kim gio
 		
 		Point A, B;
 		A = new Point(trai.x, trai.y + b*2);
 		B = new Point(phai.x, phai.y + b*2);
 		// ve tam giac tren cung
 		dtDDA(dinh.x, dinh.y, trai.x, trai.y);
 		dtDDA(dinh.x, dinh.y, phai.x, phai.y);
 		
 		// hcn bao quanh dong ho
 		hcnDDA(trai.x, trai.y, B.x, B.y);
 		super.toMauBien(tam.x, tam.y + 12, Color.RED);
 		super.toMauBien(tam.x, tam.y - 12, Color.BLUE);
 		
 		// hcn la chan dong ho
 		Point C, D; // 2 diem tao duong cheo hcn
 		C = new Point(A.x + 10, A.y);
 		D = new Point(B.x - 10, B.y + 45);
 		hcnDDA(C.x, C.y, D.x, D.y);
 		
 		// ve con lac o duoi va dung phep tinh tien
 		Point diemTT, diemCodinh;
 		diemTT = new Point(tam.x, tam.y + 55);
 		diemCodinh = new Point(tam.x, tam.y + 25);
 		Point tr = new Point(0, 0);
 		Point k = new Point();
 		Transformations tf = new Transformations();
 		while(true) {
 			while(tr.x >= -10) {
 				
 				System.out.println(tr.x);
 				k = tf.tinhTien(diemTT, tr);
 				System.out.println("X: " + k.x + ", Y: " + k.y);
 				dtDDA(diemCodinh.x, diemCodinh.y, k.x, k.y);
 				tr.x--;
 				//Thread.sleep(1000);
 			}
 			break;
 		}
 		dtDDA(tam.x, tam.y + 25, tam.x - 4, tam.y + 55);
 		//midPointDTron(tam.x - 4, tam.y + 55, 3);
 		//super.toMauBien(C.x + 5, C.y + 5, Color.CYAN);
 	}
}
