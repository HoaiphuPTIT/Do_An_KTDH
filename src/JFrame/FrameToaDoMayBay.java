package JFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;

public class FrameToaDoMayBay extends JFrame {

	private JPanel contentPane;
	public static JLabel lblA;
	public static JLabel lblB;
	public static JLabel lblC;
	public static JLabel lblD;
	private JLabel lblNewLabel_1;
	
	public static JLabel lblA_1;
	public static JLabel lblB_1;
	public static JLabel lblC_1;
	
	private JLayeredPane layeredPane_2;
	public static JLabel lblA_2;
	public static JLabel lblB_2;
	public static JLabel lblC_2;
	private JLabel lblNewLabel_1_2;
	
	private JLayeredPane layeredPane_3;
	public static JLabel lblA_3;
	private JLabel lblNewLabel_1_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameToaDoThuyen frame = new FrameToaDoThuyen();
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
	public FrameToaDoMayBay() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 550, 709);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		layeredPane.setBounds(12, 33, 503, 124);
		contentPane.add(layeredPane);
		layeredPane.setLayout(null);
		
		lblA = new JLabel("A");
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblA.setBounds(3, 1, 247, 46);
		layeredPane.add(lblA);
		
		lblB = new JLabel("B");
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblB.setBounds(262, 1, 247, 46);
		layeredPane.add(lblB);
		
		lblC = new JLabel("C");
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblC.setBounds(3, 60, 247, 46);
		layeredPane.add(lblC);
		
		lblD = new JLabel("D");
		lblD.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblD.setBounds(262, 60, 247, 46);
		layeredPane.add(lblD);
		
		lblNewLabel_1 = new JLabel("H\u00ECnh ch\u1EEF nh\u1EADt");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(12, 13, 120, 16);
		contentPane.add(lblNewLabel_1);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setLayout(null);
		layeredPane_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		layeredPane_1.setBounds(12, 194, 503, 124);
		contentPane.add(layeredPane_1);
		
		lblA_1 = new JLabel("A");
		lblA_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblA_1.setBounds(3, 1, 247, 46);
		layeredPane_1.add(lblA_1);
		
		lblB_1 = new JLabel("B");
		lblB_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblB_1.setBounds(262, 1, 247, 46);
		layeredPane_1.add(lblB_1);
		
		lblC_1 = new JLabel("C");
		lblC_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblC_1.setBounds(3, 60, 247, 46);
		layeredPane_1.add(lblC_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("H\u00ECnh tam gi\u00E1c \u0111\u1EA7u");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(12, 170, 120, 16);
		contentPane.add(lblNewLabel_1_1);
		
		layeredPane_2 = new JLayeredPane();
		layeredPane_2.setLayout(null);
		layeredPane_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		layeredPane_2.setBounds(12, 354, 503, 124);
		contentPane.add(layeredPane_2);
		
		lblA_2 = new JLabel("A");
		lblA_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblA_2.setBounds(3, 1, 247, 46);
		layeredPane_2.add(lblA_2);
		
		lblB_2 = new JLabel("B");
		lblB_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblB_2.setBounds(262, 1, 247, 46);
		layeredPane_2.add(lblB_2);
		
		lblC_2 = new JLabel("C");
		lblC_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblC_2.setBounds(3, 60, 247, 46);
		layeredPane_2.add(lblC_2);
		
		lblNewLabel_1_2 = new JLabel("H\u00ECnh tam gi\u00E1c \u0111u\u00F4i");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(12, 331, 190, 16);
		contentPane.add(lblNewLabel_1_2);
		
		layeredPane_3 = new JLayeredPane();
		layeredPane_3.setLayout(null);
		layeredPane_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		layeredPane_3.setBounds(12, 518, 503, 124);
		contentPane.add(layeredPane_3);
		
		lblA_3 = new JLabel("A");
		lblA_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblA_3.setBounds(3, 1, 247, 46);
		layeredPane_3.add(lblA_3);
		
		lblNewLabel_1_3 = new JLabel("T\u00E2m h\u00ECnh tr\u00F2n");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(12, 491, 190, 16);
		contentPane.add(lblNewLabel_1_3);
	}
}
