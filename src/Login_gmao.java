import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.sql.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;

public class Login_gmao extends JFrame {
    
	private static Connection cnx=null;
	private JPanel contentPane;
	protected static JTextField txtUsername= new JTextField("");
	protected static JPasswordField txtPassword=  new JPasswordField("");
    public static String User ="";
    protected static String id  ;
    private JLabel lblNewLabel_8;
    private static int fails = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_gmao frame = new Login_gmao();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					cnx=connexion.connecter();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws UnknownHostException 
	 */
	public String macAdresse () throws UnknownHostException {
    String s ="fail" ;	
		
	try {
   	 
   	 InetAddress ip = InetAddress.getLocalHost();
		NetworkInterface net = NetworkInterface.getByInetAddress(ip);
		byte[] mac = net.getHardwareAddress();
		StringBuilder sb = new StringBuilder();
		System.out.println(mac);
		for(int i =0;i<mac.length;i++) {
			sb.append(String.format("%02X%s", mac[i],(i<mac.length - 1) ? "-":""));
		}
		s = sb.toString();
	} catch (SocketException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	return s;
	
	}
	
	public void  deleteBlocked() throws UnknownHostException, SQLException {
		if(fails==1) {
		PreparedStatement prs1 = cnx.prepareStatement("select * from bloqué where mac='"+macAdresse()+"'");
        ResultSet res = prs1.executeQuery();
        while(res.next()) {
        	PreparedStatement prs2 = cnx.prepareStatement("delete from bloqué where mac ='"+macAdresse()+"'");
        	prs2.execute();
        }
		}
	}
	
	public Login_gmao() {
		
	
		setResizable(false);
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 794, 471);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("NAVAL GMAO");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblNewLabel_2.setBounds(220, 0, 382, 51);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.control);
		panel_1.setBounds(255, 51, 315, 380);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.control);
		panel_2.setBounds(21, 109, 272, 253);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("SIGN IN");
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnNewButton_1.setBackground(Color.BLACK);
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_1.setBackground(Color.DARK_GRAY);
			}
		});
		btnNewButton_1.setIcon(null);
		
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtPassword.getText().isEmpty() || txtUsername.getText().isEmpty()) {
					JOptionPane.showMessageDialog(contentPane , "Erreur ! Un ou plusieurs champs sont vides !", "Erreur",JOptionPane.ERROR_MESSAGE);
				}else {
					try {
						
						PreparedStatement ps = cnx.prepareStatement("select username,password ,numch from chef_service where username=? and password=?");
						PreparedStatement ps1 = cnx.prepareStatement("select username,password,id_commandant from commandant_bord where username=? and password=?");
						PreparedStatement ps2 = cnx.prepareStatement("select username,password,idagent from agent where username=? and password=?");
						PreparedStatement ps3 = cnx.prepareStatement("select username,password,id from reparateur where username=? and password=?");
						PreparedStatement ps4 = cnx.prepareStatement("select username,password,idmagasinier from magasinier where username=? and password=?");
						
						ps.setString(1, txtUsername.getText()); ps.setString(2,	txtPassword.getText());
						ps1.setString(1, txtUsername.getText()); ps1.setString(2,	txtPassword.getText());
						ps2.setString(1, txtUsername.getText()); ps2.setString(2,	txtPassword.getText());
						ps3.setString(1, txtUsername.getText()); ps3.setString(2,	txtPassword.getText());
						ps4.setString(1, txtUsername.getText()); ps4.setString(2,	txtPassword.getText());
						ResultSet rs = ps.executeQuery();
					    ResultSet rs1 = ps1.executeQuery();
					    ResultSet rs2 = ps2.executeQuery();
					    ResultSet rs3 = ps3.executeQuery();
					    ResultSet rs4 = ps4.executeQuery();
						if(rs.next()) {
						User="CS";
						id=rs.getString(3);
						chef.main(null);
						deleteBlocked();
						dispose();
						}else {if(rs1.next()) {
							   User="CB";
							   id=rs1.getString(3);
							   deleteBlocked();
							   menu_bos.main(null);
								dispose();
						       }else {if(rs2.next()) {
						    	      User="A";
						    	      id=rs2.getString(3);
						    	      deleteBlocked();
						    	      chef.main(null);
										dispose();
						              }else {if(rs3.next()) {
						            	     User="R";
						            	     id=rs3.getString(3);
						            	     deleteBlocked();
						            	     chef.main(null);
												dispose();
						                     }else {if(rs4.next()) {
						                    	  User="M";
						                    	  id=rs4.getString(3);
						                    	  deleteBlocked();
						                    	  Gestion_Stock.main(null);
						  						dispose();
						                            }else {
                                                              lblNewLabel_8.setVisible(true);
                                                              btnNewButton_1.setBounds(89, 205, 97, 37);
                                                              if(fails==1) {
                                                              PreparedStatement prs1 = cnx.prepareStatement("select * from bloqué where mac='"+macAdresse()+"'");
                                                              ResultSet res = prs1.executeQuery();
                                                              while(res.next()) {
                                                            	  if(res.getInt(2) < 2) {
                                                            		  PreparedStatement prss = cnx.prepareStatement("update bloqué set fails = fails + 1 where mac = '"+macAdresse()+"'");
                                                            		  prss.execute();
                                                            	  }else {
                                                            		  JOptionPane.showMessageDialog(contentPane, "Nombre de tentatives max dépassé. Veillez contacter un administrateur !", "Erreur !", JOptionPane.ERROR_MESSAGE);
                                                            		  Runtime.getRuntime().exit(0);
                                                            	  }
                                                            	  fails = 1;
                                                              }
                                                              }
                                                              if(fails == 0) {
                                                              PreparedStatement prs = cnx.prepareStatement("insert into bloqué values ('"+macAdresse()+"',1)");
                                                              prs.execute();
                                                              }
                                                              
						                            }
						            	  
						              }
							
						        }
							
						}
						}
					} catch (SQLException e) {
						
						e.printStackTrace();
					} catch (UnknownHostException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Century Gothic", Font.BOLD, 16));
		
		btnNewButton_1.setBounds(89, 185, 97, 37);
		panel_2.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("Login");
		lblNewLabel_4.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(103, 11, 66, 33);
		panel_2.add(lblNewLabel_4);
		
		txtUsername.setFocusable(true);
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if(txtUsername.getFont().isItalic()) {
					txtUsername.setText("");
					}
				txtUsername.setFont(new Font("Century Gothic", Font.PLAIN, 13));
				txtUsername.setForeground(Color.BLACK);
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUsername.getText().isEmpty()) {
				txtUsername.setFont(new Font("Century Gothic", Font.ITALIC, 13));
				txtUsername.setForeground(Color.GRAY);
				txtUsername.setText("Username");
				}
			}
		});
		txtUsername.setForeground(Color.GRAY);
		txtUsername.setFont(new Font("Century Gothic", Font.ITALIC, 13));
		txtUsername.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
		txtUsername.setBackground(SystemColor.menu);
		txtUsername.setBounds(47, 68, 215, 42);
		panel_2.add(txtUsername);
		txtUsername.setColumns(10);
		

		txtPassword.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent arg0) {
				if(txtPassword.getFont().isItalic()) {
					txtPassword.setText("");
					}
				txtPassword.setFont(new Font("Century Gothic", Font.PLAIN, 13));
				txtPassword.setForeground(Color.BLACK);
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtPassword.getText().isEmpty()) {
				txtPassword.setFont(new Font("Century Gothic", Font.ITALIC, 13));
				txtPassword.setForeground(Color.GRAY);
				txtPassword.setText("Password");
		}	
		}
		});
		txtPassword.setFont(new Font("Century Gothic", Font.ITALIC, 13));
		txtPassword.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
		txtPassword.setBackground(SystemColor.menu);
		txtPassword.setColumns(10);
		txtPassword.setBounds(47, 122, 215, 42);
		txtPassword.setForeground(SystemColor.GRAY);
		panel_2.add(txtPassword);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("icons\\icons8-male-user-32.png"));
		lblNewLabel_6.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
		lblNewLabel_6.setBounds(10, 73, 37, 37);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setIcon(new ImageIcon("icons\\icons8-password-24.png"));
		lblNewLabel_6_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
		lblNewLabel_6_1.setBounds(10, 121, 37, 43);
		panel_2.add(lblNewLabel_6_1);
		
		lblNewLabel_8 = new JLabel("nom d'utilisateur ou mot de passe incorrecte");
		lblNewLabel_8.setVisible(false);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setForeground(new Color(255, 0, 0));
		lblNewLabel_8.setBorder(new LineBorder(new Color(255, 0, 0)));
		lblNewLabel_8.setOpaque(true);
		lblNewLabel_8.setBackground(new Color(255, 150, 150));
		lblNewLabel_8.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_8.setBounds(10, 169, 252, 30);
		panel_2.add(lblNewLabel_8);
		

		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon("icons\\user png 1.png"));
		lblNewLabel_3.setBounds(112, 11, 90, 87);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 22));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setIcon(new ImageIcon("icons\\fde52ab8a1f0a8073f8a5ff7141ced3d.jpg"));
		lblNewLabel_1.setBackground(Color.BLUE);
		lblNewLabel_1.setBounds(0, 0, 315, 142);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("icons\\ombre (2).png"));
		lblNewLabel_5.setBounds(0, 136, 315, 252);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 796, 474);
		lblNewLabel.setIcon(new ImageIcon("icons\\naval_5.png"));
		panel.add(lblNewLabel);
		
		
	}
}
