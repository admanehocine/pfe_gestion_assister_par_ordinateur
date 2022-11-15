import java.awt.AWTException;
import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.border.LineBorder;


import net.proteanit.sql.DbUtils;


import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTree.DynamicUtilTreeNode;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.ColorModel;

import javax.swing.JTable;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;
import javax.swing.text.StyledEditorKit.BoldAction;
import javax.swing.JScrollPane;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;

import java.awt.SystemColor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.InputEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;
import java.awt.Label;
import java.awt.Robot;
import javax.swing.JTextArea;



public class Gestion_Stock extends JFrame {

	private JPanel contentPane;
    private static int Etat=0;
    private JLabel lblLivraison = new JLabel("<html>Traitement<br/>des bons</html>");
    private JLabel lblEtatStock = new JLabel(" Etat du stock");
    private static Connection cnx=null;
    private JTextField txtRecherche_2;
    private JLabel lblMaj = new JLabel("Restockage");
    private JLabel lblFournisseur_ = new JLabel("Fournisseurs");
    private JTable table;
    private JScrollPane scrollPane_1 = new JScrollPane();
    private JPanel panel_Etat_Stock = new JPanel();
    private JPanel panel_home = new JPanel();
    private JPanel panel_livraison = new JPanel();
    private JPanel panel_mis_a_jour = new JPanel();
    private JLabel lblNew = new JLabel("NEW");
    private JLabel lblPrint = new JLabel("PRINT");
    private JLayeredPane layeredPane = new JLayeredPane();
    private JTextField txtRecherche_1;
    protected static JTable table_1;
    private JRadioButton rdbtnChef;
    private JRadioButton rdbtnIdService;
    private JRadioButton rdbtnIdArticle;
    private JTextField textField_qte;
    private JComboBox<String> comboBox;
    private JTextField textField_code_art;
    private JTextField textField_libelle;
    private JTextField textField_num_serie;
    private JTextField textField_concept;
    private JTextField textField_poids;
    private JTextField textField_couleur;
    private JTextField textField_taille;
    private JTextField textField_date_acqui;
    private JTextField textField_dat_ex;
    private JTextField textField_duree;
    private JTextField textField_condi;
    private JTextField textField_prix;
    private JTextField textField_type;
    private JTextField textField_qte_new;
    private JTextField txtRecherche;
    protected static JTable table_2;
    private JPanel panel_fournisseurs;
    private JRadioButton rdbtnContrat;
    private JRadioButton rdbtnNom;
    private JLabel lblNewLabel_11 = new JLabel("");
    private JLabel lblNewLabel_11_1 = new JLabel("");
    private JLabel lblNewLabel_11_1_1 = new JLabel("");
    private JLabel lblNewLabel_12;
    private JLabel lblNewLabel_12_1;
    private JLabel lblNewLabel_12_4;
    private JLabel lblNewLabel_12_4_1;
    private JLabel lblNewLabel_12_2;
    private JLabel lblNewLabel_12_3;
    private JLabel lblNewLabel_12_4_3;
    private JLabel lblNewLabel_12_4_2;
    private JPanel panel;
    private JPanel panel_1;
    private JLabel lblNewLabel_13;
    private JLabel lblNewLabel_2;
    private JLabel lblRefresh_1 = new JLabel("REFRESH");
    private JLabel l1 = new JLabel();
    private JLabel l2 = new JLabel();
    private PreparedStatement pr ;
    private ResultSet rs;
    private JTable table_3;
    private JTextField textField;
    private JTextArea textArea_1;
    private JTextField textField_1;
    private JTable table_4;
    private JPanel panel_liv;
    private JTextArea texte;
    private JTable table_5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cnx=connexion.connecter();
					Gestion_Stock frame = new Gestion_Stock();
					frame.setVisible(true);
//					frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
					frame.setResizable(false);
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
	
public void articleajouter() {//as 'numero rapport'   as 'numero chef service ' , ouvrier_id as'numero reparateur' 
		
		String sql=" select idarticle,article_numero_serie,taille"
				+ ",poids,couleur , quantite from bon_commande WHERE id_bon_commande='"+table_1.getValueAt(table_1.getSelectedRow(), 0)+"'";
		                                                                                                                                                                    
		
		try {
			pr=cnx.prepareStatement(sql);
			rs=pr.executeQuery();
		table_3.setModel(DbUtils.resultSetToTableModel(rs));
			
		
		JTableHeader theader=table_3.getTableHeader();
		theader.setBackground(Color.lightGray);
		theader.setForeground(Color.black);
		theader.setFont(new Font("tahome",Font.BOLD,13));
		table_3.setFont(new Font("tahome",Font.BOLD,12));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
					}
	}

public void articleajouter2() {//as 'numero rapport'   as 'numero chef service ' , ouvrier_id as'numero reparateur' 
	
	String sql=" select idarticle,article_numero_serie,taille"
			+ ",poids,couleur , quantite from bon_livraison WHERE id_bon_livraison='"+table_4.getValueAt(table_4.getSelectedRow(), 0)+"'";
	                                                                                                                                                                    
	
	try {
		pr=cnx.prepareStatement(sql);
		rs=pr.executeQuery();
	table_5.setModel(DbUtils.resultSetToTableModel(rs));
		
	
	JTableHeader theader=table_5.getTableHeader();
	theader.setBackground(Color.lightGray);
	theader.setForeground(Color.black);
	theader.setFont(new Font("tahome",Font.BOLD,13));
	table_5.setFont(new Font("tahome",Font.BOLD,12));
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
				}
}

public void bon_liv() {//as 'numero rapport'   as 'numero chef service ' , ouvrier_id as'numero reparateur' 
	
	String sql="select id_bon_commande as 'N° Bon',idservice as 'N° Service' ,datecreation as 'Date de création',description as 'Description'" + 
		       " from boncommande where traitement is null";
	                                                                                                                                                                    
	
	try {
		pr=cnx.prepareStatement(sql);
		rs=pr.executeQuery();
	table_4.setModel(DbUtils.resultSetToTableModel(rs));
		
	
	JTableHeader theader=table_4.getTableHeader();
	theader.setBackground(Color.gray);
	theader.setForeground(Color.black);
	theader.setFont(new Font("tahome",Font.BOLD,14));
	table_4.setFont(new Font("tahome",Font.BOLD,12));
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
				}
}

public void converte() {
	texte.setText("***************************************************"
	 		+ "******************************************************************************\n");
	 texte.setText(texte.getText()+"           "
	 		+ "                                             BON DE LIVRAISON                                     \n");
	 texte.setText(texte.getText()+"********************************************"
	 		+ "*************************************************************************************\n");
	 texte.setText(texte.getText()+"\n\n\n\t\t\t");
			 texte.setText(texte.getText()+"N° "+table_4.getValueAt(table_4.getSelectedRow(), 0));
			 texte.setText(texte.getText()+"\n\n\t\t\t");
			 texte.setText(texte.getText()+"Date de création:"+table_4.getValueAt(table_4.getSelectedRow(), 2)+".");
			 texte.setText(texte.getText()+"\n\n\n\n\n");
			 texte.setText(texte.getText()+"Déscription :"+table_4.getValueAt(table_4.getSelectedRow(), 3)+".");
			 texte.setText(texte.getText()+"\n");
			 texte.setText(texte.getText()+"_______________________________________________________________________________________________________________________________");
			 texte.setText(texte.getText()+"\n");
			 texte.setText(texte.getText()+"|N°Article           "+"|N°Serie             "+"|Taille              "+"|Poids               "+"|Couleur             "+"|Quantité            |");
			 texte.setText(texte.getText()+"\n");
			 texte.setText(texte.getText()+"_______________________________________________________________________________________________________________________________\n");

	DefaultTableModel mod =(DefaultTableModel) table_5.getModel();
	int row=mod.getRowCount();
	int col=mod.getColumnCount();
	Object [][] tab=new Object  [row][col];
	
	for(int k=0;k<row;k++) {
		for(int j=0;j<col;j++) {
		tab[k][j]=mod.getValueAt(k, j);
		texte.setText(texte.getText()+"|"+tab[k][j]);
		int v =20-tab[k][j].toString().length();
		for(int i=0;i<v;i++) {
			texte.setText(texte.getText()+" ");
		}
	}
	texte.setText(texte.getText()+"|");
	texte.setText(texte.getText()+"\n");
		}
	texte.setText(texte.getText()+"\n\n\t\t\t\t\t\t");
//	 texte.setText(texte.getText()+"Totale "+hb21 +" DA.");
	texte.setText(texte.getText()+"\n\n\n\n\n\t\t\t");
	 texte.setText(texte.getText()+"Magasinier : "+Login_gmao.id);//login.nom_chefservice();
	 texte.setText(texte.getText()+" \n\n\n\t\t\t\t Signature:");
}
	
