/**
 * 
 */
package Libs;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import JFrame.FrameToaDo;
import JFrame.Main;

/**
 * @author HoaiphuLam
 *
 */
public class Entities extends CreateGrP{
	
	public Entities(int maxX, int maxY) {
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
 	
 	public void midPointEclipNetDut(int xc, int yc, int A, int B) {
 		
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
 	        if(t % 9 < 5) {
 	        	super.putPixel(xc+x, yc-y, Color.BLACK);
 	        	super.putPixel(xc-x, yc-y, Color.BLACK);
 	        }
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
 	        if(t % 9 < 5) {
 	        	super.putPixel(xc+x, yc-y, Color.BLACK);
 	        	super.putPixel(xc-x, yc-y, Color.BLACK);
	        }
 	        super.putPixel(xc+x, yc-y, Color.BLACK);
        	super.putPixel(xc-x, yc-y, Color.BLACK);
 	        super.putPixel(xc+x, yc+y, Color.BLACK);
 	        super.putPixel(xc-x, yc+y, Color.BLACK);
 	    }
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
// 	        	super.putPixel(xc+x, yc-y, Color.BLACK);
// 	        	super.putPixel(xc-x, yc-y, Color.BLACK);
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
// 	        	super.putPixel(xc+x, yc-y, Color.BLACK);
// 	        	super.putPixel(xc-x, yc-y, Color.BLACK);
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
 	
 	// hinh tam giac
 	public void tripleRec(Point dinh, int chRong, int chCao, int type) {
 		Point left, right;
 		
 		left = new Point();
 		right = new Point();
 		
 		if(type == 0) { 
 			left.x = dinh.x - chRong;
 	 		left.y = dinh.y + chCao;
 	 		
 	 		right.x = dinh.x + chRong;
 	 		right.y = dinh.y + chCao;
 		}
 		else if(type == 1) { // hinh tam giac nguoc
 			left.x = dinh.x - chRong;
 	 		left.y = dinh.y - chCao;
 	 		
 	 		right.x = dinh.x + chRong;
 	 		right.y = dinh.y - chCao;
 		}
 		
 		dtDDA(dinh.x, dinh.y, left.x, left.y);
 		dtDDA(dinh.x, dinh.y, right.x, right.y);
 		dtDDA(left.x, left.y, right.x, right.y);
 	}
 	
 	// hinh tam giac vuong
  	public void tripleRecL(Point dinh, int chRong, int chCao, int type) {
  		Point left, right;
  		
  		left = new Point();
  		right = new Point();
  		
  		if(type == 0) {
  			left.x = dinh.x;
  	  		left.y = dinh.y + chCao;
  	  		
  	  		right.x = dinh.x + chRong;
  	  		right.y = dinh.y + chCao;
  		}
  		else if(type == 1) {
  			left.x = dinh.x;
  	  		left.y = dinh.y - chCao;
  	  		
  	  		right.x = dinh.x + chRong;
  	  		right.y = dinh.y - chCao;
  		}
  		else if(type == 2) {
  			left.x = dinh.x - chRong;
  			left.y = dinh.y + chCao;
  			
  			right.x = dinh.x;
  			right.y = dinh.y + chCao;
  		}
  		
  		dtDDA(dinh.x, dinh.y, left.x, left.y);
  		dtDDA(dinh.x, dinh.y, right.x, right.y);
  		dtDDA(left.x, left.y, right.x, right.y);
  	}
  	
 // hinh tam giac nam
  	public void tripleRecNam(Point dinh, int chRong, int chCao) {
  		Point up, down;
  		
  		up = new Point();
  		up.x = dinh.x - chCao;
  		up.y = dinh.y - chRong;
  		
  		down = new Point();
  		down.x = dinh.x - chCao;
  		down.y = dinh.y + chCao;
  		
  		dtDDA(dinh.x, dinh.y, up.x, up.y);
  		dtDDA(dinh.x, dinh.y, down.x, down.y);
  		dtDDA(up.x, up.y, down.x, down.y);
  	}
 	
 	// 
 	public void ve2D1(Point tam, Point H, Point M){
 		Point left, right;
 		left = new Point();
 		right = new Point();
 		int khoangCach = 25, r = 20;
 		
 		
 		
 		left.x = tam.x - khoangCach;
 		left.y = tam.y - khoangCach;
 		right.x = tam.x + khoangCach;
 		right.y = tam.y - khoangCach;
 		
 		// ve tam giac tren cung
 		dtDDA(tam.x, tam.y - khoangCach*2, left.x, left.y);
 		dtDDA(tam.x, tam.y - khoangCach*2, right.x, right.y);
 		
 		// hcn bao quanh dong ho
 		hcnDDA(left.x, left.y, right.x, right.y + khoangCach*2);
 		super.toMauBien(left.x + 4, left.y + 12, Color.RED);
 		
 		// ve duong tron
 		midPointDTron(tam.x, tam.y, r);
 	 	super.toMauBien(tam.x, tam.y, Color.LIGHT_GRAY);
 	 	
 		// ve kim dong ho
 		super.putPixel(tam.x,  tam.y, Color.BLACK);
 		dtDDA(tam.x, tam.y, H.x, H.y); // kim phut
 		dtDDA(tam.x, tam.y, tam.x, tam.y + 7); // kim gio
 		
 		// hcn chan dong ho
 		hcnDDA(left.x + 5, left.y + khoangCach*2, right.x - 5, right.y + khoangCach*3 + 20);
 		super.toMauBien(left.x + 15, left.y + khoangCach*2 + 5, Color.GREEN);
 		
 		
// 		Point tt = new Point();
// 		tt.x = tam.x;
// 		tt.y = tam.y;
// 		Point tr = new Point();
// 		tr.x = 10;
// 		tr.y = 0;
// 		while(tt.x <= 260) {
// 			try {
//				Thread.sleep(1000);
//				super.setMaTranPixel(Param.maxX, Param.maxY);
//				
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
// 		}
 	}
 	
 	public void ve2D2(Point tam) {
 		int r = 50, r1 = r - 43, khoangCach = 25;
 		Point left, right;
 		
 		left = new Point();
 		right = new Point();
 		
 		// ve tong the mat tron
 		midPointDTron(tam.x, tam.y, r);
 		
 		// ve 2 mat
 		// mat ben trai
 		left.x = tam.x - khoangCach;
 		left.y = tam.y - khoangCach + 5;
 		midPointDTron(left.x, left.y, r1);
 		//mat ben phai
 		right.x = tam.x + khoangCach;
 		right.y = tam.y - khoangCach + 5;
 		midPointDTron(right.x, right.y, r1);
 		
 		// ve mieng
 		int  ra = r - 20, rb = r - 40;
 		Point tamE = new Point();
 		tamE.x = tam.x;
 		tamE.y = tam.y + khoangCach;
 		midPointEclipNetDut(tamE.x, tamE.y, ra, rb);
 	}
 	
 	// ve cac doi tuong 2D
 	// ve may bay chien dau
 	public void mbChiendau(Point dinh, Point A, Point B) {
 		// ve canh tren
 		
 		int kc2Canh = 10;
 		int chCao = 15;
 		int chRong = 10;
 		int crMB = 8;
 		
 		Point dinhtam = new Point();
 		dinhtam.x = dinh.x;
 		dinhtam.y = dinh.y;
 		dtDDA(A.x, A.y, B.x, B.y);
 		dinhtam.y = dinh.y - chCao;
 		
 		tripleRecL(dinhtam, chRong, chCao, 0);
 		dinhtam.x = dinh.x - kc2Canh;
 		dinhtam.y = dinh.y - chCao / 2;
 		tripleRecL(dinhtam, chRong / 2, chCao / 2, 0);
 		
 		// ve canh duoi
 		Point _A = new Point();
 		_A.x = A.x;
 		_A.y = A.y + crMB;
 		Point _B = new Point();
 		_B.x = B.x;
 		_B.y = B.y + crMB;
 		dinhtam.y = dinh.y + crMB*3 - 1;
 		dinhtam.x = dinh.x;
 		dtDDA(_A.x, _A.y, _B.x, _B.y);
 		tripleRecL(dinhtam, chRong, chCao, 1);
 		dinhtam.x = dinh.x - kc2Canh;
 		dinhtam.y = dinhtam.y - chCao / 2 - 1;
 		tripleRecL(dinhtam, chRong / 2, chCao / 2, 1);
 		
 		// ve mui may bay
 		dinhtam.y = _B.y;
 		dinhtam.x = _B.x + 10;
 		dtDDA(_B.x, _B.y, _B.x, _B.y - crMB);
 		dtDDA(_B.x, _B.y, dinhtam.x, dinhtam.y - crMB / 2);
 		dtDDA(_B.x, _B.y - crMB, dinhtam.x, dinhtam.y - crMB / 2);
 		
 		// ve duoi may bay
 		dinhtam.y = _A.y;
 		dinhtam.x = _A.x - 10;
 		_A.x = A.x - 5;
 		dtDDA(_A.x, _A.y, _A.x, _A.y - crMB);
 		dtDDA(_A.x, _A.y, dinhtam.x, dinhtam.y - crMB / 2);
 		dtDDA(_A.x, _A.y - crMB, dinhtam.x, dinhtam.y - crMB / 2);
 		
 		// to mau
 		super.toMauBien(A.x + 2, A.y + 2, Color.WHITE);
 		super.toMauBien(_B.x + 2, dinhtam.y - crMB / 2, Color.WHITE);
 		super.toMauBien(A.x - 5, A.y + 4, Color.RED);
 		super.toMauBien(dinh.x + 1, dinh.y - 3, Color.GREEN);
 		super.toMauBien(dinh.x + 1, dinh.y + 3 + crMB, Color.GREEN);
 		super.toMauBien(dinh.x - kc2Canh + 2, dinh.y + 3 + crMB, Color.GREEN);
 		super.toMauBien(dinh.x - kc2Canh + 2, dinh.y - 3 , Color.GREEN);
 	}
 	// ve bot ban dan
 	public void bot() {
 		Point _dinh, _A, _B;
 		_dinh = new Point();
 		_A = new Point();
 		_B = new Point();
 		
 		Point left, right;
 		left = new Point();
 		right = new Point();
 		
 		int chDai = 25;
 		int chRong = 10;
 		
 		// xac dinh tam cua bot
 		_dinh.x = 140;
 		_dinh.y = 130;
 		_A.x = 137;
 		_A.y = _dinh.y - chRong + 2;
 		_B.x = 143;
 		_B.y = _dinh.y - chDai - 2;
 		
 		left.x = _dinh.x - chDai;
 		left.y = _dinh.y;
 		right.x = _dinh.x + chDai;
 		right.y = _dinh.y + chRong;
 		
 		// ve hinh chu nhat duoi 
 		hcnDDA(left.x, left.y, right.x, right.y);
 		
 		// ve hcn tren
 		right.x = _dinh.x + chDai;
 		right.y = _dinh.y - chRong + 2;
 		hcnDDA(left.x + 5, left.y, right.x - 5, right.y);
 		
 		// ve nong sung
 		hcnDDA(_A.x, _A.y, _B.x, _B.y);
 		
 		// to mau
 		super.toMauBien(_dinh.x, _dinh.y + 1, Color.DARK_GRAY);
 		super.toMauBien(_dinh.x, _dinh.y - 1, Color.DARK_GRAY);
 		super.toMauBien(_dinh.x, _dinh.y - chRong - 3, Color.GREEN);
 	}
 	// ve vien dan
 	public void dan(Point tam, int r) {
 		midPointDTron(tam.x, tam.y, r);
 		super.toMauBien(tam.x, tam.y, Color.GREEN);
 	}
 	// ve may
 	public void may(Point tam, int r) {
 		
 		
 		midPointEclip(tam.x, tam.y+6, r+20, r);
 		super.toMauBien(tam.x, tam.y+6, Color.WHITE);
 		midPointDTron(tam.x, tam.y, r+3);
 		super.toMauBien(tam.x, tam.y, Color.WHITE);
 		midPointDTron(tam.x-10, tam.y, r-2);
 		super.toMauBien(tam.x-10, tam.y, Color.WHITE);
 		midPointDTron(tam.x+12, tam.y, r);
 		super.toMauBien(tam.x+12, tam.y, Color.WHITE);
 	}
 	// to mau nen
 	public void toBG() {
 		for(int i = 0; i < Param.pnlGrid.getWidth() / Param.size; i++){	// moi o pixel cach nhau = size
            for(int j = 0; j < Param.pnlGrid.getHeight() / Param.size; j++){
            	
            	super.putPixel(i, j, Color.CYAN);
            }
 		}
 	}
 	// hinh chuyen dong 1
 	public void object2D(Point dinh, Point A, Point B, Point tam, int r, Point tammay, int r1) {
 		toBG();
 		mbChiendau(dinh, A, B);
 		bot();
 		dan(tam, r);
 		may(tammay, r1);
 		Point _tammay = new Point(tammay.x + 60, tammay.y + 20);
 		may(_tammay, r1);
 		Point _tammay2 = new Point(tammay.x + 160, tammay.y + 10);
 		may(_tammay2, r1);
 	}
 	
 	// ve thuyen
 	public void thuyen(Point tamTh, Point Left, Point Right) {
 		// khai bao 
 		int chCao_1 = 7,
 			chCao_2 = 10,
 			chRong_1 = 20,
 			chRong_2 = 17,
 			chRong_3 = 13;
 		
 		// ve day thuyen
 		Point _Left = new Point(Left.x + 7, Left.y + chCao_2),
 			  _Right = new Point(Right.x - 3, Right.y + chCao_2);
 		
 		dtDDA(Left.x, Left.y, Right.x, Right.y);
 		dtDDA(_Left.x, _Left.y, _Right.x, _Right.y);
 		dtDDA(Left.x, Left.y, _Left.x, _Left.y);
 		dtDDA(Right.x, Right.y, _Right.x, _Right.y);
 		 
 		// ve hcn duoi
 		Point ULeft = new Point(tamTh.x - chRong_1, tamTh.y - chCao_1),
 	 		  DRight = new Point(tamTh.x + chRong_1, tamTh.y);
 		hcnDDA(ULeft.x, ULeft.y, DRight.x, DRight.y);
 	 	// ve canh buom
 		Point _tam = new Point(tamTh.x, tamTh.y - chCao_2*4);
 		
 		// ve cot buom
 		dtDDA(tamTh.x, tamTh.y - chCao_1, _tam.x, _tam.y);
 		
 		//ve canh buom 2 ben
 		tripleRecL(_tam, chRong_2, chCao_2*3 - 3, 0);
 		tripleRecL(_tam, chRong_3, chCao_2*3 - 3, 2);
 		// to mau day thuyen
 		super.toMauBien(tamTh.x, tamTh.y + 5, Color.ORANGE);
 		
 		// ve hinh tron trong day thuyen
 		midPointDTron(tamTh.x, tamTh.y + 5, 3);
 		midPointDTron(tamTh.x - 15, tamTh.y + 5, 3);
 		midPointDTron(tamTh.x + 15, tamTh.y + 5, 3);
 		super.toMauBien(tamTh.x, tamTh.y + 5, Color.RED);
 		super.toMauBien(tamTh.x - 15, tamTh.y + 5, Color.RED);
 		super.toMauBien(tamTh.x + 15, tamTh.y + 5, Color.RED);
 		
 		// to mau 
 		super.toMauBien(tamTh.x, tamTh.y - 5, Color.ORANGE);
 		super.toMauBien(_tam.x - 5, _tam.y + 15, Color.GREEN);
 		super.toMauBien(_tam.x + 5, _tam.y + 15, Color.GREEN);
 	}
 	// ve may
 	public void mayNho(Point tam, int r1, int r2) {
 		midPointEclip(tam.x, tam.y, r1, r2);
 		super.toMauBien(tam.x, tam.y, Color.DARK_GRAY);
 		midPointEclip(tam.x + 80, tam.y + 23, r1, r2);
 		super.toMauBien(tam.x + 80, tam.y + 23, Color.WHITE);
 		midPointEclip(tam.x + 180, tam.y + 10, r1, r2);
 		super.toMauBien(tam.x + 180, tam.y + 10, Color.DARK_GRAY);
 		midPointEclip(tam.x + 200, tam.y + 20, r1, r2);
 		super.toMauBien(tam.x + 200, tam.y + 20, Color.WHITE);
 	}
 	// ve mat troi
 	public void matTroi(Point tam, int r) {
 		midPointDTron(tam.x, tam.y, r);
 		super.toMauBien(tam.x, tam.y, Color.YELLOW);
 	}
 	// to mau ben
 	public void BGThuyen() {
 		hcnDDA(0, 0, 278, 50);
 		super.toMauBien(5, 5, Color.CYAN);
 		hcnDDA(0, 50, 278, 141);
 		super.toMauBien(5, 60, Color.BLUE);
 	}
 	public void object2D2(Point tamTh, Point Left, Point Right, Point tam, int r, Point tamMay, int r1, int r2) {
 		BGThuyen();
 		thuyen(tamTh, Left, Right);
 		mayNho(tamMay, r1, r2);
 		matTroi(tam, r);
 	}
 	
 	// ve cac doi tuong 3D
 	// ve hinh cau
 	public void hinhCau(Point tam, int r) {
 		int r1 = r / 4;
 		
 		midPointDTron(tam.x, tam.y, r);
 		midPointEclipNetDut(tam.x, tam.y, r, r1);
	
 	}
 	
 	// ve hinh tru
 	public void hinhTru() {
 		
 	}
 	
 // ve hinh non
  	public void hinhNon(Point tamO, Point dinh, int R) {
  		
  		// ve eclip day
  		int r1 = R / 4;
  		midPointEclipNetDut(tamO.x, tamO.y, R, r1);
  		
  		Point up, down;
  		up = new Point(dinh.x, dinh.y);
  		down = new Point(dinh.x + R, tamO.y);
  		
  		// ve 2 canh hinh non
  		dtDDA(up.x, up.y, down.x - 3, down.y);
  		dtDDA(up.x, up.y, down.x - R*2 + 3, down.y);
  	}
}
