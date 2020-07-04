package Libs;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Param {
	public static JFrame createFrame3D;
	public static JPanel contentPane;
	public static JPanel pnlGrid;
	
	public static JTextField txtX1;
	public static JTextField txtY1;
	public static JTextField txtZ1;
	public static JTextField txtR;
	public static JTextField txtH;
	
	public static JTextField txtX2;
	public static JTextField txtY2;
	public static JTextField txtZ2;
	
	public static JButton btnDraw;
	public static JButton btnCls;
	
	// khai bao cac label hien thi toa do
	public static JFrame frmToaDo;
	public static JLabel lblX1;
	public static JLabel lblX2;
	public static JLabel lblY1;
	public static JLabel lblY2;
	public static JLabel lblZ1;
	public static JLabel lblZ2;
	
	public static JLabel lblA = new JLabel();
	public static JLabel lblB = new JLabel();
	public static JLabel lblC = new JLabel();
	public static JLabel lblD = new JLabel();
	//public static int subFrameWidth=275,subFrameHight=250,xOBegin=10,yOBegin=25,khoangCach=100,labelSize=25,textSize=75;
	
	public static int size = 6;
	public static int maxX = 1678 / size; // do dai grid
	public static int maxY = 854 / size; // do rong grid
	public static Point tamO = new Point(0, 0, 0);
	public static int R = 0;
	public static int H = 0;
}
