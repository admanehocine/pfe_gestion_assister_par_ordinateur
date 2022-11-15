

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.io.File;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;

import keeptoo.KGradientPanel;
import net.proteanit.sql.DbUtils;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import javax.swing.JCheckBox;
import javax.swing.JDialog;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;
import javax.swing.DefaultListModel;
import javax.swing.DropMode;
import javax.swing.JList;
import com.toedter.components.JSpinField;


public class chef_service1 extends JFrame {
	private JTextArea texte;
	private int i=0;
	private JDateChooser r1,r2;
	private JLabel a3;
	private JPanel e3;
	private double hb20=0,hb21=0; 
	private String hb6=null,hb1=null,hb2=null,hb3=null,hb4=null,hb5=null,hb7=null,hb8=null,hb9=null,hb10=null,hb11=null,hb19=null;
	@SuppressWarnings("unused")
	private String kle,var ,id1,id2,id22=null,id45=null,kilo ,id21,id23=null,id11;
    private JLabel l1,l2;
	private JPanel pan19 ,contentPane;
	private JLayeredPane layeredPane;	
      private int t,m;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chef_service1 frame = new chef_service1();
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
	Connection cnx=null;
	ResultSet rs=null;
	PreparedStatement pr=null;
	Statement pr1=null;
	private String cle;
	JTextArea fx3;
	private JPanel pan4;
	private JPanel pan5;
	private JButton btnNewButton;
	//DefaultListModel dn=new DefaultListModel();
	Statement s=null;
	private JTable table_8;
	private JTable table_9;
	private JTextField fx1;
	private JTextField fx2;
	private JTextField fx5;
	private JTable table_6;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void articleajouter() {//as 'numero rapport'   as 'numero chef service ' , ouvrier_id as'numero reparateur' 
		
		String sql=" select idarticle,article_numero_serie,taille"
				+ ",poids,couleur , quantite , prix_unitaire , mantont from bon_commande WHERE id_bon_commande='"+fx1.getText()+"'";
		                                                                                                                                                                    
		
		try {
			pr=cnx.prepareStatement(sql);
			rs=pr.executeQuery();
		table_8.setModel(DbUtils.resultSetToTableModel(rs));
			
		
		JTableHeader theader=table_8.getTableHeader();
		theader.setBackground(Color.gray);
		theader.setForeground(Color.black);
		theader.setFont(new Font("tahome",Font.BOLD,16));
		table_8.setFont(new Font("tahome",Font.BOLD,12));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
					}
	}

	
	public void selectbon() {//as 'numero rapport'   as 'numero chef service ' , ouvrier_id as'numero reparateur' 
		
		String sql=" select boncommande.id_bon_commande as 'N° Bon',idservice as 'N°Service'"
				+ " from boncommande WHERE idmagasinier='"+123+"' and id_chef_service='"+null+"'";//login.idchefservice()
		                                                                                                                                                                    
		
		try {
			pr=cnx.prepareStatement(sql);
			rs=pr.executeQuery();
		table_6.setModel(DbUtils.resultSetToTableModel(rs));
			
		
		JTableHeader theader=table_6.getTableHeader();
		theader.setBackground(Color.gray);
		theader.setForeground(Color.black);
		theader.setFont(new Font("tahome",Font.BOLD,16));
		table_6.setFont(new Font("tahome",Font.BOLD,12));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
					}
	}
	public void selectarticle() {//as 'numero rapport'   as 'numero chef service ' , ouvrier_id as'numero reparateur' 
		
		String sql="select idarticle  ,numero_serie "
				+ ", taille , poids , couleur , prix_unitaire ,"
				+ "date_acquisition , date_experimentation , dure_vie_moyenne ,conditionnement "
				+ "concepteur , libelle from article ";
				//+ "idarticle , numero_serie ,taille, poids , couleur, prix_unitaire,date_acquisition,date_experimentation"
				//+ "dure_vie_moyenne,conditionnement,concepteur,libelle from article";
		                                                                                                                                                                    
		
		try {
			pr=cnx.prepareStatement(sql);
			rs=pr.executeQuery();
		table_9.setModel(DbUtils.resultSetToTableModel(rs));
			
		
		JTableHeader theader=table_9.getTableHeader();
		theader.setBackground(Color.gray);
		theader.setForeground(Color.black);
		theader.setFont(new Font("tahome",Font.BOLD,16));
		table_9.setFont(new Font("tahome",Font.BOLD,12));
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
		 texte.setText(texte.getText()+"\n\n\n\n\n\t\t\t");
				 texte.setText(texte.getText()+"N° "+fx1.getText().toString());
				 texte.setText(texte.getText()+"\n\n\t\t\t");
				 texte.setText(texte.getText()+"Date de création:"+l2.getText().toString()+".");
				 texte.setText(texte.getText()+"\n\n\n\n\n");
				 texte.setText(texte.getText()+"Déscription :"+fx3.getText().toString()+".");
				 texte.setText(texte.getText()+"\n\n");
				 texte.setText(texte.getText()+"N°Article"+"\t"+"N°Serie"+"\t "+"Taille"+"\t"+"Poids"+"\t"+"Couleur"+"\t"+"Quantité"+"\t"+"Prix Unitaire"+"\t"+"Montant");
				 texte.setText(texte.getText()+"\n");
		DefaultTableModel mod =(DefaultTableModel) table_8.getModel();
		int row=mod.getRowCount();
		int col=mod.getColumnCount();
		Object [][] tab=new Object  [row][col];
		for(int k=0;k<row;k++) {
			for(int j=0;j<col;j++) {
			tab[k][j]=mod.getValueAt(k, j);
			texte.setText(texte.getText()+tab[k][j]+"\t");
		}
		texte.setText(texte.getText()+"\n");
			}
		texte.setText(texte.getText()+"\n\n\t\t\t\t\t\t");
		 texte.setText(texte.getText()+"Totale "+hb21 +" DA.");
		texte.setText(texte.getText()+"\n\n\n\n\n\t\t\t");
		 texte.setText(texte.getText()+"Le magasinier : "+"admane hocine"+".");//login.nom_chefservice();
		 texte.setText(texte.getText()+" \n\n\n\t\t\t\t Signature:");
	}
public ResultSet  recherche_magasinier(String d) {
		d="2112";
		String p="";
		String  sql="SELECT * from magasinier , navire ,chef_service where navire.id_commandont="
				+ "chef_service.id_commandont and chef_service.numch='"+d+"'";
		try {
			pr=cnx.prepareStatement(sql);
			rs=pr.executeQuery();
				

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
					}
		return rs;
		
		
	}
	
	public chef_service1() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1405, 746);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		KGradientPanel gradientPanel = new KGradientPanel();
		 layeredPane = new JLayeredPane();
		layeredPane.setBounds(288, 86, 1072, 610);
		gradientPanel.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		cnx=connexion.connecter();
		
