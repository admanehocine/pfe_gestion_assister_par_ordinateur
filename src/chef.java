

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.io.File;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;

import keeptoo.KGradientPanel;
import net.proteanit.sql.DbUtils;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JSeparator;


public class chef extends JFrame {
	private int i=0;
	private JLabel a1,a2,a3,a4,a5,a6,a7;
	@SuppressWarnings("unused")
	private String kle,var ,id1,id2,id22=null,id45=null,kilo ,id21,id23=null,id11;
	private JPanel contentPane;
	private JLayeredPane layeredPane;	
	private JTable table;
    private JDateChooser t3;
    private JTextArea t5,t6;
    private int t,m;
    private static int Etat=0;
     /**
	 * Launch the application.
	 */
	private JPanel phome,p1,p2,p5;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chef frame = new chef();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
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
	private JTextField t9;
	private JTable table_2;
	private JTextField f9;
	private JLabel label_2;
	private JTextField t8;
	private JTextField t1;
	private JTextField t2;
	private JTextField t4;
	private JTextField t7;
	private JPanel pan;
	private JButton btnAjouter_3;
	private JButton btnOurner;
	private JPanel p8;
	private JPanel p4;
	private JTable table_3;
	private JPanel p7;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_7;
	private JPanel p7_1;
	private JPanel p1_1;
	private JScrollPane scrollPane_5;
	private JTable table_5;
	private JPanel p3;
	private JTable table_4;
	//DefaultListModel dn=new DefaultListModel();
	Statement s=null;
	private JTable table_7;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_11 = new JLabel();
	private JLabel lblNewLabel_11_1= new JLabel();
	private JLabel lblNewLabel_9;
	private JLabel lblNewBtn;
	private JLabel lblNew;
	private JLabel lblDeleteBtn;
	private JLabel lblDelete;
	private JLabel lblEditBtn;
	private JLabel lblEdit;
	private JLabel lblInfoBtn;
	private JLabel lblInfo;
	private JLabel lblPrintBtn;
	private JLabel lblPrint;
	private JLabel lblRefresh;
	private JLabel lblRefresh_1;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblInterventions;
	private JLabel lblNewLabel_8_3;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JPanel panel_1;
	private JPanel panel;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JTextField textField_10;
	private JLabel lblNewLabel_20;
	private JLabel l1;
	private JLabel l2;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_8_1;
	private JTextField textField_11;
	private JLabel lblNewLabel_22;
	private JTextField textField_12;
	private JLabel lblNewLabel_23;
	private JLabel lblNewLabel_24;
	private JLabel lblNewLabel_25;
	private JTextField t10;
	private JLabel label;
	private JTextField textField_13;
	private JTable table_1;
	private JLabel label_1;
	private JTextField textField_14;
	private JTable table_8;
	private JScrollPane scrollPane_2;
	private JLabel lblNewLabel_26;
	private JTextField textField_3;
	private JLabel label_3;
	private JTextField textField_4;
	private JLabel lblNewLabel_27;
	private JPanel p8_1;
	private JLabel lblNewLabel_17_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_15;
	private JTextField textField_16;
	private JLabel lblNewLabel_17_4;
	private JLabel lblNewLabel_17_5;
	private JPanel panel_3;
	private JPanel panel_4;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTable table_6;
	private JPanel p6;
	private JPanel p4_1;
	private JTextField textField_21;
	private JTextField textField_22;
	private JLabel lblNBonDe;
	private JLabel lblNService;
	private JLabel lblDscription;
	private JButton btnValider;
	private JTextField textField_23;
	private JTable table_9;
	private JTable table_10;
	private JLabel lblNewLabel_17_6;
	private JLabel lblNewLabel_17_7;
	private JLabel lblNewLabel_28_2;
	private JTable table_11;
	private JScrollPane scrollPane_11;
	private JLabel lblNewLabel_29;
	private JLabel lblNewLabel_28_3;
	private JButton btnAnnuler;
	private JPanel p4_2;
	private JLabel lblNewLabel_28_4;
	private JTextArea texte;
	private JScrollPane scrollPane_8;
	private JTextField textField_24;
	private JTable table_12;
	private JLabel lblNewLabel_30;
	private JPanel p6_1;
	private JPanel p6_2;
	private JLabel lblNewLabel_31;
	private JTextField textField_25;
	private JTextField textField_27;
	private JLabel lblTypeDintervention_2;
	private JLabel lblTypeDintervention_3;
	private JTextArea textArea_3;
	private JButton btnAnnuler_2;
	
public void articleajouter() {//as 'numero rapport'   as 'numero chef service ' , ouvrier_id as'numero reparateur' 
		
		String sql=" select idarticle,article_numero_serie,taille"
				+ ",poids,couleur , quantite from bon_commande WHERE id_bon_commande='"+textField_21.getText()+"'";
		                                                                                                                                                                    
		
		try {
			pr=cnx.prepareStatement(sql);
			rs=pr.executeQuery();
		table_10.setModel(DbUtils.resultSetToTableModel(rs));
			
		
		JTableHeader theader=table_10.getTableHeader();
		theader.setBackground(Color.gray);
		theader.setForeground(Color.black);
		theader.setFont(new Font("tahome",Font.BOLD,13));
		table_10.setFont(new Font("tahome",Font.BOLD,12));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
					}
	}

public void converte() {
	texte.setText("***************************************************"
	 		+ "******************************************************************************\n");
	 texte.setText(texte.getText()+"                       "
	 		+ "                                                          BON DE COMMANDE                                     \n");
	 texte.setText(texte.getText()+"********************************************"
	 		+ "*************************************************************************************\n");
	 texte.setText(texte.getText()+"\n\n\n\n\n\t\t\t");
			 texte.setText(texte.getText()+"N° "+table_3.getValueAt(table_3.getSelectedRow(),0));
			 texte.setText(texte.getText()+"\n\n\t\t\t");
			 texte.setText(texte.getText()+"Date "+l2.getText().toString());
			 texte.setText(texte.getText()+"\n\n\n\n\n");
			 texte.setText(texte.getText()+"Description "+table_3.getValueAt(table_3.getSelectedRow(),3));
			 texte.setText(texte.getText()+"\n\n");
			 texte.setText(texte.getText()+"N°Article"+"\t"+"N°Serie"+"\t"+"Taille"+"\t"+"Poids"+"\t"+"Couleur"+"\t"+"Quantité");
			 texte.setText(texte.getText()+"\n");
	DefaultTableModel mod =(DefaultTableModel) table_11.getModel();
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
	texte.setText(texte.getText()+"\n\n\n\n\n\t\t\t");
	 texte.setText(texte.getText()+"Chef de Service :\n\t\t\t\t"+Login_gmao.id);//login.nom_chefservice();
	 texte.setText(texte.getText()+" \n\n\n\t\t\t\t Signature");
}

public void selectarticle() {//as 'numero rapport'   as 'numero chef service ' , ouvrier_id as'numero reparateur' 
		
		String sql="select idarticle ," + 
				"numero_serie" + 
				",date_acquisition" + 
				",date_experimentation" + 
				",dure_vie_moyenne" + 
				",concepteur" + 
				",conditionnement" + 
				",libelle" + 
				",poids" + 
				",taille"+ 
				" ,couleur from article ";
				//+ "idarticle , numero_serie ,taille, poids , couleur, prix_unitaire,date_acquisition,date_experimentation"
				//+ "dure_vie_moyenne,conditionnement,concepteur,libelle from article";
		                                                                                                                                                                    
		
		try {
			pr=cnx.prepareStatement(sql);
			rs=pr.executeQuery();
		table_9.setModel(DbUtils.resultSetToTableModel(rs));
			
		
		JTableHeader theader=table_9.getTableHeader();
		theader.setBackground(Color.LIGHT_GRAY);
		theader.setForeground(Color.black);
		theader.setFont(new Font("tahome",Font.BOLD,13));
		table_9.setFont(new Font("tahome",Font.BOLD,12));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
					}
	}

	public void articleajouter(int s) {//as 'numero rapport'   as 'numero chef service ' , ouvrier_id as'numero reparateur' 
		
		String sql=" select idarticle as 'ID article',article_numero_serie as 'N° serie',taille as 'Taille'"
				+ ",poids as ' Poids',couleur as 'Couleur' , quantite as 'Quantité' from bon_commande WHERE id_bon_commande='"+s+"'";
		                                                                                                                                                                    
		
		try {
			pr=cnx.prepareStatement(sql);
			rs=pr.executeQuery();
		table_11.setModel(DbUtils.resultSetToTableModel(rs));
			
		
		JTableHeader theader=table_11.getTableHeader();
		theader.setBackground(Color.gray);
		theader.setForeground(Color.black);
		theader.setFont(new Font("tahome",Font.BOLD,13));
		table_11.setFont(new Font("tahome",Font.BOLD,12));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
					}
	}	
	
	public void selectbon() {
		
		String sql=" select id_bon_commande as 'N° Bon',idservice as 'N° Service' ,datecreation as 'Date de création',description as 'Description'"
				+ " from boncommande WHERE id_chef_service='"+Login_gmao.id+"'";//login.idchefservice()
		                                                                                                                                                                    
		
		try {
			pr=cnx.prepareStatement(sql);
			rs=pr.executeQuery();
		table_3.setModel(DbUtils.resultSetToTableModel(rs));
			
		
		JTableHeader theader=table_3.getTableHeader();
		theader.setBackground(Color.gray);
		theader.setForeground(Color.black);
		theader.setFont(new Font("tahome",Font.BOLD,13));
		table_3.setFont(new Font("tahome",Font.BOLD,12));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
					}
	}
public void intervention() {//as 'numero rapport'   as 'numero chef service ' , ouvrier_id as'numero reparateur' 
		
		String sql="select numero as 'N° intervention' ,type as'Type',date as'Date',dureas 'Durée',remarque as 'Remarques',modification"
				+ "as 'Modifications',numero_panne as 'N° panne' , cout as'Cout' from intervention";
		                                                                                                                                                                    
		
		try {
			pr=cnx.prepareStatement(sql);
			rs=pr.executeQuery();
		table_2.setModel(DbUtils.resultSetToTableModel(rs));
			
		
		JTableHeader theader=table_2.getTableHeader();
		theader.setBackground(Color.gray);
		theader.setForeground(Color.black);
		theader.setFont(new Font("tahome",Font.BOLD,14));
		table_2.setFont(new Font("tahome",Font.BOLD,12));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
					}
	}
	
	
public void loginInfo () {
	
		if(Login_gmao.User.equals("CS")) {
	try {
			PreparedStatement ps = cnx.prepareStatement("select nom,prenom from chef_service where username=? and password=?");
			ps.setString(1,Login_gmao.txtUsername.getText()); 
			ps.setString(2,	Login_gmao.txtPassword.getText());
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				 lblNewLabel_11.setText(rs.getString(1).toUpperCase()+" "+rs.getString(2).toUpperCase());
				 lblNewLabel_11_1.setText(Login_gmao.id);
			}
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		}else { if(Login_gmao.User.equals("A")){
			try {
				PreparedStatement ps = cnx.prepareStatement("select nom,prenom from agent where username=? and password=?");
				ps.setString(1,Login_gmao.txtUsername.getText()); 
				ps.setString(2,	Login_gmao.txtPassword.getText());
				
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					 lblNewLabel_11.setText(rs.getString(1)+" "+rs.getString(2));
					 lblNewLabel_11_1.setText(Login_gmao.id);
				}
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
		}else {
			try {
				PreparedStatement ps = cnx.prepareStatement("select nom,prenom from reparateur where username=? and password=?");
				ps.setString(1,Login_gmao.txtUsername.getText()); 
				ps.setString(2,	Login_gmao.txtPassword.getText());
				
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					 lblNewLabel_11.setText(rs.getString(1)+" "+rs.getString(2));
					 lblNewLabel_11_1.setText(Login_gmao.id);
				}
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
		}
			
		}
		
}

	
	@SuppressWarnings("unchecked")
	public void  panne() {
		
		ArrayList<String> p1 =new ArrayList<String>();
	
		ArrayList<String> p2 =new ArrayList<String>();
		ArrayList<String> p3 =new ArrayList<String>();
		ArrayList<String> p4 =new ArrayList<String>();
	  String  [] tab = null;
		ArrayList  <String> p5 =new ArrayList<String>();
		
		String m1="select service.idservice ,numch, id  from  service , chef_service , reparateur ,  panne  , repare  where repare.equipement_nume=panne.equipement_nume  "
				+ " and ouvries_id=reparateur.id   and   service.idservice=chef_service.service_idservice   and  service.idservice=reparateur.idservice ";
		
		String m2="select nump as 'numero panne' ,service.idservice ,numch, id  from  service , chef_service , reparateur ,  panne  , repare  where repare.equipement_nume=panne.equipement_nume  "
				+ " and ouvries_id=reparateur.id   and   service.idservice=chef_service.service_idservice   and  service.idservice=reparateur.idservice ";
		String kl="select nump from panne , reparateur,repare,service  where repare.equipement_nume=panne.equipement_nume  and repare.ouvries_id=reparateur.id  and reparateur.idservice=service.idservice";
		
		try {
			pr=cnx.prepareStatement(m1);
			//s=cnx.createStatement();
			rs=pr.executeQuery();
		
			
			while(rs.next()) {
		        p2.add(rs.getString("service.idservice"));
		        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
					}
//*********************************************
		try {
			pr=cnx.prepareStatement(m1);
			//s=cnx.createStatement();
			rs=pr.executeQuery();
		
			
			while(rs.next()) {
				 p3.add(rs.getString("numch"));
		      
			
				
			}
			//list.setModel(dn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
					}
		try {
			pr=cnx.prepareStatement(m1);
			//s=cnx.createStatement();
			rs=pr.executeQuery();
		
			
			while(rs.next()) {
				p4.add(rs.getString("id"));
		        
		}} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
					}
		
//********************************************************************1		
		
		try {
			pr=cnx.prepareStatement(kl);
			//s=cnx.createStatement();
			rs=pr.executeQuery();
		
			
			while(rs.next()) {
				id22=rs.getString("nump");
		      
				
				
				p1.add(rs.getString("panne.nump"));
		     
				
			}
			//list.setModel(dn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
					}
			
		System.out.println("***************"+i);
		System.out.println("***************"+p1.size());
		System.out.println("***************"+p2.size());
		System.out.println("***************"+p3.size());
		System.out.println("***************"+p4.size());
		String p =null;
		for(int i=0;i<=p2.size();i++)
		{
			
		
			//p=p2.get(i)+p3.get(i)+p4.get(i)+p1.get(i);
		
		p5.add(p);
		//System.out.println("***************_____-->"+p5.get(i));
			
		}
		/****
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("blabla");
		aList.add("blublu");
		aList.add("blibli");
		aList.add("bleble");
		DefaultListModel model = new DefaultListModel();
		for(String s:aList){
		    model.addElement(s);
		    
		}**/
		 
		//list = new JList(model);
		//DefaultListModel l = new DefaultListModel();
	/**	 
		DefaultListModel dlm = new DefaultListModel();
		for(int i=0;i<1;i=i+1 ){
		     dlm.addElement(p5.get(i).toString());
		}    
		 list = new JList(dlm);
**/
		//Quand j'appuie sur le bouton valider :
	
	}
	
	
	
	public void rapport() {//as 'numero rapport'   as 'numero chef service ' , ouvrier_id as'numero reparateur' 
		if(Login_gmao.User.equals("CS")) {
		String sql ="";
		if(t==7) {
	    sql="select num_rapport as 'N° rapport'  ,numch_chef_service as'N° chef de service', type as 'Type'   ,date_rap as 'Date',objet_rap as 'Objet', description as 'Description' from rapport_chef_service where numch_chef_service='"+Login_gmao.id+"'";
		}
	    
		try {
			if(t==3) {
				sql="select idRapport as 'N° rapport'  ,id_reparateur as 'N° reparateur',id_intervention as 'N° intervention', type as 'Type' ,date_i as 'Date',objet_rap as 'Objet',"
						+ "description as 'Description' from rapport where valide=0 and chef_service_numch ='"+Login_gmao.id+"'";
			}
			pr=cnx.prepareStatement(sql);
			rs=pr.executeQuery();
		table_7.setModel(DbUtils.resultSetToTableModel(rs));
		
		
		JTableHeader theader=table_7.getTableHeader();
		theader.setBackground(SystemColor.LIGHT_GRAY);
		theader.setBorder(null);
		theader.setForeground(Color.BLACK);
		theader.setFont(new Font("tahome",Font.BOLD,13));	
		table_7.setFont(new Font("tahome",Font.BOLD,12));
		
		rs=pr.executeQuery();
		table_4.setModel(DbUtils.resultSetToTableModel(rs));
	    theader=table_4.getTableHeader();
		theader.setBackground(SystemColor.LIGHT_GRAY);
		theader.setBorder(null);
		theader.setForeground(Color.BLACK);
		theader.setFont(new Font("tahome",Font.BOLD,13));	
		table_4.setFont(new Font("tahome",Font.BOLD,12));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
					}
		}else {
		String sql="select idRapport as 'N° rapport'  ,id_reparateur as 'N° reparateur',id_intervention as 'N° intervention', type as 'Type' ,date_i as 'Date',objet_rap as 'Objet', description as 'Description' , valide as 'Validation' from rapport where id_reparateur="+Login_gmao.id+"'";
		
		try {
			pr=cnx.prepareStatement(sql);
			rs=pr.executeQuery();
		table_7.setModel(DbUtils.resultSetToTableModel(rs));
			
		
		JTableHeader theader=table_7.getTableHeader();
		theader.setBackground(SystemColor.LIGHT_GRAY);
		theader.setBorder(null);
		theader.setForeground(Color.BLACK);
		theader.setFont(new Font("tahome",Font.BOLD,13));	
		table_7.setFont(new Font("tahome",Font.BOLD,12));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
					}
		}
	}
public void inter() {//as 'numero rapport'   as 'numero chef service ' , ouvrier_id as'numero reparateur' 
		
		String sql="select id as 'N° intervention',date_i as'Date intervention', type_i as'Type intervention' , panne_nump as'N° de panne' from intervention ,agent  where intervention.idred = agent.idagent and agent.chef_service_numch='"+Login_gmao.id+"' and intervention.valider=1";
		                                                                                                                                                                    
		//JOptionPane.showMessageDialog(null, ""+Logine.getCle_chef());
		try {
			pr=cnx.prepareStatement(sql);
			rs=pr.executeQuery();
		table_5.setModel(DbUtils.resultSetToTableModel(rs));
			
		
		JTableHeader theader=table_5.getTableHeader();
		theader.setBackground(SystemColor.LIGHT_GRAY);
		theader.setBorder(null);
		theader.setForeground(Color.BLACK);
		theader.setFont(new Font("tahome",Font.BOLD,13));	
		table_5.setFont(new Font("tahome",Font.BOLD,12));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
					}
	}
public void inter2() {//as 'numero rapport'   as 'numero chef service ' , ouvrier_id as'numero reparateur' 
	if(t==8 && Login_gmao.User.equals("R")) {
		String sql="select id as 'numero intervention',date_i as'date intervention', type_i as'type intervention' , panne_nump as'numero de panne' from intervention , repare where intervention.id=repare.intervention_id and intervention.date_i =repare.date_i and repare.id_reparateur =? " ;
		
		try {
			pr=cnx.prepareStatement(sql);
			pr.setString(1, lblNewLabel_11_1.getText());
			rs=pr.executeQuery();
		   table_8.setModel(DbUtils.resultSetToTableModel(rs));
			
		
		JTableHeader theader=table_8.getTableHeader();
		theader.setBackground(SystemColor.LIGHT_GRAY);
		theader.setBorder(null);
		theader.setForeground(Color.BLACK);
		theader.setFont(new Font("tahome",Font.BOLD,13));	
		table_8.setFont(new Font("tahome",Font.BOLD,12));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
					}
	}	if(t==8 && Login_gmao.User.equals("CS")) {
		
		String sql="select id as 'numero intervention',date_i as'date intervention', type_i as'type intervention' , panne_nump as'numero de panne' from intervention ,agent  where intervention.idred = agent.idagent and agent.chef_service_numch='"+Login_gmao.id+"'";//+" or intervention.idcrea="+Login_gmao.id ;
		try {
			pr=cnx.prepareStatement(sql);
			rs=pr.executeQuery();
		   table_8.setModel(DbUtils.resultSetToTableModel(rs));
			
		
		JTableHeader theader=table_8.getTableHeader();
		theader.setBackground(SystemColor.LIGHT_GRAY);
		theader.setBorder(null);
		theader.setForeground(Color.BLACK);
		theader.setFont(new Font("tahome",Font.BOLD,13));	
		table_8.setFont(new Font("tahome",Font.BOLD,12));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
					}
	}
		
	
	if(t==5) {
		String sql="select id as 'N° intervention',date_i as'Date intervention', type_i as'Type intervention' , panne_nump as'N° de panne',valider as 'Validation' from intervention  where idred=?";
		try {
			pr=cnx.prepareStatement(sql);
			pr.setString(1, lblNewLabel_11_1.getText());
			rs=pr.executeQuery();
		   table_1.setModel(DbUtils.resultSetToTableModel(rs));
			
		
		JTableHeader theader=table_1.getTableHeader();
		theader.setBackground(SystemColor.LIGHT_GRAY);
		theader.setBorder(null);
		theader.setForeground(Color.BLACK);
		theader.setFont(new Font("tahome",Font.BOLD,13));	
		table_1.setFont(new Font("tahome",Font.BOLD,12));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
					}
	}
	if(t==2 ) {
	String sql="select id as 'N° intervention',date_i as'Date intervention', type_i as'Type intervention' , panne_nump as'N° de panne' from intervention ,agent  where intervention.idred=	agent.idagent and agent.chef_service_numch='"+Login_gmao.id+"' and intervention.valider=0";
	                                                                                                                                                                    
	//JOptionPane.showMessageDialog(null, ""+Logine.getCle_chef());
	try {
		pr=cnx.prepareStatement(sql);
		rs=pr.executeQuery();
	   table_2.setModel(DbUtils.resultSetToTableModel(rs));
		
	
	JTableHeader theader=table_2.getTableHeader();
	theader.setBackground(SystemColor.LIGHT_GRAY);
	theader.setBorder(null);
	theader.setForeground(Color.BLACK);
	theader.setFont(new Font("tahome",Font.BOLD,13));	
	table_2.setFont(new Font("tahome",Font.BOLD,12));
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
				}
}
}
	public void article() {
		String sql="select article.idarticle as 'numero article',poids, taille ,couleur,type  from article , etat_stock where etat_stock.idarticle=article.idarticle and etat_stock.quantite_article<=40 and etat_stock.quantite_article>10 ";
		try {//idservice as 'numero service'  , noms as 'nom service'  , nbr_effictive as 'nombre d'fectives '
			pr=cnx.prepareStatement(sql);
			rs=pr.executeQuery();
		table_5.setModel(DbUtils.resultSetToTableModel(rs));
			
		
		JTableHeader theader=table_5.getTableHeader();
		theader.setBackground(SystemColor.LIGHT_GRAY);
		theader.setBorder(null);
		theader.setForeground(Color.BLACK);
		theader.setFont(new Font("tahome",Font.BOLD,13));	
		table_5.setFont(new Font("tahome",Font.BOLD,12));	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
					}
	}
	
	public void journal() {
		String sql ="";
		if(Login_gmao.User.equals("CS")) {
		 sql="select Idagent as 'ID agent ',DateJ as 'Date',taches as 'Taches' from journal where idchef ="+Login_gmao.id;
		}
		if(Login_gmao.User.equals("A")) {
			sql="select Idagent as 'ID agent ',DateJ as 'Date',taches as 'Taches' from journal where Idagent ="+Login_gmao.id;
		}
		try {//idservice as 'numero service'  , noms as 'nom service'  , nbr_effictive as 'nombre d'fectives '
			pr=cnx.prepareStatement(sql);
			rs=pr.executeQuery();
		table_12.setModel(DbUtils.resultSetToTableModel(rs));
			
		
		JTableHeader theader=table_12.getTableHeader();
		theader.setBackground(SystemColor.LIGHT_GRAY);
		theader.setBorder(null);
		theader.setForeground(Color.BLACK);
		theader.setFont(new Font("tahome",Font.BOLD,13));	
		table_12.setFont(new Font("tahome",Font.BOLD,12));	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
					}
	}
	
	public void uptable2() {
		//'"+Login.user+"' //and id_enseignant='"+Login.user+"'
		String  sql="SELECT id as 'N° reparateur' ,nom as 'Nom',prenom as 'Prenom',date_naissance as 'Date de naissance',tel as 'Telephone',username as 'Username' from reparateur   ORDER BY idservice DESC" ;
			try {
				pr=cnx.prepareStatement(sql);
				rs=pr.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			JTableHeader theader=table.getTableHeader();
			theader.setBackground(SystemColor.LIGHT_GRAY);
			theader.setBorder(null);
			theader.setForeground(Color.BLACK);
				//JOptionPane.showMessageDialog(null, "Remlissez les champs vides !");
			theader.setFont(new Font("tahome",Font.BOLD,13));	
			table.setFont(new Font("tahome",Font.BOLD,12));	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
						}}
			
	
	//public class ColorRenderer extends JLabel implements TableCellRenderer  {
		 
