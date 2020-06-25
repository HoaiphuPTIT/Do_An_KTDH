package JFrame;
import Libs.BasicEntities;
import Libs.CreateGrP;
import Libs.Point;
import Libs.Transformations;
import Libs.Param;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout.Group;
import javax.swing.JTabbedPane;
import java.awt.Panel;
import java.awt.BorderLayout;

public class Main extends JFrame implements Runnable{

	//public JPanel contentPane;
	//public JPanel pnlGrid;
	private JLabel lblToado;
	private JComboBox cmb2D;
	private JComboBox cmb3D;
	private JRadioButton r2D;
	private JRadioButton r3D;
	private ButtonGroup bg;
//	private int maxX; // do dai grid
//	private int maxY; // do rong grid
	private int mx;
	private int my;
//	private int size = 6;
	
	int chon = 0;
	int hinh = 0;
    private CreateGrP lib;
	private Point O;
	private BasicEntities be;
	/**
	 * Launch the application.
	 */
	//public static Main frame = new Main();
	public static void main(String[] args) {
		Main frame = new Main();
		frame.setVisible(true);
		new Thread((Runnable) frame).start();
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Main frame = new Main();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}
	public void run() {
		if(this.hinh == 0) {
			//System.out.println("Vao 1");
			Point tam = new Point();
			tam = O;
			Point tr = new Point();
	 		tr.x = 10;
	 		tr.y = 0;
			Transformations tf = new Transformations();
			be.ve2D1(tam);
			while(tam.x <= 270) {
				try {
					be.ve2D1(tam);
					tam = tf.tinhTien(tam, tr);
					Thread.sleep(1000);
					be.setMaTranPixel(Param.maxX, Param.maxY);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		else {
			System.out.println("Vao else"+hinh);
		}
	}

	/**
	 * Create the frame.
	 */
	private void initComponent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 25, 1720, 1020);
		setResizable(false);
		Param.contentPane = new JPanel();
		Param.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Param.contentPane);
		Param.contentPane.setLayout(null);
		
		Param.pnlGrid = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				be.drawPixel(g, Param.pnlGrid.getWidth(), Param.pnlGrid.getHeight(), chon);
			}
		};
		Param.pnlGrid.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pnlGridmouseClicked(e);
			}
		});
		Param.pnlGrid.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				pnlGridmouseMoved(e);
			}
		});
		Param.pnlGrid.setBounds(12, 75, 1678, 854);
		Param.pnlGrid.setBackground(Color.WHITE);
		Param.contentPane.add(Param.pnlGrid);
		
		lblToado = new JLabel("Tọa độ chuột");
		lblToado.setBounds(12, 942, 180, 16);
		Param.contentPane.add(lblToado);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				be.setMaTranPixel(Param.maxX, Param.maxY);
				Param.pnlGrid.repaint();
			}
		});
		btnClear.setBounds(1605, 13, 97, 25);
		Param.contentPane.add(btnClear);
		

		DefaultComboBoxModel<String> type1 = new DefaultComboBoxModel<String>();
		type1.addElement("Hình 1");
		type1.addElement("Hình 2");
		cmb2D = new JComboBox<String>(type1);
		cmb2D.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cmb2D.setForeground(Color.WHITE);
		cmb2D.setBackground(Color.DARK_GRAY);
		cmb2D.setSelectedIndex(0);
		
		cmb2D.setBounds(100, 14, 120, 22);
		Param.contentPane.add(cmb2D);
		
		DefaultComboBoxModel<String> type2 = new DefaultComboBoxModel<String>();
		type2.addElement("Hình 1");
		type2.addElement("Hình 2");
		cmb3D = new JComboBox<String>(type2);
		cmb3D.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cmb3D.setForeground(Color.WHITE);
		cmb3D.setBackground(Color.DARK_GRAY);
		cmb3D.setSelectedIndex(0);
		
		cmb3D.setBounds(100, 44, 120, 22);
		Param.contentPane.add(cmb3D);
		
		JButton btnDraw = new JButton("Vẽ");
		btnDraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnDrawactionPerformed(e);
			}
		});
		btnDraw.setBounds(1496, 13, 97, 25);
		Param.contentPane.add(btnDraw);
		
		r2D = new JRadioButton("Vẽ 2D");
		r3D = new JRadioButton("Vẽ 3D");
		r2D.setBounds(12, 17, 80, 22);
		r3D.setBounds(12, 47, 80, 22);
		
		bg = new ButtonGroup();
		bg.add(r2D);
		bg.add(r3D);
		
		r2D.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange() == 1) {
					chon = 1;
					Param.pnlGrid.repaint();
				}
			}
		});
		r3D.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange() == 1) {
					chon = 2;
					Param.pnlGrid.repaint();
				}
			}
		});
		
		Param.contentPane.add(r2D);
		Param.contentPane.add(r3D);
	}
	
	protected void pnlGridmouseMoved(MouseEvent e) {
		mx = e.getX();
		my = e.getY();
		float x = (int) (mx / Param.size * 0.2);
		float y = (int) (my / Param.size * 0.2);
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
		if(mx / Param.size <= O.x && my / Param.size <= O.y) {
			lblToado.setText("x: " + (float)((mx / Param.size) * 0.2 - M.x) + ", y: " + (float)(M.y - (my / Param.size) * 0.2));
		}
		else if(mx / Param.size > O.x && my / Param.size <= O.y) {
			lblToado.setText("x: " + (float)((mx / Param.size) * 0.2 - M.x) + ", y: " + (float)(M.y - (my / Param.size) * 0.2));
		}
		else if(mx / Param.size <= O.x && my / Param.size > O.y) {
			lblToado.setText("x: " + (float)((mx / Param.size) * 0.2 - M.x) + ", y: " + (float)(M.y - (my / Param.size) * 0.2));
		}
		else if(mx / Param.size > O.x && my / Param.size > O.y) {
			lblToado.setText("x: " + (float)((mx / Param.size) * 0.2 - M.x) + ", y: " + (float)(M.y - (my / Param.size) * 0.2));
		}
	}
	
	
	protected void pnlGridmouseClicked(MouseEvent e) {
		
	}
	
	protected void btnDrawactionPerformed(ActionEvent e){
		if(r2D.isSelected() && cmb2D.getSelectedIndex() == 0) {
//			Point dinh, trai, phai;
//			int a = 65, b = 25;
//			dinh = new Point(O.x, O.y - a);
//			trai = new Point(O.x - b, O.y - b);
//			phai = new Point(O.x + b, O.y - b);
			
			this.hinh = 1;
		}
		else if(r2D.isSelected() && cmb2D.getSelectedIndex() == 1) {
			be.ve2D2(O);
			
			Param.pnlGrid.repaint();
		}
		else if(r3D.isSelected() && cmb3D.getSelectedIndex() == 0) {
			be.hinhCau(O, 40);
			hinh = 3;
		}
	}
	
	public Main() {
		setTitle("Đồ Án Kỹ Thuật Đồ Họa");
		initComponent();
		mx = -1;
		my = -1;
		//maxX = Param.pnlGrid.getWidth() / size;
		//maxY = Param.pnlGrid.getHeight() / size;
        
        //System.out.println(pnlGrid.getWidth() + " -> " + maxX + " / 2 -> " + maxX / 2);
        //System.out.println(pnlGrid.getHeight() + " -> " + maxY + " / 2 -> " + maxY / 2);
        
        be = new BasicEntities(Param.maxX, Param.maxY);
        be.setMaTranPixel(Param.maxX, Param.maxY);
        O = new Point();
        O.x = Param.maxX / 2 + 1; // 140 
		O.y = Param.maxY / 2 - 1; // 71
		
	}
}
