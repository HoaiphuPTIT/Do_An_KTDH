/**
 * 
 */
package Libs;

import java.awt.Graphics;

/**
 * @author HoaiphuLam
 *
 */
public class BasicEntities extends CreateGrP{
	
	public BasicEntities(int maxX, int maxY) {
		super(maxX, maxY);
		// TODO Auto-generated constructor stub
	}
	
	public void put4Pixel(int xc, int yc, int r1, int r2) {
		super.putPixel(xc+r1, yc+r2);
		super.putPixel(xc-r1, yc+r2);
		super.putPixel(xc+r1, yc-r2);
		super.putPixel(xc-r1, yc-r2);
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
 	        if(t % 9 < 5) {
 	        	super.putPixel(xc+x, yc-y);
 	        	super.putPixel(xc-x, yc-y);
 	        }
 	        super.putPixel(xc+x, yc+y);
 	        super.putPixel(xc-x, yc+y);
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
 	        	super.putPixel(xc+x, yc-y);
 	        	super.putPixel(xc-x, yc-y);
	        }
 	        super.putPixel(xc+x, yc+y);
 	        super.putPixel(xc-x, yc+y);
 	    }
 	}
}