	    /**
		private static final long serialVersionUID = 1L;
		public ColorRenderer() {
	        setOpaque(true); //MUST do this for background to show up.
	    }
	
		public Component getTableCellRendererComponent(
             JTable table, Object value,
             boolean isSelected, boolean hasFocus,
             int row, int column) {

//if(column == 4){

if (Integer.valueOf(table.getValueAt(row, column).toString()) > 44)
{
 setBackground(Color.BLUE);
 //setForeground(Color.BLACK);
}
else
{
 setBackground(Color.RED);
 //setForeground(Color.BLACK);
}
//}
return this;
}}
	
	***
		  
		public ColorRenderer() {
	        setOpaque(true); //MUST do this for background to show up.
	    }
	
		 */
		

	
	
	
	
//	public void uptable11() {
//		String sql="select idEtat_stock as 'numero stock',idarticle  as 'numero article',quantite_article as'quantite article',date_acquisition as 'date acquisition' from etat_stock where id_commandont='"+Logine.getCle_commandant()+"'";
//		try {//idservice as 'numero service'  , noms as 'nom service'  , nbr_effictive as 'nombre d'fectives '
//			pr=cnx.prepareStatement(sql);
//			rs=pr.executeQuery();
//		table_3.setModel(DbUtils.resultSetToTableModel(rs));
//			
//		
//		JTableHeader theader=table_3.getTableHeader();
//		theader.setBackground(Color.gray);
//		theader.setForeground(Color.black);
//		theader.setFont(new Font("tahome",Font.BOLD,16));
//		table_3.setFont(new Font("tahome",Font.BOLD,12));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			//e.printStackTrace();
//					}
//		RenderPintar ren=new RenderPintar();
//		table_3.setDefaultRenderer(Object.class, ren);
//		
//		//table_3.getColumnModel().getColumn(2).setCellRenderer(new RenderPintar());
//	}
	
	
//	public void uptable() {
//		String sql="select   numch as 'N° chef du service',nom,prenom,dtn as 'Date de naissance',tel as 'Telephone',username as 'Nom utilisateur', password as 'Mot de passe', idservice as 'numero service' from chef_service where id_commandont='"+Logine.getCle_commandant()+"'";
//		try {//idservice as 'numero service'  , noms as 'nom service'  , nbr_effictive as 'nombre d'fectives '
//			pr=cnx.prepareStatement(sql);
//			rs=pr.executeQuery();
//		table_2.setModel(DbUtils.resultSetToTableModel(rs));
//			
//		
//		JTableHeader theader=table_2.getTableHeader();
//		theader.setBackground(Color.gray);
//		theader.setForeground(Color.black);
//		theader.setFont(new Font("tahome",Font.BOLD,13));
//		table_2.setFont(new Font("tahome",Font.BOLD,12));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			//e.printStackTrace();
//					}
//	}
  	
	
	public ResultSet recherche_service(String service) {
	
		String p="";
		String  sql="SELECT idservice from service  where idservice='"+service+"'";
		try {
			pr=cnx.prepareStatement(sql);
			rs=pr.executeQuery();
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
					}
		return rs;
		
		
	}
	public ResultSet recherche_reparateur(String d,String s) {
		
		String p="";
		String  sql="SELECT id,idservice from reparateur  where id='"+d+"'idservice='"+s+"'";
		try {
			pr=cnx.prepareStatement(sql);
			rs=pr.executeQuery();
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
					}
		return rs;
		
		
	}
	public void Interface (){
		 if(Login_gmao.User.equals("CS")) {
	        	lblNewLabel_13.setBackground(SystemColor.GRAY);
	        	lblNewLabel_15.setBackground(new Color(204, 0, 51));
	        	lblNewLabel_16.setBackground(new Color(204, 0, 51));
	        	a7.setBackground(SystemColor.GRAY);
	        }else {
	        	if(Login_gmao.User.equals("A")) {
	        		a2.setBackground(SystemColor.GRAY);
	        		a3.setBackground(SystemColor.GRAY);
	        		a4.setBackground(SystemColor.GRAY);
	        		a5.setBackground(SystemColor.GRAY);
	        		a6.setBackground(SystemColor.GRAY);
	        		lblInterventions.setBackground(SystemColor.GRAY);
	        		lblNewLabel_7.setBackground(SystemColor.GRAY);
	        		lblNewLabel_1.setBackground(SystemColor.GRAY);
	        		lblNewLabel_8_1.setBackground(SystemColor.GRAY);
	        		lblNewLabel_8_3.setBackground(SystemColor.GRAY);
	        		lblNewLabel_12.setBackground(SystemColor.GRAY);
	        		lblNewLabel_14.setBackground(new Color(204, 0, 51));
	        		lblNewLabel_15.setBackground(new Color(204, 0, 51));
	        		lblNewLabel_8.setBackground(SystemColor.GRAY);
	        	}else {
	        		a1.setBackground(SystemColor.GRAY);
	        		a2.setBackground(SystemColor.GRAY);
	        		a3.setBackground(SystemColor.GRAY);
	        		a5.setBackground(SystemColor.GRAY);
	        		a6.setBackground(SystemColor.GRAY);
	        		a7.setBackground(SystemColor.GRAY);
	        		lblNewLabel_10.setBackground(SystemColor.GRAY);
	        		lblNewLabel_1.setBackground(SystemColor.GRAY);
	        		lblNewLabel_8_1.setBackground(SystemColor.GRAY);
	        		lblNewLabel_8_3.setBackground(SystemColor.GRAY);
	        		lblNewLabel_13.setBackground(SystemColor.GRAY);
	        		lblNewLabel_14.setBackground(new Color(204, 0, 51));
	        		lblNewLabel_16.setBackground(new Color(204, 0, 51));
	        		lblNewLabel_8.setBackground(SystemColor.GRAY);
	        	}
	        }
	}
	
	public chef() {
       
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1129, 699);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setBackground(new Color(0, 0, 102));
		gradientPanel.setkStartColor(new Color(0, 0, 51));
		gradientPanel.setkEndColor(new Color(0, 0, 51));
		 layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 99, 1093, 553);
		gradientPanel.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		cnx=connexion.connecter();
                    phome = new JPanel();
                    phome.setBackground(Color.WHITE);
		layeredPane.add(phome, "name_7336782116200");
		phome.setLayout(null);
		loginInfo ();
		
		lblNewLabel_1 = new JLabel("Ordonnancement des interventions");
		if(Login_gmao.User.equals("CS")) {
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblNewLabel_1.setBackground(SystemColor.control);
				lblNewLabel_1.setForeground(SystemColor.BLACK);
				lblNewLabel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 102, 255)));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblNewLabel_1.setBackground(SystemColor.controlHighlight);
				lblNewLabel_1.setForeground(SystemColor.DARK_GRAY);
				lblNewLabel_1.setBorder(null);
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel_1.setBackground(SystemColor.controlHighlight);
				lblNewLabel_1.setForeground(SystemColor.DARK_GRAY);
				lblNewLabel_1.setBorder(null);
				lblNewLabel_2.setVisible(true);
				lblNewLabel_6.setFont(new Font("Century Gothic", Font.BOLD, 32));
				lblNewLabel_6.setText("<html>PANNES & <br/>MAINTENANCE</html>");
				panel.setVisible(true);
				panel_1.setVisible(true);
				layeredPane.setBounds(210, 99, 894, 553);
				layeredPane.removeAll();
		  		layeredPane.add(p1);
		  		t=1;
		  		//layeredPane.repaint();
		  		//layeredPane.revalidate();
		  		uptable2();
		  		Etat = 2;
		  		Interface();
		 		a1.setBackground(SystemColor.controlHighlight);
		 		a3.setBackground(SystemColor.controlHighlight);
		 		a4.setBackground(SystemColor.controlHighlight);
		 		a5.setBackground(SystemColor.controlHighlight);
		 		a6.setBackground(SystemColor.controlHighlight);
		 		lblInterventions.setBackground(SystemColor.controlHighlight);
		 		a2.setBackground(SystemColor.WHITE);
			}
		});
		}
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\maintenance (2).png"));
		lblNewLabel_1.setIconTextGap(10);
		lblNewLabel_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(SystemColor.controlHighlight);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBounds(21, 48, 396, 107);
		phome.add(lblNewLabel_1);
		
		lblNewLabel_8 = new JLabel("Gestion des interventions");
		if(Login_gmao.User.equals("CS")) {
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblNewLabel_8.setBackground(SystemColor.control);
				lblNewLabel_8.setForeground(SystemColor.BLACK);
				lblNewLabel_8.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 102, 255)));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblNewLabel_8.setBackground(SystemColor.controlHighlight);
				lblNewLabel_8.setForeground(SystemColor.DARK_GRAY);
				lblNewLabel_8.setBorder(null);
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				inter2();
				lblNewLabel_8.setBackground(SystemColor.controlHighlight);
				lblNewLabel_8.setForeground(SystemColor.DARK_GRAY);
				lblNewLabel_8.setBorder(null);
				lblNewLabel_2.setVisible(true);
				lblNewLabel_6.setFont(new Font("Century Gothic", Font.BOLD, 32));
				lblNewLabel_6.setText("<html>PANNES & <br/>MAINTENANCE</html>");
				panel.setVisible(true);
				panel_1.setVisible(true);
				layeredPane.setBounds(210, 99, 894, 553);
				layeredPane.removeAll();
	    		layeredPane.add(p2);
	    		t=2;
	    		layeredPane.repaint();
	    		layeredPane.revalidate();
	    		Etat = 3;
	    		Interface();
		 		a2.setBackground(SystemColor.controlHighlight);
		 		a1.setBackground(SystemColor.controlHighlight);
		 		a4.setBackground(SystemColor.controlHighlight);
		 		a5.setBackground(SystemColor.controlHighlight);
		 		a6.setBackground(SystemColor.controlHighlight);
		 		lblInterventions.setBackground(SystemColor.controlHighlight);
		 		a3.setBackground(SystemColor.WHITE);
			}
		});
		}
		lblNewLabel_8.setIconTextGap(10);
		lblNewLabel_8.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel_8.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\content (1).png"));
		lblNewLabel_8.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_8.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_8.setForeground(Color.DARK_GRAY);
		lblNewLabel_8.setOpaque(true);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBackground(SystemColor.controlHighlight);
		lblNewLabel_8.setBounds(21, 162, 396, 107);
		phome.add(lblNewLabel_8);
		
		lblNewLabel_8_1 = new JLabel("R\u00E9daction d'un bon de commande");
		if(Login_gmao.User.equals("CS")) {
		lblNewLabel_8_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblNewLabel_8_1.setBackground(SystemColor.control);
				lblNewLabel_8_1.setForeground(SystemColor.BLACK);
				lblNewLabel_8_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 102, 255)));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblNewLabel_8_1.setBackground(SystemColor.controlHighlight);
				lblNewLabel_8_1.setForeground(SystemColor.DARK_GRAY);
				lblNewLabel_8_1.setBorder(null);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_8_1.setBackground(SystemColor.controlHighlight);
				lblNewLabel_8_1.setForeground(SystemColor.DARK_GRAY);
				lblNewLabel_8_1.setBorder(null);
				lblNewLabel_2.setVisible(true);
				lblNewLabel_6.setFont(new Font("Century Gothic", Font.BOLD, 32));
				lblNewLabel_6.setText("<html>PANNES & <br/>MAINTENANCE</html>");
				panel.setVisible(true);
				panel_1.setVisible(true);
				layeredPane.setBounds(210, 99, 894, 553);
				layeredPane.removeAll();
				layeredPane.add(p4);
				t=4;
				layeredPane.repaint();
				layeredPane.revalidate();
//				uptable11();
				Etat = 6;
				Interface();
				selectbon();
		 		a2.setBackground(SystemColor.controlHighlight);
		 		a3.setBackground(SystemColor.controlHighlight);
		 		a4.setBackground(SystemColor.controlHighlight);
		 		a5.setBackground(SystemColor.controlHighlight);
		 		a1.setBackground(SystemColor.controlHighlight);
		 		lblInterventions.setBackground(SystemColor.controlHighlight);
		 		a6.setBackground(SystemColor.WHITE);
			}
		});
		}
		lblNewLabel_8_1.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\invoice.png"));
		lblNewLabel_8_1.setIconTextGap(10);
		lblNewLabel_8_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_8_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel_8_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_8_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_8_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_8_1.setOpaque(true);
		lblNewLabel_8_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8_1.setBackground(SystemColor.controlHighlight);
		lblNewLabel_8_1.setBounds(21, 280, 396, 107);
		phome.add(lblNewLabel_8_1);
		
		lblNewLabel_8_3 = new JLabel("Rapports d'interventions");
		if(Login_gmao.User.equals("CS")) {
		lblNewLabel_8_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblNewLabel_8_3.setBackground(SystemColor.control);
				lblNewLabel_8_3.setForeground(SystemColor.BLACK);
				lblNewLabel_8_3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 102, 255)));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblNewLabel_8_3.setBackground(SystemColor.controlHighlight);
				lblNewLabel_8_3.setForeground(SystemColor.DARK_GRAY);
				lblNewLabel_8_3.setBorder(null);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_8_3.setBackground(SystemColor.controlHighlight);
				lblNewLabel_8_3.setForeground(SystemColor.DARK_GRAY);
				lblNewLabel_8_3.setBorder(null);
				lblNewLabel_2.setVisible(true);
				lblNewLabel_6.setFont(new Font("Century Gothic", Font.BOLD, 32));
				lblNewLabel_6.setText("<html>PANNES & <br/>MAINTENANCE</html>");
				panel.setVisible(true);
				panel_1.setVisible(true);
				layeredPane.setBounds(210, 99, 894, 553);
				layeredPane.removeAll();
				layeredPane.add(p3);
				t=3;
				layeredPane.repaint();
				layeredPane.revalidate();
				rapport();
				Interface();
				Etat = 5;
		 		a2.setBackground(SystemColor.controlHighlight);
		 		a3.setBackground(SystemColor.controlHighlight);
		 		a4.setBackground(SystemColor.controlHighlight);
		 		a1.setBackground(SystemColor.controlHighlight);
		 		a6.setBackground(SystemColor.controlHighlight);
		 		lblInterventions.setBackground(SystemColor.controlHighlight);
		 		a5.setBackground(SystemColor.WHITE);
			}
		});
		}
		lblNewLabel_8_3.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\report (1).png"));
		lblNewLabel_8_3.setIconTextGap(10);
		lblNewLabel_8_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_8_3.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel_8_3.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_8_3.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_8_3.setForeground(Color.DARK_GRAY);
		lblNewLabel_8_3.setOpaque(true);
		lblNewLabel_8_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8_3.setBackground(SystemColor.controlHighlight);
		lblNewLabel_8_3.setBounds(21, 394, 396, 107);
		phome.add(lblNewLabel_8_3);
		
		lblNewLabel_7 = new JLabel("R\u00E9daction d'un rapport");
		if(Login_gmao.User.equals("CS") || Login_gmao.User.equals("R")) {
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblNewLabel_7.setBackground(SystemColor.control);
				lblNewLabel_7.setForeground(SystemColor.BLACK);
				lblNewLabel_7.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 102, 255)));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblNewLabel_7.setBackground(SystemColor.controlHighlight);
				lblNewLabel_7.setForeground(SystemColor.DARK_GRAY);
				lblNewLabel_7.setBorder(null);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_7.setBackground(SystemColor.controlHighlight);
				lblNewLabel_7.setForeground(SystemColor.DARK_GRAY);
				lblNewLabel_7.setBorder(null);
				lblNewLabel_2.setVisible(true);
				lblNewLabel_6.setFont(new Font("Century Gothic", Font.BOLD, 32));
				lblNewLabel_6.setText("<html>PANNES & <br/>MAINTENANCE</html>");
				panel.setVisible(true);
				panel_1.setVisible(true);
				layeredPane.setBounds(210, 99, 894, 553);
				t=7;
		   		Etat = 4;
		   		if(Login_gmao.User.equals("CS")) {
		   		textField.setEnabled(false);
				textField.setBackground(SystemColor.LIGHT_GRAY);
		 		a2.setBackground(SystemColor.controlHighlight);
		 		a3.setBackground(SystemColor.controlHighlight);
		 		a1.setBackground(SystemColor.controlHighlight);
		 		a5.setBackground(SystemColor.controlHighlight);
		 		a6.setBackground(SystemColor.controlHighlight);
		   		}
		   		layeredPane.removeAll();
		   		layeredPane.add(p7);
		   		layeredPane.repaint();
		   		layeredPane.revalidate();
		   		Interface();
		 		lblInterventions.setBackground(SystemColor.controlHighlight);
		 		a4.setBackground(SystemColor.WHITE);
		 		rapport();
			}
		});
		}
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\paper (2).png"));
		lblNewLabel_7.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_7.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel_7.setIconTextGap(40);
		lblNewLabel_7.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(Color.DARK_GRAY);
		lblNewLabel_7.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_7.setOpaque(true);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBackground(SystemColor.controlHighlight);
		lblNewLabel_7.setBounds(445, 48, 300, 221);
		phome.add(lblNewLabel_7);
		
		lblNewLabel_10 = new JLabel("Journal de bord");
		if(Login_gmao.User.equals("CS") || Login_gmao.User.equals("A")) {
		lblNewLabel_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblNewLabel_10.setBackground(SystemColor.control);
				lblNewLabel_10.setForeground(SystemColor.BLACK);
				lblNewLabel_10.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 102, 255)));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblNewLabel_10.setBackground(SystemColor.controlHighlight);
				lblNewLabel_10.setForeground(SystemColor.DARK_GRAY);
				lblNewLabel_10.setBorder(null);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Etat = 1;
				lblNewLabel_10.setBackground(SystemColor.controlHighlight);
				lblNewLabel_10.setForeground(SystemColor.DARK_GRAY);
				lblNewLabel_10.setBorder(null);
				lblNewLabel_2.setVisible(true);
				lblNewLabel_6.setFont(new Font("Century Gothic", Font.BOLD, 32));
				lblNewLabel_6.setText("<html>PANNES & <br/>MAINTENANCE</html>");
				panel.setVisible(true);
				panel_1.setVisible(true);
				layeredPane.setBounds(210, 99, 894, 553);
				layeredPane.removeAll();
				layeredPane.add(phome);
		 		layeredPane.repaint();
		 		layeredPane.revalidate();
		 		t=6;
		 		if(Login_gmao.User.equals("CS")) {
		 		a2.setBackground(SystemColor.controlHighlight);
		 		a3.setBackground(SystemColor.controlHighlight);
		 		a4.setBackground(SystemColor.controlHighlight);
		 		a5.setBackground(SystemColor.controlHighlight);
		 		a6.setBackground(SystemColor.controlHighlight);
		 		lblInterventions.setBackground(SystemColor.controlHighlight);
		 		}else {
		 		a7.setBackground(SystemColor.controlHighlight);
		 		}
		 		Interface();
		 		a1.setBackground(SystemColor.WHITE);
			}
		});
		}
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\test (1).png"));
		lblNewLabel_10.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_10.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel_10.setIconTextGap(30);
		lblNewLabel_10.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_10.setForeground(Color.DARK_GRAY);
		lblNewLabel_10.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_10.setOpaque(true);
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBackground(SystemColor.controlHighlight);
		lblNewLabel_10.setBounds(770, 48, 300, 221);
		phome.add(lblNewLabel_10);
		
		lblNewLabel_12 = new JLabel("Interventions");
		if(Login_gmao.User.equals("CS") || Login_gmao.User.equals("R")) {
		lblNewLabel_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblNewLabel_12.setBackground(SystemColor.control);
				lblNewLabel_12.setForeground(SystemColor.BLACK);
				lblNewLabel_12.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 102, 255)));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblNewLabel_12.setBackground(SystemColor.controlHighlight);
				lblNewLabel_12.setForeground(SystemColor.DARK_GRAY);
				lblNewLabel_12.setBorder(null);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_12.setBackground(SystemColor.controlHighlight);
				lblNewLabel_12.setForeground(SystemColor.DARK_GRAY);
				lblNewLabel_12.setBorder(null);
				lblNewLabel_2.setVisible(true);
				lblNewLabel_6.setFont(new Font("Century Gothic", Font.BOLD, 32));
				lblNewLabel_6.setText("<html>PANNES & <br/>MAINTENANCE</html>");
				panel.setVisible(true);
				panel_1.setVisible(true);
				layeredPane.setBounds(210, 99, 894, 553);
				layeredPane.removeAll();
				layeredPane.add(p8);
		   		t=8;
		   		layeredPane.repaint();
		   		layeredPane.revalidate();
		   		Etat = 8;
		   		inter2();
		   		if(Login_gmao.User.equals("CS")) {
		 		a2.setBackground(SystemColor.controlHighlight);
		 		a3.setBackground(SystemColor.controlHighlight);
		 		a1.setBackground(SystemColor.controlHighlight);
		 		a5.setBackground(SystemColor.controlHighlight);
		 		a6.setBackground(SystemColor.controlHighlight);
		   		}
		   		Interface();
		   		a4.setBackground(SystemColor.controlHighlight);
		 		lblInterventions.setBackground(SystemColor.WHITE);
			}
		});
		}
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\maintenance (3).png"));
		lblNewLabel_12.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_12.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel_12.setIconTextGap(30);
		lblNewLabel_12.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_12.setForeground(Color.DARK_GRAY);
		lblNewLabel_12.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_12.setOpaque(true);
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBackground(SystemColor.controlHighlight);
		lblNewLabel_12.setBounds(445, 280, 300, 221);
		phome.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("<html>R\u00E9daction d'une demande<br/> d'intervention</html>");
		if(Login_gmao.User.equals("A") ) {
		lblNewLabel_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblNewLabel_13.setBackground(SystemColor.control);
				lblNewLabel_13.setForeground(SystemColor.BLACK);
				lblNewLabel_13.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 102, 255)));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblNewLabel_13.setBackground(SystemColor.controlHighlight);
				lblNewLabel_13.setForeground(SystemColor.DARK_GRAY);
				lblNewLabel_13.setBorder(null);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_13.setBackground(SystemColor.controlHighlight);
				lblNewLabel_13.setForeground(SystemColor.DARK_GRAY);
				lblNewLabel_13.setBorder(null);
				lblNewLabel_2.setVisible(true);
				lblNewLabel_6.setFont(new Font("Century Gothic", Font.BOLD, 32));
				lblNewLabel_6.setText("<html>PANNES & <br/>MAINTENANCE</html>");
				panel.setVisible(true);
				panel_1.setVisible(true);
				layeredPane.setBounds(210, 99, 894, 553);
				layeredPane.removeAll();
				layeredPane.add(p5);
				t=5;
				layeredPane.repaint();
				layeredPane.revalidate();
				inter2();
		         
				Etat = 7;
				Interface();
				a1.setBackground(SystemColor.controlHighlight);
		 		a7.setBackground(SystemColor.WHITE);
			}
		});
		}
		lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\question (1).png"));
		lblNewLabel_13.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_13.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel_13.setIconTextGap(20);
		lblNewLabel_13.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_13.setForeground(Color.DARK_GRAY);
		lblNewLabel_13.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_13.setOpaque(true);
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setBackground(SystemColor.controlHighlight);
		lblNewLabel_13.setBounds(770, 280, 300, 221);
		phome.add(lblNewLabel_13);
		
		lblNewLabel_14 = new JLabel("CHEF DE SERVICE");
		lblNewLabel_14.setForeground(Color.WHITE);
		lblNewLabel_14.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_14.setOpaque(true);
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setBackground(new Color(51, 102, 204));
		lblNewLabel_14.setBounds(21, 11, 1049, 26);
		phome.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("REPARATEUR");
		lblNewLabel_15.setOpaque(true);
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setForeground(Color.WHITE);
		lblNewLabel_15.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_15.setBackground(new Color(51, 102, 204));
		lblNewLabel_15.setBounds(445, 512, 300, 26);
		phome.add(lblNewLabel_15);
		
		lblNewLabel_16 = new JLabel("AGENT");
		lblNewLabel_16.setOpaque(true);
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setForeground(Color.WHITE);
		lblNewLabel_16.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_16.setBackground(new Color(51, 102, 204));
		lblNewLabel_16.setBounds(770, 512, 300, 26);
		phome.add(lblNewLabel_16);
	
		 p1 = new JPanel();
		p1.setBackground(Color.WHITE);
		layeredPane.add(p1, "name_7383134918200");
		p1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 113, 874, 430);
		p1.add(scrollPane_1);
		
		table = new JTable(){
			 public boolean isCellEditable(int d,int c) {
				 return false;
			 }
		 };
		table.setBorder(null);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			 //t3.setDateFormatString(table.getModel().getValueAt(ligne, 3).toString());