		pan5 = new JPanel();
		pan5.setBackground(new Color(176, 224, 230));
		layeredPane.add(pan5, "name_140683561765200");
		pan5.setLayout(null);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(302, 92, 657, 408);
		pan5.add(scrollPane_7);
		
		table_6 = new JTable(){
			 public boolean isCellEditable(int d,int c) {
				 return false;
			 }
		 };
		table_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int ligne= table_6.getSelectedRow();

				
				 fx1.setText(table_6.getModel().getValueAt(ligne, 0).toString());


			
			}
		});
		scrollPane_7.setViewportView(table_6);
		
		JButton btnNewButton_1 = new JButton("Supprimer");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fx1.getText().toString().length()<=0) {	JOptionPane.showMessageDialog(null, "veuillez selectionné un bon ");
					
				}else {
				String sql1=" delete from boncommande where  id_chef_service = ? and id_bon_commande=? ";
				try {
					pr=cnx.prepareStatement(sql1);
					pr.setString(1,"2112");//login.idchef();
				    pr.setString(2,fx1.getText().toString());
					pr.execute();
					selectbon();
					String sql12=" delete from bon_commande where   id_bon_commande=? ";
					try {
						pr=cnx.prepareStatement(sql12);
						
					    pr.setString(1,fx1.getText().toString());
						
						pr.execute();
						fx1.setText(null);
		} catch (SQLException e1) {
						e1.printStackTrace();
				
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
			
				}
				}
				try {
					JOptionPane.showMessageDialog(null,""+recherche_magasinier("2112").getString("idmagasinier"));
				} catch (HeadlessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_1.setBounds(340, 534, 126, 31);
		pan5.add(btnNewButton_1);
		
		JButton btnAjouter_6 = new JButton("Ajouter");
		btnAjouter_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(pan4);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnAjouter_6.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD | Font.ITALIC, 12));
		btnAjouter_6.setBounds(608, 534, 126, 31);
		pan5.add(btnAjouter_6);
		Font f =new Font("Arial",Font.BOLD,15);
		
		JButton btnAnnuler = new JButton("annuler");
		btnAnnuler.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\add\\IMAGE_ICON\\delete.png"));
		btnAnnuler.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//te.setVisible(false);
			/***area.setText(null);
             
			
			area.setText("\r\n                       \t\t  Bon de commande\r\n\r\nD\u00E9scription:\n\n\n"
					
					);
					
			}
		});
		btnAnnuler.setBounds(782, 441, 160, 50);
		pan5.add(btnAnnuler);
		
		btnNewButton = new JButton("g\u00E9rer le bon");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\add\\IMAGE_ICON\\briefcase.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				if(te.getText().toString().equals(""))
				{
					JOptionPane.showMessageDialog(null, "veuiller premierement taper une description pour se bon de commande ");
				}else {
					
					
					if(i==0) {
						area.setText(area.getText()+" "+kle+"\n\n\n"
					
								+ "id article"+"\t"+"poids"+"\t"+"taille"+"\t"+"couleur"+"\t"+"type"+"\t"+"quantite"
								);
						i++;
					te.setVisible(false);
					d.setVisible(false);
					
					layeredPane.removeAll();
				layeredPane.add(pan6);
				layeredPane.repaint();
				layeredPane.revalidate();	
			article();}else {te.setVisible(false);
			d.setVisible(false);
			
			layeredPane.removeAll();
		layeredPane.add(pan6);
		layeredPane.repaint();
		layeredPane.revalidate();	
	article();
				
			}
			}**/}
		});
		//btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		//btnNewButton.setBounds(782, 280, 160, 50);
		//pan5.add(btnNewButton);
		
		 pan19 = new JPanel();
		layeredPane.add(pan19, "name_256164520312900");
		pan19.setLayout(null);
		pan19.setForeground(new Color(176, 224, 230));
		pan19.setBackground(new Color(176, 224, 230));
		
		JButton btnAjouter_5 = new JButton("Ajouter");
		btnAjouter_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
