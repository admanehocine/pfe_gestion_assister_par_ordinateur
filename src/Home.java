import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Home extends JFrame {

	private JPanel contentPane;
    private JLabel lblNewLabel_1_1 = new JLabel("");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 495);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("<html>TABLEAU <br>DE BORD</html>");
		lblNewLabel_2.setBorder(new LineBorder(SystemColor.controlHighlight, 4));
		lblNewLabel_2.setForeground(SystemColor.controlHighlight);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblNewLabel_2.setBounds(83, 164, 102, 76);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("<html>  PANNES ET <br>MAINTENANCES</html>");
		lblNewLabel_2_1.setBorder(new LineBorder(SystemColor.controlHighlight, 4));
		lblNewLabel_2_1.setForeground(SystemColor.controlHighlight);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(247, 164, 128, 76);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setBounds(27, 22, 208, 401);
				lblNewLabel.setBorder(new LineBorder(new Color(51, 204, 51), 3, true));
				lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 17));
				lblNewLabel_2.setBounds(52, 153, 152, 99);
				lblNewLabel_2.setBorder(new LineBorder(SystemColor.WHITE, 4));
				lblNewLabel_2.setForeground(SystemColor.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setBorder(new LineBorder(new Color(160, 160, 160), 0, true));
				lblNewLabel.setBounds(42, 41, 179, 365);
				lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 14));
				lblNewLabel_2.setBounds(83, 164, 102, 76);
				lblNewLabel_2.setBorder(new LineBorder(SystemColor.controlHighlight, 4));
				lblNewLabel_2.setForeground(SystemColor.controlHighlight);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\tableau de bord.jpg"));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel.setBorder(new LineBorder(SystemColor.controlHighlight, 2, true));
		lblNewLabel.setBounds(42, 41, 179, 365);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\maintenance .jpg"));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setBorder(new LineBorder(new Color(51, 204, 51), 3, true));
				lblNewLabel_1.setBounds(206, 22, 207, 401);//x-15,y-19,l+29,h+36
				lblNewLabel_2_1.setFont(new Font("Century Gothic", Font.BOLD, 17));
				lblNewLabel_2_1.setBounds(220, 153, 178, 99);//x-27,y-11,l+50,h+23
				lblNewLabel_2_1.setBorder(new LineBorder(SystemColor.WHITE, 4));
				lblNewLabel_2_1.setForeground(SystemColor.WHITE);
				lblNewLabel.setBounds(42, 41, 164, 365);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1.setBorder(new LineBorder(SystemColor.controlHighlight, 0, true));
				lblNewLabel_1.setBounds(221, 41, 178, 365);
				lblNewLabel_2_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
				lblNewLabel_2_1.setBounds(247, 164, 128, 76);
				lblNewLabel_2_1.setBorder(new LineBorder(SystemColor.controlHighlight, 4));
				lblNewLabel_2_1.setForeground(SystemColor.controlHighlight);
				lblNewLabel.setBounds(42, 41, 179, 365);
				
			}
		});
		lblNewLabel_1.setBorder(new LineBorder(SystemColor.controlHighlight, 2, true));
		lblNewLabel_1.setBounds(221, 41, 178, 365);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("<html>  GESTION <br> DU STOCK</html>");
		lblNewLabel_2_1_1.setBorder(new LineBorder(SystemColor.controlHighlight, 4));
		lblNewLabel_2_1_1.setForeground(SystemColor.controlHighlight);
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(426, 164, 128, 76);
		contentPane.add(lblNewLabel_2_1_1);
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				if(Login_gmao.User.equals("M")) {
				lblNewLabel_1_1.setBorder(new LineBorder(new Color(160, 160, 160), 0, true));
				lblNewLabel_1_1.setBounds(398, 41, 178, 365);
				lblNewLabel_2_1_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
				lblNewLabel_2_1_1.setBounds(426, 164, 128, 76);
				lblNewLabel_2_1_1.setBorder(new LineBorder(SystemColor.controlHighlight, 4));
				lblNewLabel_2_1_1.setForeground(SystemColor.controlHighlight);
				lblNewLabel_1.setBounds(221, 41, 178, 365);
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				if(Login_gmao.User.equals("M")) {
				lblNewLabel_1_1.setBorder(new LineBorder(new Color(51, 204, 51), 3, true));
				lblNewLabel_1_1.setBounds(383, 22, 207, 401);
				lblNewLabel_2_1_1.setFont(new Font("Century Gothic", Font.BOLD, 17));
				lblNewLabel_2_1_1.setBounds(407, 153, 158, 99);
				lblNewLabel_2_1_1.setBorder(new LineBorder(SystemColor.WHITE, 4));
				lblNewLabel_2_1_1.setForeground(SystemColor.WHITE);
				lblNewLabel_1.setBounds(221, 41, 162, 365);
				}else {
					lblNewLabel_1_1.setBorder(new LineBorder(new Color(200, 0, 0), 3, true));
					lblNewLabel_2_1_1.setBorder(new LineBorder(SystemColor.controlShadow, 4));
					lblNewLabel_2_1_1.setForeground(SystemColor.controlShadow);
					
				}
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(Login_gmao.User.equals("M")) {
				Gestion_Stock.main(null);
				dispose();
				}else {
					lblNewLabel_1_1.setBorder(new LineBorder(new Color(200, 0, 0), 3, true));
					JOptionPane.showMessageDialog(contentPane, "Vous n'avez pas les privilèges requis pour accéder à cette partie !","ERREUR", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		
		
		
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\stock.jpg"));
		lblNewLabel_1_1.setBorder(new LineBorder(SystemColor.controlHighlight, 2, true));
		lblNewLabel_1_1.setBounds(399, 41, 178, 365);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\fde52ab8a1f0a8073f8a5ff7141ced3d.jpg"));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(0, 0, 608, 456);
		contentPane.add(lblNewLabel_3);
	}
}
