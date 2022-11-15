package add;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import keeptoo.KGradientPanel;


public class Logine extends JFrame{

	Connection cnx=null;
	ResultSet rs=null;
	PreparedStatement pr=null;
	private JPanel contentPane;
	private JTextField t1;
	private JPasswordField t2;
    private JLabel lblNewLabel_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logine frame = new Logine();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private static String cle_commandant,cle_chef;
	

	public static String getCle_chef() {
		return cle_chef;
	}
	public static String getCle_commandant() {
		return cle_commandant;
	}

	/**
	 * Create the frame.
	 */
	
	public Logine() {
	
		setBackground(Color.WHITE);
		
		//setUndecorated(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);//pour maximiser la fenetre apres l'execution 
		cnx =connexion.connecter();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1307, 648);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setBounds(0, 0, 1370, 705);
		contentPane.add(gradientPanel);
		gradientPanel.kGradientFocus = 200;
		gradientPanel.kEndColor = new Color(255, 51, 51);
		gradientPanel.kStartColor = new Color(51, 51, 255);
		gradientPanel.setLayout(null);
		
		t1 = new JTextField();
		t1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 15));
		t1.setBounds(615, 280, 246, 25);
		gradientPanel.add(t1);
		t1.setColumns(10);
		
		t2 = new JPasswordField();
		t2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		t2.setBounds(615, 329, 246, 25);
		gradientPanel.add(t2);
		
		JLabel lblNewLabel = new JLabel("username");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(204, 0, 51));
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 21));
		lblNewLabel.setBounds(457, 280, 136, 25);
		gradientPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("password");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(204, 0, 51));
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(457, 328, 137, 25);
		gradientPanel.add(lblNewLabel_1);
		
		 lblNewLabel_2 = new JLabel("Login");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 String ka=t1.getText().toString();
				 
				String Ea=t2.getText().toString();
					
					
					String sql="select  id_commandont,username,password from commandont_bord ";
					try {
						pr=cnx.prepareStatement(sql);
						rs=pr.executeQuery();
						
						int i=0;
						if(ka.equals("") || Ea.equals("")) {
							JOptionPane.showMessageDialog(null, "fill in all the blanks pleas!");
					
					
						}else {
						while (rs.next()) {
							 String n=rs.getString("username");
							String p=rs.getString("password");
							//int mm=rs.getInt("id");
							
							if(n.equals(ka) && p.equals(Ea)) {							
							menu_bos frame = new menu_bos();
								frame.setVisible(true);
								dispose();
							cle_commandant=rs.getString("id_commandont");	
						i=1;		}	
						}if(i==0) {cle_commandant=null;
							JOptionPane.showMessageDialog(null, "incorrect password or username");}
						}	
		 			}catch(SQLException ex) {
						ex.printStackTrace();
					}
					
							
			
				/*
				 *String k=t1.getText().toString();
					String E=t2.getText().toString();
						
						
						String ql="select  numch,username,password from chef_service ";
						try {
							pr=cnx.prepareStatement(ql);
							rs=pr.executeQuery();
							
							int i=0;
							if(k.equals("") || E.equals("")) {
								JOptionPane.showMessageDialog(null, "fill in all the blanks pleas!");
						
						
							}else {
							while (rs.next()) {
								 String n=rs.getString("username");
								String p=rs.getString("password");
								//int mm=rs.getInt("id");
								
								if(n.equals(k) && p.equals(E)) {							
								agent frame = new agent();
									frame.setVisible(true);
									dispose();
									cle_chef=rs.getString("numch");	
									i=1;		}	
							}if(i==0) {
								cle_chef=null;
								JOptionPane.showMessageDialog(null, "incorrect password or username");}
							}	
			 			}catch(SQLException ex) {
							ex.printStackTrace();
						}
			*/
			
			}
			@Override
			public void mouseEntered(MouseEvent e) {lblNewLabel_2.setForeground(new Color(0, 0, 0));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {lblNewLabel_2.setForeground(new Color(255, 255, 255));
				
			}
		});
		lblNewLabel_2.setFont(new Font("Papyrus", Font.BOLD, 31));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBackground(new Color(51, 102, 204));
		lblNewLabel_2.setBounds(685, 375, 136, 42);
		gradientPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\login (3).png"));
		lblNewLabel_3.setBounds(426, 280, 24, 25);
		gradientPanel.add(lblNewLabel_3);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\icons8-cadenas-30.png"));
		label.setBounds(426, 329, 31, 25);
		gradientPanel.add(label);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\star.png"));
		lblNewLabel_4.setBounds(236, 376, 74, 103);
		gradientPanel.add(lblNewLabel_4);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\star.png"));
		label_1.setBounds(1087, 54, 74, 103);
		gradientPanel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\star.png"));
		label_2.setBounds(1127, 393, 74, 103);
		gradientPanel.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\star.png"));
		label_3.setBounds(289, 54, 74, 103);
		gradientPanel.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\star.png"));
		label_4.setBounds(723, 97, 74, 103);
		gradientPanel.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\star.png"));
		label_5.setBounds(709, 522, 74, 103);
		gradientPanel.add(label_5);
	}

}