if(fx5.getText().toString().length()<=0) {	JOptionPane.showMessageDialog(null,"vous devez taper la quantité d'article") ;
	
}else {
				
				String sql="  insert into bon_commande ( id_bon_commande,"
		                              + "idarticle "
		                              + ",article_numero_serie"
		                              + ",date_acquisition"
		                              + ",date_expermentation"
		                              + ",dure_vie_moyenne"
		                              + ",concepteur"
		                              + ",conditionnement"
		                              + ",libelle"
		                              + ",poids"
		                              + ",taille"
		                              + ",quantite"
		                              + ",couleur ,prix_unitaire,mantont)"
		                              + " values (?, ? , ? , ? , ?, ? , ? , ? , ? , ? , ? , ? , ? ,?,?  )";
 				try {
 					pr=cnx.prepareStatement(sql);
 						//String k=x1.getText().toString();
 						pr.setString(1,fx1.getText());
 						//String k2=x2.getText().toString();
 						pr.setString(2,hb1);
 						//String k2e=x3.getText().toString();
 						pr.setString(3,hb2);
 						SimpleDateFormat date =new SimpleDateFormat("yyyy-MM-dd");
 						String k3=date.format(r1.getDate());
 						pr.setString(4,k3);
 						//SimpleDateFormat date =new SimpleDateFormat("yyyy-MM-dd");
 						String erk3=date.format(r2.getDate());
 						pr.setString(5,erk3);
 						//String k4=x6.getText().toString();
 						pr.setString(6,hb9);
 						//String k5=x7.getText().toString();
 						pr.setString(7,hb10);
 						//String k6=x8.getText().toString();
 						pr.setString(8,hb11);
 						//String kla=x9.getText().toString();
 						pr.setString(9,hb3);
 						//String k8=x10.getText().toString();
 						pr.setString(10,hb2);					
 						//String k8ez=x11.getText().toString();
 						pr.setString(11,hb4);					
 						//String k8x=x12.getText().toString();
 						pr.setString(12,fx5.getText());
 						pr.setString(13,hb5);
 						pr.setString(14,hb6);
 						//double k=hb6+fx5.getText();
 						
 					     hb20=Double.parseDouble(fx5.getText().toString())*Double.parseDouble(hb6);
 					    hb21=hb21+hb20;
 						pr.setDouble(15, hb20);
		 								
 						fx5.setText(null);//pr.setString(8,Logine.getCle_chef());
 								pr.execute();
 								//JOptionPane.showMessageDialog(null,"Reparateur ajouter") ;
 		
 								articleajouter();
            	}
 					catch (SQLException ez) {
 						JOptionPane.showMessageDialog(null,"cette article existe déja dans ce bon  !!");
 						ez.printStackTrace();
 						}			
}	}
		});
		btnAjouter_5.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		btnAjouter_5.setBounds(435, 437, 120, 45);
		pan19.add(btnAjouter_5);
		
		JButton btnNewButton_2 = new JButton("Imprimer");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//DefaultTableModel model=(DefaultTableModel) table_8.getModel();
				/***MessageFormat header =new MessageFormat("BON DE COMMANDE");
				MessageFormat footer =new MessageFormat("page[0,number,integer]");
				*/
		if(table_8.getRowCount()==0) {
			JOptionPane.showMessageDialog(null,"veuillez remplire minimum un article") ;
		}else {
				try {
					converte();
					texte.print();
					
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}}
			}
		});
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnNewButton_2.setBounds(219, 439, 124, 42);
		pan19.add(btnNewButton_2);
		
		JScrollPane scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(0, 0, 4, 3);
		pan19.add(scrollPane_8);
		
		table_8 = new JTable();
		scrollPane_8.setViewportView(table_8);
		
		JScrollPane scrollPane_9 = new JScrollPane();
		scrollPane_9.setBounds(10, 14, 1052, 247);
		pan19.add(scrollPane_9);
		
		table_9 = new JTable(){
			 public boolean isCellEditable(int d,int c) {
				 return false;
			 }
		 };
		table_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					
					int ligne= table_9.getSelectedRow();
					//t9.setText(null);
					
					// t8.setText(table.getModel().getValueAt(ligne, 0).toString());
					  hb1=table_9.getModel().getValueAt(ligne, 0).toString();
					  hb2=table_9.getModel().getValueAt(ligne, 1).toString();
					  hb3=table_9.getModel().getValueAt(ligne, 2).toString();
					  hb4=table_9.getModel().getValueAt(ligne, 3).toString();
					  hb5=table_9.getModel().getValueAt(ligne, 4).toString();
					  hb6=table_9.getModel().getValueAt(ligne, 5).toString();
					  hb9=table_9.getModel().getValueAt(ligne, 8).toString();
					  hb10=table_9.getModel().getValueAt(ligne, 9).toString();
					  hb11=table_9.getModel().getValueAt(ligne, 10).toString();
					 // hb12=table_9.getModel().getValueAt(ligne, 11).toString();
					  hb19=table_9.getModel().getValueAt(ligne, 5).toString();
					  
					 //id2= table.getModel().getValueAt(ligne, 7).toString();
					 //t7.setText(table.getModel().getValueAt(ligne, 7).toString());
					// t1.setText(table.getModel().getValueAt(ligne, 1).toString());
					 //t2.setText(table.getModel().getValueAt(ligne, 2).toString());
					// t4.setText("0"+table.getModel().getValueAt(ligne, 4).toString());
					 //t5.setText(table.getModel().getValueAt(ligne, 5).toString());
					 //t6.setText(table.getModel().getValueAt(ligne, 6).toString());
					 table_9.setSelectionBackground(Color.getColor("a", Color.getHSBColor(520, 50, 50)));
					 table_9.setSelectionForeground(Color.BLACK);
					DefaultTableModel model=(DefaultTableModel) table_9.getModel();
					Date date = new SimpleDateFormat("yyyy-mm-dd").parse((String) model.getValueAt(ligne, 6).toString());
					
					r1.setDate(date);
					Date date1 = new SimpleDateFormat("yyyy-mm-dd").parse((String) model.getValueAt(ligne, 7).toString());
					r2.setDate(date);
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					
				}		

			}
		});
		scrollPane_9.setViewportView(table_9);
		
		JScrollPane scrollPane_10 = new JScrollPane();
		scrollPane_10.setBounds(20, 298, 4, 3);
		pan19.add(scrollPane_10);
		
		 texte = new JTextArea();
		 
		  
		
		
		 
		 
		 scrollPane_10.setViewportView(texte);
		
		fx5 = new JTextField();
		fx5.setBounds(284, 314, 177, 34);
		pan19.add(fx5);
		fx5.setColumns(10);
		
		 r1 = new JDateChooser();
		r1.setBounds(878, 283, 4, 3);
		pan19.add(r1);
		
	 r2 = new JDateChooser();
		r2.setBounds(985, 320, 4, 3);
		pan19.add(r2);
		
		JLabel lblQuantit = new JLabel("Quantit\u00E9");
		lblQuantit.setFont(new Font("Dubai Medium", Font.BOLD | Font.ITALIC, 14));
		lblQuantit.setBounds(165, 314, 130, 34);
		pan19.add(lblQuantit);
		
		pan4 = new JPanel();
		pan4.setBackground(new Color(176, 224, 230));
		layeredPane.add(pan4, "name_121817075301600");
		pan4.setLayout(null);
		
		fx1 = new JTextField();
		fx1.setBounds(101, 89, 238, 31);
		pan4.add(fx1);
		fx1.setColumns(10);
		
		fx2 = new JTextField();
		fx2.setBounds(576, 89, 238, 31);
		pan4.add(fx2);
		fx2.setColumns(10);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(306, 265, 334, 171);
		pan4.add(scrollPane_6);
		
		 fx3 = new JTextArea();
		scrollPane_6.setViewportView(fx3);
		
		JLabel lblNBonDe = new JLabel("N\u00B0 Bon de Livraison");
		lblNBonDe.setFont(new Font("Microsoft YaHei Light", Font.BOLD | Font.ITALIC, 14));
		lblNBonDe.setBounds(137, 45, 163, 33);
		pan4.add(lblNBonDe);
		
		JLabel lblNService = new JLabel("N\u00B0 Service");
		lblNService.setFont(new Font("Microsoft YaHei Light", Font.BOLD | Font.ITALIC, 14));
		lblNService.setBounds(611, 45, 163, 33);
		pan4.add(lblNService);
		
		JLabel lblDscription = new JLabel("D\u00E9scription");
		lblDscription.setFont(new Font("Microsoft YaHei Light", Font.BOLD | Font.ITALIC, 14));
		lblDscription.setBounds(382, 221, 163, 33);
		pan4.add(lblDscription);
		
		JButton btnValider_1 = new JButton("Valider");
		btnValider_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