try {
	
	int ligne= table.getSelectedRow();
	//t9.setText(null);
	id1=null;
	// t8.setText(table.getModel().getValueAt(ligne, 0).toString());
	  id1=table.getModel().getValueAt(ligne, 0).toString();
	 //id2= table.getModel().getValueAt(ligne, 7).toString();
	 //t7.setText(table.getModel().getValueAt(ligne, 7).toString());
	// t1.setText(table.getModel().getValueAt(ligne, 1).toString());
	 //t2.setText(table.getModel().getValueAt(ligne, 2).toString());
	// t4.setText("0"+table.getModel().getValueAt(ligne, 4).toString());
	 //t5.setText(table.getModel().getValueAt(ligne, 5).toString());
	 //t6.setText(table.getModel().getValueAt(ligne, 6).toString());
	 table.setSelectionBackground(Color.getColor("a", Color.getHSBColor(520, 50, 50)));
	 table.setSelectionForeground(Color.BLACK);
	//DefaultTableModel model=(DefaultTableModel) table.getModel();
	//Date date = new SimpleDateFormat("yyyy-mm-dd").parse((String) model.getValueAt(ligne, 3).toString());
	//t3.setDate(date);
	
} catch (Exception e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
	
}		
			}
		});
		scrollPane_1.setViewportView(table);
		
		t9 = new JTextField();
		t9.setBorder(null);
		t9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				t9.setText("");
				t9.setFont(new Font("Century Gothic", Font.PLAIN, 13));
				t9.setForeground(Color.BLACK);
			}
		});
		t9.setForeground(Color.GRAY);
		t9.setFont(new Font("Century Gothic", Font.ITALIC, 13));
		t9.setBackground(Color.WHITE);
		t9.setText(" Recherche...");
		t9.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				t9.setFont(new Font("Century Gothic", Font.ITALIC, 13));
				t9.setForeground(Color.GRAY);
				t9.setText(" Recherche...");
			}
		});
		t9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
         DefaultTableModel ta=(DefaultTableModel)table.getModel(); 
			String s=t9.getText().toLowerCase();
         TableRowSorter<DefaultTableModel> tr=new  TableRowSorter<DefaultTableModel>(ta);
         table.setRowSorter(tr);
         tr.setRowFilter(RowFilter.regexFilter(s));
			
			}
		});
		t9.setBounds(30, 21, 207, 31);
		p1.add(t9);
		t9.setColumns(10);
		
		JButton btnSupprimer = new JButton("Ordonner");
		btnSupprimer.setFocusPainted(false);
		btnSupprimer.setForeground(Color.WHITE);
		btnSupprimer.setBackground(new Color(51, 204, 102));
		btnSupprimer.setBorderPainted(false);
		btnSupprimer.setBorder(null);
		btnSupprimer.setBounds(247, 21, 136, 31);
		p1.add(btnSupprimer);
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	
			if(id1!=null)  {
				layeredPane.removeAll();
				layeredPane.add(p1_1);
				layeredPane.repaint();
				layeredPane.revalidate();
				t=11;
				inter();
			}else { JOptionPane.showMessageDialog(null, "veuillez selectionner un reparateur");}
		}});
		btnSupprimer.setFont(new Font("Century Gothic", Font.BOLD, 14));
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(SystemColor.controlHighlight);
		lblNewLabel.setBounds(0, 0, 893, 70);
		p1.add(lblNewLabel);
		
		lblNewLabel_17 = new JLabel("Liste des r\u00E9parateurs ");
		lblNewLabel_17.setOpaque(true);
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_17.setBackground(SystemColor.menu);
		lblNewLabel_17.setBounds(15, 86, 252, 28);
		p1.add(lblNewLabel_17);
		 
		 p1_1 = new JPanel();
		 p1_1.setVisible(false);
		 p1_1.setBackground(Color.WHITE);
		 layeredPane.add(p1_1, "name_348603830254100");
		 p1_1.setLayout(null);
		 
		 scrollPane_5 =  new JScrollPane();
		 scrollPane_5.setBounds(10, 113, 875, 386);
		 p1_1.add(scrollPane_5);
		 
		 table_5 = new JTable() {
			 public boolean isCellEditable(int d,int c) {
				 return false;
			 }
		 };
			
			table_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {

					int ligne= table_5.getSelectedRow();
					
					
					
					
					
					
					
					//var=textf.getText();
					//t9.setText(null);
				
					// tx1.setText(table_5.getModel().getValueAt(ligne, 0).toString());
					 id45=table_5.getModel().getValueAt(ligne, 0).toString();
					 //id2= table.getModel().getValueAt(ligne, 7).toString();
					
					 table_5.setSelectionBackground(Color.getColor("a", Color.getHSBColor(520, 50, 50)));
					 table_5.setSelectionForeground(Color.BLACK);
					
					//DefaultTableModel model=(DefaultTableModel) table.getModel();
					//Date date = new SimpleDateFormat("yyyy-mm-dd").parse((String) model.getValueAt(ligne, 3).toString());
					//t3.setDate(date);
								}			
	});
		 scrollPane_5.setViewportView(table_5);
		 
		 JButton btnAjouter_4 = new JButton("Valider");
		 btnAjouter_4.setBackground(new Color(51, 204, 102));
		 btnAjouter_4.setBorder(null);
		 btnAjouter_4.setBorderPainted(false);
		 btnAjouter_4.setFocusPainted(false);
		 btnAjouter_4.setForeground(Color.WHITE);
		 btnAjouter_4.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\add\\IMAGE_ICON\\accept.png"));
		 btnAjouter_4.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 	
		 	//	JOptionPane.showMessageDialog(null,"***"+id1+"***"+id45);
		 		
				
		 		if(id45!=null) {
		 		String sql="  insert into repare (  id_reparateur ,intervention_id ,date_i,Equipement_nume  ) values ( ? , ? , ? ,?  )";
 				try {
 					pr=cnx.prepareStatement(sql);
 					PreparedStatement pr1 = cnx.prepareStatement("select equipement_nume from panne where nump = ?");
 					    pr1.setInt(1, (int)table_5.getValueAt(table_5.getSelectedRow(), 3));
 					    ResultSet rs = pr1.executeQuery();
 					    while(rs.next()) {
 					    	pr.setInt(4,rs.getInt(1));
 					    }
 						pr.setString(1,id1);
 						//String k2=t2.getText().toString();
 						pr.setInt(2,(int)table_5.getValueAt(table_5.getSelectedRow(), 0));
 						pr.setDate(3,(java.sql.Date)table_5.getValueAt(table_5.getSelectedRow(), 1));
 						
 						pr.execute();
 								JOptionPane.showMessageDialog(null,"intervention affectée") ;
 								
 								}
 					catch (SQLException ez) {
 						JOptionPane.showMessageDialog(null,"vous avez déja affecté se reparateur a cette intervention !!");
 						ez.printStackTrace();
 						}	 	
							
		 		
		 		

				
		 	}else JOptionPane.showMessageDialog(null,"veuiller choissir une intérvention") ;			
        
				}

		 		
					            }

				
		 	
		 );
		 btnAjouter_4.setFont(new Font("Century Gothic", Font.BOLD, 14));
		 btnAjouter_4.setBounds(459, 510, 136, 31);
		 p1_1.add(btnAjouter_4);
		 
		 JButton btnAnnuler_1 = new JButton("Annuler");
		 btnAnnuler_1.setBackground(new Color(255, 0, 51));
		 btnAnnuler_1.setBorder(null);
		 btnAnnuler_1.setBorderPainted(false);
		 btnAnnuler_1.setFocusPainted(false);
		 btnAnnuler_1.setForeground(Color.WHITE);
		 btnAnnuler_1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		layeredPane.removeAll();
				layeredPane.add(p1);
				layeredPane.repaint();
				layeredPane.revalidate();
				
				id45=null;
				id1=null;
		 	}
		 });
		 btnAnnuler_1.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\add\\IMAGE_ICON\\return.png"));
		 
		 	
		 btnAnnuler_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		 btnAnnuler_1.setBounds(313, 510, 136, 31);
		 p1_1.add(btnAnnuler_1);
		 
		 textField_10 = new JTextField();
		 textField_10.addKeyListener(new KeyAdapter() {
		 	@Override
		 	public void keyReleased(KeyEvent arg0) {
		 		DefaultTableModel ta=(DefaultTableModel)table_5.getModel(); 
				String s=textField_10.getText().toLowerCase();
	         TableRowSorter<DefaultTableModel> tr=new  TableRowSorter<DefaultTableModel>(ta);
	         table_5.setRowSorter(tr);
	         tr.setRowFilter(RowFilter.regexFilter(s));
		 	}
		 });
		 textField_10.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					textField_10.setText("");
					textField_10.setFont(new Font("Century Gothic", Font.PLAIN, 13));
					textField_10.setForeground(Color.BLACK);
				}
			});
		 textField_10.addFocusListener(new FocusAdapter() {
				@Override
				public void focusLost(FocusEvent arg0) {
					 textField_10.setFont(new Font("Century Gothic", Font.ITALIC, 13));
					 textField_10.setForeground(Color.GRAY);
					 textField_10.setText(" Recherche...");
				}
			});
		 textField_10.setText(" Recherche...");
		 textField_10.setForeground(Color.GRAY);
		 textField_10.setFont(new Font("Century Gothic", Font.ITALIC, 13));
		 textField_10.setColumns(10);
		 textField_10.setBorder(null);
		 textField_10.setBackground(Color.WHITE);
		 textField_10.setBounds(30, 21, 207, 31);
		 p1_1.add(textField_10);
		 
		 lblNewLabel_19 = new JLabel("");
		 lblNewLabel_19.setBackground(SystemColor.controlHighlight);
		 lblNewLabel_19.setOpaque(true);
		 lblNewLabel_19.setBounds(0, 0, 895, 70);
		 p1_1.add(lblNewLabel_19);
		 
		 lblNewLabel_20 = new JLabel("Liste des interventions valid\u00E9es non affect\u00E9es");
		 lblNewLabel_20.setOpaque(true);
		 lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel_20.setFont(new Font("Century Gothic", Font.BOLD, 15));
		 lblNewLabel_20.setBackground(SystemColor.menu);
		 lblNewLabel_20.setBounds(15, 86, 371, 28);
		 p1_1.add(lblNewLabel_20);
		 
		 
		 
		 
		 pan = new JPanel();
		 pan.setBorder(null);
		 pan.setBackground(Color.WHITE);
		 pan.setForeground(Color.WHITE);
		 layeredPane.add(pan, "name_439948061450500");
		 pan.setLayout(null);
		 
		 t8 = new JTextField();
		 t8.setBorder(null);
		 t8.setColumns(10);
		 t8.setBounds(234, 31, 193, 31);
		 pan.add(t8);
		 
		 t1 = new JTextField();
		 t1.setBorder(null);
		 t1.setColumns(10);
		 t1.setBounds(234, 72, 193, 31);
		 pan.add(t1);
		 
		 t2 = new JTextField();
		 t2.setBorder(null);
		 t2.setColumns(10);
		 t2.setBounds(234, 114, 193, 31);
		 pan.add(t2);
		 
		 t3 = new JDateChooser();
		 t3.setBorder(null);
		 t3.setBounds(234, 156, 193, 36);
		 pan.add(t3);
		 
		 t4 = new JTextField();
		 t4.setBorder(null);
		 t4.setColumns(10);
		 t4.setBounds(234, 207, 193, 31);
		 pan.add(t4);
		 
		 t7 = new JTextField();
		 t7.setBorder(null);
		 t7.setColumns(10);
		 t7.setBounds(234, 249, 193, 31);
		 pan.add(t7);
		 
		 JLabel lblNumeroIntervention = new JLabel("N\u00B0 d'intervention");
		 lblNumeroIntervention.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 lblNumeroIntervention.setBounds(23, 30, 201, 31);
		 pan.add(lblNumeroIntervention);
		 
		 JLabel lblCoutIntervention = new JLabel("Cout d'intervention");
		 lblCoutIntervention.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 lblCoutIntervention.setBounds(23, 73, 201, 31);
		 pan.add(lblCoutIntervention);
		 
		 JLabel lblTypeDintervention = new JLabel("Type d'intervention");
		 lblTypeDintervention.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 lblTypeDintervention.setBounds(23, 115, 201, 31);
		 pan.add(lblTypeDintervention);
		 
		 JLabel lblDateDintervention = new JLabel("Date d'intervention");
		 lblDateDintervention.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 lblDateDintervention.setBounds(23, 162, 201, 31);
		 pan.add(lblDateDintervention);
		 
		 JLabel lblDurDintervention = new JLabel("Dur\u00E9e d'intervention");
		 lblDurDintervention.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 lblDurDintervention.setBounds(23, 208, 201, 31);
		 pan.add(lblDurDintervention);
		 
		 JLabel lblModification = new JLabel("Modifications");
		 lblModification.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 lblModification.setBounds(464, 30, 103, 31);
		 pan.add(lblModification);
		 
		 JLabel lblRemarque = new JLabel("Remarques");
		 lblRemarque.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 lblRemarque.setBounds(464, 275, 103, 31);
		 pan.add(lblRemarque);
		 
		 JLabel lblNumeroPanne = new JLabel("N\u00B0 de panne");
		 lblNumeroPanne.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 lblNumeroPanne.setBounds(23, 249, 196, 31);
		 pan.add(lblNumeroPanne);
		 
		 btnAjouter_3 = new JButton("Valider");
		 btnAjouter_3.setFocusPainted(false);
		 btnAjouter_3.setBorder(null);
		 btnAjouter_3.setBackground(new Color(0, 204, 102));
		 btnAjouter_3.setForeground(Color.WHITE);
		 btnAjouter_3.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\add\\IMAGE_ICON\\add.png"));
		 btnAjouter_3.setFont(new Font("Century Gothic", Font.BOLD, 14));
		 btnAjouter_3.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
		 		if(m==1) {
		 		String k1=t1.getText().toString();
				 
		 		String k21=t2.getText().toString();
               
		 
		 		String k41=t4.getText().toString();
		 		
		 		String k51=t5.getText().toString();
		 
		 		String k61=t6.getText().toString();
  
		 		
		 		String kla1=t7.getText().toString();
		 
		 		String k81=t8.getText().toString();
	               	
		 		if(   k1.equals("")||k21.equals("")||k41.equals("")||t3.getDate()==null||k51.equals("")||k61.equals("")||kla1.equals("")||k81.equals("")  )
		 			JOptionPane.showMessageDialog(null,"veuillez remplire tous les champs vide ");
		 		
		 		else {
		 				String sql="  insert into intervention (  id, type_i ,date_i,dure_i,remarque,modification,panne_nump ,idagent , cout_piece ) values ( ? , ? , ?, ?, ? , ? , ? , ? ,? )";
		 				try {
		 					pr=cnx.prepareStatement(sql);
		 						String k=t8.getText().toString();
		 						pr.setString(1,k);
		 						String k2=t1.getText().toString();
		 						pr.setString(9,k2);
		 						SimpleDateFormat date =new SimpleDateFormat("yyyy-MM-dd");
		 						String k3=date.format(t3.getDate());
		 						pr.setString(3,k3);
		 						String k4=t2.getText().toString();
		 						pr.setString(2,k4);
		 						String k5=t4.getText().toString();
		 						pr.setString(4,k5);
		 						String k6=t6.getText().toString();
		 						pr.setString(5,k6);
		 						String kla=t5.getText().toString();
		 						pr.setString(6,kla);
		 						String k8=t7.getText().toString();
		 						pr.setString(7,k8);
		 						String k9 = t10.getText().toString();
		 						pr.setString(8, k9);
		 						//pr.setString(8,Logine.getCle_chef());
		 								pr.execute();
		 								//JOptionPane.showMessageDialog(null,"Reparateur ajouter") ;
		 								intervention();
		 								t2.setText(null);
		 								t4.setText(null);
		 								t1.setText(null);
		 								t5.setText(null);
		 								t6.setText(null);
		 								t7.setText(null);
		 								t8.setText(null);
		 								t3.setDate(null);}
		 					catch (SQLException ez) {
		 						JOptionPane.showMessageDialog(null,"cette intervention existe déja  !!");
		 					}}
		 			
		                }
		 	
		 	
			 	if(m==2) {
			 		                String k_1=t1.getText().toString();
			 				 		
			 				 		String k_21=t2.getText().toString();
			 		               
			 				 
			 				 		String k_41=t4.getText().toString();
			 				 		
			 				 		String k_51=t5.getText().toString();
			 				 
			 				 		String k_61=t6.getText().toString();
			 		  
			 				 		
			 				 		String k_la1=t7.getText().toString();
			 				           
			 				 		String k_81=t8.getText().toString();
			 				 		
			 				 		if(   k_1.equals("")||k_21.equals("")||t3.getDate()==null||k_41.equals("")||k_51.equals("")||k_61.equals("")||k_la1.equals("")||k_81.equals("")  )
			 				 			JOptionPane.showMessageDialog(null,"veuillez remplire tous les champs vide !","",JOptionPane.ERROR_MESSAGE);
			 				 		
			 				 		else {							
			 				 		
			 				 			 if(t8.getText().toString().length()==4 || t8.getText().toString().length()==5) {
			 				
			 				 				try {
			 				String sql=" update intervention set  id=?, type_i=? , date_i=?, dure_i=?, remarque=?, modification=?, panne_nump=? , cout_piece=?  , idagent= ? where id = ? and date_i=?";
			 				 					pr=cnx.prepareStatement(sql);
			 			 						String k=t8.getText().toString();
			 			 						pr.setString(1,k);
			 			 						String k2=t1.getText().toString();
			 			 						pr.setString(8,k2);
			 			 						SimpleDateFormat date =new SimpleDateFormat("yyyy-MM-dd");
			 			 						String k3=date.format(t3.getDate());
			 			 						pr.setString(3,k3);
			 			 						String k4=t2.getText().toString();
			 			 						pr.setString(2,k4);
			 			 						String k5=t4.getText().toString();
			 			 						pr.setString(4,k5);
			 			 						String k6=t6.getText().toString();
			 			 						pr.setString(5,k6);
			 			 						String kla=t5.getText().toString();
			 			 						pr.setString(6,kla);
			 			 						String k8=t7.getText().toString();
			 			 						pr.setString(7,k8);
			 			 						if(t10.isEnabled()) {
			 			 						String k9 = t10.getText().toString();
			 			 						pr.setString(9, k9);
			 			 						}
			 			 						pr.setString(10,k);
			 			 						pr.setString(11, k3);
			 			 						pr.executeUpdate();
			 			 						
			 				 					JOptionPane.showMessageDialog(null, "informations  modifiées !","",JOptionPane.INFORMATION_MESSAGE);
			 				 				}
			 				 				 catch (SQLException e1) {
			 				 					// TODO Auto-generated catch block
			 				 					e1.printStackTrace();
			 				 					
			 				 				}}}
			 				 				}else {  JOptionPane.showMessageDialog(null,"L'identifiant doit etre compris entre 4 et 5 chiffres ");}
			 				 				 	
			 				 		
		 	}
		 	
		 });
		 btnAjouter_3.setBounds(86, 511, 136, 31);
		 pan.add(btnAjouter_3);
		 
		 btnOurner = new JButton("Annuler");
		 btnOurner.setFocusPainted(false);
		 btnOurner.setBorder(null);
		 btnOurner.setBackground(new Color(204, 0, 51));
		 btnOurner.setForeground(Color.WHITE);
		 btnOurner.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		layeredPane.removeAll();
		 		if(t==2) {layeredPane.add(p2);}else {if(t==8){layeredPane.add(p1);}else{if(t==5) {layeredPane.add(p5); }}}
				layeredPane.repaint();
				layeredPane.revalidate();
		 	}
		 });
		 btnOurner.setFont(new Font("Century Gothic", Font.BOLD, 14));
		 btnOurner.setBounds(232, 511, 136, 31);
		 pan.add(btnOurner);
		 
		 t6 = new JTextArea();
		 t6.setBounds(577, 279, 291, 237);
		 pan.add(t6);
		 
		  t5 = new JTextArea();
		 t5.setBounds(577, 31, 291, 237);
		 pan.add(t5);
		 
		 lblNewLabel_25 = new JLabel("");
		 lblNewLabel_25.setOpaque(true);
		 lblNewLabel_25.setBackground(SystemColor.controlHighlight);
		 lblNewLabel_25.setBounds(447, 11, 438, 531);
		 pan.add(lblNewLabel_25);
		 
		 t10 = new JTextField();
		 t10.setColumns(10);
		 t10.setBorder(null);
		 t10.setBounds(234, 291, 193, 31);
		 pan.add(t10);
		 
		 JLabel lblNAgent = new JLabel("N\u00B0 Redacteur");
		 lblNAgent.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 lblNAgent.setBounds(23, 290, 196, 31);
		 pan.add(lblNAgent);
		 
		 lblNewLabel_24 = new JLabel("");
		 lblNewLabel_24.setOpaque(true);
		 lblNewLabel_24.setBackground(SystemColor.controlHighlight);
		 lblNewLabel_24.setBounds(14, 11, 423, 326);
		 pan.add(lblNewLabel_24);
		 
		
		
		
		
		 p2 = new JPanel();
		 p2.setBackground(Color.WHITE);
		layeredPane.add(p2, "name_7385635862500");
		p2.setLayout(null);
		
		JButton btnValider_1 = new JButton("Valider");
		btnValider_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table_2.isRowSelected(table_2.getSelectedRow())) {
				try {
					PreparedStatement ps = cnx.prepareStatement("update intervention set valider = 1 where id=? and date_i=?");
					ps.setInt(1, (int)table_2.getValueAt(table_2.getSelectedRow(), 0));
					ps.setDate(2,(java.sql.Date) table_2.getValueAt(table_2.getSelectedRow(), 1));
					ps.executeUpdate();
					JOptionPane.showMessageDialog(contentPane, "Intervention validée avec succés !", "", JOptionPane.INFORMATION_MESSAGE);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}else{
					JOptionPane.showMessageDialog(contentPane, "Veuillez selectionner une ligne !", "ERREUR !", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnValider_1.setForeground(Color.WHITE);
		btnValider_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnValider_1.setFocusPainted(false);
		btnValider_1.setBorderPainted(false);
		btnValider_1.setBorder(null);
		btnValider_1.setBackground(new Color(51, 204, 102));
		btnValider_1.setBounds(247, 21, 136, 31);
		p2.add(btnValider_1);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 113, 873, 430);
		p2.add(scrollPane_3);
		
		table_2 = new JTable(){
			 public boolean isCellEditable(int d,int c) {
				 return false;
			 }
		 };
//		table_2.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				
//				
//				  try {
//	
//	int ligne= table_2.getSelectedRow();
//
//	
//	 t8.setText(table_2.getModel().getValueAt(ligne, 0).toString());
//	 t2.setText(table_2.getModel().getValueAt(ligne, 1).toString());
//	 t4.setText(table_2.getModel().getValueAt(ligne, 3).toString());
//	 t5.setText(table_2.getModel().getValueAt(ligne, 4).toString());
//	 t6.setText(table_2.getModel().getValueAt(ligne, 5).toString());
//	 t7.setText(table_2.getModel().getValueAt(ligne, 6).toString());
//	 t1.setText(table_2.getModel().getValueAt(ligne, 7).toString());
//	 
//	 table_2.setSelectionBackground(Color.getColor("a", Color.getHSBColor(520, 50, 50)));
//	 table_2.setSelectionForeground(Color.BLACK);
//	DefaultTableModel model=(DefaultTableModel) table_2.getModel();
//	Date date = new SimpleDateFormat("yyyy-mm-dd").parse((String) model.getValueAt(ligne, 2).toString());
//	t3.setDate(date);
//	
//} catch (ParseException e1) {
//	// TODO Auto-generated catch block
//	e1.printStackTrace();
//	
//}		
//			
//				
//				
//				
//			}
//		});
		scrollPane_3.setViewportView(table_2);
		
		f9 = new JTextField();
		f9.setBorder(null);
		f9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				f9.setText("");
				f9.setFont(new Font("Century Gothic", Font.PLAIN, 13));
				f9.setForeground(Color.BLACK);
			}
		});
		f9.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				f9.setFont(new Font("Century Gothic", Font.ITALIC, 13));
				f9.setForeground(Color.GRAY);
				f9.setText(" Recherche...");
			}
		});
		f9.setText(" Recherche...");
		f9.setForeground(Color.GRAY);
		f9.setFont(new Font("Century Gothic", Font.ITALIC, 13));
		f9.setBackground(Color.WHITE);
		f9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				 DefaultTableModel ta=(DefaultTableModel)table_2.getModel(); 
					String s=f9.getText().toLowerCase();
		TableRowSorter<DefaultTableModel> tr=new  TableRowSorter<DefaultTableModel>(ta);
		table_2.setRowSorter(tr);
		tr.setRowFilter(RowFilter.regexFilter(s));
					
			}
		});
		f9.setBounds(30, 21, 207, 31);
		p2.add(f9);
		f9.setColumns(10);
		
		btnAnnuler_2 = new JButton("Refuser");
		btnAnnuler_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table_2.isRowSelected(table_2.getSelectedRow())) {
					try {
						PreparedStatement ps = cnx.prepareStatement("update intervention set valider = -1 where id=? and date_i=?");
						ps.setInt(1, (int)table_2.getValueAt(table_2.getSelectedRow(), 0));
						ps.setDate(2,(java.sql.Date) table_2.getValueAt(table_2.getSelectedRow(), 1));
						ps.executeUpdate();
						JOptionPane.showMessageDialog(contentPane, "Intervention refusée !", "", JOptionPane.INFORMATION_MESSAGE);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}else{
						JOptionPane.showMessageDialog(contentPane, "Veuillez selectionner une ligne !", "ERREUR !", JOptionPane.ERROR_MESSAGE);
					}
			}
		});
		btnAnnuler_2.setForeground(Color.WHITE);
		btnAnnuler_2.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnAnnuler_2.setFocusPainted(false);
		btnAnnuler_2.setBorderPainted(false);
		btnAnnuler_2.setBorder(null);
		btnAnnuler_2.setBackground(new Color(255, 0, 51));
		btnAnnuler_2.setBounds(393, 21, 136, 31);
		p2.add(btnAnnuler_2);
		
		lblNewLabel_18 = new JLabel("Liste des interventions non valid\u00E9es");
		lblNewLabel_18.setOpaque(true);
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_18.setBackground(SystemColor.menu);
		lblNewLabel_18.setBounds(15, 86, 303, 28);
		p2.add(lblNewLabel_18);
		
		label_2 = new JLabel("");
		label_2.setBackground(SystemColor.controlHighlight);
		label_2.setOpaque(true);
		label_2.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\add\\IMAGE_ICON\\loupe.png"));
		label_2.setBounds(0, 0, 893, 70);
		p2.add(label_2);
           
           p3 = new JPanel();
           p3.setBackground(Color.WHITE);
           layeredPane.add(p3, "name_400482899941800");
           p3.setLayout(null);
           
           textField_11 = new JTextField();
           textField_11.addMouseListener(new MouseAdapter() {
   			@Override
   			public void mouseClicked(MouseEvent arg0) {
   				textField_11.setText("");
   				textField_11.setFont(new Font("Century Gothic", Font.PLAIN, 13));
   				textField_11.setForeground(Color.BLACK);
   			}
   		});
           textField_11.addFocusListener(new FocusAdapter() {
   			@Override
   			public void focusLost(FocusEvent arg0) {
   				textField_11.setFont(new Font("Century Gothic", Font.ITALIC, 13));
   				textField_11.setForeground(Color.GRAY);
   				textField_11.setText(" Recherche...");
   			}
   		});
           textField_11.addKeyListener(new KeyAdapter() {
   			@Override
   			public void keyReleased(KeyEvent e) {
            DefaultTableModel ta=(DefaultTableModel)table_4.getModel(); 
   			String s=textField_11.getText().toLowerCase();
            TableRowSorter<DefaultTableModel> tr=new  TableRowSorter<DefaultTableModel>(ta);
            table_4.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(s));
   			
   			}
   		});
           textField_11.setText(" Recherche...");
           textField_11.setForeground(Color.GRAY);
           textField_11.setFont(new Font("Century Gothic", Font.ITALIC, 13));
           textField_11.setColumns(10);
           textField_11.setBorder(null);
           textField_11.setBackground(Color.WHITE);
           textField_11.setBounds(30, 21, 207, 31);
           p3.add(textField_11);
           
           JScrollPane scrollPane = new JScrollPane();
           scrollPane.setBounds(10, 113, 875, 435);
           p3.add(scrollPane);
           
           table_4 = new JTable(){
			 public boolean isCellEditable(int d,int c) {
				 return false;
			 }
		 };
           table_4.addMouseListener(new MouseAdapter() {
           	@Override
           	public void mouseClicked(MouseEvent e) {
           		int ligne= table_4.getSelectedRow();
				
				
				
				
				
				
				
				//var=textf.getText();
				//t9.setText(null);
			
				 //tx1.setText(table_5.getModel().getValueAt(ligne, 0).toString());
				  id1=table_4.getModel().getValueAt(ligne, 0).toString();
				 id22= table_4.getModel().getValueAt(ligne,4 ).toString();
				 id23= table_4.getModel().getValueAt(ligne,0 ).toString();
				 table_4.setSelectionBackground(Color.getColor("a", Color.getHSBColor(520, 50, 50)));
				 table_4.setSelectionForeground(Color.BLACK);
				
				//DefaultTableModel model=(DefaultTableModel) table.getModel();
				//Date date = new SimpleDateFormat("yyyy-mm-dd").parse((String) model.getValueAt(ligne, 3).toString());
				//t3.setDate(date);
	
           	}
           });
           scrollPane.setViewportView(table_4);
           
           JButton btnRdigerUnRapport = new JButton("Valider");
           btnRdigerUnRapport.setBorder(null);
           btnRdigerUnRapport.setBorderPainted(false);
           btnRdigerUnRapport.setFocusPainted(false);
           btnRdigerUnRapport.setBackground(new Color(0, 204, 102));
           btnRdigerUnRapport.setForeground(Color.WHITE);
           btnRdigerUnRapport.addActionListener(new ActionListener() {
           	public void actionPerformed(ActionEvent e) {
           		if(!table_4.isRowSelected(table_4.getSelectedRow()))
           			JOptionPane.showMessageDialog(null,"veuillez selectionner un rapport ");
           		else 
           		{
           			
           				
           				String requete="UPDATE rapport SET   valide=1 where idRapport ='"+table_4.getValueAt(table_4.getSelectedRow(), 0)+"'";
				try {
					pr=cnx.prepareStatement(requete);
					//pr.setString(1,t10.getText().toString());
					
					pr.executeUpdate();
				
					JOptionPane.showMessageDialog(null, "rapport validé !","",JOptionPane.INFORMATION_MESSAGE);
					rapport();
					id23=null;
					id22=null;
				}
				 catch (SQLException e1) {
					// TODO Auto-generated catch block
					//e1.printStackTrace();
					
				}
           			
           			
           			}
           		
           		}
           });
           btnRdigerUnRapport.setFont(new Font("Century Gothic", Font.BOLD, 14));
           btnRdigerUnRapport.setBounds(247, 21, 136, 31);
           p3.add(btnRdigerUnRapport);
           
           JLabel lblNewLabel_21 = new JLabel("");
           lblNewLabel_21.setOpaque(true);
           lblNewLabel_21.setBackground(SystemColor.controlHighlight);
           lblNewLabel_21.setBounds(0, 0, 895, 70);
           p3.add(lblNewLabel_21);
           
           JLabel lblNewLabel_17_1 = new JLabel("Liste des rapports d'interventions");
           lblNewLabel_17_1.setOpaque(true);
           lblNewLabel_17_1.setHorizontalAlignment(SwingConstants.CENTER);
           lblNewLabel_17_1.setFont(new Font("Century Gothic", Font.BOLD, 15));
           lblNewLabel_17_1.setBackground(SystemColor.menu);
           lblNewLabel_17_1.setBounds(15, 86, 292, 28);
           p3.add(lblNewLabel_17_1);
		
           p5 = new JPanel();
           p5.setBackground(Color.WHITE);
		layeredPane.add(p5, "name_7414096282500");
		
		textField_13 = new JTextField();
		textField_13.setBounds(30, 21, 207, 31);
		 textField_13.addMouseListener(new MouseAdapter() {
	   			@Override
	   			public void mouseClicked(MouseEvent arg0) {
	   				textField_13.setText("");
	   				textField_13.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	   				textField_13.setForeground(Color.BLACK);
	   			}
	   		});
	           textField_13.addFocusListener(new FocusAdapter() {
	   			@Override
	   			public void focusLost(FocusEvent arg0) {
	   				textField_13.setFont(new Font("Century Gothic", Font.ITALIC, 13));
	   				textField_13.setForeground(Color.GRAY);
	   				textField_13.setText(" Recherche...");
	   			}
	   		});
	           textField_13.addKeyListener(new KeyAdapter() {
	   			@Override
	   			public void keyReleased(KeyEvent e) {
	            DefaultTableModel ta=(DefaultTableModel)table_1.getModel(); 
	   			String s=textField_13.getText().toLowerCase();
	            TableRowSorter<DefaultTableModel> tr=new  TableRowSorter<DefaultTableModel>(ta);
	            table_1.setRowSorter(tr);
	            tr.setRowFilter(RowFilter.regexFilter(s));
	   			
	   			}
	   		});	
		p5.setLayout(null);
		textField_13.setText(" Recherche...");
		textField_13.setForeground(Color.GRAY);
		textField_13.setFont(new Font("Century Gothic", Font.ITALIC, 13));
		textField_13.setColumns(10);
		textField_13.setBorder(null);
		textField_13.setBackground(Color.WHITE);
		p5.add(textField_13);
		
		label = new JLabel("");
		label.setBounds(0, 0, 895, 70);
		label.setOpaque(true);
		label.setBackground(SystemColor.controlHighlight);
		p5.add(label);
		
		JScrollPane scrollPane_3_1 = new JScrollPane();
		scrollPane_3_1.setBounds(10, 113, 873, 430);
		p5.add(scrollPane_3_1);
		
		table_1 = new JTable(){
			 public boolean isCellEditable(int d,int c) {
				 return false;
			 }
		 };
		scrollPane_3_1.setViewportView(table_1);
		
		JLabel lblNewLabel_18_1 = new JLabel("Liste de vos demandes t'interventions");
		lblNewLabel_18_1.setBounds(15, 86, 303, 28);
		lblNewLabel_18_1.setOpaque(true);
		lblNewLabel_18_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18_1.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_18_1.setBackground(SystemColor.menu);
		p5.add(lblNewLabel_18_1);
		
		p8 = new JPanel();
		p8.setVisible(false);
		p8.setBackground(Color.WHITE);
		layeredPane.add(p8, "name_448297305773400");
		p8.setLayout(null);
		
		textField_14 = new JTextField();
		textField_14.addMouseListener(new MouseAdapter() {
   			@Override
   			public void mouseClicked(MouseEvent arg0) {
   				textField_14.setText("");
   				textField_14.setFont(new Font("Century Gothic", Font.PLAIN, 13));
   				textField_14.setForeground(Color.BLACK);
   			}
   		});
           textField_14.addFocusListener(new FocusAdapter() {
   			@Override
   			public void focusLost(FocusEvent arg0) {
   				textField_14.setFont(new Font("Century Gothic", Font.ITALIC, 13));
   				textField_14.setForeground(Color.GRAY);
   				textField_14.setText(" Recherche...");
   			}
   		});
           textField_14.addKeyListener(new KeyAdapter() {
   			@Override
   			public void keyReleased(KeyEvent e) {
            DefaultTableModel ta=(DefaultTableModel)table_8.getModel(); 
   			String s=textField_14.getText().toLowerCase();
            TableRowSorter<DefaultTableModel> tr=new  TableRowSorter<DefaultTableModel>(ta);
            table_8.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(s));
   			
   			}
   		});	
		textField_14.setText(" Recherche...");
		textField_14.setForeground(Color.GRAY);
		textField_14.setFont(new Font("Century Gothic", Font.ITALIC, 13));
		textField_14.setColumns(10);
		textField_14.setBorder(null);
		textField_14.setBackground(Color.WHITE);
		textField_14.setBounds(30, 21, 207, 31);
		p8.add(textField_14);
		
		label_1 = new JLabel("");
		label_1.setOpaque(true);
		label_1.setBackground(SystemColor.controlHighlight);
		label_1.setBounds(0, 0, 895, 70);
		p8.add(label_1);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 113, 875, 429);
		p8.add(scrollPane_2);
		
		table_8 = new JTable();
		scrollPane_2.setViewportView(table_8);
		
		lblNewLabel_26 = new JLabel("Liste des interventions programm\u00E9es");
		lblNewLabel_26.setOpaque(true);
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_26.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_26.setBackground(SystemColor.menu);
		lblNewLabel_26.setBounds(15, 86, 303, 28);
		p8.add(lblNewLabel_26);
		
		p4 = new JPanel();
		p4.setBackground(Color.WHITE);
		layeredPane.add(p4, "name_448303123023100");
		p4.setLayout(null);
		
		textField_12 = new JTextField();
		textField_12.addMouseListener(new MouseAdapter() {
   			@Override
   			public void mouseClicked(MouseEvent arg0) {
   				textField_12.setText("");
   				textField_12.setFont(new Font("Century Gothic", Font.PLAIN, 13));
   				textField_12.setForeground(Color.BLACK);
   			}
   		});
           textField_12.addFocusListener(new FocusAdapter() {
   			@Override
   			public void focusLost(FocusEvent arg0) {
   				textField_12.setFont(new Font("Century Gothic", Font.ITALIC, 13));
   				textField_12.setForeground(Color.GRAY);
   				textField_12.setText(" Recherche...");
   			}
   		});
           textField_12.addKeyListener(new KeyAdapter() {
   			@Override
   			public void keyReleased(KeyEvent e) {
            DefaultTableModel ta=(DefaultTableModel)table_3.getModel(); 
   			String s=textField_12.getText().toLowerCase();
            TableRowSorter<DefaultTableModel> tr=new  TableRowSorter<DefaultTableModel>(ta);
            table_3.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(s));
   			
   			}
   		});
		textField_12.setText(" Recherche...");
		textField_12.setForeground(Color.GRAY);
		textField_12.setFont(new Font("Century Gothic", Font.ITALIC, 13));
		textField_12.setColumns(10);
		textField_12.setBorder(null);
		textField_12.setBackground(Color.WHITE);
		textField_12.setBounds(30, 21, 207, 31);
		p4.add(textField_12);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 113, 875, 190);
		p4.add(scrollPane_4);
		
		table_3 = new JTable(){
			 public boolean isCellEditable(int d,int c) {
				 return false;
			 }
		 };
		 table_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if(table_3.isRowSelected(table_3.getSelectedRow())) {
						articleajouter((int)table_3.getValueAt(table_3.getSelectedRow(),0 ));
						scrollPane_11.setVisible(false);
						scrollPane_11.setVisible(true);
					}
				}
			});
		scrollPane_4.setViewportView(table_3);
		
		lblNewLabel_22 = new JLabel("");
		lblNewLabel_22.setOpaque(true);
		lblNewLabel_22.setBackground(SystemColor.controlHighlight);
		lblNewLabel_22.setBounds(0, 0, 895, 70);
		p4.add(lblNewLabel_22);
		
		lblNewLabel_23 = new JLabel("Liste des bons de commandes ");
		lblNewLabel_23.setOpaque(true);
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_23.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_23.setBackground(SystemColor.menu);
		lblNewLabel_23.setBounds(15, 86, 290, 28);
		p4.add(lblNewLabel_23);
		
		scrollPane_11 = new JScrollPane();
		scrollPane_11.setBounds(10, 342, 875, 200);
		p4.add(scrollPane_11);
		
		table_11 = new JTable();
		
		scrollPane_11.setViewportView(table_11);
		
		lblNewLabel_29 = new JLabel("Liste des artciles ");
		lblNewLabel_29.setOpaque(true);
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_29.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_29.setBackground(SystemColor.menu);
		lblNewLabel_29.setBounds(15, 315, 198, 28);
		p4.add(lblNewLabel_29);
		Font f =new Font("Arial",Font.BOLD,15);
		
		p7 = new JPanel();
		p7.setBackground(Color.WHITE);
		layeredPane.add(p7, "name_121817075301600");
		p7.setLayout(null);
		
		JLabel lblConcepteur = new JLabel("ID du r\u00E9dacteur");
		lblConcepteur.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblConcepteur.setBounds(37, 72, 188, 33);
		p7.add(lblConcepteur);
		
		JLabel lblLibell = new JLabel("ID du rapport");
		lblLibell.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblLibell.setBounds(37, 114, 188, 33);
		p7.add(lblLibell);
		
		JLabel lblPoids = new JLabel("ID de l'intervention");
		lblPoids.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblPoids.setBounds(37, 166, 188, 33);
		p7.add(lblPoids);
		
		textField = new JTextField();
		textField.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		textField.setBorder(null);
		textField.setColumns(10);
		textField.setBounds(235, 170, 217, 33);
		p7.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		textField_1.setBorder(null);
		textField_1.setColumns(10);
		textField_1.setBounds(235, 118, 217, 33);
		p7.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		textField_2.setBorder(null);
		textField_2.setColumns(10);
		textField_2.setBounds(235, 72, 217, 33);
		p7.add(textField_2);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		textField_7.setBorder(null);
		textField_7.setColumns(10);
		textField_7.setBounds(235, 258, 217, 33);
		p7.add(textField_7);
		
		JLabel lblTaille = new JLabel("Date ");
		lblTaille.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblTaille.setBounds(37, 212, 188, 33);
		p7.add(lblTaille);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBorder(null);
		dateChooser.setBounds(235, 214, 217, 33);
		p7.add(dateChooser);
		
		JLabel lblDateD = new JLabel("Type du rapport");
		lblDateD.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblDateD.setBounds(37, 258, 188, 33);
		p7.add(lblDateD);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(521, 116, 343, 219);
		p7.add(textArea);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		textField_3.setBorder(null);
		textField_3.setColumns(10);
		textField_3.setBounds(235, 302, 217, 33);
		p7.add(textField_3);
		
		JLabel lblObjetDuRapport = new JLabel("Objet du rapport");
		lblObjetDuRapport.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblObjetDuRapport.setBounds(37, 304, 188, 33);
		p7.add(lblObjetDuRapport);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblDescription.setBounds(521, 72, 188, 33);
		p7.add(lblDescription);
		
		JLabel lblNewLabel_24_1 = new JLabel("");
		lblNewLabel_24_1.setOpaque(true);
		lblNewLabel_24_1.setBackground(SystemColor.controlHighlight);
		lblNewLabel_24_1.setBounds(10, 58, 466, 300);
		p7.add(lblNewLabel_24_1);
		
		JLabel lblNewLabel_24_1_1 = new JLabel("");
		lblNewLabel_24_1_1.setOpaque(true);
		lblNewLabel_24_1_1.setBackground(SystemColor.controlHighlight);
		lblNewLabel_24_1_1.setBounds(476, 58, 409, 300);
		p7.add(lblNewLabel_24_1_1);
		
		JLabel lblNewLabel_17_2 = new JLabel("R\u00E9daction d'un nouveau rapport");
		lblNewLabel_17_2.setOpaque(true);
		lblNewLabel_17_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17_2.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_17_2.setBackground(SystemColor.menu);
		lblNewLabel_17_2.setBounds(15, 31, 320, 28);
		p7.add(lblNewLabel_17_2);
		
		JButton btnAjouter_3_1 = new JButton("Cr\u00E9er");
		btnAjouter_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnAjouter_3_1.setBackground(new Color(30, 234, 132));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnAjouter_3_1.setBackground(new Color(0, 204, 102));
			}
		});
		btnAjouter_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Login_gmao.User.equals("CS")) {
					
					
					String c1 = textField_1.getText().toString();
					String c2 = textField_2.getText().toString();
					String c3 = textField_3.getText().toString();
					String c4 = textField_7.getText().toString();
					String c5 = textArea.getText().toString();
					
					if(c1.isEmpty() ||c2.isEmpty() ||c3.isEmpty() ||c4.isEmpty() ||c5.isEmpty() ||dateChooser.getDate()==null ) {
						JOptionPane.showMessageDialog(contentPane, "Veillez remplir tout les champs !", "Erreur", JOptionPane.ERROR_MESSAGE);
					}else {
						String req = "";
						if(m==3 ) {
						 req = "Update rapport_chef_service set num_rapport=?,type=?,description=?,numch_chef_service=?,objet_rap=?,date_rap=? where num_rapport='"+table_7.getValueAt(table_7.getSelectedRow(), 0)+"'";	
						}else {
						 req = "insert into rapport_chef_service(num_rapport,type,description,numch_chef_service,objet_rap,date_rap) values(?,?,?,?,?,?)";
						}
						try {
							
							PreparedStatement pr = cnx.prepareStatement(req);
							pr.setString(1, c1);
							pr.setString(2, c4);
							pr.setString(3, c5);
							pr.setString(4, c2);
							pr.setString(5, c3);
							SimpleDateFormat date =new SimpleDateFormat("yyyy-MM-dd");
		 					String k3=date.format(dateChooser.getDate());
							pr.setString(6,k3 );
							pr.execute();
							if(m==3) {
								JOptionPane.showMessageDialog(contentPane,"Rapport modifié !","Modification",JOptionPane.INFORMATION_MESSAGE);
							}else {
							JOptionPane.showMessageDialog(contentPane,"Rapport crée !","Creation",JOptionPane.INFORMATION_MESSAGE);
							}
							textField_1.setText("");
							textField_2.setText("");
							textField_3.setText("");
							textField_7.setText("");
							textArea.setText("");
							dateChooser.setDate(null);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							JOptionPane.showMessageDialog(contentPane, "Ce rapport existe déjà !", "Erreur", JOptionPane.ERROR_MESSAGE);
						}
					}
					}else {
						String c1 = textField_1.getText().toString();
						String c2 = textField_2.getText().toString();
						String c3 = textField_3.getText().toString();
						String c4 = textField_7.getText().toString();
						String c5 = textArea.getText().toString();
						String c6 = textField.getText().toString();
						
						if(c1.isEmpty() ||c2.isEmpty() ||c3.isEmpty() ||c4.isEmpty() ||c5.isEmpty() ||dateChooser.getDate()==null || c6.isEmpty()) {
							JOptionPane.showMessageDialog(contentPane, "Veillez remplir tout les champs !", "Erreur", JOptionPane.ERROR_MESSAGE);
						}else {
							String req = "";
							if(m==3 && (int)table_7.getValueAt(table_7.getSelectedRow(), 7)!=1) {
								req = "update rapport set idRapport=?,description=?,type=?,id_reparateur=?,id_intervention=?,objet_rap=?,date_i=? where idRapport='"+table_7.getValueAt(table_7.getSelectedRow(), 0)+"'";
							}else {if( m==3 && (int)table_7.getValueAt(table_7.getSelectedRow(), 7)==1) {
								JOptionPane.showMessageDialog(contentPane, "Vous n'avez pas les droits necessaire pour modifier un rapport après validation", "Erreur", JOptionPane.ERROR_MESSAGE);
							}else {
							    req = "insert into rapport(idRapport,description,type,id_reparateur,id_intervention,objet_rap,date_i,chef_service_numch) values(?,?,?,?,?,?,?)";
							}
							}
							    try {
								PreparedStatement pr = cnx.prepareStatement(req);
								pr.setString(1, c1);
								pr.setString(2, c5);
								pr.setString(3, c3);
								pr.setString(4, c2);
								pr.setString(5, c6);
								SimpleDateFormat date =new SimpleDateFormat("yyyy-MM-dd");
			 					String k3=date.format(dateChooser.getDate());
								pr.setString(7,k3 );
								pr.setString(6, c4);
								PreparedStatement pr1 = cnx.prepareStatement("select idservice from reparateur where id=?");
								PreparedStatement pr2 = cnx.prepareStatement("select numch from chef_service where service_idservice = ?");
								pr1.setString(1, c2);
								ResultSet rs = pr1.executeQuery();
								while(rs.next()) {
									pr2.setString(1, rs.getString(1));
								}
								ResultSet rs1 = pr2.executeQuery();
								while(rs1.next()) {
									pr.setString(8, rs.getString(1));
								}
								pr.execute();
								if(m==3) {
									JOptionPane.showMessageDialog(contentPane,"Rapport modifié !","Modification",JOptionPane.INFORMATION_MESSAGE);
								}else {
								JOptionPane.showMessageDialog(contentPane,"Rapport crée !","Creation",JOptionPane.INFORMATION_MESSAGE);
								}
								textField.setText("");
								textField_1.setText("");
								textField_2.setText("");
								textField_3.setText("");
								textField_7.setText("");
								textArea.setText("");
								dateChooser.setDate(null);
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								JOptionPane.showMessageDialog(contentPane, "Ce rapport existe déjà !", "Erreur", JOptionPane.ERROR_MESSAGE);
							}
						
					}
					
				}
				layeredPane.removeAll();
		 		layeredPane.add(p7_1);
				layeredPane.repaint();
				layeredPane.revalidate();
				rapport();
				t=9;
				
			}
		});
		btnAjouter_3_1.setForeground(Color.WHITE);
		btnAjouter_3_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnAjouter_3_1.setFocusPainted(false);
		btnAjouter_3_1.setBorder(null);
		btnAjouter_3_1.setBackground(new Color(0, 204, 102));
		btnAjouter_3_1.setBounds(10, 369, 136, 31);
		p7.add(btnAjouter_3_1);
		
		JButton btnOurner_1 = new JButton("Historique");
		btnOurner_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(m==3) {
					btnOurner_1.setBackground(new Color(234, 30, 81));
				}else {
				btnOurner_1.setBackground(new Color(30, 132, 234));
				}
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				if(m==3) {
					btnOurner_1.setBackground(new Color(204, 0, 51));
				}else {
				btnOurner_1.setBackground(new Color(0, 102, 204));
				}
				}
		});
		btnOurner_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				layeredPane.removeAll();
		 		layeredPane.add(p7_1);
				layeredPane.repaint();
				layeredPane.revalidate();
				t=9;
				
			}
		});
		btnOurner_1.setForeground(Color.WHITE);
		btnOurner_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnOurner_1.setFocusPainted(false);
		btnOurner_1.setBorder(null);
		btnOurner_1.setBackground(new Color(0, 102, 204));
		btnOurner_1.setBounds(156, 369, 136, 31);
		p7.add(btnOurner_1);
		
		gradientPanel.kGradientFocus = 200;
		gradientPanel.kStartColor = new Color(0, 0, 51);
		gradientPanel.kEndColor = new Color(0, 0, 51);
		gradientPanel.setBounds(0, 0, 1113, 660);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		 
		 p8_1 = new JPanel();
		 p8_1.setLayout(null);
		 p8_1.setBackground(Color.WHITE);
		 layeredPane.add(p8_1, "name_114438912650600");
		 
		 panel_3 = new JPanel();
		 panel_3.setBackground(SystemColor.controlHighlight);
		 panel_3.setBounds(10, 43, 875, 499);
		 p8_1.add(panel_3);
		 panel_3.setLayout(null);
		 
		 textField_5 = new JTextField();
		 textField_5.setEditable(false);
		 textField_5.setBounds(221, 16, 193, 31);
		 panel_3.add(textField_5);
		 textField_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		 textField_5.setBackground(Color.LIGHT_GRAY);
		 textField_5.setColumns(10);
		 textField_5.setBorder(null);
		 
		 JLabel lblNumeroIntervention_1 = new JLabel("N\u00B0 d'intervention");
		 lblNumeroIntervention_1.setBounds(10, 15, 201, 31);
		 panel_3.add(lblNumeroIntervention_1);
		 lblNumeroIntervention_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 
		 JLabel lblCoutIntervention_1 = new JLabel("Cout d'intervention");
		 lblCoutIntervention_1.setBounds(10, 58, 201, 31);
		 panel_3.add(lblCoutIntervention_1);
		 lblCoutIntervention_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 
		 textField_6 = new JTextField();
		 textField_6.setEditable(false);
		 textField_6.setBounds(221, 57, 193, 31);
		 panel_3.add(textField_6);
		 textField_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		 textField_6.setBackground(Color.LIGHT_GRAY);
		 textField_6.setColumns(10);
		 textField_6.setBorder(null);
		 
		 textField_8 = new JTextField();
		 textField_8.setEditable(false);
		 textField_8.setBounds(221, 99, 193, 31);
		 panel_3.add(textField_8);
		 textField_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		 textField_8.setBackground(Color.LIGHT_GRAY);
		 textField_8.setColumns(10);
		 textField_8.setBorder(null);
		 
		 JLabel lblTypeDintervention_1 = new JLabel("Type d'intervention");
		 lblTypeDintervention_1.setBounds(10, 100, 201, 31);
		 panel_3.add(lblTypeDintervention_1);
		 lblTypeDintervention_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 
		 JLabel lblDateDintervention_1 = new JLabel("Date d'intervention");
		 lblDateDintervention_1.setBounds(10, 147, 201, 31);
		 panel_3.add(lblDateDintervention_1);
		 lblDateDintervention_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 
		 JDateChooser t3_1 = new JDateChooser();
		 t3_1.setBounds(221, 141, 193, 36);
		 t3_1.setFocusable(false);
		 panel_3.add(t3_1);
		 t3_1.setBackground(Color.LIGHT_GRAY);
		 t3_1.setBorder(null);
		 
		 textField_9 = new JTextField();
		 textField_9.setEditable(false);
		 textField_9.setBounds(221, 192, 193, 31);
		 panel_3.add(textField_9);
		 textField_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		 textField_9.setBackground(Color.LIGHT_GRAY);
		 textField_9.setColumns(10);
		 textField_9.setBorder(null);
		 
		 JLabel lblDurDintervention_1 = new JLabel("Dur\u00E9e d'intervention");
		 lblDurDintervention_1.setBounds(10, 193, 201, 31);
		 panel_3.add(lblDurDintervention_1);
		 lblDurDintervention_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 
		 JLabel lblNumeroPanne_1 = new JLabel("N\u00B0 de panne");
		 lblNumeroPanne_1.setBounds(10, 234, 196, 31);
		 panel_3.add(lblNumeroPanne_1);
		 lblNumeroPanne_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 
		 textField_15 = new JTextField();
		 textField_15.setEditable(false);
		 textField_15.setBounds(221, 234, 193, 31);
		 panel_3.add(textField_15);
		 textField_15.setFont(new Font("Tahoma", Font.PLAIN, 12));
		 textField_15.setBackground(Color.LIGHT_GRAY);
		 textField_15.setColumns(10);
		 textField_15.setBorder(null);
		 
		 textField_16 = new JTextField();
		 textField_16.setEditable(false);
		 textField_16.setBounds(221, 276, 193, 31);
		 panel_3.add(textField_16);
		 textField_16.setFont(new Font("Tahoma", Font.PLAIN, 12));
		 textField_16.setBackground(Color.LIGHT_GRAY);
		 textField_16.setColumns(10);
		 textField_16.setBorder(null);
		 
		 JLabel lblNAgent_1 = new JLabel("N\u00B0 Redacteur");
		 lblNAgent_1.setBounds(10, 275, 196, 31);
		 panel_3.add(lblNAgent_1);
		 lblNAgent_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 
		 JTextArea t6_1 = new JTextArea();
		 t6_1.setEditable(false);
		 t6_1.setBounds(107, 318, 307, 171);
		 panel_3.add(t6_1);
		 t6_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		 t6_1.setBackground(Color.LIGHT_GRAY);
		 
		 JTextArea t5_1 = new JTextArea();
		 t5_1.setEditable(false);
		 t5_1.setBounds(547, 15, 307, 470);
		 panel_3.add(t5_1);
		 t5_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		 t5_1.setBackground(Color.LIGHT_GRAY);
		 
		 JLabel lblModification_1 = new JLabel("Modifications");
		 lblModification_1.setBounds(434, 11, 103, 31);
		 panel_3.add(lblModification_1);
		 lblModification_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 
		 JLabel lblRemarque_1 = new JLabel("Remarques");
		 lblRemarque_1.setBounds(10, 313, 103, 31);
		 panel_3.add(lblRemarque_1);
		 lblRemarque_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 
		 JPanel panel_5 = new JPanel();
		 panel_5.setBackground(SystemColor.controlHighlight);
		 panel_5.setBounds(10, 43, 875, 499);
		 p8_1.add(panel_5);
		 panel_5.setLayout(null);
		 
		 JScrollPane scrollPane_6 = new JScrollPane();
		 scrollPane_6.setBounds(10, 11, 855, 477);
		 panel_5.add(scrollPane_6);
		 
		 table_6 = new JTable();
		 scrollPane_6.setViewportView(table_6);
		 
		 panel_4 = new JPanel();
		 panel_4.setBackground(SystemColor.controlHighlight);
		 panel_4.setBounds(10, 43, 875, 499);
		 p8_1.add(panel_4);
		 panel_4.setLayout(null);
		 
		 textField_17 = new JTextField();
		 textField_17.setEditable(false);
		 textField_17.setFont(new Font("Tahoma", Font.PLAIN, 12));
		 textField_17.setColumns(10);
		 textField_17.setBorder(null);
		 textField_17.setBackground(Color.LIGHT_GRAY);
		 textField_17.setBounds(255, 11, 257, 31);
		 panel_4.add(textField_17);
		 
		 textField_18 = new JTextField();
		 textField_18.setEditable(false);
		 textField_18.setFont(new Font("Tahoma", Font.PLAIN, 12));
		 textField_18.setColumns(10);
		 textField_18.setBorder(null);
		 textField_18.setBackground(Color.LIGHT_GRAY);
		 textField_18.setBounds(255, 52, 257, 31);
		 panel_4.add(textField_18);
		 
		 textField_19 = new JTextField();
		 textField_19.setEditable(false);
		 textField_19.setFont(new Font("Tahoma", Font.PLAIN, 12));
		 textField_19.setColumns(10);
		 textField_19.setBorder(null);
		 textField_19.setBackground(Color.LIGHT_GRAY);
		 textField_19.setBounds(255, 94, 257, 31);
		 panel_4.add(textField_19);
		 
		 textField_20 = new JTextField();
		 textField_20.setEditable(false);
		 textField_20.setFont(new Font("Tahoma", Font.PLAIN, 12));
		 textField_20.setColumns(10);
		 textField_20.setBorder(null);
		 textField_20.setBackground(Color.LIGHT_GRAY);
		 textField_20.setBounds(255, 137, 257, 31);
		 panel_4.add(textField_20);
		 
		 JTextArea t6_1_1 = new JTextArea();
		 t6_1_1.setEditable(false);
		 t6_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		 t6_1_1.setBackground(Color.LIGHT_GRAY);
		 t6_1_1.setBounds(207, 183, 307, 303);
		 panel_4.add(t6_1_1);
		 
		 JLabel lblNumeroIntervention_1_1 = new JLabel("N\u00B0 panne");
		 lblNumeroIntervention_1_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 lblNumeroIntervention_1_1.setBounds(7, 11, 201, 31);
		 panel_4.add(lblNumeroIntervention_1_1);
		 
		 JLabel lblCoutIntervention_1_1 = new JLabel("Type de panne");
		 lblCoutIntervention_1_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 lblCoutIntervention_1_1.setBounds(7, 54, 201, 31);
		 panel_4.add(lblCoutIntervention_1_1);
		 
		 JLabel lblTypeDintervention_1_1 = new JLabel("N\u00B0 equipement");
		 lblTypeDintervention_1_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 lblTypeDintervention_1_1.setBounds(7, 96, 201, 31);
		 panel_4.add(lblTypeDintervention_1_1);
		 
		 JLabel lblDateDintervention_1_1 = new JLabel("Nom equipement");
		 lblDateDintervention_1_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 lblDateDintervention_1_1.setBounds(7, 143, 201, 31);
		 panel_4.add(lblDateDintervention_1_1);
		 
		 JLabel lblDurDintervention_1_1 = new JLabel("Description");
		 lblDurDintervention_1_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 lblDurDintervention_1_1.setBounds(7, 189, 201, 31);
		 panel_4.add(lblDurDintervention_1_1);
		 
		 lblNewLabel_17_3 = new JLabel("Intervention");
		 lblNewLabel_17_3.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent arg0) {
		 		lblNewLabel_17_3.setBackground(SystemColor.controlHighlight);
		 		lblNewLabel_17_4.setBackground(SystemColor.scrollbar);
		 		lblNewLabel_17_5.setBackground(SystemColor.scrollbar);
		 		panel_5.setVisible(false);
		 		panel_3.setVisible(true);
		 		panel_4.setVisible(false);
		 	}
		 });
		 lblNewLabel_17_3.setOpaque(true);
		 lblNewLabel_17_3.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel_17_3.setFont(new Font("Century Gothic", Font.BOLD, 15));
		 lblNewLabel_17_3.setBackground(SystemColor.controlHighlight);
		 lblNewLabel_17_3.setBounds(10, 11, 150, 33);
		 p8_1.add(lblNewLabel_17_3);
		 
		 lblNewLabel_17_4 = new JLabel("Panne");
		 lblNewLabel_17_4.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent arg0) {
		 		lblNewLabel_17_3.setBackground(SystemColor.scrollbar);
		 		lblNewLabel_17_4.setBackground(SystemColor.controlHighlight);
		 		lblNewLabel_17_5.setBackground(SystemColor.scrollbar);
		 		panel_5.setVisible(false);
		 		panel_3.setVisible(false);
		 		panel_4.setVisible(true);
		 		try {
					PreparedStatement ps = cnx.prepareStatement("select * from panne where nump=?");
					PreparedStatement ps1 = cnx.prepareStatement("select nome from equipement where nume=?");
					ps.setString(1, textField_15.getText());
					ResultSet rs = ps.executeQuery();
					while(rs.next()) {
						textField_17.setText(rs.getString(1));
						textField_18.setText(rs.getString(2));
						textField_19.setText(rs.getString(4));
						t6_1_1.setText(rs.getString(3));;
						ps1.setString(1, textField_19.getText());
					}
					ResultSet rs1 = ps1.executeQuery();
					while(rs1.next()) {
						textField_20.setText(rs1.getString(1));
					}
					layeredPane.removeAll();
			   		layeredPane.add(p8_1);
            	} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		 		
		 	}
		 });
		 lblNewLabel_17_4.setOpaque(true);
		 lblNewLabel_17_4.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel_17_4.setFont(new Font("Century Gothic", Font.BOLD, 15));
		 lblNewLabel_17_4.setBackground(SystemColor.scrollbar);
		 lblNewLabel_17_4.setBounds(170, 11, 150, 33);
		 p8_1.add(lblNewLabel_17_4);
		 
		 lblNewLabel_17_5 = new JLabel("Historique Panne");
		 lblNewLabel_17_5.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent arg0) {
		 		lblNewLabel_17_3.setBackground(SystemColor.scrollbar);
		 		lblNewLabel_17_4.setBackground(SystemColor.scrollbar);
		 		lblNewLabel_17_5.setBackground(SystemColor.controlHighlight);
		 		panel_5.setVisible(true);
		 		panel_3.setVisible(false);
		 		panel_4.setVisible(false);
		 		try {
					PreparedStatement ps = cnx.prepareStatement("select date as 'Date de la panne',heure as 'Heure de la panne' from historique where panne_nump= ?");
					ps.setString(1, textField_15.getText());
					ResultSet rs = ps.executeQuery();
					table_6.setModel(DbUtils.resultSetToTableModel(rs));
					JTableHeader theader=table_6.getTableHeader();
					theader.setBackground(Color.LIGHT_GRAY);
					theader.setForeground(Color.black);
					theader.setFont(new Font("tahome",Font.BOLD,14));
					table_6.setFont(new Font("tahome",Font.BOLD,12));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 		
		 	}
		 });
		 lblNewLabel_17_5.setOpaque(true);
		 lblNewLabel_17_5.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel_17_5.setFont(new Font("Century Gothic", Font.BOLD, 15));
		 lblNewLabel_17_5.setBackground(SystemColor.scrollbar);
		 lblNewLabel_17_5.setBounds(330, 11, 150, 33);
		 p8_1.add(lblNewLabel_17_5);
		
		 p7_1 = new JPanel();
		 p7_1.setBackground(Color.WHITE);
		 layeredPane.add(p7_1, "");
		p7_1.setBounds(0, 0, 10, 10);
		p7_1.setLayout(null);
		
		textField_4 = new JTextField();
		textField_4.addMouseListener(new MouseAdapter() {
   			@Override
   			public void mouseClicked(MouseEvent arg0) {
   				textField_4.setText("");
   				textField_4.setFont(new Font("Century Gothic", Font.PLAIN, 13));
   				textField_4.setForeground(Color.BLACK);
   			}
   		});
           textField_4.addFocusListener(new FocusAdapter() {
   			@Override
   			public void focusLost(FocusEvent arg0) {
   				textField_4.setFont(new Font("Century Gothic", Font.ITALIC, 13));
   				textField_4.setForeground(Color.GRAY);
   				textField_4.setText(" Recherche...");
   			}
   		});
           textField_4.addKeyListener(new KeyAdapter() {
   			@Override
   			public void keyReleased(KeyEvent e) {
            DefaultTableModel ta=(DefaultTableModel)table_7.getModel(); 
   			String s=textField_4.getText().toLowerCase();
            TableRowSorter<DefaultTableModel> tr=new  TableRowSorter<DefaultTableModel>(ta);
            table_7.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(s));
   			
   			}
   		});
		textField_4.setText(" Recherche...");
		textField_4.setForeground(Color.GRAY);
		textField_4.setFont(new Font("Century Gothic", Font.ITALIC, 13));
		textField_4.setColumns(10);
		textField_4.setBorder(null);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(30, 21, 207, 31);
		p7_1.add(textField_4);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(10, 113, 875, 429);
		p7_1.add(scrollPane_7);
		
		table_7 = new JTable() {public boolean isCellEditable(int d,int c) {
			 return false;
		 }
	 };
      ;
		table_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
	           		int ligne= table_7.getSelectedRow();
					
					
					
					
					
					
					
					//var=textf.getText();
					//t9.setText(null);
				
					 //tx1.setText(table_5.getModel().getValueAt(ligne, 0).toString());
					  //id1=table.getModel().getValueAt(ligne, 0).toString();
					 id22= table_7.getModel().getValueAt(ligne,4 ).toString();
					 id23= table_7.getModel().getValueAt(ligne,0 ).toString();
					 table_4.setSelectionBackground(Color.getColor("a", Color.getHSBColor(520, 50, 50)));
					 table_4.setSelectionForeground(Color.BLACK);
					
					//DefaultTableModel model=(DefaultTableModel) table.getModel();
					//Date date = new SimpleDateFormat("yyyy-mm-dd").parse((String) model.getValueAt(ligne, 3).toString());
					//t3.setDate(date);
		
				
			}
		});
		scrollPane_7.setViewportView(table_7);
		
		label_3 = new JLabel("");
		label_3.setOpaque(true);
		label_3.setBackground(SystemColor.controlHighlight);
		label_3.setBounds(0, 0, 895, 70);
		p7_1.add(label_3);
		
		lblNewLabel_27 = new JLabel("Historique des rapports cr\u00E9es");
		lblNewLabel_27.setOpaque(true);
		lblNewLabel_27.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_27.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_27.setBackground(SystemColor.controlHighlight);
		lblNewLabel_27.setBounds(15, 86, 269, 28);
		p7_1.add(lblNewLabel_27);
		
		p6 = new JPanel();
		p6.setBackground(Color.WHITE);
		layeredPane.add(p6, "name_196950753168400");
		p6.setLayout(null);
		
		textField_24 = new JTextField();
		textField_24.addMouseListener(new MouseAdapter() {
   			@Override
   			public void mouseClicked(MouseEvent arg0) {
   				textField_24.setText("");
   				textField_24.setFont(new Font("Century Gothic", Font.PLAIN, 13));
   				textField_24.setForeground(Color.BLACK);
   			}
   		});
           textField_24.addFocusListener(new FocusAdapter() {
   			@Override
   			public void focusLost(FocusEvent arg0) {
   				textField_24.setFont(new Font("Century Gothic", Font.ITALIC, 13));
   				textField_24.setForeground(Color.GRAY);
   				textField_24.setText(" Recherche...");
   			}
   		});
           textField_24.addKeyListener(new KeyAdapter() {
   			@Override
   			public void keyReleased(KeyEvent e) {
            DefaultTableModel ta=(DefaultTableModel)table_12.getModel(); 
   			String s=textField_24.getText().toLowerCase();
            TableRowSorter<DefaultTableModel> tr=new  TableRowSorter<DefaultTableModel>(ta);
            table_12.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(s));
   			
   			}
   		});
		textField_24.setText(" Recherche...");
		textField_24.setForeground(Color.GRAY);
		textField_24.setFont(new Font("Century Gothic", Font.ITALIC, 13));
		textField_24.setColumns(10);
		textField_24.setBorder(null);
		textField_24.setBackground(Color.WHITE);
		textField_24.setBounds(30, 21, 207, 31);
		p6.add(textField_24);
		
		JLabel lblNewLabel_22_1 = new JLabel("");
		lblNewLabel_22_1.setOpaque(true);
		lblNewLabel_22_1.setBackground(SystemColor.controlHighlight);
		lblNewLabel_22_1.setBounds(0, 0, 895, 70);
		p6.add(lblNewLabel_22_1);
		
		JScrollPane scrollPane_12 = new JScrollPane();
		scrollPane_12.setBounds(10, 115, 875, 427);
		p6.add(scrollPane_12);
		
		table_12 = new JTable();
		scrollPane_12.setViewportView(table_12);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setBounds(20, 101, -299, -238);
		p6.add(label_4);
		
		lblNewLabel_30 = new JLabel("Historique du journal de bord ");
		lblNewLabel_30.setOpaque(true);
		lblNewLabel_30.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_30.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_30.setBackground(SystemColor.menu);
		lblNewLabel_30.setBounds(15, 86, 290, 28);
		p6.add(lblNewLabel_30);
		
		p4_1 = new JPanel();
		p4_1.setLayout(null);
		p4_1.setBackground(Color.WHITE);
		layeredPane.add(p4_1, "name_200978390958000");
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(493, 23, 380, 73);
		p4_1.add(textArea_1);
		
		textField_21 = new JTextField();
		textField_21.setBorder(null);
		textField_21.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_21.setColumns(10);
		textField_21.setBounds(184, 23, 189, 31);
		p4_1.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setBorder(null);
		textField_22.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_22.setColumns(10);
		textField_22.setBounds(184, 65, 189, 31);
		p4_1.add(textField_22);
		
		lblNBonDe = new JLabel("N\u00B0 Bon de commande");
		lblNBonDe.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNBonDe.setBounds(21, 21, 163, 33);
		p4_1.add(lblNBonDe);
		
		lblNService = new JLabel("N\u00B0 Service");
		lblNService.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNService.setBounds(21, 65, 163, 33);
		p4_1.add(lblNService);
		
		lblDscription = new JLabel("D\u00E9scription");
		lblDscription.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblDscription.setBounds(402, 21, 81, 33);
		p4_1.add(lblDscription);
		
		btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_21.setText("");
				textField_22.setText("");
				textField_23.setText("");
				textArea_1.setText("");
				articleajouter();
				layeredPane.removeAll();
				layeredPane.add(p4);
				t=4;
				layeredPane.repaint();
				layeredPane.revalidate();
				JOptionPane.showMessageDialog(contentPane, "Bon de commande crée !", "Création", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnValider.setBackground(new Color(51, 204, 102));
		btnValider.setBorder(null);
		btnValider.setForeground(Color.WHITE);
		btnValider.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnValider.setBounds(743, 498, 130, 36);
		p4_1.add(btnValider);
		
		JButton btnAjouter_5 = new JButton("Ajouter");
		btnAjouter_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAjouter_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
				PreparedStatement ps1 = cnx.prepareStatement("select * from boncommande where id_bon_commande=?");
				
				ps1.setString(1, textField_21.getText());
				ResultSet rs = ps1.executeQuery();
				if(rs.next()) {
					if(table_9.isRowSelected(table_9.getSelectedRow()) && !textField_23.getText().isEmpty() ) {
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
	                            + ",couleur )"
	                            + " values (?, ? , ? , ? , ?, ? , ? , ? , ? , ? , ? , ? , ?   )";
			try {
				pr=cnx.prepareStatement(sql);
					
					pr.setString(1,textField_21.getText().toString());
					pr.setInt(2,(int)table_9.getValueAt(table_9.getSelectedRow(), 0));
					pr.setInt(3,(int)table_9.getValueAt(table_9.getSelectedRow(), 1));
					pr.setDate(4,(java.sql.Date)table_9.getValueAt(table_9.getSelectedRow(), 2));
					//SimpleDateFormat date =new SimpleDateFormat("yyyy-MM-dd");
					pr.setDate(5,(java.sql.Date)table_9.getValueAt(table_9.getSelectedRow(), 3));
					//String k4=x6.getText().toString();
					pr.setString(6,(String)table_9.getValueAt(table_9.getSelectedRow(), 4));
					//String k5=x7.getText().toString();
					pr.setString(7,(String)table_9.getValueAt(table_9.getSelectedRow(), 5));
					//String k6=x8.getText().toString();
					pr.setString(8,(String)table_9.getValueAt(table_9.getSelectedRow(), 6));
					//String kla=x9.getText().toString();
					pr.setString(9,(String)table_9.getValueAt(table_9.getSelectedRow(), 7));
					//String k8=x10.getText().toString();
					pr.setDouble(10,(Double)table_9.getValueAt(table_9.getSelectedRow(), 8));					
					//String k8ez=x11.getText().toString();
					pr.setDouble(11,(Double)table_9.getValueAt(table_9.getSelectedRow(), 9));					
					pr.setString(12,textField_23.getText());
					pr.setString(13,(String)table_9.getValueAt(table_9.getSelectedRow(), 10));
					pr.execute();					
					textField_23.setText(null);//pr.setString(8,Logine.getCle_chef());
					
							//JOptionPane.showMessageDialog(null,"Reparateur ajouter") ;
							articleajouter();
	  	}
				catch (MySQLIntegrityConstraintViolationException e1) {
					//JOptionPane.showMessageDialog(null,"cette article existe déja dans ce bon  !!");
					 JOptionPane.showMessageDialog(contentPane, "Cette article a déjà été ajouter !", "Erreur", JOptionPane.ERROR_MESSAGE);
					}		
						
					}
				}else {
					String sql1="  insert into boncommande ( id_bon_commande,"
	                        + "id_chef_service "
	                        + ",idservice"
	                        + ",datecreation"
	                        + ",idmagasinier"
	                        + ",description)"
	                        + " values (?, ? , ? , ? , ?, ?   )";
		try {
			pr=cnx.prepareStatement(sql1);
				
				pr.setString(1,textField_21.getText());
			
				pr.setString(2,Login_gmao.id);//login.getclechef();
				
				pr.setString(3,textField_22.getText());
				
				pr.setString(4,l2.getText());//TEMPS
				
				pr.setString(5,"1");//idmagasinier
				//String k4=x6.getText().toString();
				pr.setString(6,textArea_1.getText());
						pr.execute();
						
		                				
		}
			catch (SQLException ez) {
				//JOptionPane.showMessageDialog(null,"ce numero de bon commande existe déja   !!");
				ez.printStackTrace();
				}				
					
					if(table_9.isRowSelected(table_9.getSelectedRow()) && !textField_23.getText().isEmpty() ) {
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
	                            + ",couleur )"
	                            + " values (?, ? , ? , ? , ?, ? , ? , ? , ? , ? , ? , ? , ?   )";
			try {
				pr=cnx.prepareStatement(sql);
					
					pr.setString(1,textField_21.getText().toString());
					pr.setInt(2,(int)table_9.getValueAt(table_9.getSelectedRow(), 0));
					pr.setInt(3,(int)table_9.getValueAt(table_9.getSelectedRow(), 1));
					pr.setDate(4,(java.sql.Date)table_9.getValueAt(table_9.getSelectedRow(), 2));
					//SimpleDateFormat date =new SimpleDateFormat("yyyy-MM-dd");
					pr.setDate(5,(java.sql.Date)table_9.getValueAt(table_9.getSelectedRow(), 3));
					//String k4=x6.getText().toString();
					pr.setString(6,(String)table_9.getValueAt(table_9.getSelectedRow(), 4));
					//String k5=x7.getText().toString();
					pr.setString(7,(String)table_9.getValueAt(table_9.getSelectedRow(), 5));
					//String k6=x8.getText().toString();
					pr.setString(8,(String)table_9.getValueAt(table_9.getSelectedRow(), 6));
					//String kla=x9.getText().toString();
					pr.setString(9,(String)table_9.getValueAt(table_9.getSelectedRow(), 7));
					//String k8=x10.getText().toString();
					pr.setDouble(10,(Double)table_9.getValueAt(table_9.getSelectedRow(), 8));					
					//String k8ez=x11.getText().toString();
					pr.setDouble(11,(Double)table_9.getValueAt(table_9.getSelectedRow(), 9));					
					pr.setString(12,textField_23.getText());
					pr.setString(13,(String)table_9.getValueAt(table_9.getSelectedRow(), 10));
					pr.execute();					
					textField_23.setText(null);//pr.setString(8,Logine.getCle_chef());
					
							//JOptionPane.showMessageDialog(null,"Reparateur ajouter") ;
							articleajouter();
	  	}
				catch (SQLException ez) {
					//JOptionPane.showMessageDialog(null,"cette article existe déja dans ce bon  !!");
					ez.printStackTrace();
					}		
						
					}
				}
				}catch(SQLException e) {
					e.printStackTrace();
				}
				
			}
		});
		btnAjouter_5.setBackground(new Color(51, 102, 204));
		btnAjouter_5.setForeground(Color.WHITE);
		btnAjouter_5.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnAjouter_5.setBounds(733, 330, 140, 31);
		p4_1.add(btnAjouter_5);
		
		textField_23 = new JTextField();
		textField_23.setBorder(null);
		textField_23.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_23.setColumns(10);
		textField_23.setBounds(518, 330, 177, 28);
		p4_1.add(textField_23);
		
		JLabel lblQuantit = new JLabel("Quantit\u00E9");
		lblQuantit.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblQuantit.setBounds(439, 328, 69, 34);
		p4_1.add(lblQuantit);
		
		JScrollPane scrollPane_9 = new JScrollPane();
		scrollPane_9.setBounds(21, 168, 852, 151);
		p4_1.add(scrollPane_9);
		
		table_9 = new JTable();
		scrollPane_9.setViewportView(table_9);
		
		JScrollPane scrollPane_10 = new JScrollPane();
		scrollPane_10.setBounds(22, 394, 698, 140);
		p4_1.add(scrollPane_10);
		
		table_10 = new JTable();
		scrollPane_10.setViewportView(table_10);
		
		JLabel lblNewLabel_28 = new JLabel("");
		lblNewLabel_28.setOpaque(true);
		lblNewLabel_28.setBackground(SystemColor.controlHighlight);
		lblNewLabel_28.setBounds(10, 11, 875, 99);
		p4_1.add(lblNewLabel_28);
		
		lblNewLabel_17_6 = new JLabel("Liste des artciles disponible");
		lblNewLabel_17_6.setOpaque(true);
		lblNewLabel_17_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17_6.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_17_6.setBackground(SystemColor.menu);
		lblNewLabel_17_6.setBounds(15, 121, 239, 28);
		p4_1.add(lblNewLabel_17_6);
		
		lblNewLabel_28_2 = new JLabel("");
		lblNewLabel_28_2.setOpaque(true);
		lblNewLabel_28_2.setBackground(SystemColor.controlHighlight);
		lblNewLabel_28_2.setBounds(10, 382, 723, 160);
		p4_1.add(lblNewLabel_28_2);
		
		lblNewLabel_17_7 = new JLabel("Liste des artciles ajout\u00E9s");
		lblNewLabel_17_7.setOpaque(true);
		lblNewLabel_17_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17_7.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_17_7.setBackground(SystemColor.menu);
		lblNewLabel_17_7.setBounds(15, 355, 239, 28);
		p4_1.add(lblNewLabel_17_7);
		
		lblNewLabel_28_3 = new JLabel("");
		lblNewLabel_28_3.setOpaque(true);
		lblNewLabel_28_3.setBackground(Color.WHITE);
		lblNewLabel_28_3.setBounds(10, 334, 419, 200);
		p4_1.add(lblNewLabel_28_3);
		
		JLabel lblNewLabel_28_1 = new JLabel("");
		lblNewLabel_28_1.setOpaque(true);
		lblNewLabel_28_1.setBackground(SystemColor.controlHighlight);
		lblNewLabel_28_1.setBounds(10, 148, 875, 223);
		p4_1.add(lblNewLabel_28_1);
		
		btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAnnuler.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int reponse = JOptionPane.showConfirmDialog(contentPane, "Etes-vous sur de vouloir annuler?", "Suppression", JOptionPane.YES_NO_CANCEL_OPTION);
				
				if(reponse==JOptionPane.YES_OPTION){
				try {
					PreparedStatement ps1 = cnx.prepareStatement("select * from boncommande where id_bon_commande=?");
					
					ps1.setString(1, textField_21.getText());
					ResultSet rs = ps1.executeQuery();
					while(rs.next()) {
						PreparedStatement ps = cnx.prepareStatement("delete from boncommande where id_bon_commande=?");
						ps.setString(1, textField_21.getText());
						ps.execute();
					}
					textField_21.setText("");
					textField_22.setText("");
					textField_23.setText("");
					textArea_1.setText("");
					articleajouter();
					layeredPane.removeAll();
					layeredPane.add(p4);
					t=4;
					layeredPane.repaint();
					layeredPane.revalidate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
		});
		btnAnnuler.setForeground(Color.WHITE);
		btnAnnuler.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnAnnuler.setBorder(null);
		btnAnnuler.setBackground(new Color(204, 0, 51));
		btnAnnuler.setBounds(743, 455, 130, 36);
		p4_1.add(btnAnnuler);
		
		p4_2 = new JPanel();
		p4_2.setBackground(Color.WHITE);
		layeredPane.add(p4_2, "name_224461339009200");
		p4_2.setLayout(null);
		
		scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(127, 26, 633, 502);
		p4_2.add(scrollPane_8);
		
		texte = new JTextArea();
		scrollPane_8.setViewportView(texte);
		
		lblNewLabel_28_4 = new JLabel("");
		lblNewLabel_28_4.setOpaque(true);
		lblNewLabel_28_4.setBackground(SystemColor.controlHighlight);
		lblNewLabel_28_4.setBounds(10, 11, 875, 531);
		p4_2.add(lblNewLabel_28_4);
		
		p6_1 = new JPanel();
		layeredPane.add(p6_1, "name_1131744949231500");
		p6_1.setLayout(null);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setFont(new Font("Candara", Font.BOLD, 17));
		textArea_2.setBounds(10, 37, 862, 463);
		p6_1.add(textArea_2);
		
		JLabel lblNewLabel_23_1 = new JLabel("");
		lblNewLabel_23_1.setOpaque(true);
		lblNewLabel_23_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_23_1.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_23_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_23_1.setBounds(15, 11, 463, 28);
		p6_1.add(lblNewLabel_23_1);
		
		JButton btnAnnuler_1_1 = new JButton("Retour");
		btnAnnuler_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Etat = 1;
		 		layeredPane.removeAll();
		 		layeredPane.add(p6);
		 		layeredPane.repaint();
		 		layeredPane.revalidate();
		 		t=6;
		 		journal();
			}
		});
		btnAnnuler_1_1.setForeground(Color.WHITE);
		btnAnnuler_1_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnAnnuler_1_1.setFocusPainted(false);
		btnAnnuler_1_1.setBorderPainted(false);
		btnAnnuler_1_1.setBorder(null);
		btnAnnuler_1_1.setBackground(new Color(255, 0, 51));
		btnAnnuler_1_1.setBounds(736, 511, 136, 31);
		p6_1.add(btnAnnuler_1_1);
		
		p6_2 = new JPanel();
		p6_2.setBackground(Color.WHITE);
		layeredPane.add(p6_2, "name_1135201359067800");
		p6_2.setLayout(null);
		
		textField_25 = new JTextField();
		textField_25.setBorder(null);
		textField_25.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		textField_25.setBackground(Color.WHITE);
		textField_25.setBounds(155, 25, 193, 35);
		p6_2.add(textField_25);
		textField_25.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		textField_27.setColumns(10);
		textField_27.setBorder(null);
		textField_27.setBackground(Color.WHITE);
		textField_27.setBounds(155, 117, 564, 35);
		p6_2.add(textField_27);
		
		lblTypeDintervention_2 = new JLabel("Id de l'agent");
		lblTypeDintervention_2.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		lblTypeDintervention_2.setBounds(26, 25, 119, 31);
		p6_2.add(lblTypeDintervention_2);
		
		lblTypeDintervention_3 = new JLabel("Date ");
		lblTypeDintervention_3.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		lblTypeDintervention_3.setBounds(26, 71, 119, 31);
		p6_2.add(lblTypeDintervention_3);
		
		JDateChooser t3_1_1 = new JDateChooser();
		t3_1_1.setFocusable(false);
		t3_1_1.setBorder(null);
		t3_1_1.setBackground(Color.LIGHT_GRAY);
		t3_1_1.setBounds(155, 71, 193, 35);
		p6_2.add(t3_1_1);
		
		JLabel lblTypeDintervention_3_1 = new JLabel("Tache");
		lblTypeDintervention_3_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		lblTypeDintervention_3_1.setBounds(26, 119, 119, 31);
		p6_2.add(lblTypeDintervention_3_1);
		
		JButton btnAjouter_5_1 = new JButton("Ajouter");
		btnAjouter_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea_3.setText(textArea_3.getText()+"- "+textField_27.getText()+"\n");
				textField_27.setText("");
				
			}
		});
		btnAjouter_5_1.setForeground(Color.WHITE);
		btnAjouter_5_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnAjouter_5_1.setBackground(new Color(51, 102, 204));
		btnAjouter_5_1.setBounds(729, 116, 142, 35);
		p6_2.add(btnAjouter_5_1);
		
		lblNewLabel_31 = new JLabel("");
		lblNewLabel_31.setOpaque(true);
		lblNewLabel_31.setBackground(SystemColor.controlHighlight);
		lblNewLabel_31.setBounds(10, 11, 875, 161);
		p6_2.add(lblNewLabel_31);
		
		textArea_3 = new JTextArea("");
		textArea_3.setEditable(false);
		textArea_3.setFont(new Font("Candara", Font.BOLD, 17));
		textArea_3.setBounds(20, 193, 851, 296);
		p6_2.add(textArea_3);
		
		JLabel lblNewLabel_31_1 = new JLabel("");
		lblNewLabel_31_1.setOpaque(true);
		lblNewLabel_31_1.setBackground(SystemColor.controlHighlight);
		lblNewLabel_31_1.setBounds(10, 183, 875, 318);
		p6_2.add(lblNewLabel_31_1);
		
		JButton btnValider_2 = new JButton("Valider");
		btnValider_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sql="";
				String sql1="";
				try {
					if(m==6) {
						sql1 ="update journal set DateJ=?,Idagent=?,taches=?,idchef=? where Datej=? and Idagent=?";
						    PreparedStatement ps1= cnx.prepareStatement(sql1);  
						    SimpleDateFormat d =new SimpleDateFormat("yyyy-MM-dd");
						    String k4=d.format(t3_1_1.getDate());
						    ps1.setString(1, k4);
							ps1.setString(2, textField_25.getText());
							ps1.setString(4, Login_gmao.id);
							ps1.setString(3, textArea_3.getText());
							ps1.setDate(5, (java.sql.Date) table_12.getValueAt(table_12.getSelectedRow(), 1));
							ps1.setString(6,""+(int)table_12.getValueAt(table_12.getSelectedRow(), 0));
							ps1.execute();
							JOptionPane.showMessageDialog(contentPane, "Enregistrement modifié avec succés !", "Journal de bord", JOptionPane.INFORMATION_MESSAGE);
					}else {
						 sql="insert into journal values(?,?,?,?)";
						 PreparedStatement ps = cnx.prepareStatement(sql);
							SimpleDateFormat date =new SimpleDateFormat("yyyy-MM-dd");
						    String k3=date.format(t3_1_1.getDate());
						    ps.setString(1, k3);
							ps.setString(2, textField_25.getText());
							ps.setString(4, Login_gmao.id);
							ps.setString(3, textArea_3.getText());
							ps.execute();
							JOptionPane.showMessageDialog(contentPane, "Enregistrement ajouté avec succés !", "Journal de bord", JOptionPane.INFORMATION_MESSAGE);
					}
					
					
					
					
					Etat = 1;
			 		layeredPane.removeAll();
			 		layeredPane.add(p6);
			 		layeredPane.repaint();
			 		layeredPane.revalidate();
			 		t=6;
			 		journal();
					
					
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		});
		btnValider_2.setForeground(Color.WHITE);
		btnValider_2.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnValider_2.setBorder(null);
		btnValider_2.setBackground(new Color(51, 204, 102));
		btnValider_2.setBounds(729, 507, 142, 35);
		p6_2.add(btnValider_2);
		//gradientPanel.add(pan8);
		
		panel = new JPanel();
		panel.setVisible(false);
		panel.setForeground(Color.BLACK);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 169, 200, 483);
		gradientPanel.add(panel);
		panel.setLayout(null);
		
		 a1 = new JLabel("Journal de bord");
		 a1.setIconTextGap(20);
		 a1.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\test.png"));
		 a1.setOpaque(true);
		 a1.setHorizontalAlignment(SwingConstants.CENTER);
		 a1.setBounds(0, 250, 200, 50);
		 panel.add(a1);
		 a1.setBackground(SystemColor.controlHighlight);
		 if(Login_gmao.User.equals("CS") || Login_gmao.User.equals("A")) {
		 a1.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent e) {
		 		Etat = 1;
		 		layeredPane.removeAll();
		 		layeredPane.add(p6);
		 		layeredPane.repaint();
		 		layeredPane.revalidate();
		 		t=6;
		 		if(Login_gmao.User.equals("CS")) {
		 		a2.setBackground(SystemColor.controlHighlight);
		 		a3.setBackground(SystemColor.controlHighlight);
		 		a4.setBackground(SystemColor.controlHighlight);
		 		a5.setBackground(SystemColor.controlHighlight);
		 		a6.setBackground(SystemColor.controlHighlight);
		 		lblInterventions.setBackground(SystemColor.controlHighlight);
		 		}else {
		 		a7.setBackground(SystemColor.controlHighlight);
		 		}
		 		Interface();
		 		a1.setBackground(SystemColor.WHITE);
		 		journal();
		 	
		 	}
		 	@Override
		 	public void mouseEntered(MouseEvent e) {
		 		if(Etat!=1) {
					a1.setBackground(SystemColor.control);
				}
		 	}
		 	@Override
		 	public void mouseExited(MouseEvent e) {
		 		if(Etat!=1) {
					a1.setBackground(SystemColor.controlHighlight);
				}
		 	}
		 });
		 }
		 a1.setFont(new Font("Century Gothic", Font.BOLD, 15));
		 a1.setForeground(Color.BLACK);
		 
		  a2 = new JLabel("<html>Ordonancement <br/>des interventions</html>");
		  a2.setIconTextGap(15);
		  a2.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\maintenance.png"));
		  a2.setOpaque(true);
		  a2.setHorizontalAlignment(SwingConstants.CENTER);
		  a2.setBounds(0, 0, 200, 50);
		  panel.add(a2);
		  a2.setBackground(SystemColor.controlHighlight);
		   if(Login_gmao.User.equals("CS")) {
		  a2.addMouseListener(new MouseAdapter() {
		  	@Override
		  	public void mouseClicked(MouseEvent e) {
		  		layeredPane.removeAll();
		  		layeredPane.add(p1);
		  		t=1;
		  		layeredPane.repaint();
		  		layeredPane.revalidate();
		  		uptable2();
		  		Etat = 2;
		 		a1.setBackground(SystemColor.controlHighlight);
		 		a3.setBackground(SystemColor.controlHighlight);
		 		a4.setBackground(SystemColor.controlHighlight);
		 		a5.setBackground(SystemColor.controlHighlight);
		 		a6.setBackground(SystemColor.controlHighlight);
		 		lblInterventions.setBackground(SystemColor.controlHighlight);
		 		a2.setBackground(SystemColor.WHITE);
		  	}
		  	@Override
		  	public void mouseEntered(MouseEvent e) {
		  		if(Etat!=2) {
					a2.setBackground(SystemColor.control);
				}
		  	}
		  	@Override
		  	public void mouseExited(MouseEvent e) {
		  		if(Etat!=2) {
					a2.setBackground(SystemColor.controlHighlight);
				}
		  	}
		  });
		   }
		  a2.setFont(new Font("Century Gothic", Font.BOLD, 15));
		  a2.setForeground(Color.BLACK);
		  
		   a4 = new JLabel("R\u00E9diger un rapport");
		   a4.setAlignmentX(0.5f);
		   a4.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\paper.png"));
		   a4.setOpaque(true);
		   a4.setBackground(SystemColor.controlHighlight);
		   a4.setHorizontalAlignment(SwingConstants.CENTER);
		   a4.setBounds(0, 300, 200, 50);
		   panel.add(a4);
		   if(Login_gmao.User.equals("CS") || Login_gmao.User.equals("R")) {
		   a4.addMouseListener(new MouseAdapter() {
		   	@Override
		   	public void mouseClicked(MouseEvent e) {
		   		btnOurner_1.setBackground(new Color(0, 102, 204));
            	btnOurner_1.setText("Historique");
            	btnAjouter_3_1.setText("Créer");
		   		m=1;
		   		t=7;
		   		Etat = 4;
		   		if(Login_gmao.User.equals("CS")) {
		   		textField.setEnabled(false);
				textField.setBackground(SystemColor.LIGHT_GRAY);
		 		a2.setBackground(SystemColor.controlHighlight);
		 		a3.setBackground(SystemColor.controlHighlight);
		 		a1.setBackground(SystemColor.controlHighlight);
		 		a5.setBackground(SystemColor.controlHighlight);
		 		a6.setBackground(SystemColor.controlHighlight);
		   		}
		   		layeredPane.removeAll();
		   		layeredPane.add(p7);
		   		layeredPane.repaint();
		   		layeredPane.revalidate();
		   		Interface();
		 		lblInterventions.setBackground(SystemColor.controlHighlight);
		 		a4.setBackground(SystemColor.WHITE);
		   	    rapport();
		   	}
		   	@Override
		   	public void mouseEntered(MouseEvent e) {
		   		if(Etat!=4) {
					a4.setBackground(SystemColor.control);
				}
		   	}
		   	@Override
		   	public void mouseExited(MouseEvent e) {
		   		if(Etat!=4) {
					a4.setBackground(SystemColor.controlHighlight);
				}
		   	}
		   });
		   }
		   a4.setForeground(Color.BLACK);
		   a4.setFont(new Font("Century Gothic", Font.BOLD, 15));
		   
		    a3 = new JLabel("<html>Gestion <br/>des Interventions</html>");
		    a3.setIconTextGap(20);
		    a3.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\content (2).png"));
		    a3.setOpaque(true);
		    a3.setBackground(SystemColor.controlHighlight);
		    a3.setHorizontalAlignment(SwingConstants.CENTER);
		    a3.setBounds(0, 50, 200, 50);
		    panel.add(a3);
		    if(Login_gmao.User.equals("CS")) {
		    a3.addMouseListener(new MouseAdapter() {
		    	@Override
		    	public void mouseClicked(MouseEvent e) {
		    		inter2();
		    		layeredPane.removeAll();
		    		layeredPane.add(p2);
		    		t=2;
		    		layeredPane.repaint();
		    		layeredPane.revalidate();
		    		Etat = 3;
			 		a2.setBackground(SystemColor.controlHighlight);
			 		a1.setBackground(SystemColor.controlHighlight);
			 		a4.setBackground(SystemColor.controlHighlight);
			 		a5.setBackground(SystemColor.controlHighlight);
			 		a6.setBackground(SystemColor.controlHighlight);
			 		lblInterventions.setBackground(SystemColor.controlHighlight);
			 		a3.setBackground(SystemColor.WHITE);
//		    	uptable();
		    	pan.setVisible(false);
		    	}
		    	@Override
		    	public void mouseEntered(MouseEvent e) {
		    		if(Etat!=3) {
						a3.setBackground(SystemColor.control);
					}
		    	}
		    	@Override
		    	public void mouseExited(MouseEvent e) {
		    		if(Etat!=3) {
						a3.setBackground(SystemColor.controlHighlight);
					}
		    	}
		    });
		    }
		    a3.setForeground(Color.BLACK);
		    a3.setFont(new Font("Century Gothic", Font.BOLD, 15));
		    
		    a6 = new JLabel("R\u00E9diger un bon");
		    a6.setHorizontalTextPosition(SwingConstants.RIGHT);
		    a6.setIconTextGap(25);
		    a6.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\invoice (1).png"));
		    a6.setOpaque(true);
		    a6.setBackground(SystemColor.controlHighlight);
		    a6.setHorizontalAlignment(SwingConstants.CENTER);
		    a6.setBounds(0, 150, 200, 50);
		    panel.add(a6);
		    if(Login_gmao.User.equals("CS")) {
		    a6.addMouseListener(new MouseAdapter() {
		    	@Override
		    	public void mouseClicked(MouseEvent e) {
		    		layeredPane.removeAll();
				layeredPane.add(p4);
				t=4;
				layeredPane.repaint();
				layeredPane.revalidate();
//				uptable11();
				Etat = 6;
		 		a2.setBackground(SystemColor.controlHighlight);
		 		a3.setBackground(SystemColor.controlHighlight);
		 		a4.setBackground(SystemColor.controlHighlight);
		 		a5.setBackground(SystemColor.controlHighlight);
		 		a1.setBackground(SystemColor.controlHighlight);
		 		lblInterventions.setBackground(SystemColor.controlHighlight);
		 		a6.setBackground(SystemColor.WHITE);
		 		Interface();
		 		selectbon();
		    	}
		    	@Override
		    	public void mouseEntered(MouseEvent e) {
		    		if(Etat!=6) {
						a6.setBackground(SystemColor.control);
					}
		    	}
		    	@Override
		    	public void mouseExited(MouseEvent e) {
		    		if(Etat!=6) {
						a6.setBackground(SystemColor.controlHighlight);
					}
		    	}
		    });
		    }
		    a6.setForeground(Color.BLACK);
		    a6.setFont(new Font("Century Gothic", Font.BOLD, 15));
		    
		     a7 = new JLabel("<html>Demande <br/>d'intervention</html>");
		     a7.setIconTextGap(35);
		     a7.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\question.png"));
		     a7.setOpaque(true);
		     a7.setBackground(SystemColor.controlHighlight);
		     a7.setHorizontalAlignment(SwingConstants.CENTER);
		     a7.setBounds(0, 200, 200, 50);
		     panel.add(a7);
		     if(Login_gmao.User.equals("A")) {
		     a7.addMouseListener(new MouseAdapter() {
		     	@Override
		     	public void mouseClicked(MouseEvent e) {
		     	layeredPane.removeAll();
				layeredPane.add(p5);
				t=5;
				layeredPane.repaint();
				layeredPane.revalidate();
				inter2();
		         
				Etat = 7;
				
				Interface();
				a1.setBackground(SystemColor.controlHighlight);
		 		a7.setBackground(SystemColor.WHITE);
		     	}
		     	@Override
		     	public void mouseEntered(MouseEvent e) {
		     		if(Etat!=7) {
						a7.setBackground(SystemColor.control);
					}
		     	}
		     	@Override
		     	public void mouseExited(MouseEvent e) {
		     		if(Etat!=7) {
						a7.setBackground(SystemColor.controlHighlight);
					}
		     	}
		     });
		     }
		     a7.addKeyListener(new KeyAdapter() {

		     });
		     a7.setForeground(Color.BLACK);
		     a7.setFont(new Font("Century Gothic", Font.BOLD, 15));
		     
		      a5 = new JLabel("<html>Rapports <br/>d'interventions </html>");
		      a5.setIconTextGap(35);
		      a5.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\report.png"));
		      a5.setOpaque(true);
		      a5.setBackground(SystemColor.controlHighlight);
		      a5.setHorizontalAlignment(SwingConstants.CENTER);
		      a5.setBounds(0, 100, 200, 50);
		      panel.add(a5);
		      if(Login_gmao.User.equals("CS")) {
		      a5.addMouseListener(new MouseAdapter() {
		      	@Override
		      	public void mouseClicked(MouseEvent e) {
		      		
		        layeredPane.removeAll();
				layeredPane.add(p3);
				t=3;
				layeredPane.repaint();
				layeredPane.revalidate();
				rapport();
				
				Etat = 5;
		 		a2.setBackground(SystemColor.controlHighlight);
		 		a3.setBackground(SystemColor.controlHighlight);
		 		a4.setBackground(SystemColor.controlHighlight);
		 		a1.setBackground(SystemColor.controlHighlight);
		 		a6.setBackground(SystemColor.controlHighlight);
		 		lblInterventions.setBackground(SystemColor.controlHighlight);
		 		a5.setBackground(SystemColor.WHITE);
		 		Interface();
		      	}
		      	@Override
		      	public void mouseEntered(MouseEvent e) {
		      		if(Etat!=5) {
						a5.setBackground(SystemColor.control);
					}
		      	}
		      	@Override
		      	public void mouseExited(MouseEvent e) {
		      		if(Etat!=5) {
						a5.setBackground(SystemColor.controlHighlight);
					}
		      	}
		      });
		      }
		      a5.setFont(new Font("Century Gothic", Font.BOLD, 15));
		      a5.setForeground(Color.BLACK);
		      
		      lblInterventions = new JLabel("Interventions");
		      if(Login_gmao.User.equals("CS") || Login_gmao.User.equals("R")) {
		      lblInterventions.addMouseListener(new MouseAdapter() {
		      	@Override
		      	public void mouseClicked(MouseEvent e) {
		      		layeredPane.removeAll();
			   		layeredPane.add(p8);
			   		t=8;
			   		layeredPane.repaint();
			   		layeredPane.revalidate();
			   		Etat = 8;
			   		inter2();
			   		if(Login_gmao.User.equals("CS")) {
			 		a2.setBackground(SystemColor.controlHighlight);
			 		a3.setBackground(SystemColor.controlHighlight);
			 		a1.setBackground(SystemColor.controlHighlight);
			 		a5.setBackground(SystemColor.controlHighlight);
			 		a6.setBackground(SystemColor.controlHighlight);
			   		}
			   		Interface();
			 		a4.setBackground(SystemColor.controlHighlight);
			 		lblInterventions.setBackground(SystemColor.WHITE);
		      	}
		      	@Override
		      	public void mouseEntered(MouseEvent e) {
		      		if(Etat!=8) {
						lblInterventions.setBackground(SystemColor.control);
					}
		      	}
		      	@Override
		      	public void mouseExited(MouseEvent e) {
		      		if(Etat!=8) {
						lblInterventions.setBackground(SystemColor.controlHighlight);
					}
		      	}
		      });
		      }
		      lblInterventions.setIconTextGap(40);
		      lblInterventions.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\maintenance (1).png"));
		      lblInterventions.setOpaque(true);
		      lblInterventions.setHorizontalAlignment(SwingConstants.CENTER);
		      lblInterventions.setForeground(Color.BLACK);
		      lblInterventions.setFont(new Font("Century Gothic", Font.BOLD, 15));
		      lblInterventions.setBackground(SystemColor.controlHighlight);
		      lblInterventions.setBounds(0, 350, 200, 50);
		      panel.add(lblInterventions);
		
		panel_1 = new JPanel();
		panel_1.setVisible(false);
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(411, 35, 318, 64);
		gradientPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\icons8-administrator-male-60.png"));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(1004, 11, 60, 54);
		panel_1.add(lblNewLabel_3);
		
		JLabel p12 = new JLabel("sign out");
		p12.setBounds(983, 76, 91, 30);
		panel_1.add(p12);
		p12.setFont(new Font("MS Reference Sans Serif", Font.BOLD | Font.ITALIC, 17));
		p12.setForeground(Color.RED);
		
		separator = new JSeparator();
		separator.setBackground(Color.GRAY);
		separator.setForeground(Color.GRAY);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(315, 9, 2, 45);
		panel_1.add(separator);
		
		lblNewBtn = new JLabel("");
		lblNewBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnOurner_1.setBackground(new Color(0, 102, 204));
            	btnOurner_1.setText("Historique");
            	btnAjouter_3_1.setText("Créer");
				m=1;
				if(t==5 || t==8) {
				layeredPane.removeAll();
				layeredPane.add(pan);
				layeredPane.repaint();
				layeredPane.revalidate();
				t10.setText(lblNewLabel_11_1.getText());
				
				
                }
                if(t==4) {
                	layeredPane.removeAll();
    				layeredPane.add(p4_1);
    				layeredPane.repaint();
    				layeredPane.revalidate();
    				selectarticle();
    				t=41;
                }
                if(t==9) {
                	layeredPane.removeAll();
    				layeredPane.add(p7);
    				layeredPane.repaint();
    				layeredPane.revalidate();
    				t=7;
                
                }
                if(t==6) {
                	if(Login_gmao.User.equals("CS")) {
                	m=5;
                	layeredPane.removeAll();
    				layeredPane.add(p6_2);
    				layeredPane.repaint();
    				layeredPane.revalidate();
    				t=62;
    				textArea_3.setEditable(false);
                	}
                }
			
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblNew.setBackground(SystemColor.controlHighlight);
				lblNewBtn.setBackground(SystemColor.controlHighlight);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNew.setBackground(SystemColor.LIGHT_GRAY);
				lblNewBtn.setBackground(SystemColor.LIGHT_GRAY);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lblNewBtn.setBackground(SystemColor.control);
				lblNew.setBackground(SystemColor.control);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblNewBtn.setBackground(SystemColor.LIGHT_GRAY);
				lblNew.setBackground(SystemColor.LIGHT_GRAY);
			}
		});
		lblNewBtn.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\file (2).png"));
		lblNewBtn.setOpaque(true);
		lblNewBtn.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewBtn.setBackground(Color.LIGHT_GRAY);
		lblNewBtn.setBounds(0, 1, 50, 42);
		panel_1.add(lblNewBtn);
		
		lblNew = new JLabel("NEW");
		lblNew.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnOurner_1.setBackground(new Color(0, 102, 204));
            	btnOurner_1.setText("Historique");
            	btnAjouter_3_1.setText("Créer");
				m=1;
				if(t==5 || t==8) {
					layeredPane.removeAll();
					layeredPane.add(pan);
					layeredPane.repaint();
					layeredPane.revalidate();
					if(t==8) {
						t10.setEnabled(false);
						t10.setBackground(SystemColor.LIGHT_GRAY);
					}
					
	                }
	                if(t==4) {
	                	layeredPane.removeAll();
	    				layeredPane.add(p4_1);
	    				layeredPane.repaint();
	    				layeredPane.revalidate();
	    				selectarticle();
	                }
	                if(t==9) {
	                	layeredPane.removeAll();
	    				layeredPane.add(p7);
	    				layeredPane.repaint();
	    				layeredPane.revalidate();
	                	
	                }
	                if(t==6) {
	                	m=5;
	                	layeredPane.removeAll();
	    				layeredPane.add(p6_2);
	    				layeredPane.repaint();
	    				layeredPane.revalidate();
	    				t=62;
	    				textArea_3.setEditable(false);
	                }
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblNew.setBackground(SystemColor.controlHighlight);
				lblNewBtn.setBackground(SystemColor.controlHighlight);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNew.setBackground(SystemColor.LIGHT_GRAY);
				lblNewBtn.setBackground(SystemColor.LIGHT_GRAY);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lblNewBtn.setBackground(SystemColor.control);
				lblNew.setBackground(SystemColor.control);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblNewBtn.setBackground(SystemColor.LIGHT_GRAY);
				lblNew.setBackground(SystemColor.LIGHT_GRAY);
			}
		});
		lblNew.setOpaque(true);
		lblNew.setHorizontalAlignment(SwingConstants.CENTER);
		lblNew.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblNew.setBackground(Color.LIGHT_GRAY);
		lblNew.setBounds(0, 42, 50, 23);
		panel_1.add(lblNew);
		
		lblDeleteBtn = new JLabel("");
		lblDeleteBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
                if( t==2 ) {
                	if(!table_2.isRowSelected(table_2.getSelectedRow())) {JOptionPane.showMessageDialog(null, "Veuillez selectionner une intervention !");}else {
                		int reponse = JOptionPane.showConfirmDialog(contentPane, "Etes-vous sur de vouloir supprimer cette intervention ?", "Suppression", JOptionPane.YES_NO_CANCEL_OPTION);
        				
        				if(reponse==JOptionPane.YES_OPTION){
    					
    									String sql1=" delete from intervention where  id=? and date_i";
    									try {
    										pr=cnx.prepareStatement(sql1);
    										pr.setInt(1,(int)table_2.getValueAt(table_2.getSelectedRow(), 0));
    				 						pr.setDate(2,(java.sql.Date)table_2.getValueAt(table_2.getSelectedRow(), 1));
    										pr.execute();
    										intervention();
    										t2.setText(null);
    										t4.setText(null);
    										t1.setText(null);
    										t5.setText(null);
    										t6.setText(null);
    										t7.setText(null);
    										t8.setText(null);
    										t3.setDate(null);
    									
    									} catch (SQLException e1) {
    								
    										
    										e1.printStackTrace();
    									}
    			}
    		}
                	}
                
                if(t==8) {
                	if(!table_8.isRowSelected(table_8.getSelectedRow())) {JOptionPane.showMessageDialog(null, "Veuillez selectionner une intervention !");}else {
                		int reponse = JOptionPane.showConfirmDialog(contentPane, "Etes-vous sur de vouloir supprimer cette intervention ?", "Suppression", JOptionPane.YES_NO_CANCEL_OPTION);
        				
        				if(reponse==JOptionPane.YES_OPTION){
    					
    									String sql1=" delete from intervention where  id=? and date_i";
    									try {
    										pr=cnx.prepareStatement(sql1);
    										pr.setInt(1,(int)table_8.getValueAt(table_8.getSelectedRow(), 0));
    				 						pr.setDate(2,(java.sql.Date)table_8.getValueAt(table_8.getSelectedRow(), 1));
    										pr.execute();
    										intervention();
    										t2.setText(null);
    										t4.setText(null);
    										t1.setText(null);
    										t5.setText(null);
    										t6.setText(null);
    										t7.setText(null);
    										t8.setText(null);
    										t3.setDate(null);
    									
    									} catch (SQLException e1) {
    								
    										
    										e1.printStackTrace();
    									}
    			}
    		}	
                }
                
                
                if(t==5 && table_1.isRowSelected(table_1.getSelectedRow()) && (int)table_1.getValueAt(table_1.getSelectedRow(), 4)==0) {
                 int reponse = JOptionPane.showConfirmDialog(contentPane, "Etes-vous sur de vouloir supprimer cette intervention ?", "Suppression", JOptionPane.YES_NO_CANCEL_OPTION);
				
				if(reponse==JOptionPane.YES_OPTION){
					
    			String sql1=" delete from intervention where  id=? and date_i=?";
    			try {
					pr=cnx.prepareStatement(sql1);
					pr.setInt(1,(int)table_1.getValueAt(table_1.getSelectedRow(), 0));
					pr.setDate(2,(java.sql.Date)table_1.getValueAt(table_1.getSelectedRow(), 1));
					pr.execute();
					inter2();
					JOptionPane.showMessageDialog(contentPane, "Intervention supprimée !", "Suppression", JOptionPane.INFORMATION_MESSAGE);
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
    		}else {
    			if(t==5 && !table_1.isRowSelected(table_1.getSelectedRow())){
    				JOptionPane.showMessageDialog(contentPane, "Veuillez selectionner une intervention !", "Erreur", JOptionPane.ERROR_MESSAGE);
    			}else{
    				if(t==5 && (int)table_1.getValueAt(table_1.getSelectedRow(), 4)!=0) {
    					JOptionPane.showMessageDialog(contentPane, "Vous n'avez pas l'autorisation de supprimer une intervention validée !", "Erreur", JOptionPane.ERROR_MESSAGE);
    				}
    			}
    		}
                
                
            if(t==9 && table_7.isRowSelected(table_7.getSelectedRow()) && Login_gmao.User.equals("CS")) {
                int reponse = JOptionPane.showConfirmDialog(contentPane, "Etes-vous sur de vouloir supprimer ce rapport ?", "Suppression", JOptionPane.YES_NO_CANCEL_OPTION);
				
				if(reponse==JOptionPane.YES_OPTION){
					
   			String sql1=" delete from rapport_chef_service where  num_rapport=? and date_rap=?";
   			try {
					pr=cnx.prepareStatement(sql1);
					pr.setInt(1,(int)table_7.getValueAt(table_7.getSelectedRow(), 0));
					pr.setDate(2,(java.sql.Date)table_7.getValueAt(table_7.getSelectedRow(), 3));
					pr.execute();
					rapport();
					JOptionPane.showMessageDialog(contentPane, "Rapport supprimé !", "Suppression", JOptionPane.INFORMATION_MESSAGE);
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
            }else {
            	if(!Login_gmao.User.equals("CS")) {
            		JOptionPane.showMessageDialog(contentPane, "Vous n'avez pas les droits necessaire pour supprimer un rapport !", "Erreur", JOptionPane.ERROR_MESSAGE);
            	}
            }
    		if(t==6 && table_12.isRowSelected(table_12.getSelectedRow()) && Login_gmao.User.equals("CS")) {
                int reponse = JOptionPane.showConfirmDialog(contentPane, "Etes-vous sur de vouloir supprimer ce journal ?", "Suppression", JOptionPane.YES_NO_CANCEL_OPTION);
				
				if(reponse==JOptionPane.YES_OPTION){
    			String sql1=" delete from journal where  Idagent=? and DateJ=?";
       			try {
    					pr=cnx.prepareStatement(sql1);
    					pr.setInt(1,(int)table_12.getValueAt(table_12.getSelectedRow(), 0));
    					pr.setDate(2,(java.sql.Date)table_12.getValueAt(table_12.getSelectedRow(), 1));
    					pr.execute();
    					journal();
    					JOptionPane.showMessageDialog(contentPane, "journal supprimé !", "Suppression", JOptionPane.INFORMATION_MESSAGE);
    					
    				} catch (SQLException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
				}
    		}
                
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblDeleteBtn.setBackground(SystemColor.controlHighlight);
				lblDelete.setBackground(SystemColor.controlHighlight);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblDeleteBtn.setBackground(SystemColor.LIGHT_GRAY);
				lblDelete.setBackground(SystemColor.LIGHT_GRAY);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lblDeleteBtn.setBackground(SystemColor.control);
				lblDelete.setBackground(SystemColor.control);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblDeleteBtn.setBackground(SystemColor.LIGHT_GRAY);
				lblDelete.setBackground(SystemColor.LIGHT_GRAY);
			}
		});
		lblDeleteBtn.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\file (3).png"));
		lblDeleteBtn.setOpaque(true);
		lblDeleteBtn.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeleteBtn.setBackground(Color.LIGHT_GRAY);
		lblDeleteBtn.setBounds(51, 1, 50, 42);
		panel_1.add(lblDeleteBtn);
		
		lblDelete = new JLabel("DELETE");
		lblDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if( t==2 ) {
                	if(!table_2.isRowSelected(table_2.getSelectedRow())) {JOptionPane.showMessageDialog(null, "Veuillez selectionner une intervention !");}else {
                		int reponse = JOptionPane.showConfirmDialog(contentPane, "Etes-vous sur de vouloir supprimer cette intervention ?", "Suppression", JOptionPane.YES_NO_CANCEL_OPTION);
        				
        				if(reponse==JOptionPane.YES_OPTION){
    					
    									String sql1=" delete from intervention where  id=? and date_i";
    									try {
    										pr=cnx.prepareStatement(sql1);
    										pr.setInt(1,(int)table_2.getValueAt(table_2.getSelectedRow(), 0));
    				 						pr.setDate(2,(java.sql.Date)table_2.getValueAt(table_2.getSelectedRow(), 1));
    										pr.execute();
    										intervention();
    										t2.setText(null);
    										t4.setText(null);
    										t1.setText(null);
    										t5.setText(null);
    										t6.setText(null);
    										t7.setText(null);
    										t8.setText(null);
    										t3.setDate(null);
    									
    									} catch (SQLException e1) {
    								
    										
    										e1.printStackTrace();
    									}
    			}
    		}
                	}
                
                if(t==8) {
                	if(!table_8.isRowSelected(table_8.getSelectedRow())) {JOptionPane.showMessageDialog(null, "Veuillez selectionner une intervention !");}else {
                		int reponse = JOptionPane.showConfirmDialog(contentPane, "Etes-vous sur de vouloir supprimer cette intervention ?", "Suppression", JOptionPane.YES_NO_CANCEL_OPTION);
        				
        				if(reponse==JOptionPane.YES_OPTION){
    					
    									String sql1=" delete from intervention where  id=? and date_i";
    									try {
    										pr=cnx.prepareStatement(sql1);
    										pr.setInt(1,(int)table_8.getValueAt(table_8.getSelectedRow(), 0));
    				 						pr.setDate(2,(java.sql.Date)table_8.getValueAt(table_8.getSelectedRow(), 1));
    										pr.execute();
    										intervention();
    										t2.setText(null);
    										t4.setText(null);
    										t1.setText(null);
    										t5.setText(null);
    										t6.setText(null);
    										t7.setText(null);
    										t8.setText(null);
    										t3.setDate(null);
    									
    									} catch (SQLException e1) {
    								
    										
    										e1.printStackTrace();
    									}
    			}
    		}	
                }
                
                
                if(t==5 && table_1.isRowSelected(table_1.getSelectedRow()) && (int)table_1.getValueAt(table_1.getSelectedRow(), 4)==0) {
                 int reponse = JOptionPane.showConfirmDialog(contentPane, "Etes-vous sur de vouloir supprimer cette intervention ?", "Suppression", JOptionPane.YES_NO_CANCEL_OPTION);
				
				if(reponse==JOptionPane.YES_OPTION){
					
    			String sql1=" delete from intervention where  id=? and date_i=?";
    			try {
					pr=cnx.prepareStatement(sql1);
					pr.setInt(1,(int)table_1.getValueAt(table_1.getSelectedRow(), 0));
					pr.setDate(2,(java.sql.Date)table_1.getValueAt(table_1.getSelectedRow(), 1));
					pr.execute();
					inter2();
					JOptionPane.showMessageDialog(contentPane, "Intervention supprimée !", "Suppression", JOptionPane.INFORMATION_MESSAGE);
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
    		}else {
    			if(!table_1.isRowSelected(table_1.getSelectedRow())){
    				JOptionPane.showMessageDialog(contentPane, "Veuillez selectionner une intervention !", "Erreur", JOptionPane.ERROR_MESSAGE);
    			}else{
    				if((int)table_1.getValueAt(table_1.getSelectedRow(), 4)!=0) {
    					JOptionPane.showMessageDialog(contentPane, "Vous n'avez pas l'autorisation de supprimer une intervention validée !", "Erreur", JOptionPane.ERROR_MESSAGE);
    				}
    			}
    		}
                
                
            if(t==9 && table_7.isRowSelected(table_7.getSelectedRow()) && Login_gmao.User.equals("CS")) {
                int reponse = JOptionPane.showConfirmDialog(contentPane, "Etes-vous sur de vouloir supprimer ce rapport ?", "Suppression", JOptionPane.YES_NO_CANCEL_OPTION);
				
				if(reponse==JOptionPane.YES_OPTION){
					
   			String sql1=" delete from rapport_chef_service where  num_rapport=? and date_rap=?";
   			try {
					pr=cnx.prepareStatement(sql1);
					pr.setInt(1,(int)table_7.getValueAt(table_7.getSelectedRow(), 0));
					pr.setDate(2,(java.sql.Date)table_7.getValueAt(table_7.getSelectedRow(), 3));
					pr.execute();
					rapport();
					JOptionPane.showMessageDialog(contentPane, "Rapport supprimé !", "Suppression", JOptionPane.INFORMATION_MESSAGE);
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
            }else {
            	if(!Login_gmao.User.equals("CS")) {
            		JOptionPane.showMessageDialog(contentPane, "Vous n'avez pas les droits necessaire pour supprimer un rapport !", "Erreur", JOptionPane.ERROR_MESSAGE);
            	}
            }	
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblDeleteBtn.setBackground(SystemColor.controlHighlight);
				lblDelete.setBackground(SystemColor.controlHighlight);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblDeleteBtn.setBackground(SystemColor.LIGHT_GRAY);
				lblDelete.setBackground(SystemColor.LIGHT_GRAY);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lblDeleteBtn.setBackground(SystemColor.control);
				lblDelete.setBackground(SystemColor.control);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblDeleteBtn.setBackground(SystemColor.LIGHT_GRAY);
				lblDelete.setBackground(SystemColor.LIGHT_GRAY);
			}
		});
		lblDelete.setOpaque(true);
		lblDelete.setHorizontalAlignment(SwingConstants.CENTER);
		lblDelete.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblDelete.setBackground(Color.LIGHT_GRAY);
		lblDelete.setBounds(51, 42, 50, 23);
		panel_1.add(lblDelete);
		
		lblEditBtn = new JLabel("");
		lblEditBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				m=2;
                if(t==2 && table_2.isRowSelected(table_2.getSelectedRow())) {
                	layeredPane.removeAll();
    				layeredPane.add(pan);
    				
                	try {
						PreparedStatement ps = cnx.prepareStatement("select * from intervention where id=? and date_i=?");
						ps.setInt(1, (int)table_2.getValueAt(table_2.getSelectedRow(), 0));
						ps.setDate(2, (java.sql.Date)table_2.getValueAt(table_2.getSelectedRow(), 1));
						ResultSet rs = ps.executeQuery();
						while(rs.next()) {
							t8.setText(rs.getString(1));
							t1.setText(rs.getString(2));
							t2.setText(rs.getString(4));
							t3.setDate(rs.getDate(3));
							t4.setText(rs.getString(6));
							t7.setText(rs.getString(7));
							t5.setText(rs.getString(5));
							t6.setText(rs.getString(8));
							t10.setText(rs.getString(9));
							
						}
                	} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
                }else { if(!table_7.isRowSelected(table_7.getSelectedRow()) && t==2) {
                	JOptionPane.showMessageDialog(contentPane, "Veuillez selectionner une intervention !", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
                }
                if(t==8 && Login_gmao.User.equals("CS") && table_8.isRowSelected(table_8.getSelectedRow())) {
                	layeredPane.removeAll();
    				layeredPane.add(pan);
                	try {
						PreparedStatement ps = cnx.prepareStatement("select * from intervention where id=? and date_i=?");
						ps.setInt(1, (int)table_8.getValueAt(table_8.getSelectedRow(), 0));
						ps.setDate(2, (java.sql.Date)table_8.getValueAt(table_8.getSelectedRow(), 1));
						ResultSet rs = ps.executeQuery();
						while(rs.next()) {
							t8.setText(rs.getString(1));
							t1.setText(rs.getString(2));
							t2.setText(rs.getString(4));
							t3.setDate(rs.getDate(3));
							t4.setText(rs.getString(6));
							t7.setText(rs.getString(7));
							t5.setText(rs.getString(5));
							t6.setText(rs.getString(8));
							t10.setText(rs.getString(9));
							
						}
                	} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
                }else { if(!table_8.isRowSelected(table_8.getSelectedRow()) && t==8) {
                	JOptionPane.showMessageDialog(contentPane, "Veuillez selectionner une intervention !", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
                }
                
                if(t==5 && (int)table_1.getValueAt(table_1.getSelectedRow(), 4) ==0  && table_1.isRowSelected(table_1.getSelectedRow())) {
                	layeredPane.removeAll();
    				layeredPane.add(pan);
                	try {
						PreparedStatement ps = cnx.prepareStatement("select * from intervention where id=? and date_i=?");
						ps.setInt(1, (int)table_1.getValueAt(table_1.getSelectedRow(), 0));
						ps.setDate(2, (java.sql.Date)table_1.getValueAt(table_1.getSelectedRow(), 1));
						ResultSet rs = ps.executeQuery();
						while(rs.next()) {
							t8.setText(rs.getString(1));
							t1.setText(rs.getString(2));
							t2.setText(rs.getString(4));
							t3.setDate(rs.getDate(3));
							t4.setText(rs.getString(6));
							t7.setText(rs.getString(7));
							t5.setText(rs.getString(5));
							t6.setText(rs.getString(8));
							t10.setText(rs.getString(9));
							
						}
                	} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
                }else { if(!table_1.isRowSelected(table_1.getSelectedRow()) && t==5) {
                	JOptionPane.showMessageDialog(contentPane, "Veuillez selectionner une intervention !", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
                }
                if(t==9 && table_7.isRowSelected(table_7.getSelectedRow())) {
                	m=3;
                	btnOurner_1.setBackground(new Color(204, 0, 51));
                	btnOurner_1.setText("Annuler");
                	btnAjouter_3_1.setText("Modifier");
                	if( Login_gmao.User.equals("CS")){
                	try {
                		textField.setEnabled(false);
                		textField.setBackground(SystemColor.LIGHT_GRAY);
                		layeredPane.removeAll();
        				layeredPane.add(p7);
						PreparedStatement ps = cnx.prepareStatement("select * from rapport_chef_service where num_rapport=? and date_rap=?");
						ps.setInt(1, (int)table_7.getValueAt(table_7.getSelectedRow(), 0));
						ps.setDate(2, (java.sql.Date)table_7.getValueAt(table_7.getSelectedRow(), 3));
						ResultSet rs = ps.executeQuery();
						while(rs.next()) {
							textField_1.setText(rs.getString(1));
							textField_7.setText(rs.getString(2));
							textArea.setText(rs.getString(3));
							dateChooser.setDate(rs.getDate(7));
							textField_2.setText(rs.getString(4));
							textField_3.setText(rs.getString(6));
							
						}
                	} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
                	}else {
                		layeredPane.removeAll();
        				layeredPane.add(p7);
                        	try {
        						PreparedStatement ps = cnx.prepareStatement("select * from rapport where idRapport=? and date_i=?");
        						ps.setInt(1, (int)table_7.getValueAt(table_7.getSelectedRow(), 0));
        						ps.setDate(2, (java.sql.Date)table_7.getValueAt(table_7.getSelectedRow(), 4));
        						ResultSet rs = ps.executeQuery();
        						while(rs.next()) {
        							textField_1.setText(rs.getString(1));
        							textField_7.setText(rs.getString(3));
        							textArea.setText(rs.getString(2));
        							dateChooser.setDate(rs.getDate(8));
        							textField_2.setText(rs.getString(5));
        							textField.setText(rs.getString(7));
        							textField_3.setText(rs.getString(9));
        							
        						}
                        	} catch (SQLException e) {
        						// TODO Auto-generated catch block
        						e.printStackTrace();
        					}  
                	}
                	
                }else { if(!table_7.isRowSelected(table_7.getSelectedRow()) && t==9) {
                	JOptionPane.showMessageDialog(contentPane, "Veuillez selectionner un rapport !", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
                	
                }
                if(t==6 && table_12.isRowSelected(table_12.getSelectedRow()) && Login_gmao.User.equals("CS")) {
                	m=6;
                	layeredPane.removeAll();
    				layeredPane.add(p6_2);
    				textField_25.setText(""+(int)table_12.getValueAt(table_12.getSelectedRow(), 0));
    				t3_1_1.setDate((java.sql.Date)table_12.getValueAt(table_12.getSelectedRow(), 1));
    				textArea_3.setText((String)table_12.getValueAt(table_12.getSelectedRow(), 2));
    				textArea_3.setEditable(true);
    				
                }
                
                
				layeredPane.repaint();
				layeredPane.revalidate();
                
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblEditBtn.setBackground(SystemColor.controlHighlight);
				lblEdit.setBackground(SystemColor.controlHighlight);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblEditBtn.setBackground(SystemColor.LIGHT_GRAY);
				lblEdit.setBackground(SystemColor.LIGHT_GRAY);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lblEditBtn.setBackground(SystemColor.control);
				lblEdit.setBackground(SystemColor.control);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblEditBtn.setBackground(SystemColor.LIGHT_GRAY);
				lblEdit.setBackground(SystemColor.LIGHT_GRAY);
			}
		});
		lblEditBtn.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\file (4).png"));
		lblEditBtn.setOpaque(true);
		lblEditBtn.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditBtn.setBackground(Color.LIGHT_GRAY);
		lblEditBtn.setBounds(102, 1, 50, 42);
		panel_1.add(lblEditBtn);
		
		lblEdit = new JLabel("EDIT");
		lblEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				m=2;
                if(t==2 && table_2.isRowSelected(table_2.getSelectedRow())) {
                	layeredPane.removeAll();
    				layeredPane.add(pan);
                	try {
						PreparedStatement ps = cnx.prepareStatement("select * from intervention where id=? and date_i=?");
						ps.setInt(1, (int)table_2.getValueAt(table_2.getSelectedRow(), 0));
						ps.setDate(2, (java.sql.Date)table_2.getValueAt(table_2.getSelectedRow(), 1));
						ResultSet rs = ps.executeQuery();
						while(rs.next()) {
							t8.setText(rs.getString(1));
							t1.setText(rs.getString(2));
							t2.setText(rs.getString(4));
							t3.setDate(rs.getDate(3));
							t4.setText(rs.getString(6));
							t7.setText(rs.getString(7));
							t5.setText(rs.getString(5));
							t6.setText(rs.getString(8));
							t10.setText(rs.getString(9));
							
						}
                	} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
                }else { if(!table_7.isRowSelected(table_7.getSelectedRow())) {
                	JOptionPane.showMessageDialog(contentPane, "Veuillez selectionner une intervention !", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
                }
                if(t==8 && Login_gmao.User.equals("CS") && table_8.isRowSelected(table_8.getSelectedRow())) {
                	layeredPane.removeAll();
    				layeredPane.add(pan);
                	try {
						PreparedStatement ps = cnx.prepareStatement("select * from intervention where id=? and date_i=?");
						ps.setInt(1, (int)table_8.getValueAt(table_8.getSelectedRow(), 0));
						ps.setDate(2, (java.sql.Date)table_8.getValueAt(table_8.getSelectedRow(), 1));
						ResultSet rs = ps.executeQuery();
						while(rs.next()) {
							t8.setText(rs.getString(1));
							t1.setText(rs.getString(2));
							t2.setText(rs.getString(4));
							t3.setDate(rs.getDate(3));
							t4.setText(rs.getString(6));
							t7.setText(rs.getString(7));
							t5.setText(rs.getString(5));
							t6.setText(rs.getString(8));
							t10.setText(rs.getString(9));
							
						}
                	} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
                }else { if(!table_8.isRowSelected(table_8.getSelectedRow())) {
                	JOptionPane.showMessageDialog(contentPane, "Veuillez selectionner une intervention !", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
                }
                
                if(t==5 || (int)table_1.getValueAt(table_1.getSelectedRow(), 4) ==0  && table_1.isRowSelected(table_1.getSelectedRow())) {
                	layeredPane.removeAll();
    				layeredPane.add(pan);
                	try {
						PreparedStatement ps = cnx.prepareStatement("select * from intervention where id=? and date_i=?");
						ps.setInt(1, (int)table_1.getValueAt(table_1.getSelectedRow(), 0));
						ps.setDate(2, (java.sql.Date)table_1.getValueAt(table_1.getSelectedRow(), 1));
						ResultSet rs = ps.executeQuery();
						while(rs.next()) {
							t8.setText(rs.getString(1));
							t1.setText(rs.getString(2));
							t2.setText(rs.getString(4));
							t3.setDate(rs.getDate(3));
							t4.setText(rs.getString(6));
							t7.setText(rs.getString(7));
							t5.setText(rs.getString(5));
							t6.setText(rs.getString(8));
							t10.setText(rs.getString(9));
							
						}
                	} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
                }else { if(!table_1.isRowSelected(table_1.getSelectedRow())) {
                	JOptionPane.showMessageDialog(contentPane, "Veuillez selectionner une intervention !", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
                }
                if(t==9 && table_7.isRowSelected(table_7.getSelectedRow())) {
                	layeredPane.removeAll();
    				layeredPane.add(p7);
                	if( Login_gmao.User.equals("CS")){
                	try {
                		textField.setEnabled(false);
                		textField.setBackground(SystemColor.LIGHT_GRAY);
						PreparedStatement ps = cnx.prepareStatement("select * from rapport_chef_service where num_rapport=? and date_rap=?");
						ps.setInt(1, (int)table_1.getValueAt(table_7.getSelectedRow(), 0));
						ps.setDate(2, (java.sql.Date)table_7.getValueAt(table_7.getSelectedRow(), 3));
						ResultSet rs = ps.executeQuery();
						while(rs.next()) {
							textField_1.setText(rs.getString(1));
							textField_7.setText(rs.getString(2));
							textArea.setText(rs.getString(3));
							dateChooser.setDate(rs.getDate(7));
							textField_2.setText(rs.getString(4));
							textField_3.setText(rs.getString(6));
							
						}
                	} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
                	}else {
                        	try {
        						PreparedStatement ps = cnx.prepareStatement("select * from rapport where idRapport=? and date_i=?");
        						ps.setInt(1, (int)table_1.getValueAt(table_7.getSelectedRow(), 0));
        						ps.setDate(2, (java.sql.Date)table_7.getValueAt(table_7.getSelectedRow(), 4));
        						ResultSet rs = ps.executeQuery();
        						while(rs.next()) {
        							textField_1.setText(rs.getString(1));
        							textField_7.setText(rs.getString(3));
        							textArea.setText(rs.getString(2));
        							dateChooser.setDate(rs.getDate(8));
        							textField_2.setText(rs.getString(5));
        							textField.setText(rs.getString(7));
        							textField_3.setText(rs.getString(9));
        							
        						}
                        	} catch (SQLException e) {
        						// TODO Auto-generated catch block
        						e.printStackTrace();
        					}  
                	}
                	
                }else { if(!table_7.isRowSelected(table_7.getSelectedRow())) {
                	JOptionPane.showMessageDialog(contentPane, "Veuillez selectionner un rapport !", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
                	
                if(t==6 && table_12.isRowSelected(table_12.getSelectedRow()) && Login_gmao.User.equals("CS")) {
                	m=6;
                	layeredPane.removeAll();
    				layeredPane.add(p6_2);
    				textField_25.setText(""+(int)table_12.getValueAt(table_12.getSelectedRow(), 0));
    				t3_1_1.setDate((java.sql.Date)table_12.getValueAt(table_12.getSelectedRow(), 1));
    				textArea_3.setText((String)table_12.getValueAt(table_12.getSelectedRow(), 2));
    				textArea_3.setEditable(true);
    				
                }
                
                }
				layeredPane.repaint();
				layeredPane.revalidate();
				m=1;
                
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblEditBtn.setBackground(SystemColor.controlHighlight);
				lblEdit.setBackground(SystemColor.controlHighlight);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblEditBtn.setBackground(SystemColor.LIGHT_GRAY);
				lblEdit.setBackground(SystemColor.LIGHT_GRAY);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lblEditBtn.setBackground(SystemColor.control);
				lblEdit.setBackground(SystemColor.control);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblEditBtn.setBackground(SystemColor.LIGHT_GRAY);
				lblEdit.setBackground(SystemColor.LIGHT_GRAY);
			}
		});
		lblEdit.setOpaque(true);
		lblEdit.setHorizontalAlignment(SwingConstants.CENTER);
		lblEdit.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblEdit.setBackground(Color.LIGHT_GRAY);
		lblEdit.setBounds(102, 42, 50, 23);
		panel_1.add(lblEdit);
		
		lblInfoBtn = new JLabel("");
		lblInfoBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblInfoBtn.setBackground(SystemColor.controlHighlight);
				lblInfo.setBackground(SystemColor.controlHighlight);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblInfoBtn.setBackground(SystemColor.LIGHT_GRAY);
				lblInfo.setBackground(SystemColor.LIGHT_GRAY);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lblInfoBtn.setBackground(SystemColor.control);
				lblInfo.setBackground(SystemColor.control);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblInfoBtn.setBackground(SystemColor.LIGHT_GRAY);
				lblInfo.setBackground(SystemColor.LIGHT_GRAY);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
		   		layeredPane.repaint();
		   		layeredPane.revalidate();
		   		lblNewLabel_17_3.setBackground(SystemColor.controlHighlight);
		 		lblNewLabel_17_4.setBackground(SystemColor.scrollbar);
		 		lblNewLabel_17_5.setBackground(SystemColor.scrollbar);
		 		panel_5.setVisible(false);
		 		panel_3.setVisible(true);
		 		panel_4.setVisible(false);
		 		if(t==8 && table_8.isRowSelected(table_8.getSelectedRow())) {
		 		try {
					PreparedStatement ps = cnx.prepareStatement("select * from intervention where id=? and date_i=?");
					ps.setInt(1, (int)table_8.getValueAt(table_8.getSelectedRow(), 0));
					ps.setDate(2, (java.sql.Date)table_8.getValueAt(table_8.getSelectedRow(), 1));
					ResultSet rs = ps.executeQuery();
					while(rs.next()) {
						textField_5.setText(rs.getString(1));
						textField_6.setText(rs.getString(2));
						textField_8.setText(rs.getString(4));
						t3_1.setDate(rs.getDate(3));
						textField_9.setText(rs.getString(6));
						textField_15.setText(rs.getString(7));
						t5_1.setText(rs.getString(5));
						t6_1.setText(rs.getString(8));
						textField_16.setText(rs.getString(9));
					}
					layeredPane.removeAll();
			   		layeredPane.add(p8_1);
			   		t=81;
            	} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		 		}
		 		if(t==4 && table_3.isRowSelected(table_3.getSelectedRow())) {
		 			layeredPane.removeAll();
			   		layeredPane.add(p4_2);
			   		t=11;
			   		layeredPane.repaint();
			   		layeredPane.revalidate();
		 			converte();
		 			
		 		}
		 		if(t==6 && table_12.isRowSelected(table_12.getSelectedRow())) {
		 			layeredPane.removeAll();
			   		layeredPane.add(p6_1);
			   		t=61;
			   		layeredPane.repaint();
			   		layeredPane.revalidate();
			   		textArea_2.setText((String)table_12.getValueAt(table_12.getSelectedRow(), 2));
			   		lblNewLabel_23_1.setText("Journal de bord du "+table_12.getValueAt(table_12.getSelectedRow(), 1)+"de l'agent "+table_12.getValueAt(table_12.getSelectedRow(), 0));
			   		
		 		}
			}
		});
		lblInfoBtn.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\information.png"));
		lblInfoBtn.setOpaque(true);
		lblInfoBtn.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfoBtn.setBackground(Color.LIGHT_GRAY);
		lblInfoBtn.setBounds(153, 1, 50, 42);
		panel_1.add(lblInfoBtn);
		
		lblInfo = new JLabel("INFO");
		lblInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblInfoBtn.setBackground(SystemColor.controlHighlight);
				lblInfo.setBackground(SystemColor.controlHighlight);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblInfoBtn.setBackground(SystemColor.LIGHT_GRAY);
				lblInfo.setBackground(SystemColor.LIGHT_GRAY);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lblInfoBtn.setBackground(SystemColor.control);
				lblInfo.setBackground(SystemColor.control);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblInfoBtn.setBackground(SystemColor.LIGHT_GRAY);
				lblInfo.setBackground(SystemColor.LIGHT_GRAY);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.repaint();
		   		layeredPane.revalidate();
		   		lblNewLabel_17_3.setBackground(SystemColor.controlHighlight);
		 		lblNewLabel_17_4.setBackground(SystemColor.scrollbar);
		 		lblNewLabel_17_5.setBackground(SystemColor.scrollbar);
		 		panel_5.setVisible(false);
		 		panel_3.setVisible(true);
		 		panel_4.setVisible(false);
		 		if(t==8 && table_8.isRowSelected(table_8.getSelectedRow())) {
		 		try {
					PreparedStatement ps = cnx.prepareStatement("select * from intervention where id=? and date_i=?");
					ps.setInt(1, (int)table_8.getValueAt(table_8.getSelectedRow(), 0));
					ps.setDate(2, (java.sql.Date)table_8.getValueAt(table_8.getSelectedRow(), 1));
					ResultSet rs = ps.executeQuery();
					while(rs.next()) {
						textField_5.setText(rs.getString(1));
						textField_6.setText(rs.getString(2));
						textField_8.setText(rs.getString(4));
						t3_1.setDate(rs.getDate(3));
						textField_9.setText(rs.getString(6));
						textField_15.setText(rs.getString(7));
						t5_1.setText(rs.getString(5));
						t6_1.setText(rs.getString(8));
						textField_16.setText(rs.getString(9));
					}
					layeredPane.removeAll();
			   		layeredPane.add(p8_1);
            	} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		 		}
		 		if(t==4 && table_3.isRowSelected(table_3.getSelectedRow())) {
		 			layeredPane.removeAll();
			   		layeredPane.add(p4_2);
			   		t=11;
			   		layeredPane.repaint();
			   		layeredPane.revalidate();
		 			converte();
		 			
		 		}
		 		if(t==6 && table_12.isRowSelected(table_12.getSelectedRow())) {
		 			layeredPane.removeAll();
			   		layeredPane.add(p6_1);
			   		t=61;
			   		layeredPane.repaint();
			   		layeredPane.revalidate();
			   		textArea_2.setText((String)table_12.getValueAt(table_12.getSelectedRow(), 2));
			   		
		 		}
			}
		});
		lblInfo.setOpaque(true);
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblInfo.setBackground(Color.LIGHT_GRAY);
		lblInfo.setBounds(153, 42, 50, 23);
		panel_1.add(lblInfo);
		
		lblPrintBtn = new JLabel("");
		lblPrintBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblPrintBtn.setBackground(SystemColor.controlHighlight);
				lblPrint.setBackground(SystemColor.controlHighlight);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblPrintBtn.setBackground(SystemColor.LIGHT_GRAY);
				lblPrint.setBackground(SystemColor.LIGHT_GRAY);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lblPrintBtn.setBackground(SystemColor.control);
				lblPrint.setBackground(SystemColor.control);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblPrintBtn.setBackground(SystemColor.LIGHT_GRAY);
				lblPrint.setBackground(SystemColor.LIGHT_GRAY);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(t==11) {
					try {
						texte.print();
					} catch (PrinterException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		lblPrintBtn.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\print.png"));
		lblPrintBtn.setOpaque(true);
		lblPrintBtn.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrintBtn.setBackground(Color.LIGHT_GRAY);
		lblPrintBtn.setBounds(204, 1, 50, 42);
		panel_1.add(lblPrintBtn);
		
		lblPrint = new JLabel("PRINT");
		lblPrint.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblPrintBtn.setBackground(SystemColor.controlHighlight);
				lblPrint.setBackground(SystemColor.controlHighlight);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblPrintBtn.setBackground(SystemColor.LIGHT_GRAY);
				lblPrint.setBackground(SystemColor.LIGHT_GRAY);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lblPrintBtn.setBackground(SystemColor.control);
				lblPrint.setBackground(SystemColor.control);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblPrintBtn.setBackground(SystemColor.LIGHT_GRAY);
				lblPrint.setBackground(SystemColor.LIGHT_GRAY);
			}
		});
		lblPrint.setOpaque(true);
		lblPrint.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrint.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblPrint.setBackground(Color.LIGHT_GRAY);
		lblPrint.setBounds(204, 42, 50, 23);
		panel_1.add(lblPrint);
		
		lblRefresh = new JLabel("");
		lblRefresh.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblRefresh.setBackground(SystemColor.controlHighlight);
				lblRefresh_1.setBackground(SystemColor.controlHighlight);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblRefresh.setBackground(SystemColor.LIGHT_GRAY);
				lblRefresh_1.setBackground(SystemColor.LIGHT_GRAY);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lblRefresh.setBackground(SystemColor.control);
				lblRefresh_1.setBackground(SystemColor.control);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblRefresh.setBackground(SystemColor.controlHighlight);
				lblRefresh_1.setBackground(SystemColor.controlHighlight);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(t==1) {
					uptable2();
				}
				if(t==11) {
					inter();
				}
				if(t==2) {
					intervention();
				}
				if(t==3) {
					rapport();
				}
				if(t==4) {
					selectbon();
				}
				if(t==5) {
					inter2();
				}
				if(t==6) {
					journal();
				}
				if(t==41) {
					selectarticle();
				}
				if(t==9){
					rapport();
				}
				if(t==8) {
					inter2();
				}
				if(t==81) {
					try {
						PreparedStatement ps = cnx.prepareStatement("select date as 'Date de la panne',heure as 'Heure de la panne' from historique where panne_nump= ?");
						ps.setString(1, textField_15.getText());
						ResultSet rs = ps.executeQuery();
						table_6.setModel(DbUtils.resultSetToTableModel(rs));
						JTableHeader theader=table_6.getTableHeader();
						theader.setBackground(Color.LIGHT_GRAY);
						theader.setForeground(Color.black);
						theader.setFont(new Font("tahome",Font.BOLD,14));
						table_6.setFont(new Font("tahome",Font.BOLD,12));
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		lblRefresh.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\refresh.png"));
		lblRefresh.setOpaque(true);
		lblRefresh.setHorizontalAlignment(SwingConstants.CENTER);
		lblRefresh.setBackground(Color.LIGHT_GRAY);
		lblRefresh.setBounds(255, 1, 50, 42);
		panel_1.add(lblRefresh);
		
		lblRefresh_1 = new JLabel("REFRESH");
		lblRefresh_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblRefresh.setBackground(SystemColor.controlHighlight);
				lblRefresh_1.setBackground(SystemColor.controlHighlight);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblRefresh.setBackground(SystemColor.LIGHT_GRAY);
				lblRefresh_1.setBackground(SystemColor.LIGHT_GRAY);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lblRefresh.setBackground(SystemColor.control);
				lblRefresh_1.setBackground(SystemColor.control);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblRefresh.setBackground(SystemColor.controlHighlight);
				lblRefresh_1.setBackground(SystemColor.controlHighlight);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		lblRefresh_1.setOpaque(true);
		lblRefresh_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRefresh_1.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblRefresh_1.setBackground(Color.LIGHT_GRAY);
		lblRefresh_1.setBounds(255, 42, 50, 22);
		panel_1.add(lblRefresh_1);
		
		lblNewLabel_6 = new JLabel("PANNES & MAINTENANCE");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Century Gothic", Font.BOLD, 40));
		lblNewLabel_6.setBounds(110, 11, 630, 88);
		gradientPanel.add(lblNewLabel_6);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				lblNewLabel_2.setBackground(SystemColor.WHITE);
				
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				lblNewLabel_2.setBackground(SystemColor.LIGHT_GRAY);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lblNewLabel_2.setBackground(SystemColor.LIGHT_GRAY);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_2.setBackground(SystemColor.GRAY);
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel.setVisible(false);
				panel_1.setVisible(false);
				lblNewLabel_6.setText("PANNES & MAINTENANCE");
				lblNewLabel_6.setFont(new Font("Century Gothic", Font.BOLD, 40));
				lblNewLabel_2.setVisible(false);
				layeredPane.setBounds(10, 99, 1094, 553);
				layeredPane.removeAll();
		 		layeredPane.add(phome);
		 		layeredPane.repaint();
		 		layeredPane.revalidate();
		 		Etat=0;
		 		a7.setBackground(SystemColor.controlHighlight);
		 		a1.setBackground(SystemColor.controlHighlight);
		 		a3.setBackground(SystemColor.controlHighlight);
		 		a4.setBackground(SystemColor.controlHighlight);
		 		a5.setBackground(SystemColor.controlHighlight);
		 		a6.setBackground(SystemColor.controlHighlight);
		 		a2.setBackground(SystemColor.controlHighlight);
			}
});
		lblNewLabel_2.setBackground(SystemColor.windowBorder);
		lblNewLabel_2.setBorder(null);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\home.png"));
		lblNewLabel_2.setBounds(10, 99, 200, 70);
		gradientPanel.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(728, 35, 375, 64);
		gradientPanel.add(panel_2);
		panel_2.setLayout(null);
		
		lblNewLabel_4 = new JLabel(Login_gmao.txtUsername.getText());
		lblNewLabel_4.setForeground(new Color(0, 0, 102));
		lblNewLabel_4.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNewLabel_4.setBounds(121, 0, 195, 23);
		panel_2.add(lblNewLabel_4);
		
		lblNewLabel_11.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_11.setBounds(121, 23, 195, 23);
		panel_2.add(lblNewLabel_11);
		
		
		lblNewLabel_11_1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_11_1.setBounds(121, 46, 195, 18);
		panel_2.add(lblNewLabel_11_1);
		
		lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblNewLabel_9.setBackground(SystemColor.controlShadow);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_9.setBackground(SystemColor.GRAY);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lblNewLabel_9.setBackground(SystemColor.WHITE);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblNewLabel_9.setBackground(SystemColor.GRAY);
				
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
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\arrow.png"));
		lblNewLabel_9.setOpaque(true);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBackground(Color.GRAY);
		lblNewLabel_9.setBounds(326, 0, 51, 64);
		panel_2.add(lblNewLabel_9);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(Color.GRAY);
		separator_1.setBackground(Color.GRAY);
		separator_1.setBounds(110, 11, 2, 45);
		panel_2.add(separator_1);
		
		l1 = new JLabel("");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setForeground(Color.BLACK);
		l1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		l1.setBounds(10, 11, 86, 22);
		panel_2.add(l1);
		
		l2 = new JLabel("");
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setForeground(Color.BLACK);
		l2.setFont(new Font("Century Gothic", Font.BOLD, 14));
		l2.setBounds(10, 31, 86, 22);
		panel_2.add(l2);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Amine\\Downloads\\support (1).png"));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(10, 11, 101, 88);
		gradientPanel.add(lblNewLabel_5);
		Interface();
		
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
	public JTable getTable_5() {
		return table_5;
	}
}
