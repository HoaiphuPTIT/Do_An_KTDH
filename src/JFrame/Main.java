package JFrame;
import Libs.BasicEntities;
import Libs.CreateGrP;
import Libs.Point;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JPanel pnlGrid;
	private JLabel lblToado;
	
	private int maxX; // do dai grid
	private int maxY; // do rong grid
	private int mx;
	private int my;
	private int size = 6;
	
    private CreateGrP lib;
	private Point O;
	private BasicEntities be;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	private void initComponent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 25, 1720, 1020);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		pnlGrid = new JPanel() {
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				be.drawPixel(g, pnlGrid.getWidth(), pnlGrid.getHeight());
			}
		};
		pnlGrid.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pnlGridmouseClicked(e);
			}
		});
		pnlGrid.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				pnlGridmouseMoved(e);
			}
		});
		pnlGrid.setBounds(12, 75, 1678, 854);
		contentPane.add(pnlGrid);
		
		lblToado = new JLabel("Tọa độ chuột");
		lblToado.setBounds(12, 942, 180, 16);
		contentPane.add(lblToado);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				be.setMaTranPixel(maxX, maxY);
				pnlGrid.repaint();
			}
		});
		btnClear.setBounds(1605, 13, 97, 25);
		contentPane.add(btnClear);
		
	}
	
	private void pnlGridmouseMoved(MouseEvent e) {
		mx = e.getX();
		my = e.getY();
		float x = (int) (mx / size * 0.2);
		float y = (int) (my / size * 0.2);
		Point M = new Point();
		M.x = (int) (O.x * 0.2);
		M.y = (int) (O.y * 0.2);
//		if(mx / size <= O.x && my / size <= O.y) {
//			lblToado.setText("x: " + (float)(x - M.x) + ", y: " + (float)(M.y - y));
//		}
//		else if(mx / size > O.x && my / size <= O.y) {
//			lblToado.setText("x: " + (float)(x - M.x) + ", y: " + (float)(M.y - y));
//		}
//		else if(mx / size <= O.x && my / size > O.y) {
//			lblToado.setText("x: " + (float)(x - M.x) + ", y: " + (float)(M.y - y));
//		}
//		else if(mx / size > O.x && my / size > O.y) {
//			lblToado.setText("x: " + (float)(x - M.x) + ", y: " + (float)(M.y - y));
//		}
		if(mx / size <= O.x && my / size <= O.y) {
			lblToado.setText("x: " + (float)((mx / size) * 0.2 - M.x) + ", y: " + (float)(M.y - (my / size) * 0.2));
		}
		else if(mx / size > O.x && my / size <= O.y) {
			lblToado.setText("x: " + (float)((mx / size) * 0.2 - M.x) + ", y: " + (float)(M.y - (my / size) * 0.2));
		}
		else if(mx / size <= O.x && my / size > O.y) {
			lblToado.setText("x: " + (float)((mx / size) * 0.2 - M.x) + ", y: " + (float)(M.y - (my / size) * 0.2));
		}
		else if(mx / size > O.x && my / size > O.y) {
			lblToado.setText("x: " + (float)((mx / size) * 0.2 - M.x) + ", y: " + (float)(M.y - (my / size) * 0.2));
		}
	}
	
	
	private void pnlGridmouseClicked(MouseEvent e) {
		be.hcnDDA(15, 23, 43, 55);
		Point maxA, maxB;
		maxA = new Point(15, 23);
		maxB = new Point(43, 55);
		be.toMauBien(19, 24, Color.RED);
		be.midPointEclip(O.x, O.y, 14, 35);
		be.toMauBien(19, 24, Color.RED);
		be.toMauBien(O.x, O.y, Color.RED);
		pnlGrid.repaint();
	}
	
	public Main() {
		setTitle("Đồ Án Kỹ Thuật Đồ Họa");
		initComponent();
		mx = -1;
		my = -1;
		maxX = pnlGrid.getWidth() / size;
		maxY = pnlGrid.getHeight() / size;
        
        //System.out.println(pnlGrid.getWidth() + " -> " + maxX + " / 2 -> " + maxX / 2);
        //System.out.println(pnlGrid.getHeight() + " -> " + maxY + " / 2 -> " + maxY / 2);
        
        be = new BasicEntities(maxX, maxY);
        be.setMaTranPixel(maxX, maxY);
        O = new Point();
        O.x = maxX / 2 + 1; // 140 
		O.y = maxY / 2 - 1; // 71
		
	}
}
