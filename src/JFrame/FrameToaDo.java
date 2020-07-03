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

public class FrameToaDo extends JFrame {

	private JPanel contentPane;
	public static JLabel lblNewLabel;
	public static JLabel lblNewLabel_1;
	public static JLabel lblNewLabel_2;
	public static JLabel lblNewLabel_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameToaDo frame = new FrameToaDo();
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
	public FrameToaDo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 688, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		layeredPane.setBounds(12, 13, 631, 91);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new GridLayout(0, 8, 0, 0));
		
		lblNewLabel = new JLabel("X1");
		layeredPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Y1");
		layeredPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("X2");
		layeredPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Y2");
		layeredPane.add(lblNewLabel_3);
	}
}
