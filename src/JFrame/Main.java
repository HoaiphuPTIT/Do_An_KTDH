package JFrame;
import Libs.Entities;
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
import java.awt.event.MouseMotionListener;

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
	private JLabel lblToadoP;
	
	private JLabel lblX1;
	private JLabel lblX2;
	private JLabel lblY1;
	private JLabel lblY2;
	private JLabel lblO;
	
	private JComboBox<String> cmb2D;
	private JComboBox<String> cmb3D;
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
	private Entities be;
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
		while(true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// chuyen dong 2D1
			if(this.hinh == 1) {
		
				Transformations tf = new Transformations();
				Point Left = new Point(175, 120);
				Point Right = new Point(245, 120);
				Point tamTh = new Point(210, 120);
				
				
				Point tam = new Point(60, 15);
				int r = 8;
				Point tammay = new Point(30, 20);
				int r1 = 26, r2 = 3;
				be.object2D2(tamTh, Left, Right, tam, r, tammay, r1, r2);
				Point x, y, z, o, p;
				x = new Point();
				y = new Point();
				z = new Point();
				o = new Point();
				p = new Point();
				
				Point tr = new Point(-1, 0);
				Point tr1 = new Point(0, -1);
				Point tr2 = new Point(1, 0);
				Param.pnlGrid.repaint();
				while(tr.x >= -200) {
					try {
						// tinh tien thueyn
						x = tf.tinhTien(Left, tr);
						y = tf.tinhTien(Right, tr);
						z = tf.tinhTien(tamTh, tr);
						o = tf.tinhTien(tam, tr1);
						p = tf.tinhTien(tammay, tr2);
						be.object2D2(z, x, y, tam, r, p, r1, r2);
						tr.x -= 1;
						//tinh tien may
						if(z.x % 10 == 0) {
							tr2.x += 1;
						}
						Thread.sleep(100);
						be.setMaTranPixel(Param.maxX, Param.maxY);
						Param.pnlGrid.repaint();
						// ngung chuyen dong va xoa het khi bam nut clear
						if(this.hinh == 0) break;
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			// chuyen dong 2D2
			else if(this.hinh == 2) {
				Transformations tf = new Transformations();
				Point A = new Point(10, 20);
				Point B = new Point(35, 20);
				Point dinh = new Point(15, 20);
				Point tam = new Point(140, 103);
				int r = 6;
				Point tammay = new Point(30, 20);
				int r1 = 6;
				Point x, y, z, o, p;
				x = new Point();
				y = new Point();
				z = new Point();
				o = new Point();
				p = new Point();
				
				be.object2D(dinh, A, B, tam, r, tammay, r1);
				Point tr = new Point(1, 0);
				Point tr1 = new Point(0, -1);
				Point tr2 = new Point(1, 0);
				while(tr.x <= 250) {
					try {
						// tinh tien may bay
						x = tf.tinhTien(A, tr);
						y = tf.tinhTien(B, tr);
						z = tf.tinhTien(dinh, tr);
						o = tf.tinhTien(tam, tr1);
						p = tf.tinhTien(tammay, tr2);
						be.object2D(z, x, y, o, r, p, r1);
						tr.x += 2;
						tr1.y -= 1;
						//-------------------------
						// vien dan thu nho dan
						if(o.y == 70) {
							r -= 2;
							
						}
						if(o.y == 60) {
							r -= 2;
							
						}
						if(o.y == 50) {
							r = 0;
							
						}
						//------------------
						//tinh tien may
						if(z.x % 20 == 0) {
							tr2.x += 1;
						}
						//----------------
						Thread.sleep(100);
						be.setMaTranPixel(Param.maxX, Param.maxY);
						Param.pnlGrid.repaint();
						// ngung chuyen dong va xoa het khi bam nut clear
						if(this.hinh == 0) break;
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				Param.pnlGrid.repaint();
			}
			// ve hinh cau
			else if(this.hinh == 3) {
				Point tam = new Point();
				
				if(Param.tamO.x >= 0 && Param.tamO.y >= 0 && Param.tamO.z >= 0) {
					
//					if(Param.tamO.z >= 78) {
//						tam.x = Param.tamO.x - (Param.tamO.z / 4);
//						tam.y = Param.tamO.y + (Param.tamO.z / 4);
//					}
//					else if(Param.tamO.z < 78) {
//						tam.x = Param.tamO.x + (Param.tamO.z / 4);
//						tam.y = Param.tamO.y - (Param.tamO.z / 4);
//					}
					tam.x = Param.tamO.x;
					tam.y = Param.tamO.y;
					be.hinhCau(tam, Param.R);
				}
				Param.pnlGrid.repaint();
			}
			// ve hinh non
			else if(this.hinh == 4) {
				Point tam, dinh;
				tam = new Point();
				dinh = new Point();
				int R = 28;
				if(Param.tamO.x >= 0 && Param.tamO.y >= 0 && Param.tamO.z >= 0) {
					
//					if(Param.tamO.z >= 78) {
//						tam.x = Param.tamO.x - (Param.tamO.z / 4);
//						tam.y = Param.tamO.y + (Param.tamO.z / 4);
//					}
//					else if(Param.tamO.z < 78) {
//						tam.x = Param.tamO.x + (Param.tamO.z / 4);
//						tam.y = Param.tamO.y - (Param.tamO.z / 4);
//					}
					tam.x = Param.tamO.x;
					tam.y = Param.tamO.y;
					dinh.x = tam.x;
					dinh.y = tam.y - Param.H;
					be.hinhNon(tam, dinh, Param.R);
				}
				
				Param.pnlGrid.repaint();
			}
			else if(this.hinh == 5) {
				Point tam = new Point();
                int h = 0;
                if(Param.tamO.x >= 0 && Param.tamO.y >= 0 && Param.tamO.z >= 0) {
		
//					if(Param.tamO.z >= 78) {
//						tam.x = Param.tamO.x - (Param.tamO.z / 4);
//						tam.y = Param.tamO.y + (Param.tamO.z / 4);
//					}
//					else if(Param.tamO.z < 78) {
//						tam.x = Param.tamO.x + (Param.tamO.z / 4);
//						tam.y = Param.tamO.y - (Param.tamO.z / 4);
//			                                    
//					}
					tam.x = Param.tamO.x;
					tam.y = Param.tamO.y;
					be.hinhTru(tam, Param.H, Param.R);            
                }
                Param.pnlGrid.repaint();
			}
			else if(this.hinh == 6) {
				Point start = new Point();
                int h = 0;
                if(Param.tamO.x >= 0 && Param.tamO.y >= 0 && Param.tamO.z >= 0) {
                	start.x = Param.tamO.x;
                	start.y = Param.tamO.y;
                	start.z = Param.tamO.z;
//					if(Param.tamO.z >= 78) {
//						start.x = Param.tamO.x - (Param.tamO.z / 4);
//						start.y = Param.tamO.y + (Param.tamO.z / 4);
//					}
//					else if(Param.tamO.z < 78) {
//						start.x = Param.tamO.x + (Param.tamO.z / 4);
//						start.y = Param.tamO.y - (Param.tamO.z / 4);                    
//					}
                    be.hinhHop(start.x, start.y, start.z, Param.H);            
                }
                  
                Param.pnlGrid.repaint();
			}
			else if(this.hinh == 7) {
				Point tam = new Point(140, 70);
				Point diem = new Point (140, 30);
				Transformations tf = new Transformations();
				Point tr = new Point(0, 40);
				Point tr2 = new Point(0, -40);
				int a = 0;
				double deg = -0.1;
				Point t = new Point(40, 30);
				be.quay(tam, diem);
				while(a <= 100) {
					try {
						tr.x = tam.x - diem.x;
						tr.y = tam.y - diem.y;
						diem = tf.tinhTien(diem, tr);
						diem = tf.quay2(tam, deg);
						tr2.x =  - diem.x;
						tr2.y =  - diem.y;
						diem = tf.tinhTien(tam, tr);
						be.quay(tam, diem);
						deg -= 0.1;
						a++;
						Thread.sleep(1000);
						be.setMaTranPixel(Param.maxX, Param.maxY);
						Param.pnlGrid.repaint();
						if(this.hinh == 0) break;
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			// xoa 
			else if(this.hinh == 0) {
				Param.tamO.x = -1;
				Param.tamO.y = -1;
				Param.tamO.z = -1;
				Param.R = 0;
				Param.H = 0;
				be.setMaTranPixel(Param.maxX, Param.maxY);
				Param.pnlGrid.repaint();
			}	
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
		Param.contentPane.setBackground(Color.WHITE);
		Param.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Param.contentPane);
		Param.contentPane.setLayout(null);
		Param.contentPane.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				//lblToadoP.setText("X: " + e.getX() + ", Y: " + e.getY());
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
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
//		lblO = new JLabel("O");
//		lblO.setBounds(839, 427, 180, 16);
//		Param.pnlGrid.add(lblO);
		
		Param.contentPane.add(Param.pnlGrid);
		
		lblToado = new JLabel("Tọa độ chuột");
		lblToado.setBounds(12, 942, 180, 16);
		Param.contentPane.add(lblToado);
		
//		lblToadoP = new JLabel("Tọa độ Pannel");
//		lblToadoP.setBounds(112, 942, 180, 16);
//		Param.contentPane.add(lblToadoP);
		
		lblY1 = new JLabel("14");
		lblY1.setBounds(845, 52, 180, 16);
		Param.contentPane.add(lblY1);
		lblY2 = new JLabel("-14");
		lblY2.setBounds(845, 932, 180, 16);
		Param.contentPane.add(lblY2);
		lblX1 = new JLabel("28");
		lblX1.setBounds(1695, 485, 180, 16);
		Param.contentPane.add(lblX1);
		lblX2 = new JLabel("-28");
		lblX2.setBounds(0, 485, 180, 16);
		Param.contentPane.add(lblX2);
		
		
		JButton btnClear = new JButton("Xóa");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnClearactionPerformed(e);
			}
		});
		btnClear.setBackground(Color.RED);
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnClear.setBounds(1605, 13, 97, 25);
		Param.contentPane.add(btnClear);
		
		JButton btnInfo = new JButton("Thông tin nhóm");
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameInfo fr = new FrameInfo();
				fr.setVisible(true);
			}
		});
		btnInfo.setBackground(Color.RED);
		btnInfo.setForeground(Color.WHITE);
		btnInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnInfo.setBounds(1555, 932, 150, 25);
		Param.contentPane.add(btnInfo);
		

		DefaultComboBoxModel<String> type1 = new DefaultComboBoxModel<String>();
		type1.addElement("Chuyển động 2D 1");
		type1.addElement("Chuyển động 2D 2");
		
		cmb2D = new JComboBox<String>(type1);
		cmb2D.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cmb2D.setForeground(Color.WHITE);
		cmb2D.setBackground(Color.DARK_GRAY);
		cmb2D.setSelectedIndex(0);
		
		cmb2D.setBounds(100, 14, 170, 22);
		Param.contentPane.add(cmb2D);
		
		DefaultComboBoxModel<String> type2 = new DefaultComboBoxModel<String>();
		type2.addElement("Hình cầu");
		type2.addElement("Hình nón");
		type2.addElement("Hình trụ");
		type2.addElement("Hình hộp chữ nhật");
		type2.addElement("Test");
		cmb3D = new JComboBox<String>(type2);
		cmb3D.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cmb3D.setForeground(Color.WHITE);
		cmb3D.setBackground(Color.DARK_GRAY);
		cmb3D.setSelectedIndex(0);
		
		cmb3D.setBounds(100, 44, 170, 22);
		Param.contentPane.add(cmb3D);
		
		JButton btnDraw = new JButton("Vẽ");
		btnDraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					btnDrawactionPerformed(e);
			}
		});
		btnDraw.setBackground(Color.DARK_GRAY);
		btnDraw.setForeground(Color.WHITE);
		btnDraw.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDraw.setBounds(1496, 13, 97, 25);
		Param.contentPane.add(btnDraw);
		
		r2D = new JRadioButton("Vẽ 2D");
		r3D = new JRadioButton("Vẽ 3D");
		r2D.setBounds(12, 14, 80, 22);
		r3D.setBounds(12, 44, 80, 22);
		r2D.setBackground(Color.DARK_GRAY);
		r2D.setForeground(Color.WHITE);
		r2D.setFont(new Font("Tahoma", Font.PLAIN, 15));
		r3D.setBackground(Color.DARK_GRAY);
		r3D.setForeground(Color.WHITE);
		r3D.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
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
//		if(mx / Param.size <= O.x && my / Param.size <= O.y) {
//			lblToado.setText("x: " + (float)((mx / Param.size) * 0.2 - M.x) + ", y: " + (float)(M.y - (my / Param.size) * 0.2));
//		}
//		else if(mx / Param.size > O.x && my / Param.size <= O.y) {
//			lblToado.setText("x: " + (float)((mx / Param.size) * 0.2 - M.x) + ", y: " + (float)(M.y - (my / Param.size) * 0.2));
//		}
//		else if(mx / Param.size <= O.x && my / Param.size > O.y) {
//			lblToado.setText("x: " + (float)((mx / Param.size) * 0.2 - M.x) + ", y: " + (float)(M.y - (my / Param.size) * 0.2));
//		}
//		else if(mx / Param.size > O.x && my / Param.size > O.y) {
//			lblToado.setText("x: " + (float)((mx / Param.size) * 0.2 - M.x) + ", y: " + (float)(M.y - (my / Param.size) * 0.2));
//		}
		lblToado.setText("x: " + (float)((mx / Param.size) * 0.2 - M.x) + ", y: " + (float)(M.y - (my / Param.size) * 0.2));
	}
	
	
	protected void pnlGridmouseClicked(MouseEvent e) {
			
			
//			if(r2D.isSelected() && cmb2D.getSelectedIndex() == 0) {
////				
//				this.hinh = 1;
//			}
//			else if(r2D.isSelected() && cmb2D.getSelectedIndex() == 1) {
//				
//				this.hinh = 2;
//			}
			// hien form ve hinh cau
			if(r3D.isSelected() && cmb3D.getSelectedIndex() == 0) {
				FrameHinhCau hc = new FrameHinhCau();
				Param.createFrame3D = hc.create();
				
				Param.btnDraw.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						Param.btnDraw.setBackground(Color.GRAY);
						Param.btnCls.setBackground(Color.WHITE);
						
						hc.processTXT();
//						System.out.println(Param.tamO.x);
//						System.out.println(Param.tamO.y);
//						System.out.println(Param.R);
					}
				});
				
				Param.btnCls.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						Param.btnDraw.setBackground(Color.WHITE);
						Param.btnCls.setBackground(Color.GRAY);
						hc.clear();
						be.setMaTranPixel(Param.maxX, Param.maxY);
						Param.pnlGrid.repaint();
					}
				});
				this.hinh = 3;
			}
			// hien form ve hinh non
			else if(r3D.isSelected() && cmb3D.getSelectedIndex() == 1) {
				FrameHinhNon hn = new FrameHinhNon();
				Param.createFrame3D = hn.create();
				
				Param.btnDraw.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						Param.btnDraw.setBackground(Color.GRAY);
						Param.btnCls.setBackground(Color.WHITE);
						
						hn.processTXT();
//						System.out.println(Param.tamO.x);
//						System.out.println(Param.tamO.y);
//						System.out.println(Param.R);
					}
				});
				
				Param.btnCls.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						Param.btnDraw.setBackground(Color.WHITE);
						Param.btnCls.setBackground(Color.GRAY);
						hn.clear();
						be.setMaTranPixel(Param.maxX, Param.maxY);
						Param.pnlGrid.repaint();
					}
				});
				this.hinh = 4;
			}
			// hien form ve hinh tru
			else if(r3D.isSelected() && cmb3D.getSelectedIndex() == 2) {
				FrameHinhTru ht = new FrameHinhTru();
				Param.createFrame3D = ht.create();
				
				Param.btnDraw.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						Param.btnDraw.setBackground(Color.GRAY);
						Param.btnCls.setBackground(Color.WHITE);
						
						ht.processTXT();
//						System.out.println(Param.tamO.x);
//						System.out.println(Param.tamO.y);
//						System.out.println(Param.R);
					}
				});
				
				Param.btnCls.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						Param.btnDraw.setBackground(Color.WHITE);
						Param.btnCls.setBackground(Color.GRAY);
						ht.clear();
						be.setMaTranPixel(Param.maxX, Param.maxY);
						Param.pnlGrid.repaint();
					}
				});
				this.hinh = 5;
			}
			// hien form ve hinh hop chu nhat
			else if(r3D.isSelected() && cmb3D.getSelectedIndex() == 3) {
				
				FrameHinhHop hh = new FrameHinhHop();
				Param.createFrame3D = hh.create();
				
				Param.btnDraw.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						Param.btnDraw.setBackground(Color.GRAY);
						Param.btnCls.setBackground(Color.WHITE);
						
						hh.processTXT();
//						System.out.println(Param.tamO.x);
//						System.out.println(Param.tamO.y);
//						System.out.println(Param.R);
					}
				});
				
				Param.btnCls.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						Param.btnDraw.setBackground(Color.WHITE);
						Param.btnCls.setBackground(Color.GRAY);
						hh.clear();
						be.setMaTranPixel(Param.maxX, Param.maxY);
						Param.pnlGrid.repaint();
					}
				});
				this.hinh = 6;
			}
	}
	
	protected void btnClearactionPerformed(ActionEvent e) {
		this.hinh = 0;
		be.setMaTranPixel(Param.maxX, Param.maxY);
		Param.pnlGrid.repaint();
	}
	
	protected void btnDrawactionPerformed(ActionEvent e){
		if(r2D.isSelected() && cmb2D.getSelectedIndex() == 0) {
//			Point dinh, trai, phai;
//			int a = 65, b = 25;
//			dinh = new Point(O.x, O.y - a);
//			trai = new Point(O.x - b, O.y - b);
//			phai = new Point(O.x + b, O.y - b);
			FrameToaDoThuyen fr = new FrameToaDoThuyen();
			fr.setVisible(true);
			this.hinh = 1;
		}
		else if(r2D.isSelected() && cmb2D.getSelectedIndex() == 1) {
			FrameToaDoMayBay fr = new FrameToaDoMayBay();
			fr.setVisible(true);
			this.hinh = 2;
		}
		else if(r3D.isSelected() && cmb3D.getSelectedIndex() == 0) {
			
			this.hinh = 3;
		}
		else if(r3D.isSelected() && cmb3D.getSelectedIndex() == 1) {
			
			this.hinh = 4;
		}
		else if(r3D.isSelected() && cmb3D.getSelectedIndex() == 2) {
			
			this.hinh = 5;
		}
		else if(r3D.isSelected() && cmb3D.getSelectedIndex() == 3) {
			
			this.hinh = 6;
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
        
        be = new Entities(Param.maxX, Param.maxY);
        be.setMaTranPixel(Param.maxX, Param.maxY);
        O = new Point();
        O.x = Param.maxX / 2 + 1; // 140 
		O.y = Param.maxY / 2 - 1; // 71
		// O.z = 156.524
	}
}