	public void selectbon() {
		
		String sql=" select id_bon_commande as 'N° Bon',idservice as 'N° Service' ,datecreation as 'Date de création',description as 'Description'"
				+ " from boncommande WHERE Traitement=0";
		                                                                                                                                                                    
		
		try {
			pr=cnx.prepareStatement(sql);
			rs=pr.executeQuery();
		table_1.setModel(DbUtils.resultSetToTableModel(rs));
			
		
		JTableHeader theader=table_1.getTableHeader();
		theader.setBackground(Color.lightGray);
		theader.setForeground(Color.black);
		theader.setFont(new Font("tahome",Font.BOLD,13));
		table_1.setFont(new Font("tahome",Font.BOLD,12));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
					}
	}
	public Gestion_Stock() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 699);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		try {
			PreparedStatement ps = cnx.prepareStatement("select nom,prenom,idmagasinier from magasinier where username=? and password=?");
			ps.setString(1,Login_gmao.txtUsername.getText()); 
			ps.setString(2,	Login_gmao.txtPassword.getText());
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				 lblNewLabel_11_1.setText(rs.getString(1)+" "+rs.getString(2));
				 lblNewLabel_11_1_1.setText(rs.getString(3));
			}
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		
		layeredPane.setBorder(null);
		layeredPane.setBounds(98, 99, 973, 553);
		contentPane.add(layeredPane);
		
		
		panel_mis_a_jour.setBorder(null);
		panel_mis_a_jour.setBackground(Color.WHITE);
		panel_mis_a_jour.setBounds(0, 0, 890, 553);
		panel_mis_a_jour.setVisible(false);
		
		
		panel_Etat_Stock.setBorder(null);
		panel_Etat_Stock.setBackground(Color.WHITE);
		panel_Etat_Stock.setBounds(0, 0, 890, 570);
		panel_Etat_Stock.setVisible(false);
		
		panel_liv = new JPanel();
		panel_liv.setVisible(false);
		panel_liv.setBounds(0, 0, 890, 553);
		layeredPane.add(panel_liv);
		panel_liv.setLayout(null);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(108, 11, 653, 516);
		panel_liv.add(scrollPane_6);
		
		texte = new JTextArea();
		scrollPane_6.setViewportView(texte);
		texte.setFont(new Font("Monospaced", Font.PLAIN, 12));
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(40, 16, 1, 1);
		panel_liv.add(scrollPane_7);
		
		table_5 = new JTable();
		scrollPane_7.setViewportView(table_5);
		panel_home.setBorder(null);
		
		
		panel_home.setBackground(Color.WHITE);
		panel_home.setBounds(0, 0, 973, 553);
		layeredPane.add(panel_home);
		panel_home.setLayout(null);
		
		lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setBorder(null);
		lblNewLabel_12.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setIconTextGap(0);
		
		lblNewLabel_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_12.setBackground(SystemColor.control);
				lblNewLabel_12_4.setBackground(SystemColor.control);
				lblNewLabel_12.setBorder(new MatteBorder(2, 2, 0, 2, (Color) new Color(0, 51, 204)));
				lblNewLabel_12_4.setBorder(new MatteBorder(0, 2, 2, 2, (Color) new Color(0, 51, 204)));
				
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblNewLabel_12.setBackground(SystemColor.controlHighlight);
				lblNewLabel_12_4.setBackground(SystemColor.controlHighlight);
				lblNewLabel_12.setBorder(null);
				lblNewLabel_12_4.setBorder(null);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				lblEtatStock.dispatchEvent(new MouseEvent(lblEtatStock, MouseEvent.MOUSE_CLICKED, 0, 0, 5, 5, 5, 5, 1, false, MouseEvent.BUTTON1));
				layeredPane.setBounds(181, 99, 893, 553);
				panel.setVisible(true);
			    panel_1.setVisible(true);
			    lblNewLabel_2.setVisible(true);
			    lblNewLabel_13.setFont(new Font("Century Gothic", Font.BOLD, 30));
			    lblNewLabel_13.setText("<html>GESTIONNAIRE <br/>DE STOCK</html>");
				
				
			}
		});
		
		lblNewLabel_12_4 = new JLabel("Surveiller l'etat du stock");
		lblNewLabel_12_4.setBorder(null);
		lblNewLabel_12_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblEtatStock.dispatchEvent(new MouseEvent(lblEtatStock, MouseEvent.MOUSE_CLICKED, 0, 0, 5, 5, 5, 5, 1, false, MouseEvent.BUTTON1));
				layeredPane.setBounds(181, 99, 893, 553);
				panel.setVisible(true);
			    panel_1.setVisible(true);
			    lblNewLabel_13.setFont(new Font("Century Gothic", Font.BOLD, 30));
			    lblNewLabel_13.setText("<html>GESTIONNAIRE <br/>DE STOCK</html>");
			    lblNewLabel_2.setVisible(true);
			}
				@Override
				public void mouseEntered(MouseEvent e) {
					lblNewLabel_12.setBackground(SystemColor.control);
					lblNewLabel_12.setBorder(new MatteBorder(2, 2, 0, 2, (Color) new Color(0, 51, 204)));
					lblNewLabel_12_4.setBackground(SystemColor.control);
					lblNewLabel_12_4.setBorder(new MatteBorder(0, 2, 2, 2, (Color) new Color(0, 51, 204)));
					lblNewLabel_12_4.setForeground(Color.DARK_GRAY);
				}
				@Override
				public void mouseExited(MouseEvent arg0) {
					lblNewLabel_12.setBackground(SystemColor.controlHighlight);
					lblNewLabel_12.setBorder(null);
					lblNewLabel_12_4.setBackground(SystemColor.controlHighlight);
					lblNewLabel_12_4.setBorder(null);
					lblNewLabel_12_4.setForeground(Color.DARK_GRAY);
				}
		});
		lblNewLabel_12_4.setOpaque(true);
		lblNewLabel_12_4.setIconTextGap(0);
		lblNewLabel_12_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_12_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12_4.setForeground(Color.DARK_GRAY);
		lblNewLabel_12_4.setFont(new Font("Century Gothic", Font.BOLD, 27));
		lblNewLabel_12_4.setBackground(SystemColor.controlHighlight);
		lblNewLabel_12_4.setBounds(49, 183, 418, 79);
		panel_home.add(lblNewLabel_12_4);
		lblNewLabel_12.setForeground(Color.DARK_GRAY);
		lblNewLabel_12.setIcon(new ImageIcon("icons\\graph (2).png"));
		lblNewLabel_12.setFont(new Font("Century Gothic", Font.BOLD, 27));
		lblNewLabel_12.setBackground(SystemColor.controlHighlight);
		lblNewLabel_12.setOpaque(true);
		lblNewLabel_12.setBounds(49, 34, 418, 177);
		panel_home.add(lblNewLabel_12);
		
		lblNewLabel_12_1 = new JLabel("");
		lblNewLabel_12_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblLivraison.dispatchEvent(new MouseEvent(lblLivraison, MouseEvent.MOUSE_CLICKED, 0, 0, 5, 5, 5, 5, 1, false, MouseEvent.BUTTON1));
				layeredPane.setBounds(181, 99, 893, 553);
				panel.setVisible(true);
			    panel_1.setVisible(true);
			    lblNewLabel_13.setFont(new Font("Century Gothic", Font.BOLD, 30));
			    lblNewLabel_13.setText("<html>GESTIONNAIRE <br/>DE STOCK</html>");
			    lblNewLabel_2.setVisible(true);
			}
				@Override
				public void mouseEntered(MouseEvent e) {
					lblNewLabel_12_1.setBackground(SystemColor.control);
					lblNewLabel_12_1.setBorder(new MatteBorder(2, 2, 0, 2, (Color) new Color(0, 51, 204)));
					lblNewLabel_12_4_1.setBackground(SystemColor.control);
					lblNewLabel_12_4_1.setBorder(new MatteBorder(0, 2, 2, 2, (Color) new Color(0, 51, 204)));
					lblNewLabel_12_4_1.setForeground(Color.DARK_GRAY);
				}
				@Override
				public void mouseExited(MouseEvent arg0) {
					lblNewLabel_12_1.setBackground(SystemColor.controlHighlight);
					lblNewLabel_12_1.setBorder(null);
					lblNewLabel_12_4_1.setBackground(SystemColor.controlHighlight);
					lblNewLabel_12_4_1.setBorder(null);
					lblNewLabel_12_4_1.setForeground(Color.DARK_GRAY);
				}
		});
		
		lblNewLabel_12_4_1 = new JLabel("<html>Traiter les bons <br/>de commandes</html>");
		lblNewLabel_12_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblLivraison.dispatchEvent(new MouseEvent(lblLivraison, MouseEvent.MOUSE_CLICKED, 0, 0, 5, 5, 5, 5, 1, false, MouseEvent.BUTTON1));
				layeredPane.setBounds(181, 99, 893, 553);
				panel.setVisible(true);
			    panel_1.setVisible(true);
			    lblNewLabel_13.setFont(new Font("Century Gothic", Font.BOLD, 30));
			    lblNewLabel_13.setText("<html>GESTIONNAIRE <br/>DE STOCK</html>");
			    lblNewLabel_2.setVisible(true);
			}
				@Override
				public void mouseEntered(MouseEvent e) {
					lblNewLabel_12_1.setBackground(SystemColor.control);
					lblNewLabel_12_1.setBorder(new MatteBorder(2, 2, 0, 2, (Color) new Color(0, 51, 204)));
					lblNewLabel_12_4_1.setBackground(SystemColor.control);
					lblNewLabel_12_4_1.setBorder(new MatteBorder(0, 2, 2, 2, (Color) new Color(0, 51, 204)));
					lblNewLabel_12_4_1.setForeground(Color.DARK_GRAY);
				}
				@Override
				public void mouseExited(MouseEvent arg0) {
					lblNewLabel_12_1.setBackground(SystemColor.controlHighlight);
					lblNewLabel_12_1.setBorder(null);
					lblNewLabel_12_4_1.setBackground(SystemColor.controlHighlight);
					lblNewLabel_12_4_1.setBorder(null);
					lblNewLabel_12_4_1.setForeground(Color.DARK_GRAY);
				}
		});
		lblNewLabel_12_4_1.setOpaque(true);
		lblNewLabel_12_4_1.setIconTextGap(0);
		lblNewLabel_12_4_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_12_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12_4_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_12_4_1.setFont(new Font("Century Gothic", Font.BOLD, 27));
		lblNewLabel_12_4_1.setBackground(SystemColor.controlHighlight);
		lblNewLabel_12_4_1.setBounds(502, 183, 418, 79);
		panel_home.add(lblNewLabel_12_4_1);
		
		lblNewLabel_12_1.setIcon(new ImageIcon("icons\\order.png"));
		lblNewLabel_12_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_12_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_12_1.setOpaque(true);
		lblNewLabel_12_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12_1.setFont(new Font("Century Gothic", Font.BOLD, 27));
		lblNewLabel_12_1.setBackground(SystemColor.controlHighlight);
		lblNewLabel_12_1.setBounds(502, 34, 418, 161);
		panel_home.add(lblNewLabel_12_1);
		
		lblNewLabel_12_2 = new JLabel("");
		lblNewLabel_12_2.setIcon(new ImageIcon("icons\\Sans titre (4).png"));
		lblNewLabel_12_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblMaj.dispatchEvent(new MouseEvent(lblMaj, MouseEvent.MOUSE_CLICKED, 0, 0, 5, 5, 5, 5, 1, false, MouseEvent.BUTTON1));
				layeredPane.setBounds(181, 99, 893, 553);
				panel.setVisible(true);
			    panel_1.setVisible(true);
			    lblNewLabel_13.setFont(new Font("Century Gothic", Font.BOLD, 30));
			    lblNewLabel_13.setText("<html>GESTIONNAIRE <br/>DE STOCK</html>");
			    lblNewLabel_2.setVisible(true);
			}
				@Override
				public void mouseEntered(MouseEvent e) {
					lblNewLabel_12_2.setBackground(SystemColor.control);
					lblNewLabel_12_2.setBorder(new MatteBorder(2, 2, 0, 2, (Color) new Color(0, 51, 204)));
					lblNewLabel_12_4_2.setBackground(SystemColor.control);
					lblNewLabel_12_4_2.setBorder(new MatteBorder(0, 2, 2, 2, (Color) new Color(0, 51, 204)));
					lblNewLabel_12_4_2.setForeground(Color.DARK_GRAY);
				}
				@Override
				public void mouseExited(MouseEvent arg0) {
					lblNewLabel_12_2.setBackground(SystemColor.controlHighlight);
					lblNewLabel_12_2.setBorder(null);
					lblNewLabel_12_4_2.setBackground(SystemColor.controlHighlight);
					lblNewLabel_12_4_2.setBorder(null);
					lblNewLabel_12_4_2.setForeground(Color.DARK_GRAY);
				}
		});
		lblNewLabel_12_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_12_2.setOpaque(true);
		lblNewLabel_12_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12_2.setFont(new Font("Century Gothic", Font.BOLD, 27));
		lblNewLabel_12_2.setBackground(SystemColor.controlHighlight);
		lblNewLabel_12_2.setBounds(49, 286, 418, 177);
		panel_home.add(lblNewLabel_12_2);
		
		lblNewLabel_12_3 = new JLabel("");
		lblNewLabel_12_3.setIcon(new ImageIcon("icons\\Sans titre (5).png"));
		lblNewLabel_12_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblFournisseur_.dispatchEvent(new MouseEvent(lblFournisseur_, MouseEvent.MOUSE_CLICKED, 0, 0, 5, 5, 5, 5, 1, false, MouseEvent.BUTTON1));
				layeredPane.setBounds(181, 99, 893, 553);
				panel.setVisible(true);
			    panel_1.setVisible(true);
			    lblNewLabel_13.setFont(new Font("Century Gothic", Font.BOLD, 30));
			    lblNewLabel_13.setText("<html>GESTIONNAIRE <br/>DE STOCK</html>");
			    lblNewLabel_2.setVisible(true);
			}
				@Override
				public void mouseEntered(MouseEvent e) {
					lblNewLabel_12_3.setBackground(SystemColor.control);
					lblNewLabel_12_3.setBorder(new MatteBorder(2, 2, 0, 2, (Color) new Color(0, 51, 204)));
					lblNewLabel_12_4_3.setBackground(SystemColor.control);
					lblNewLabel_12_4_3.setBorder(new MatteBorder(0, 2, 2, 2, (Color) new Color(0, 51, 204)));
					lblNewLabel_12_4_3.setForeground(Color.DARK_GRAY);
				}
				@Override
				public void mouseExited(MouseEvent arg0) {
					lblNewLabel_12_3.setBackground(SystemColor.controlHighlight);
					lblNewLabel_12_3.setBorder(null);
					lblNewLabel_12_4_3.setBackground(SystemColor.controlHighlight);
					lblNewLabel_12_4_3.setBorder(null);
					lblNewLabel_12_4_3.setForeground(Color.DARK_GRAY);
				}
		});
		lblNewLabel_12_3.setForeground(Color.DARK_GRAY);
		lblNewLabel_12_3.setOpaque(true);
		lblNewLabel_12_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12_3.setFont(new Font("Century Gothic", Font.BOLD, 27));
		lblNewLabel_12_3.setBackground(SystemColor.controlHighlight);
		lblNewLabel_12_3.setBounds(502, 286, 418, 177);
		panel_home.add(lblNewLabel_12_3);
		
		lblNewLabel_12_4_2 = new JLabel("Ravitailler le stock");
		lblNewLabel_12_4_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblMaj.dispatchEvent(new MouseEvent(lblMaj, MouseEvent.MOUSE_CLICKED, 0, 0, 5, 5, 5, 5, 1, false, MouseEvent.BUTTON1));
				layeredPane.setBounds(181, 99, 893, 553);
				panel.setVisible(true);
			    panel_1.setVisible(true);
			    lblNewLabel_13.setFont(new Font("Century Gothic", Font.BOLD, 30));
			    lblNewLabel_13.setText("<html>GESTIONNAIRE <br/>DE STOCK</html>");
			    lblNewLabel_2.setVisible(true);
			}
				@Override
				public void mouseEntered(MouseEvent e) {
					lblNewLabel_12_2.setBackground(SystemColor.control);
					lblNewLabel_12_2.setBorder(new MatteBorder(2, 2, 0, 2, (Color) new Color(0, 51, 204)));
					lblNewLabel_12_4_2.setBackground(SystemColor.control);
					lblNewLabel_12_4_2.setBorder(new MatteBorder(0, 2, 2, 2, (Color) new Color(0, 51, 204)));
					lblNewLabel_12_4_2.setForeground(Color.DARK_GRAY);
				}
				@Override
				public void mouseExited(MouseEvent arg0) {
					lblNewLabel_12_2.setBackground(SystemColor.controlHighlight);
					lblNewLabel_12_2.setBorder(null);
					lblNewLabel_12_4_2.setBackground(SystemColor.controlHighlight);
					lblNewLabel_12_4_2.setBorder(null);
					lblNewLabel_12_4_2.setForeground(Color.DARK_GRAY);
				}
		});
		lblNewLabel_12_4_2.setOpaque(true);
		lblNewLabel_12_4_2.setIconTextGap(0);
		lblNewLabel_12_4_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_12_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12_4_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_12_4_2.setFont(new Font("Century Gothic", Font.BOLD, 27));
		lblNewLabel_12_4_2.setBorder(null);
		lblNewLabel_12_4_2.setBackground(SystemColor.controlHighlight);
		lblNewLabel_12_4_2.setBounds(49, 435, 418, 79);
		panel_home.add(lblNewLabel_12_4_2);
		
		lblNewLabel_12_4_3 = new JLabel("Informations fournisseurs");
		lblNewLabel_12_4_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblFournisseur_.dispatchEvent(new MouseEvent(lblFournisseur_, MouseEvent.MOUSE_CLICKED, 0, 0, 5, 5, 5, 5, 1, false, MouseEvent.BUTTON1));
				layeredPane.setBounds(181, 99, 893, 553);
				panel.setVisible(true);
			    panel_1.setVisible(true);
			    lblNewLabel_13.setFont(new Font("Century Gothic", Font.BOLD, 30));
			    lblNewLabel_13.setText("<html>GESTIONNAIRE <br/>DE STOCK</html>");
			    lblNewLabel_2.setVisible(true);
			}
				@Override
				public void mouseEntered(MouseEvent e) {
					lblNewLabel_12_3.setBackground(SystemColor.control);
					lblNewLabel_12_3.setBorder(new MatteBorder(2, 2, 0, 2, (Color) new Color(0, 51, 204)));
					lblNewLabel_12_4_3.setBackground(SystemColor.control);
					lblNewLabel_12_4_3.setBorder(new MatteBorder(0, 2, 2, 2, (Color) new Color(0, 51, 204)));
					lblNewLabel_12_4_3.setForeground(Color.DARK_GRAY);
				}
				@Override
				public void mouseExited(MouseEvent arg0) {
					lblNewLabel_12_3.setBackground(SystemColor.controlHighlight);
					lblNewLabel_12_3.setBorder(null);
					lblNewLabel_12_4_3.setBackground(SystemColor.controlHighlight);
					lblNewLabel_12_4_3.setBorder(null);
					lblNewLabel_12_4_3.setForeground(Color.DARK_GRAY);
				}
		});
		lblNewLabel_12_4_3.setOpaque(true);
		lblNewLabel_12_4_3.setIconTextGap(0);
		lblNewLabel_12_4_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_12_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12_4_3.setForeground(Color.DARK_GRAY);
		lblNewLabel_12_4_3.setFont(new Font("Century Gothic", Font.BOLD, 27));
		lblNewLabel_12_4_3.setBorder(null);
		lblNewLabel_12_4_3.setBackground(SystemColor.controlHighlight);
		lblNewLabel_12_4_3.setBounds(502, 435, 418, 79);
		panel_home.add(lblNewLabel_12_4_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setVisible(false);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 890, 553);
		layeredPane.add(panel_2);
		panel_2.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.addMouseListener(new MouseAdapter() {
   			@Override
   			public void mouseClicked(MouseEvent arg0) {
   				textField_1.setText("");
   				textField_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
   				textField_1.setForeground(Color.BLACK);
   			}
   		});
           textField_1.addFocusListener(new FocusAdapter() {
   			@Override
   			public void focusLost(FocusEvent arg0) {
   				textField_1.setFont(new Font("Century Gothic", Font.ITALIC, 13));
   				textField_1.setForeground(Color.GRAY);
   				textField_1.setText(" Recherche...");
   			}
   		});
           textField_1.addKeyListener(new KeyAdapter() {
   			@Override
   			public void keyReleased(KeyEvent e) {
            DefaultTableModel ta=(DefaultTableModel)table_4.getModel(); 
   			String s=textField_1.getText().toLowerCase();
            TableRowSorter<DefaultTableModel> tr=new  TableRowSorter<DefaultTableModel>(ta);
            table_4.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(s));
   			
   			}
   		});	
		textField_1.setText(" Recherche...");
		textField_1.setForeground(Color.GRAY);
		textField_1.setFont(new Font("Century Gothic", Font.ITALIC, 13));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(35, 23, 215, 30);
		panel_2.add(textField_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("");
		lblNewLabel_6_2.setOpaque(true);
		lblNewLabel_6_2.setForeground(new Color(0, 153, 153));
		lblNewLabel_6_2.setBorder(null);
		lblNewLabel_6_2.setBackground(SystemColor.controlHighlight);
		lblNewLabel_6_2.setBounds(0, 0, 890, 70);
		panel_2.add(lblNewLabel_6_2);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(10, 106, 870, 436);
		panel_2.add(scrollPane_5);
		
		table_4 = new JTable();
		scrollPane_5.setViewportView(table_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Liste des bons de livraisons");
		lblNewLabel_4_1.setOpaque(true);
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_4_1.setBackground(SystemColor.menu);
		lblNewLabel_4_1.setBounds(15, 78, 245, 30);
		panel_2.add(lblNewLabel_4_1);
		
		
		panel_livraison.setBorder(null);
		panel_livraison.setBackground(Color.WHITE);
		panel_livraison.setBounds(0, 0, 890, 553);
		layeredPane.add(panel_livraison);
		panel_livraison.setLayout(null);
		panel_livraison.setVisible(false);
		
		JLabel lblNewLabel_rech_liv = new JLabel("");
		lblNewLabel_rech_liv.setOpaque(true);
		lblNewLabel_rech_liv.setIcon(new ImageIcon("icons\\tools-and-utensils (1).png"));
		lblNewLabel_rech_liv.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_rech_liv.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_rech_liv.setBorder(null);
		lblNewLabel_rech_liv.setBackground(Color.WHITE);
		lblNewLabel_rech_liv.setBounds(248, 23, 34, 30);
		panel_livraison.add(lblNewLabel_rech_liv);
		
		txtRecherche_1 = new JTextField();
		txtRecherche_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				txtRecherche_1.setFont(new Font("Century Gothic", Font.ITALIC, 13));
				txtRecherche_1.setForeground(Color.GRAY);
				txtRecherche_1.setText(" Recherche...");
			}
		});
		txtRecherche_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtRecherche_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
				txtRecherche_1.setForeground(Color.BLACK);
				txtRecherche_1.setText("");
			}
		});
		txtRecherche_1.setForeground(Color.GRAY);
		txtRecherche_1.setText(" Recherche...");
		txtRecherche_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				if( !txtRecherche_1.getText().isEmpty()) {
					String s = txtRecherche_1.getText();
					if(rdbtnChef.isSelected()) {
						try {
							PreparedStatement ps = cnx.prepareStatement("select chef_service_numch as 'ID Chef De Service',idservice as 'ID Service',idarticle as 'ID Artcile',article_numero_serie as 'Numero De Serie',date_acquisition as 'Date d''acquisition',quantite as 'Quantité' from bon_commande where Traitement=0 and chef_service_numch like '"+s+"%'");
							ResultSet rs = ps.executeQuery();
							table_1.setModel(DbUtils.resultSetToTableModel(rs));
							
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
                    if(rdbtnIdArticle.isSelected()) {
                    	try {
							PreparedStatement ps = cnx.prepareStatement("select chef_service_numch as 'ID Chef De Service',idservice as 'ID Service',idarticle as 'ID Artcile',article_numero_serie as 'Numero De Serie',date_acquisition as 'Date d''acquisition',quantite as 'Quantité' from bon_commande where Traitement=0 and idarticle like '"+s+"%'");
							ResultSet rs = ps.executeQuery();
							table_1.setModel(DbUtils.resultSetToTableModel(rs));
							
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
                    if(rdbtnIdService.isSelected()) {
                    	try {
							PreparedStatement ps = cnx.prepareStatement("select chef_service_numch as 'ID Chef De Service',idservice as 'ID Service',idarticle as 'ID Artcile',article_numero_serie as 'Numero De Serie',date_acquisition as 'Date d''acquisition',quantite as 'Quantité' from bon_commande where Traitement=0 and idservice like '"+s+"%'");
							ResultSet rs = ps.executeQuery();
							table_1.setModel(DbUtils.resultSetToTableModel(rs));
							
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				}else {
					
					try {
						PreparedStatement pst = cnx.prepareStatement("select chef_service_numch as 'ID Chef De Service',idservice as 'ID Service',idarticle as 'ID Artcile',article_numero_serie as 'Numero De Serie',date_acquisition as 'Date d''acquisition',quantite as 'Quantité' from bon_commande where Traitement=0");
					    ResultSet rs;
						rs = pst.executeQuery();
						table_1.setModel(DbUtils.resultSetToTableModel(rs));
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		txtRecherche_1.setFont(new Font("Century Gothic", Font.ITALIC, 13));
		txtRecherche_1.setBackground(Color.WHITE);
		txtRecherche_1.setBorder(null);
		txtRecherche_1.setBounds(35, 23, 215, 30);
		panel_livraison.add(txtRecherche_1);
		txtRecherche_1.setColumns(10);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBorder(null);
		scrollPane_2.setBounds(10, 112, 870, 120);
		panel_livraison.add(scrollPane_2);
		
		table_1 = new JTable();
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(table_1.isRowSelected(table_1.getSelectedRow())) {
                  articleajouter();
				}
			}
		});
		table_1.setShowGrid(false);
		table_1.setBorder(null);
		scrollPane_2.setViewportView(table_1);
		
		JButton btnNewButton = new JButton("Traiter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btnNewButton.setBackground(SystemColor.controlHighlight);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnNewButton.setBackground(SystemColor.DARK_GRAY);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(table_1.isRowSelected(table_1.getSelectedRow())) {
					int response = JOptionPane.showConfirmDialog(contentPane,"Etes-vous sur de vouloir confirmer le traitement du bon et élaborer le bon de livraison ?","Confirmation !",JOptionPane.YES_NO_CANCEL_OPTION);
					if(response == JOptionPane.YES_OPTION) {
					int k=0;
					int art=0,qte=0;
			while(k<table_3.getRowCount()) {
						
					
				qte = (int) table_3.getValueAt(k,5);
				art = (int) table_3.getValueAt(k,0);
				
				//mise a jour de la quantité
				try {
					PreparedStatement pst = cnx.prepareStatement("update etat_stock set quantite_article=quantite_article - ? where idarticle=?");
					pst.setInt(1,qte);
					pst.setInt(2, art);
					pst.executeUpdate();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				k++;
					}
				//mise a jour du bon de commande
				try {
					PreparedStatement pst = cnx.prepareStatement("update boncommande set traitement='1' where id_bon_commande=?");
					pst.setInt(1, (int)table_1.getValueAt(table_1.getSelectedRow(), 0));
					pst.executeUpdate();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				//Elaboration du bon de livraison (insertion dans la table)
				ArrayList<String> bon_liv = new ArrayList<String>();
				int i;
				try {
					PreparedStatement pst = cnx.prepareStatement("insert into boncommande(id_bon_commande,idservice,datecreation,description,idmagasinier) values(?,?,?,?,?)");
					pst.setString(1, textField.getText());
					pst.setInt(2, (int) table_1.getValueAt(table_1.getSelectedRow(), 1));
					pst.setString(3, l2.getText());
					pst.setString(4, textArea_1.getText());
					pst.setString(5, Login_gmao.id);
					pst.executeUpdate();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
      				//Recuperation des infos du bon de commande
			        try {
					PreparedStatement pst = cnx.prepareStatement("select * from bon_commande where id_bon_commande=? ");
					pst.setInt(1, (int) table_1.getValueAt(table_1.getSelectedRow(), 0));
					ResultSet rs =pst.executeQuery();
					while(rs.next()) {
						for( i=1;i<13;i++) {
						bon_liv.add(rs.getString(i));
						}
					bon_liv.add(textField.getText());
					i=0;
					//Insertion du nouveau bon de livraison
					pst = cnx.prepareStatement("insert into bon_livraison values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
					while(i<13) {
					pst.setString(i+1,bon_liv.get(i));
					i++;
					}
					pst.executeUpdate();
					}
					JOptionPane.showMessageDialog(contentPane, "Bon de livraison élaborer avec succès !");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				
				}
			}else {
				JOptionPane.showMessageDialog(contentPane,"Veuillez selectionner un bon a traiter !", "ERREUR !", JOptionPane.ERROR_MESSAGE);
			}
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 16));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(51, 102, 204));
		btnNewButton.setBounds(714, 512, 166, 30);
		panel_livraison.add(btnNewButton);
		
		rdbtnChef = new JRadioButton("ID Chef de service");
		rdbtnChef.setOpaque(false);
		rdbtnChef.setIcon(new ImageIcon("icons\\radio-button-unchecked (2).png"));
		rdbtnChef.setFont(new Font("Century Gothic", Font.BOLD, 12));
		rdbtnChef.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnChef.isSelected()) {
					rdbtnChef.setIcon(new ImageIcon("icons\\radio-button (2) (1)"));
					rdbtnIdArticle.setIcon(new ImageIcon("icons\\radio-button-unchecked (2).png"));
					rdbtnIdService.setIcon(new ImageIcon("icons\\radio-button-unchecked (2).png"));
					rdbtnIdArticle.setSelected(false);
					rdbtnIdService.setSelected(false);
					
				}
				
			}
		});
		rdbtnChef.setBackground(Color.LIGHT_GRAY);
		rdbtnChef.setBounds(311, 27, 137, 23);
		panel_livraison.add(rdbtnChef);
		
		rdbtnIdService = new JRadioButton("ID Service");
		rdbtnIdService.setOpaque(false);
		rdbtnIdService.setIcon(new ImageIcon("icons\\radio-button-unchecked (2).png"));
		rdbtnIdService.setFont(new Font("Century Gothic", Font.BOLD, 12));
		rdbtnIdService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnIdService.isSelected()) {
					rdbtnIdService.setIcon(new ImageIcon("icons\\radio-button (2) (1).png"));
					rdbtnIdArticle.setIcon(new ImageIcon("icons\\radio-button-unchecked (2).png"));
					rdbtnChef.setIcon(new ImageIcon("icons\\radio-button-unchecked (2).png"));
					rdbtnIdArticle.setSelected(false);
					rdbtnChef.setSelected(false);
					
				}
			}
		});
		rdbtnIdService.setBackground(Color.LIGHT_GRAY);
		rdbtnIdService.setBounds(480, 27, 99, 23);
		panel_livraison.add(rdbtnIdService);
		
		rdbtnIdArticle = new JRadioButton("ID Article");
		rdbtnIdArticle.setOpaque(false);
		rdbtnIdArticle.setIcon(new ImageIcon("icons\\radio-button-unchecked (2).png"));
		rdbtnIdArticle.setFont(new Font("Century Gothic", Font.BOLD, 12));
		rdbtnIdArticle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnIdArticle.isSelected()) {
					rdbtnIdArticle.setIcon(new ImageIcon("icons\\radio-button (2) (1).png"));
					rdbtnIdService.setIcon(new ImageIcon("icons\\radio-button-unchecked (2).png"));
					rdbtnChef.setIcon(new ImageIcon("icons\\radio-button-unchecked (2).png"));
					rdbtnChef.setSelected(false);
					rdbtnIdService.setSelected(false);
				}
			}
		});
		rdbtnIdArticle.setBackground(Color.LIGHT_GRAY);
		rdbtnIdArticle.setBounds(610, 27, 109, 23);
		panel_livraison.add(rdbtnIdArticle);
		
		JLabel lblNewLabel_5 = new JLabel("Liste des bons de commandes non trait\u00E9s");
		lblNewLabel_5.setBackground(SystemColor.control);
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_5.setBounds(15, 86, 321, 28);
		panel_livraison.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBorder(null);
		lblNewLabel_6.setBackground(SystemColor.controlHighlight);
		lblNewLabel_6.setForeground(new Color(0, 153, 153));
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setBounds(0, 0, 890, 70);
		panel_livraison.add(lblNewLabel_6);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(8, 262, 870, 120);
		panel_livraison.add(scrollPane_4);
		
		table_3 = new JTable();
		scrollPane_4.setViewportView(table_3);
		
		JLabel lblNewLabel_5_1 = new JLabel("Liste des articles du bon");
		lblNewLabel_5_1.setOpaque(true);
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_5_1.setBackground(SystemColor.menu);
		lblNewLabel_5_1.setBounds(13, 236, 218, 28);
		panel_livraison.add(lblNewLabel_5_1);
		
		JLabel lblNBonDe = new JLabel("N\u00B0 Bon de commande");
		lblNBonDe.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNBonDe.setBounds(15, 407, 163, 33);
		panel_livraison.add(lblNBonDe);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBounds(178, 409, 189, 31);
		panel_livraison.add(textField);
		
		textArea_1 = new JTextArea();
		textArea_1.setBounds(487, 409, 380, 73);
		panel_livraison.add(textArea_1);
		
		JLabel lblDscription = new JLabel("D\u00E9scription");
		lblDscription.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblDscription.setBounds(396, 407, 81, 33);
		panel_livraison.add(lblDscription);
		
		JLabel lblNewLabel_28 = new JLabel("");
		lblNewLabel_28.setOpaque(true);
		lblNewLabel_28.setBackground(SystemColor.controlHighlight);
		lblNewLabel_28.setBounds(5, 393, 875, 108);
		panel_livraison.add(lblNewLabel_28);
		
		JButton btnHistoriqueBonsDe = new JButton("Historique bons de livraisons");
		btnHistoriqueBonsDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_Etat_Stock.setVisible(false);
				panel_home.setVisible(false);
				panel_livraison.setVisible(false);
				panel_liv.setVisible(false);
				panel_mis_a_jour.setVisible(false);
				panel_fournisseurs.setVisible(false);
				panel_2.setVisible(true);
				bon_liv();
			}
		});
		btnHistoriqueBonsDe.setForeground(Color.WHITE);
		btnHistoriqueBonsDe.setFont(new Font("Century Gothic", Font.BOLD, 16));
		btnHistoriqueBonsDe.setFocusPainted(false);
		btnHistoriqueBonsDe.setBorderPainted(false);
		btnHistoriqueBonsDe.setBorder(null);
		btnHistoriqueBonsDe.setBackground(new Color(51, 102, 204));
		btnHistoriqueBonsDe.setBounds(545, 77, 335, 28);
		panel_livraison.add(btnHistoriqueBonsDe);
		
		panel_fournisseurs = new JPanel();
		panel_fournisseurs.setBorder(null);
		panel_fournisseurs.setBackground(Color.WHITE);
		panel_fournisseurs.setBounds(0, 0, 890, 553);
		layeredPane.add(panel_fournisseurs);
		panel_fournisseurs.setLayout(null);
		panel_fournisseurs.setVisible(false);
		
		txtRecherche = new JTextField();
		txtRecherche.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				txtRecherche.setText(" Recherche...");
				txtRecherche.setForeground(Color.GRAY);
				txtRecherche.setFont(new Font("Century Gothic", Font.ITALIC, 13));
			}
		});
		txtRecherche.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtRecherche.setText("");
				txtRecherche.setForeground(Color.BLACK);
				txtRecherche.setFont(new Font("Century Gothic", Font.PLAIN, 13));
			}
		});
		txtRecherche.setForeground(Color.GRAY);
		txtRecherche.setText(" Recherche...");
		txtRecherche.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				if(!txtRecherche.getText().isEmpty()) {
					String s = txtRecherche.getText();
					if(rdbtnContrat.isSelected()) {
						try {
							PreparedStatement pst = cnx.prepareStatement("select numf as 'N° fournisseur',num_contract as 'N° contrat',adr as 'Adresse',tel as 'N° de telephone',nomf as 'Nom fournisseur' from fournisseur where num_contract like '"+s+"%'");
						    ResultSet rs =pst.executeQuery();
						    table_2.setModel(DbUtils.resultSetToTableModel(rs));
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					if(rdbtnNom.isSelected()) {
						try {
							PreparedStatement pst = cnx.prepareStatement("select numf as 'N° fournisseur',num_contract as 'N° contrat',adr as 'Adresse',tel as 'N° de telephone',nomf as 'Nom fournisseur' from fournisseur where nomf like '"+s+"%'");
//						    pst.setString(1,s);
						    ResultSet rs =pst.executeQuery();
						    table_2.setModel(DbUtils.resultSetToTableModel(rs));
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				}else {
					try {
						PreparedStatement pst = cnx.prepareStatement("select numf as 'N° fournisseur',num_contract as 'N° contrat',adr as 'Adresse',tel as 'N° de telephone',nomf as 'Nom fournisseur' from fournisseur");
					    ResultSet rs =pst.executeQuery();
					    table_2.setModel(DbUtils.resultSetToTableModel(rs));
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
			}
		});
		txtRecherche.setBounds(35, 23, 215, 30);
		txtRecherche.setFont(new Font("Century Gothic", Font.ITALIC, 13));
		txtRecherche.setColumns(10);
		txtRecherche.setBorder(null);
		txtRecherche.setBackground(Color.WHITE);
		panel_fournisseurs.add(txtRecherche);
		
		JLabel lblNewLabel_rech_liv_1 = new JLabel("");
		lblNewLabel_rech_liv_1.setIcon(new ImageIcon("icons\\tools-and-utensils (1).png"));
		lblNewLabel_rech_liv_1.setOpaque(true);
		lblNewLabel_rech_liv_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_rech_liv_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_rech_liv_1.setBorder(null);
		lblNewLabel_rech_liv_1.setBackground(Color.WHITE);
		lblNewLabel_rech_liv_1.setBounds(249, 23, 33, 30);
		panel_fournisseurs.add(lblNewLabel_rech_liv_1);
		
		rdbtnContrat = new JRadioButton("N\u00B0 De contrat");
		rdbtnContrat.setOpaque(false);
		rdbtnContrat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnContrat.isSelected()) {
					rdbtnNom.setSelected(false);
					rdbtnContrat.setIcon(new ImageIcon("icons\\radio-button (2) (1).png"));
					rdbtnNom.setIcon(new ImageIcon("icons\\radio-button-unchecked (2).png"));
				}
			}
		});
		rdbtnContrat.setIcon(new ImageIcon("icons\\radio-button-unchecked (2).png"));
		rdbtnContrat.setFont(new Font("Century Gothic", Font.BOLD, 12));
		rdbtnContrat.setBackground(Color.LIGHT_GRAY);
		rdbtnContrat.setBounds(347, 27, 109, 23);
		panel_fournisseurs.add(rdbtnContrat);
		
		rdbtnNom = new JRadioButton("Nom du fournisseur");
		rdbtnNom.setOpaque(false);
		rdbtnNom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNom.isSelected() ) {
					rdbtnContrat.setSelected(false);
					rdbtnNom.setIcon(new ImageIcon("icons\\radio-button (2) (1).png"));
					rdbtnContrat.setIcon(new ImageIcon("icons\\radio-button-unchecked (2).png"));
					
				}
			}
		});
		rdbtnNom.setIcon(new ImageIcon("icons\\radio-button-unchecked (2).png"));
		rdbtnNom.setFont(new Font("Century Gothic", Font.BOLD, 12));
		rdbtnNom.setBackground(Color.LIGHT_GRAY);
		rdbtnNom.setBounds(537, 27, 169, 23);
		panel_fournisseurs.add(rdbtnNom);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(35, 115, 822, 403);
		panel_fournisseurs.add(scrollPane_3);
		
		table_2 = new JTable();
		table_2.setBorder(null);
		table_2.setShowVerticalLines(false);
		table_2.setShowGrid(false);
		scrollPane_3.setViewportView(table_2);
		
		JLabel lblNewLabel_4 = new JLabel("Liste des fournisseurs");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBackground(SystemColor.control);
		lblNewLabel_4.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_4.setBounds(35, 88, 215, 30);
		panel_fournisseurs.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("");
		lblNewLabel_6_1_1.setOpaque(true);
		lblNewLabel_6_1_1.setForeground(new Color(0, 153, 153));
		lblNewLabel_6_1_1.setBorder(null);
		lblNewLabel_6_1_1.setBackground(SystemColor.controlHighlight);
		lblNewLabel_6_1_1.setBounds(0, 0, 890, 70);
		panel_fournisseurs.add(lblNewLabel_6_1_1);
		layeredPane.add(panel_Etat_Stock);
		panel_Etat_Stock.setLayout(null);
		
		JLabel lblNewLabel_rech_etatS = new JLabel("");
		lblNewLabel_rech_etatS.setOpaque(true);
		lblNewLabel_rech_etatS.setBounds(248, 23, 34, 30);
		lblNewLabel_rech_etatS.setForeground(SystemColor.controlHighlight);
		lblNewLabel_rech_etatS.setBackground(Color.WHITE);
		lblNewLabel_rech_etatS.setBorder(null);
		lblNewLabel_rech_etatS.setIcon(new ImageIcon("icons\\tools-and-utensils (1).png"));
		lblNewLabel_rech_etatS.setHorizontalAlignment(SwingConstants.CENTER);
		panel_Etat_Stock.add(lblNewLabel_rech_etatS);
		
		txtRecherche_2 = new JTextField();
		txtRecherche_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				txtRecherche_2.setFont(new Font("Century Gothic", Font.ITALIC, 13));
				txtRecherche_2.setForeground(Color.GRAY);
				txtRecherche_2.setText(" Recherche...");
			}
		});
		txtRecherche_2.setForeground(Color.GRAY);
		txtRecherche_2.setText(" Recherche...");
		txtRecherche_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtRecherche_2.setText("");
				txtRecherche_2.setFont(new Font("Century Gothic", Font.PLAIN, 13));
				txtRecherche_2.setForeground(Color.BLACK);
				
			}
		});
		txtRecherche_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				if(!txtRecherche_2.getText().isEmpty()) {
					String ch = txtRecherche_2.getText();
					try {
						PreparedStatement ps = cnx.prepareStatement("select idEtat_stock as 'Num Stock',idarticle as 'ID Article',quantite_article as 'Quantité',date_acquisition as 'Date d''acquisition' from etat_stock where idarticle like '"+ch+"%'");
						
						ResultSet rs = ps.executeQuery();
						table.setModel(DbUtils.resultSetToTableModel(rs));
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else {
					
					try {
						PreparedStatement pst = cnx.prepareStatement("select idEtat_stock as 'Num Stock',idarticle as 'ID Article',quantite_article as 'Quantité',date_acquisition as 'Date d''acquisition' from etat_stock");
					    ResultSet rs;
						rs = pst.executeQuery();
						table.setModel(DbUtils.resultSetToTableModel(rs));
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		txtRecherche_2.setBounds(35, 23, 215, 30);
		txtRecherche_2.setBorder(null);
		txtRecherche_2.setFont(new Font("Century Gothic", Font.ITALIC, 13));
		txtRecherche_2.setBackground(Color.WHITE);
		panel_Etat_Stock.add(txtRecherche_2);
		txtRecherche_2.setColumns(10);
		
		
		scrollPane_1.setEnabled(false);
		scrollPane_1.setFocusable(false);
		scrollPane_1.setBounds(35, 115, 822, 420);
		panel_Etat_Stock.add(scrollPane_1);
		
		table = new JTable(){
			public boolean isCellEditable(int row,int column) {
				return false;
			}
		};
		
		table.setShowHorizontalLines(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{},
				{},
			},
			new String[] {
			}
		));
		table.setRowSelectionAllowed(true);
		scrollPane_1.setViewportView(table);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setOpaque(true);
		lblNewLabel_6_1.setForeground(new Color(0, 153, 153));
		lblNewLabel_6_1.setBorder(null);
		lblNewLabel_6_1.setBackground(SystemColor.controlHighlight);
		lblNewLabel_6_1.setBounds(0, 0, 890, 70);
		panel_Etat_Stock.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_8 = new JLabel("Liste des etats des articles en stock");
		lblNewLabel_8.setBackground(SystemColor.control);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_8.setOpaque(true);
		lblNewLabel_8.setBounds(35, 88, 295, 30);
		panel_Etat_Stock.add(lblNewLabel_8);
		layeredPane.add(panel_mis_a_jour);
		panel_mis_a_jour.setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.setMaximumRowCount(10);
		comboBox.setFont(new Font("Century Gothic", Font.BOLD, 13));
		comboBox.addItem("");
		comboBox.setBackground(Color.WHITE);
		comboBox.setBorder(null);
		comboBox.setBounds(93, 65, 269, 30);
		panel_mis_a_jour.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Artcile ");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(20, 69, 74, 25);
		panel_mis_a_jour.add(lblNewLabel_1);
		
		textField_qte = new JTextField();
		textField_qte.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_qte.setColumns(10);
		textField_qte.setBorder(null);
		textField_qte.setBackground(Color.WHITE);
		textField_qte.setBounds(93, 106, 269, 30);
		panel_mis_a_jour.add(textField_qte);
		
		JLabel lblNewLabel_1_1 = new JLabel("Quantit\u00E9");
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(20, 111, 74, 25);
		panel_mis_a_jour.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("R\u00E9approvisionnement d'un article \u00E9xistant");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 12, 308, 30);
		panel_mis_a_jour.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("VALIDER");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!comboBox.getSelectedItem().toString().isEmpty() && !textField_qte.getText().isEmpty()) {
				String s =comboBox.getSelectedItem().toString();
				s=s.substring(0, 4);
				try {
					PreparedStatement pst = cnx.prepareStatement("update etat_stock set quantite_article=quantite_article + ? where idarticle=?");
					pst.setString(1,textField_qte.getText());
					pst.setString(2, s);
					pst.executeUpdate();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(contentPane, "Article réapprovisionné avec succés!", "Operation réussi", JOptionPane.INFORMATION_MESSAGE);
				textField_qte.setText("");
				comboBox.setSelectedIndex(0);
				}else {
					JOptionPane.showMessageDialog(comboBox, "Un des champs est vide !", "ERREUR", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("Century Gothic", Font.BOLD, 13));
		btnNewButton_1.setBounds(10, 172, 139, 30);
		panel_mis_a_jour.add(btnNewButton_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Approvisionnement d'un nouvel article");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setOpaque(true);
		lblNewLabel_3_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(396, 12, 299, 30);
		panel_mis_a_jour.add(lblNewLabel_3_1);
		
		textField_code_art = new JTextField();
		textField_code_art.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_code_art.setColumns(10);
		textField_code_art.setBorder(null);
		textField_code_art.setBackground(SystemColor.text);
		textField_code_art.setBounds(571, 50, 269, 25);
		panel_mis_a_jour.add(textField_code_art);
		
		textField_libelle = new JTextField();
		textField_libelle.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_libelle.setColumns(10);
		textField_libelle.setBorder(null);
		textField_libelle.setBackground(SystemColor.text);
		textField_libelle.setBounds(571, 86, 269, 25);
		panel_mis_a_jour.add(textField_libelle);
		
		textField_num_serie = new JTextField();
		textField_num_serie.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_num_serie.setColumns(10);
		textField_num_serie.setBorder(null);
		textField_num_serie.setBackground(SystemColor.text);
		textField_num_serie.setBounds(571, 121, 269, 25);
		panel_mis_a_jour.add(textField_num_serie);
		
		textField_concept = new JTextField();
		textField_concept.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_concept.setColumns(10);
		textField_concept.setBorder(null);
		textField_concept.setBackground(SystemColor.text);
		textField_concept.setBounds(571, 157, 269, 25);
		panel_mis_a_jour.add(textField_concept);
		
		textField_poids = new JTextField();
		textField_poids.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_poids.setColumns(10);
		textField_poids.setBorder(null);
		textField_poids.setBackground(SystemColor.text);
		textField_poids.setBounds(570, 192, 94, 25);
		panel_mis_a_jour.add(textField_poids);
		
		textField_couleur = new JTextField();
		textField_couleur.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_couleur.setColumns(10);
		textField_couleur.setBorder(null);
		textField_couleur.setBackground(SystemColor.text);
		textField_couleur.setBounds(571, 228, 93, 25);
		panel_mis_a_jour.add(textField_couleur);
		
		textField_taille = new JTextField();
		textField_taille.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_taille.setColumns(10);
		textField_taille.setBorder(null);
		textField_taille.setBackground(SystemColor.text);
		textField_taille.setBounds(747, 193, 93, 25);
		panel_mis_a_jour.add(textField_taille);
		
		textField_date_acqui = new JTextField();
		textField_date_acqui.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_date_acqui.setColumns(10);
		textField_date_acqui.setBorder(null);
		textField_date_acqui.setBackground(SystemColor.text);
		textField_date_acqui.setBounds(571, 301, 269, 25);
		panel_mis_a_jour.add(textField_date_acqui);
		
		textField_dat_ex = new JTextField();
		textField_dat_ex.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_dat_ex.setColumns(10);
		textField_dat_ex.setBorder(null);
		textField_dat_ex.setBackground(SystemColor.text);
		textField_dat_ex.setBounds(571, 340, 269, 25);
		panel_mis_a_jour.add(textField_dat_ex);
		
		textField_duree = new JTextField();
		textField_duree.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_duree.setColumns(10);
		textField_duree.setBorder(null);
		textField_duree.setBackground(SystemColor.text);
		textField_duree.setBounds(570, 379, 270, 25);
		panel_mis_a_jour.add(textField_duree);
		
		textField_condi = new JTextField();
		textField_condi.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_condi.setColumns(10);
		textField_condi.setBorder(null);
		textField_condi.setBackground(SystemColor.text);
		textField_condi.setBounds(570, 415, 270, 25);
		panel_mis_a_jour.add(textField_condi);
		
		JLabel lblNewLabel_1_2 = new JLabel("Code article");
		lblNewLabel_1_2.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(408, 50, 144, 25);
		panel_mis_a_jour.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Libelle");
		lblNewLabel_1_1_2.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNewLabel_1_1_2.setBounds(408, 85, 144, 25);
		panel_mis_a_jour.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Numero de S\u00E9rie");
		lblNewLabel_1_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNewLabel_1_1_1.setBounds(408, 121, 144, 25);
		panel_mis_a_jour.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Concepteur");
		lblNewLabel_1_1_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNewLabel_1_1_1_1.setBounds(408, 157, 144, 25);
		panel_mis_a_jour.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Poids");
		lblNewLabel_1_1_2_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNewLabel_1_1_2_1.setBounds(407, 193, 194, 25);
		panel_mis_a_jour.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("Couleur");
		lblNewLabel_1_1_2_2.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNewLabel_1_1_2_2.setBounds(407, 227, 62, 25);
		panel_mis_a_jour.add(lblNewLabel_1_1_2_2);
		
		JLabel lblNewLabel_1_1_2_2_1 = new JLabel("Taille");
		lblNewLabel_1_1_2_2_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNewLabel_1_1_2_2_1.setBounds(674, 193, 39, 25);
		panel_mis_a_jour.add(lblNewLabel_1_1_2_2_1);
		
		JLabel lblNewLabel_1_1_2_3 = new JLabel("Date d'acquisition");
		lblNewLabel_1_1_2_3.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNewLabel_1_1_2_3.setBounds(407, 300, 194, 25);
		panel_mis_a_jour.add(lblNewLabel_1_1_2_3);
		
		JLabel lblNewLabel_1_1_2_4 = new JLabel("Date d'experimentation");
		lblNewLabel_1_1_2_4.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNewLabel_1_1_2_4.setBounds(408, 337, 194, 25);
		panel_mis_a_jour.add(lblNewLabel_1_1_2_4);
		
		JLabel lblNewLabel_1_1_2_5 = new JLabel("Dur\u00E9e de vie moyenne");
		lblNewLabel_1_1_2_5.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNewLabel_1_1_2_5.setBounds(407, 376, 194, 25);
		panel_mis_a_jour.add(lblNewLabel_1_1_2_5);
		
		JLabel lblNewLabel_1_1_2_6 = new JLabel("Conditionnement");
		lblNewLabel_1_1_2_6.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNewLabel_1_1_2_6.setBounds(407, 407, 194, 25);
		panel_mis_a_jour.add(lblNewLabel_1_1_2_6);
		
		JLabel lblNewLabel_1_1_2_2_1_1 = new JLabel("Prix");
		lblNewLabel_1_1_2_2_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNewLabel_1_1_2_2_1_1.setBounds(406, 264, 194, 25);
		panel_mis_a_jour.add(lblNewLabel_1_1_2_2_1_1);
		
		textField_prix = new JTextField();
		textField_prix.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_prix.setColumns(10);
		textField_prix.setBorder(null);
		textField_prix.setBackground(SystemColor.text);
		textField_prix.setBounds(570, 265, 94, 25);
		panel_mis_a_jour.add(textField_prix);
		
		textField_type = new JTextField();
		textField_type.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_type.setColumns(10);
		textField_type.setBorder(null);
		textField_type.setBackground(SystemColor.text);
		textField_type.setBounds(747, 228, 93, 25);
		panel_mis_a_jour.add(textField_type);
		
		JLabel lblNewLabel_1_1_2_2_1_2 = new JLabel("Type");
		lblNewLabel_1_1_2_2_1_2.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNewLabel_1_1_2_2_1_2.setBounds(674, 230, 39, 25);
		panel_mis_a_jour.add(lblNewLabel_1_1_2_2_1_2);
		
		JLabel lblNewLabel_1_1_2_2_1_2_1 = new JLabel("Quantit\u00E9");
		lblNewLabel_1_1_2_2_1_2_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNewLabel_1_1_2_2_1_2_1.setBounds(674, 264, 62, 25);
		panel_mis_a_jour.add(lblNewLabel_1_1_2_2_1_2_1);
		
		textField_qte_new = new JTextField();
		textField_qte_new.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_qte_new.setColumns(10);
		textField_qte_new.setBorder(null);
		textField_qte_new.setBackground(SystemColor.text);
		textField_qte_new.setBounds(747, 264, 93, 25);
		panel_mis_a_jour.add(textField_qte_new);
		
		JButton btnNewButton_1_1 = new JButton("VALIDER");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if( !textField_code_art.getText().isEmpty() && !textField_num_serie.getText().isEmpty() && !textField_concept.getText().isEmpty() && 
					!textField_poids.getText().isEmpty() &&  !textField_taille.getText().isEmpty()  &&  !textField_libelle.getText().isEmpty() && 
					!textField_qte_new.getText().isEmpty() &&  !textField_prix.getText().isEmpty() && !textField_couleur.getText().isEmpty() && 
					!textField_date_acqui.getText().isEmpty() && !textField_duree.getText().isEmpty() && !textField_dat_ex.getText().isEmpty() && 
					!textField_type.getText().isEmpty() && !textField_condi.getText().isEmpty() ){
				try {
				
					PreparedStatement ps =cnx.prepareStatement("insert into article values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
					ps.setString(1,textField_code_art.getText() );   ps.setString(2,textField_num_serie.getText()); ps.setString(3,textField_concept.getText());
					ps.setString(4,textField_poids.getText());       ps.setString(5,textField_taille.getText());    ps.setString(6,textField_libelle.getText());
					ps.setString(7,textField_qte_new.getText());     ps.setString(8,textField_prix.getText());      ps.setString(9,textField_couleur.getText());
					ps.setString(10,textField_date_acqui.getText()); ps.setString(11,textField_duree.getText());    ps.setString(12,textField_dat_ex.getText());
					ps.setString(13,textField_type.getText());       ps.setString(14,textField_condi.getText());
					
					ps.executeQuery();
					JOptionPane.showMessageDialog(contentPane, "Nouvel article inserer avec succés !", "Operation réussie", JOptionPane.INFORMATION_MESSAGE);
					}catch(SQLException a) {
					a.printStackTrace();
				}
				}else {
					JOptionPane.showMessageDialog(contentPane, "Un ou plusieurs champs sont vides", "ERREUR !", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Century Gothic", Font.BOLD, 13));
		btnNewButton_1_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1_1.setBounds(407, 463, 139, 30);
		panel_mis_a_jour.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBackground(SystemColor.controlHighlight);
		lblNewLabel_7.setOpaque(true);
		lblNewLabel_7.setBounds(10, 41, 376, 120);
		panel_mis_a_jour.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("");
		lblNewLabel_7_1.setOpaque(true);
		lblNewLabel_7_1.setBackground(SystemColor.controlHighlight);
		lblNewLabel_7_1.setBounds(396, 41, 466, 411);
		panel_mis_a_jour.add(lblNewLabel_7_1);
		
		panel = new JPanel();
		panel.setVisible(false);
		panel.setBorder(null);
//		panel.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				if(EtatP==0) {
//					panel.setBounds(20, 182, 168, 365);
//					lblEtatStock.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\button (20).png"));
//					lblEtatStock.setBounds(0, 11, 161, 52);
//					
//					lblLivraison.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\button (27).png"));
//					lblLivraison.setBounds(0, 64, 161, 52);
//					
//					lblMaj.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\button (45).png"));
//					lblMaj.setBounds(0, 117, 161, 52);
//					
//					lblFournisseur_.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\button (52).png"));
//					lblFournisseur_.setBounds(0, 170, 161, 52);
//					lblFournisseur.setBounds(0, 170, 62, 52);
//				}
//			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				if(EtatP==0) {
//					panel.setBounds(20, 182, 66, 365);
//					lblLivraison.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\button (30).png"));
//					lblLivraison.setBounds(0, 64, 62, 52);
//					
//					lblEtatStock.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\button (17).png"));
//					lblEtatStock.setBounds(0, 11, 62, 52);
//					
//					lblMaj.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\button (39).png"));
//					lblMaj.setBounds(0, 117, 62, 52);
//					
//					lblFournisseur_.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\button (51).png"));
//					lblFournisseur_.setBounds(0, 170, 62, 52);
//					lblFournisseur.setBounds(0, 170, 62, 52);
//				}
//			}
//		});
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 169, 171, 483);
		contentPane.add(panel);
		panel.setLayout(null);
		lblEtatStock.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtatStock.setIconTextGap(5);
		lblEtatStock.setOpaque(true);
		lblEtatStock.setBackground(SystemColor.controlHighlight);
		lblEtatStock.setIcon(new ImageIcon("icons\\etats.png"));
		lblEtatStock.setFont(new Font("Century Gothic", Font.BOLD, 16));
		
		
		lblEtatStock.setBounds(0, 0, 171, 52);
		panel.add(lblEtatStock);
		lblEtatStock.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Etat = 1;
				panel_Etat_Stock.setVisible(true);
				panel_home.setVisible(false);
				panel_liv.setVisible(false);
				panel_2.setVisible(false);
				panel_livraison.setVisible(false);
				panel_mis_a_jour.setVisible(false);
				panel_fournisseurs.setVisible(false);
				
				lblEtatStock.setBackground(Color.WHITE);
				lblLivraison.setBackground(SystemColor.controlHighlight);
				lblMaj.setBackground(SystemColor.controlHighlight);
				lblFournisseur_.setBackground(SystemColor.controlHighlight);
			     
				try {
					scrollPane_1.setVisible(true);
					TableColorCellRendrer rend = new TableColorCellRendrer();
					table.setDefaultRenderer(Object.class, rend);
					
					   table.setModel(new DefaultTableModel(){
						   
							public boolean isCellEditable(int row, int column) {
								return false;
							}
						});
					
					PreparedStatement pst = cnx.prepareStatement("select idEtat_stock as 'Num Stock',idarticle as 'ID Article',quantite_article as 'Quantité',date_acquisition as 'Date d''acquisition' from etat_stock");
				    ResultSet rs= pst.executeQuery();
				    table.setModel(DbUtils.resultSetToTableModel(rs));
				    
				 
				    
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}
		
			@Override
			public void mouseEntered(MouseEvent e) {
				if(Etat!=1) {
					lblEtatStock.setBackground(SystemColor.control);
				}
//					panel.setBounds(20, 182, 168, 365);
//					lblEtatStock.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\button (20).png"));
//					lblEtatStock.setBounds(0, 11, 161, 52);
//					
//					lblLivraison.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\button (27).png"));
//					lblLivraison.setBounds(0, 64, 161, 52);
//					
//					lblMaj.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\button (45).png"));
//					lblMaj.setBounds(0, 117, 161, 52);
//					
//					lblFournisseur_.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\button (52).png"));
//					lblFournisseur_.setBounds(0, 170, 161, 52);
//					lblFournisseur.setBounds(0, 170, 62, 52);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(Etat !=1) {
				lblEtatStock.setBackground(SystemColor.controlHighlight);
			}
			}	
		});
		lblLivraison.setIconTextGap(15);
		lblLivraison.setOpaque(true);
		lblLivraison.setBackground(SystemColor.controlHighlight);
		lblLivraison.setFont(new Font("Century Gothic", Font.BOLD, 16));
		
		
		lblLivraison.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Etat=2;
				lblEtatStock.setBackground(SystemColor.controlHighlight);
				lblLivraison.setBackground(SystemColor.WHITE);
				lblMaj.setBackground(SystemColor.controlHighlight);
				lblFournisseur_.setBackground(SystemColor.controlHighlight);
				
				panel_Etat_Stock.setVisible(false);
				panel_home.setVisible(false);
				panel_livraison.setVisible(true);
				panel_2.setVisible(false);
				panel_liv.setVisible(false);
				panel_mis_a_jour.setVisible(false);
				panel_fournisseurs.setVisible(false);
				
				selectbon();
				
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				if(Etat!=2) {
				lblLivraison.setBackground(SystemColor.control);
				}
//				if(EtatP==0) {
//					panel.setBounds(20, 182, 168, 365);
//					lblEtatStock.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\button (20).png"));
//					lblEtatStock.setBounds(0, 11, 161, 52);
//					
//					lblLivraison.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\button (27).png"));
//					lblLivraison.setBounds(0, 64, 161, 52);
//					
//					lblMaj.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\button (45).png"));
//					lblMaj.setBounds(0, 117, 161, 52);
//					
//					lblFournisseur_.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\button (52).png"));
//					lblFournisseur_.setBounds(0, 170, 161, 52);
//					lblFournisseur.setBounds(0, 170, 62, 52);
//				}
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				if(Etat!=2) {
		     	lblLivraison.setBackground(SystemColor.controlHighlight);
			}
			}	
		});
		lblLivraison.setIcon(new ImageIcon("icons\\liv.png"));
		lblLivraison.setHorizontalAlignment(SwingConstants.CENTER);
		lblLivraison.setBounds(0, 52, 171, 52);
		panel.add(lblLivraison);
		lblMaj.setIconTextGap(10);
		lblMaj.setBackground(SystemColor.controlHighlight);
		lblMaj.setOpaque(true);
		lblMaj.setFont(new Font("Century Gothic", Font.BOLD, 16));
		
		
		lblMaj.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(Etat!=3) {
				lblMaj.setBackground(SystemColor.control);
		
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Etat=3;
				lblEtatStock.setBackground(SystemColor.controlHighlight);
				lblLivraison.setBackground(SystemColor.controlHighlight);
				lblMaj.setBackground(SystemColor.WHITE);
				lblFournisseur_.setBackground(SystemColor.controlHighlight);
			
				panel_Etat_Stock.setVisible(false);
				panel_home.setVisible(false);
				panel_2.setVisible(false);
				panel_liv.setVisible(false);
				panel_livraison.setVisible(false);
				panel_mis_a_jour.setVisible(true);
				panel_fournisseurs.setVisible(false);
				
				try {
					PreparedStatement ps = cnx.prepareStatement("select fournit.idarticle,numf,article_numero_serie,libelle,concepteur,type from pfe2.fournit right join pfe2.article on fournit.idarticle = article.idarticle");
					ResultSet rs=ps.executeQuery();
					while(rs.next()) {
						comboBox.addItem(rs.getString(1)+"/"+rs.getString(2)+"/"+rs.getString(3)+"/"+rs.getString(4)+"/"+rs.getString(5)+"/"+rs.getString(6));
					}
					
					
				}catch(SQLException e1) {
					e1.printStackTrace();
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(Etat!=3) {
				lblMaj.setBackground(SystemColor.controlHighlight);
				}
				}
				
		});
		lblMaj.setIcon(new ImageIcon("icons\\stock.png"));
		lblMaj.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaj.setBounds(0, 104, 171, 52);
		panel.add(lblMaj);
		lblFournisseur_.setIconTextGap(10);
		lblFournisseur_.setBackground(SystemColor.controlHighlight);
		lblFournisseur_.setOpaque(true);
		lblFournisseur_.setFont(new Font("Century Gothic", Font.BOLD, 16));
		
		
		lblFournisseur_.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			    Etat=4;
			    
				lblEtatStock.setBackground(SystemColor.controlHighlight);
				lblLivraison.setBackground(SystemColor.controlHighlight);
				lblMaj.setBackground(SystemColor.controlHighlight);
				lblFournisseur_.setBackground(SystemColor.WHITE);
				
				panel_Etat_Stock.setVisible(false);
				panel_home.setVisible(false);
				panel_liv.setVisible(false);
				panel_2.setVisible(false);
				panel_livraison.setVisible(false);
				panel_mis_a_jour.setVisible(false);
				panel_fournisseurs.setVisible(true);
			
				
				
				try {
					PreparedStatement pst = cnx.prepareStatement("select numf as 'N° fournisseur',num_contract as 'N° contrat',adr as 'Adresse',tel as 'N° de telephone',nomf as 'Nom fournisseur' from fournisseur ");
					ResultSet rs = pst.executeQuery();
					table_2.setModel(DbUtils.resultSetToTableModel(rs));
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				if(Etat!=4) {
					lblFournisseur_.setBackground(SystemColor.control);
				}
//				if(EtatP==0) {
//				panel.setBounds(20, 182, 168, 365);
//				lblFournisseur_.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\button (52).png"));
//				lblFournisseur_.setBounds(0, 170, 161, 52);
//				lblFournisseur.setBounds(0, 170, 62, 52);
//				
//				lblEtatStock.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\button (20).png"));
//				lblEtatStock.setBounds(0, 11, 161, 52);
//				
//				lblLivraison.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\button (27).png"));
//				lblLivraison.setBounds(0, 64, 161, 52);
//				
//				lblMaj.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\button (45).png"));
//				lblMaj.setBounds(0, 117, 161, 52);
//				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(Etat!=4) {
				lblFournisseur_.setBackground(SystemColor.controlHighlight);
				}
				}
		});
		lblFournisseur_.setIcon(new ImageIcon("icons\\UIHere (1).png"));
		lblFournisseur_.setHorizontalAlignment(SwingConstants.CENTER);
		lblFournisseur_.setBounds(0, 156, 171, 52);
		panel.add(lblFournisseur_);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(169, 11, 876, 548);
		
		
		
		panel_1 = new JPanel();
		panel_1.setVisible(false);
		panel_1.setBorder(null);
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(366, 35, 321, 64);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewBtn = new JLabel("");
		lblNewBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblNewBtn.setBackground(SystemColor.control);
				lblNew.setBackground(SystemColor.control);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblNewBtn.setBackground(Color.LIGHT_GRAY);
				lblNew.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(panel_Etat_Stock.isVisible()) {
					Insertion_Stock.main(null);
					PreparedStatement pst;
					try {
						pst = cnx.prepareStatement("select idEtat_stock as 'Num Stock',idarticle as 'ID Article',quantite_article as 'Quantité',date_acquisition as 'Date d''acquisition' from etat_stock");
						 ResultSet rs= pst.executeQuery();
						    table.setModel(DbUtils.resultSetToTableModel(rs));
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				  
				}
				if(panel_livraison.isVisible()) {
					JOptionPane.showMessageDialog(contentPane, "Vous n'avez pas les droits necessaire pour réaliser cette action !", "ERREUR DROITS MANQUANTS !", JOptionPane.ERROR_MESSAGE);
				}
				if(panel_fournisseurs.isVisible()) {
					Insertion_fournisseur.main(null);
					PreparedStatement pst;
					try {
						pst = cnx.prepareStatement("select numf as 'N° fournisseur',num_contract as 'N° contrat',adr as 'Adresse',tel as 'N° de telephone',nomf as 'Nom fournisseur' from fournisseur");
						 ResultSet rs= pst.executeQuery();
						    table.setModel(DbUtils.resultSetToTableModel(rs));
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBackground(Color.GRAY);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(317, 9, 2, 45);
		panel_1.add(separator);
		
		JLabel lblInfo = new JLabel("INFO");
		lblInfo.setBackground(Color.LIGHT_GRAY);
		lblInfo.setOpaque(true);
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblInfo.setBounds(155, 41, 50, 23);
		panel_1.add(lblInfo);
		
		JLabel lblEdit = new JLabel("EDIT");
		lblEdit.setBackground(Color.LIGHT_GRAY);
		lblEdit.setOpaque(true);
		lblEdit.setHorizontalAlignment(SwingConstants.CENTER);
		lblEdit.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblEdit.setBounds(104, 41, 50, 23);
		panel_1.add(lblEdit);
		
		JLabel lblDelete = new JLabel("DELETE");
		lblDelete.setBackground(Color.LIGHT_GRAY);
		lblDelete.setOpaque(true);
		lblDelete.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblDelete.setHorizontalAlignment(SwingConstants.CENTER);
		lblDelete.setBounds(53, 41, 50, 23);
		panel_1.add(lblDelete);
		lblNew.setBackground(Color.LIGHT_GRAY);
		lblNew.setOpaque(true);
		
		
		lblNew.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblNew.setHorizontalAlignment(SwingConstants.CENTER);
		lblNew.setBounds(2, 41, 50, 23);
		panel_1.add(lblNew);
		lblNewBtn.setBackground(Color.LIGHT_GRAY);
		lblNewBtn.setOpaque(true);
		lblNewBtn.setIcon(new ImageIcon("icons\\file (2).png"));
		lblNewBtn.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewBtn.setBounds(2, 0, 50, 42);
		panel_1.add(lblNewBtn);
		
		JLabel lblDeleteBtn = new JLabel("");
		lblDeleteBtn.setBackground(Color.LIGHT_GRAY);
		lblDeleteBtn.setOpaque(true);
		lblDeleteBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblDeleteBtn.setBackground(SystemColor.control);
				lblDelete.setBackground(SystemColor.control);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblDeleteBtn.setBackground(Color.LIGHT_GRAY);
				lblDelete.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(panel_Etat_Stock.isVisible() && table.isRowSelected(table.getSelectedRow())) {
					int response = JOptionPane.showConfirmDialog(contentPane,"Etes-vous sur de vouloir supprimer cet enregistrement ?","Confirmation de suppression ",JOptionPane.YES_NO_CANCEL_OPTION);
					if(response==JOptionPane.YES_OPTION) {
						
					int Dvalue = (int)table.getValueAt(table.getSelectedRow(), 1);
					try {
						PreparedStatement ps = cnx.prepareStatement("Delete from etat_stock where idarticle=?");
						ps.setInt(1, Dvalue);
					    ps.executeUpdate();
					    
					    PreparedStatement pst = cnx.prepareStatement("select idEtat_stock as 'Num Stock',idarticle as 'ID Article',quantite_article as 'Quantité',date_acquisition as 'Date d''acquisition' from etat_stock");
					    ResultSet rs;
						rs = pst.executeQuery();
						table.setModel(DbUtils.resultSetToTableModel(rs));
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
					}else {
				if(panel_livraison.isVisible()) {
					JOptionPane.showMessageDialog(contentPane, "Vous n'avez pas les droits necessaire pour réaliser cette action !", "ERREUR DROITS MANQUANTS !", JOptionPane.ERROR_MESSAGE);
				}else {
					if(panel_fournisseurs.isVisible() && table_2.isRowSelected(table_2.getSelectedRow())) {
						int response = JOptionPane.showConfirmDialog(contentPane,"Etes-vous sur de vouloir supprimer cet enregistrement ?","Confirmation de suppression ",JOptionPane.YES_NO_CANCEL_OPTION);
						if(response==JOptionPane.YES_OPTION) {
							
						int Dvalue = (int)table_2.getValueAt(table_2.getSelectedRow(), 0);
						try {
							PreparedStatement ps = cnx.prepareStatement("Delete from fournisseur where numf=?");
							ps.setInt(1, Dvalue);
						    ps.executeUpdate();
						    
						    PreparedStatement pst = cnx.prepareStatement("select numf as 'N° fournisseur',num_contract as 'N° contrat',adr as 'Adresse',tel as 'N° de telephone',nomf as 'Nom fournisseur' from fournisseur");
						    ResultSet rs;
							rs = pst.executeQuery();
							table_2.setModel(DbUtils.resultSetToTableModel(rs));
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						}
						}else {
					JOptionPane.showMessageDialog(contentPane, "Veuillez selectionner une ligne !", "ERREUR !", JOptionPane.ERROR_MESSAGE);
						}
				}
					}
			}
		});
		lblDeleteBtn.setIcon(new ImageIcon("icons\\file (3).png"));
		lblDeleteBtn.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeleteBtn.setBounds(53, 0, 50, 42);
		panel_1.add(lblDeleteBtn);
		
		JLabel lblEditBtn = new JLabel("");
		lblEditBtn.setBackground(Color.LIGHT_GRAY);
		lblEditBtn.setOpaque(true);
		lblEditBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblEditBtn.setBackground(SystemColor.control);
				lblEdit.setBackground(SystemColor.control);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblEditBtn.setBackground(Color.LIGHT_GRAY);
			    lblEdit.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(panel_Etat_Stock.isVisible() && table.isRowSelected(table.getSelectedRow())) {
				Edit_Stock.main(null);
				String s =(String)table.getValueAt(table.getSelectedRow(), 3);
				Edit_Stock.textField_3.setText(""+s);
				int a =(int)table.getValueAt(table.getSelectedRow(), 0);
				Edit_Stock.textField.setText(""+a);
				a=(int)table.getValueAt(table.getSelectedRow(), 1);
				Edit_Stock.textField_1.setText(""+a);
				double b=(double)table.getValueAt(table.getSelectedRow(), 2);
				Edit_Stock.textField_2.setText(""+b);
				
				}else {if(panel_fournisseurs.isVisible() && table_2.isRowSelected(table_2.getSelectedRow())) {
					Edit_fournisseur.main(null);
					
					Edit_fournisseur.textField.setText(""+(int)table_2.getValueAt(table_2.getSelectedRow(),0));
					
					Edit_fournisseur.textField_1.setText(""+(String)table_2.getValueAt(table_2.getSelectedRow(),1));
					
					Edit_fournisseur.textField_2.setText(""+(String)table_2.getValueAt(table_2.getSelectedRow(),2));
		
					Edit_fournisseur.textField_3.setText(""+(int)table_2.getValueAt(table_2.getSelectedRow(), 3));
					
					Edit_fournisseur.textField_4.setText(""+(String)table_2.getValueAt(table_2.getSelectedRow(), 4));
					
				}else {if(panel_livraison.isVisible()) {
					JOptionPane.showMessageDialog(contentPane, "Vous n'avez pas les droits necessaire pour réaliser cette action !", "ERREUR DROITS MANQUANTS !", JOptionPane.ERROR_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(contentPane, "Veuillez selectionner une ligne !", "ERREUR !", JOptionPane.ERROR_MESSAGE);
				}
				}
				
				
			}
			}
		});
		lblEditBtn.setIcon(new ImageIcon("icons\\file (4).png"));
		lblEditBtn.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditBtn.setBounds(104, 0, 50, 42);
		panel_1.add(lblEditBtn);
		
		JLabel lblInfoBtn = new JLabel("");
		lblInfoBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				lblInfoBtn.setBackground(SystemColor.control);
				lblInfo.setBackground(SystemColor.control);
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				lblInfoBtn.setBackground(Color.LIGHT_GRAY);
				lblInfo.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(panel_livraison.isVisible()) {
				if(table_1.isRowSelected(table_1.getSelectedRow())) {
					Details.main(null);
				}else {
					JOptionPane.showMessageDialog(contentPane, "Veuillez selectionner un bon !", "ERREUR !", JOptionPane.ERROR_MESSAGE);
					}
			}else {
				if(panel_fournisseurs.isVisible()) {
					if(table_2.isRowSelected(table_2.getSelectedRow())) {
						Info_fournisseur.main(null);
					}else {
						JOptionPane.showMessageDialog(contentPane, "Veuillez selectionner un bon !", "ERREUR !", JOptionPane.ERROR_MESSAGE);
						}
			}
			
			}
			if(panel_2.isVisible()) {
				if(table_4.isRowSelected(table_4.getSelectedRow())) {
					articleajouter2();
					panel_Etat_Stock.setVisible(false);
					panel_home.setVisible(false);
					panel_liv.setVisible(true);
					panel_2.setVisible(false);
					panel_livraison.setVisible(false);
					panel_mis_a_jour.setVisible(false);
					panel_fournisseurs.setVisible(false);
					converte();
				}
			}
			}
		});
		lblInfoBtn.setIcon(new ImageIcon("icons\\information.png"));
		lblInfoBtn.setOpaque(true);
		lblInfoBtn.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfoBtn.setBackground(Color.LIGHT_GRAY);
		lblInfoBtn.setBounds(155, 0, 50, 42);
		panel_1.add(lblInfoBtn);
		
		JLabel lblPrintBtn = new JLabel("");
		lblPrintBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				lblPrintBtn.setBackground(SystemColor.control);
				lblPrint.setBackground(SystemColor.control);
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				lblPrintBtn.setBackground(Color.LIGHT_GRAY);
				lblPrint.setBackground(Color.LIGHT_GRAY);
			}
		});
		lblPrintBtn.setIcon(new ImageIcon("icons\\print.png"));
		lblPrintBtn.setOpaque(true);
		lblPrintBtn.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrintBtn.setBackground(Color.LIGHT_GRAY);
		lblPrintBtn.setBounds(206, 0, 50, 42);
		panel_1.add(lblPrintBtn);
		
	
		lblPrint.setBackground(Color.LIGHT_GRAY);
		lblPrint.setOpaque(true);
		lblPrint.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrint.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPrint.setBounds(206, 41, 50, 23);
		panel_1.add(lblPrint);
		
		JLabel lblRefresh = new JLabel("");
		lblRefresh.setIcon(new ImageIcon("icons\\refresh.png"));
		lblRefresh.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				lblRefresh.setBackground(SystemColor.control);
				lblRefresh_1.setBackground(SystemColor.control);
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				lblRefresh.setBackground(Color.LIGHT_GRAY);
				lblRefresh_1.setBackground(SystemColor.controlHighlight);
			}
		});
		lblRefresh.setOpaque(true);
		lblRefresh.setHorizontalAlignment(SwingConstants.CENTER);
		lblRefresh.setBackground(Color.LIGHT_GRAY);
		lblRefresh.setBounds(257, 0, 50, 42);
		panel_1.add(lblRefresh);
		
		
		lblRefresh_1.setOpaque(true);
		lblRefresh_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRefresh_1.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblRefresh_1.setBackground(Color.LIGHT_GRAY);
		lblRefresh_1.setBounds(257, 41, 50, 23);
		panel_1.add(lblRefresh_1);
		
		Thread clock=new Thread() {
			public void run () {
				try {
					
					
					for(;;) {
					Calendar cal=new GregorianCalendar();
					int day=cal.get(Calendar.DAY_OF_MONTH);
					int month =cal.get(Calendar.MONTH)+1;
					int year=cal.get(Calendar.YEAR);
					int second =cal.get(Calendar.SECOND);
					int minute =cal.get(Calendar.MINUTE);
					int hour=cal.get(Calendar.HOUR);
					//String kk=cal.get(ABORT);
					
					//DateFormat date =new SimpleDateFormat("hh:mm:ss aa");
					//String d=date.format(new Date(hour, hour, hour)).toString();
					l1.setText(""+hour+":"+minute+":"+second);
					l2.setText(""+year+"-"+month+"-"+day);
					sleep(1000);
			
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		
		clock.start();
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setVisible(false);
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				lblNewLabel_2.setBackground(SystemColor.WHITE);
				
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				lblNewLabel_2.setBackground(SystemColor.GRAY);
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				layeredPane.setBounds(98, 99, 973, 553);
				panel.setVisible(false);
			    panel_1.setVisible(false);
			    lblNewLabel_13.setVisible(true);
			    lblNewLabel_13.setFont(new Font("Century Gothic", Font.BOLD, 38));
			    lblNewLabel_13.setText("GESTIONNAIRE DE STOCK");
			    lblNewLabel_2.setVisible(false);
			    
				lblEtatStock.setBackground(SystemColor.controlHighlight);
				lblLivraison.setBackground(SystemColor.controlHighlight);
				lblMaj.setBackground(SystemColor.controlHighlight);
				lblFournisseur_.setBackground(SystemColor.controlHighlight);
				
				panel_Etat_Stock.setVisible(false);
				panel_home.setVisible(true);
				panel_2.setVisible(false);
				panel_liv.setVisible(false);
				panel_livraison.setVisible(false);
				panel_mis_a_jour.setVisible(false);
				panel_fournisseurs.setVisible(false);
		
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lblNewLabel_2.setBackground(SystemColor.GRAY);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_2.setBackground(SystemColor.DARK_GRAY);
			}
});
		lblNewLabel_2.setBackground(Color.DARK_GRAY);
		lblNewLabel_2.setBorder(null);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon("icons\\home.png"));
		lblNewLabel_2.setBounds(10, 99, 171, 70);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 11, 101, 81);
		contentPane.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("icons\\Sans titre-1 (1).png"));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(null);
		panel_1_1.setBackground(Color.LIGHT_GRAY);
		panel_1_1.setBounds(686, 35, 385, 64);
		contentPane.add(panel_1_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("");
		lblNewLabel_9_1.setBounds(334, 0, 51, 64);
		panel_1_1.add(lblNewLabel_9_1);
		lblNewLabel_9_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblNewLabel_9_1.setBackground(SystemColor.controlShadow);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_9_1.setBackground(SystemColor.GRAY);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lblNewLabel_9_1.setBackground(SystemColor.WHITE);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblNewLabel_9_1.setBackground(SystemColor.GRAY);
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				int reponse = JOptionPane.showConfirmDialog(contentPane, "Etes-vous sur de vouloir vous déconnectez ?", "Deconnexion", JOptionPane.YES_NO_CANCEL_OPTION);
				
				if(reponse==JOptionPane.YES_OPTION){
					dispose();
					Login_gmao.main(null);
				}
			}
		});
		lblNewLabel_9_1.setBackground(Color.GRAY);
		lblNewLabel_9_1.setOpaque(true);
		lblNewLabel_9_1.setIcon(new ImageIcon("icons\\arrow.png"));
		lblNewLabel_9_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_11.setText(Login_gmao.txtUsername.getText());
		lblNewLabel_11.setForeground(new Color(0, 0, 102));
		lblNewLabel_11.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNewLabel_11.setBounds(123, 0, 201, 23);
		panel_1_1.add(lblNewLabel_11);
		
		lblNewLabel_11_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewLabel_11_1.setBounds(123, 23, 201, 23);
		panel_1_1.add(lblNewLabel_11_1);
		
		lblNewLabel_11_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewLabel_11_1_1.setBounds(123, 46, 201, 18);
		panel_1_1.add(lblNewLabel_11_1_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(Color.GRAY);
		separator_1.setBackground(Color.GRAY);
		separator_1.setBounds(111, 9, 2, 45);
		panel_1_1.add(separator_1);
		
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		l1.setBounds(10, 9, 96, 23);
		panel_1_1.add(l1);
		
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setFont(new Font("Century Gothic", Font.BOLD, 14));
		l2.setBounds(10, 32, 96, 23);
		panel_1_1.add(l2);
		
		lblNewLabel_13 = new JLabel("GESTIONNAIRE DE STOCK");
		lblNewLabel_13.setFont(new Font("Century Gothic", Font.BOLD, 38));
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setBounds(111, 11, 630, 77);
		contentPane.add(lblNewLabel_13);
		
		
	}
}