if(fx1.getText().toString().length()<=0 && fx2.getText().toString().length()<=0 && fx3.getText().toString().length()<=0) {
	JOptionPane.showMessageDialog(null,"vous devez remplire touts les champs vide   !!");
}else {
String sql="  insert into boncommande ( id_bon_commande,"
		                              + "id_chef_service "
		                              + ",idservice"
		                              + ",datecreation"
		                              + ",idmagasinier"
		                              + ",description)"
		                              + " values (?, ? , ? , ? , ?, ?   )";
 				try {
 					pr=cnx.prepareStatement(sql);
 						
 						pr.setString(1,fx1.getText());
 					
 						pr.setString(2,"2112");//login.getclechef();
 						
 						pr.setString(3,fx2.getText());
 						
 						pr.setString(4,l2.getText());//TEMPS
 						
 						pr.setString(5,"123");//idmagasinier
 						//String k4=x6.getText().toString();
 						pr.setString(6,fx3.getText());
 								pr.execute();
 								selectarticle();
 								layeredPane.removeAll();
 								layeredPane.add(pan19);
 								layeredPane.repaint();
 								layeredPane.revalidate();
 								
 				                				
 				}
 					catch (SQLException ez) {
 						JOptionPane.showMessageDialog(null,"ce numero de bon commande existe déja   !!"+recherche_magasinier("2112"));
 						ez.printStackTrace();
 						}					
				
}
				
			}
		});
		btnValider_1.setBounds(346, 503, 163, 42);
		pan4.add(btnValider_1);
		
		gradientPanel.kGradientFocus = 200;
		gradientPanel.kStartColor = new Color(51, 51, 255);
		gradientPanel.kEndColor = new Color(255, 51, 51);
		gradientPanel.setBounds(0, 0, 1370, 707);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
      ;
		//gradientPanel.add(pan8);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(10, 11, 279, 685);
		gradientPanel.add(panel);
		panel.setLayout(null);
		
    e3 = new JPanel();
		e3.setLayout(null);
		e3.setBackground(Color.BLACK);
		e3.setBounds(70, 103, 162, 35);
		panel.add(e3);
		
		 a3 = new JLabel("Bon de livraison");
		a3.setBounds(0, 0, 163, 35);
		e3.add(a3);
		a3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(pan5);
				layeredPane.repaint();
				layeredPane.revalidate();
			//	e6.setBackground(Color.black);
				e3.setBackground(Color.WHITE);
							selectarticle();
			selectbon();
			
			}
		});
		a3.setForeground(Color.WHITE);
		a3.setFont(new Font("MS Reference Sans Serif", Font.BOLD | Font.ITALIC, 13));
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBackground(new Color(102, 0, 0));
		panel_1.setBounds(286, 11, 1074, 76);
		gradientPanel.add(panel_1);
		panel_1.setLayout(null);
		
		 l1 = new JLabel("");
		l1.setForeground(new Color(255, 255, 255));
		l1.setFont(new Font("Microsoft YaHei UI", Font.BOLD | Font.ITALIC, 17));
		l1.setBounds(295, 22, 121, 30);
		panel_1.add(l1);
		
	 l2 = new JLabel("");
		l2.setForeground(new Color(255, 255, 255));
		l2.setFont(new Font("Microsoft YaHei UI", Font.BOLD | Font.ITALIC, 17));
		l2.setBounds(511, 22, 121, 30);
		panel_1.add(l2);
		
		JLabel lblNewLabel_1 = new JLabel("chef de service");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1.setBounds(758, 22, 205, 30);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\icons8-administrator-male-60.png"));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(1004, 11, 60, 54);
		panel_1.add(lblNewLabel_2);
		
		JLabel p12 = new JLabel("sign out");
		p12.setBounds(983, 76, 91, 30);
		panel_1.add(p12);
		p12.setFont(new Font("MS Reference Sans Serif", Font.BOLD | Font.ITALIC, 17));
		p12.setForeground(Color.RED);
		
		
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
		
			
	}
}
