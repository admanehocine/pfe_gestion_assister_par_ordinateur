
import java.awt.BorderLayout;



import java.awt.Button;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.TextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
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
import javax.swing.table.TableModel;
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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;
import javax.swing.DefaultListModel;
import javax.swing.DropMode;
import javax.swing.JList;
import javax.swing.JTextPane;


public class menu_bos extends JFrame {
	private int i=0;
	private JLabel a1,a2,a3,a4,a5,a6,a7,a8;
	private JPanel e1,e2,e4,e3,e5,e6,e7,e8;
	@SuppressWarnings("unused")
	
	private String i60="",i61="", pa,bb=" ", kle,var,d1 ,id1,id2,id22=" ",kilo ,id21,id23=" ",id11,i1=null,i2=null,i3=null,i4=null,i5=null,i6=null;
    private JLabel l2;
	private JPanel contentPane;
	private JLayeredPane layeredPane;	
	private JTable table;
     private JDateChooser v4,t3;
     private Object[] row;
     private int t,m;
     private DefaultTableModel model1;
     private        HashMap<String,String> a=new HashMap<String,String>();
     private 	ArrayList<String> b=new ArrayList<String>();
     /**
	 * Launch the application.
	 */
	private JPanel p1,p2,p3,p4;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu_bos frame = new menu_bos();
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
	private JTextArea textArea=null;
	Connection cnx=null;
	ResultSet rs=null;
	PreparedStatement pr=null;
	Statement pr1=null;
	private String cle;
	private JTextField t9;
	private JLabel label;
	private JTable table_1;
	private JTextField s1;
	private JTextField s2;
	private JTextField s3;
	private JTable table_2;
	private JTextField f9;
	private JLabel label_2;
	private JTextField t8;
	private JTextField t1;
	private JTextField t2;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JTextField t7;
	private JPanel pan;
	private JButton btnAjouter_3;
	private JButton btnOurner;
	private JButton button;
	private JButton btnAjouter;
	private JPanel pan2;
	private JPanel pan3;
	private JTextField f8;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JLabel label_18;
	private JTextField f1;
	private JTextField f2;
	private JTextField f3;
	private JDateChooser f4;
	private JTextField f5;
	private JTextField f6;
	private JTextField f7;
	private JButton btnValider;
	private JButton btnRetourner;
	private JLabel label_19;
	private JLabel label_20;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel label_23;
	private JLabel label_24;
	private JTable table_3;
	private JPanel pan4,pan10;
	private JTextField v3;
	private JTextField v2;
	private JTextField v1;
	private JTextField v5;
	private JTextField v6;
	private JTextField v7;
	private JTextField v8;
	private JPanel pan5,pan8;
	private JPanel pan6;
	private JScrollPane scrollPane_5;
	private JTable table_5;
	private JTextField tx1;
	private JTextField tx2;
	private JTextField tx3;
	private JTextField tx4;
	private JTextField tx6;
	private JLabel x1;
	private JLabel x2;
	private JLabel x3;
	private JLabel x4;
	private JLabel type;
	private JTextField tx5;
	private JLabel label_25;
	private JLabel label_26;
	private JPanel pan7;
	private JTable table_4;
	//DefaultListModel dn=new DefaultListModel();
	Statement s=null;
	private JPanel pan9;
	private JScrollPane scrollPane_7;
	private JLabel label_27;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JTextField textField_10;
	private JLabel label_28;
	private JTable table_6;
	private JTextField v9;
	private ArrayList <String> p5=new ArrayList<String>();
	private JScrollPane scrollPane_9;
	private JTable table_7;
	//private ArrayList <String> pp1=new ArrayList<String>();
	
	public void panne() {
		String plus="SELECT  nump as 'N° Panne',date as 'date de panne', heure as 'heure de panne',"
				+ " service_idservice as 'N° Service' ,numch as 'N° Chef de service' ,tel as 'N° Telephone'"
				+ " from chef_service , panne ,historique  where  service_idservice=idservice and panne_nump=nump";

		try {//idservice as 'numero service'  , noms as 'nom service'  , nbr_effictive as 'nombre d'fectives '
			pr=cnx.prepareStatement(plus);
			rs=pr.executeQuery();
		table_7.setModel(DbUtils.resultSetToTableModel(rs));
			
		
		JTableHeader theader=table_7.getTableHeader();
		theader.setBackground(Color.gray);
		theader.setForeground(Color.black);
		theader.setFont(new Font("tahome",Font.BOLD,16));
		table_7.setFont(new Font("tahome",Font.BOLD,12));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
					}
	
	
	
	
	
	}
	
	@SuppressWarnings("unchecked")
	public void  panne1() {
		
	ArrayList<String> p2 =new ArrayList<String>();
		ArrayList<String> p3 =new ArrayList<String>();
		ArrayList<String> p4 =new ArrayList<String>();
		ArrayList<String> p1=new ArrayList<String>();
	  String  [] tab = null;
	//	ArrayList  <String> p5 =new ArrayList<String>();
		
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
			
		
			p=p2.get(i)+p3.get(i)+p4.get(i)+p1.get(i);
		
		p5.add(p);
		System.out.println("***************_____-->"+p5.get(i));

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
		//list=new JList(pp1.toArray());
		}
	
	public boolean  search(HashMap<String,String> al,String k,String cc) {
		boolean a=false;
		for (Entry<String, String> mapentry : al.entrySet()) {
	          if(mapentry.getKey().equals(k) && mapentry.getValue().equals(cc)) {a=true ; return a; }
	                          
	        }
		return a;
	}
	
	
	public void rapport() {//as 'numero rapport'as 'numero chef service '
		String sql="select num_rapport  as 'numero rapport', type  , description , numch_chef_service as 'numero chef service ' , valide from rapport_chef_service where id_commandont='"+1+"'";
		
		String m2="select nump as 'numero panne' ,service.idservice ,numch, id  from  service , chef_service , reparateur ,  panne  , repare  where repare.equipement_nume=panne.equipement_nume  "
				+ " and ouvries_id=reparateur.id   and   service.idservice=chef_service.service_idservice   and  service.idservice=reparateur.idservice ";
		
		try {//idservice as 'numero service'  , noms as 'nom service'  , nbr_effictive as 'nombre d'fectives '
			pr=cnx.prepareStatement(sql);
			rs=pr.executeQuery();
		table_4.setModel(DbUtils.resultSetToTableModel(rs));
			
		
		JTableHeader theader=table_4.getTableHeader();
		theader.setBackground(Color.gray);
		theader.setForeground(Color.black);
		theader.setFont(new Font("tahome",Font.BOLD,16));
		table_4.setFont(new Font("tahome",Font.BOLD,12));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
					}
	}
	
	public void article() {
		String sql="select article.idarticle as 'numero article',numero_serie,poids, taille ,couleur "
				+ " from article , etat_stock where "
				+ "etat_stock.idarticle=article.idarticle and "
				+ "etat_stock.quantite_article<=40 and "
				+ "etat_stock.quantite_article>10 ";
		try {//idservice as 'numero service'  , noms as 'nom service'  , nbr_effictive as 'nombre d'fectives '
			pr=cnx.prepareStatement(sql);
			rs=pr.executeQuery();
		table_5.setModel(DbUtils.resultSetToTableModel(rs));
			
		
		JTableHeader theader=table_5.getTableHeader();
		theader.setBackground(Color.gray);
		theader.setForeground(Color.black);
		theader.setFont(new Font("tahome",Font.BOLD,16));
		table_5.setFont(new Font("tahome",Font.BOLD,12));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
					}
	}
	public void uptable2() {
		//'"+Login.user+"' //and id_enseignant='"+Login.user+"'
		String  sql="SELECT id as 'numero reparateur' ,nom,prenom,date_naissance as 'date de naissance',tel as 'telephone',username , password , idservice as 'numero service' from reparateur   ORDER BY idservice DESC" ;
			try {
				pr=cnx.prepareStatement(sql);
				rs=pr.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			JTableHeader theader=table.getTableHeader();
			theader.setBackground(Color.gray);
			theader.setForeground(Color.black);
				//JOptionPane.showMessageDialog(null, "Remlissez les champs vides !");
			theader.setFont(new Font("tahome",Font.BOLD,13));	
			table.setFont(new Font("tahome",Font.BOLD,12));	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
						}}
			
	public void agent() {
		//'"+Login.user+"' //as 'numero agent'as 'date de naissance'as 'code postale' as 'numero service'  
		String  sql="SELECT idagent  ,nom,prenom,dtn ,grade ,codepostale ,username , password , idservice from agent    ORDER BY idagent DESC" ;
			try {
				pr=cnx.prepareStatement(sql);
				rs=pr.executeQuery();
			table_6.setModel(DbUtils.resultSetToTableModel(rs));
			
			JTableHeader theader=table_6.getTableHeader();
			theader.setBackground(Color.gray);
			theader.setForeground(Color.black);
				//JOptionPane.showMessageDialog(null, "Remlissez les champs vides !");
			theader.setFont(new Font("tahome",Font.BOLD,13));	
			table_6.setFont(new Font("tahome",Font.BOLD,12));	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
						}}
	
	public void uptable1() {
		String sql="select idservice as 'numero service', noms as 'nom service' , nbr_effictive  as 'nombre effectives 'from service";
		try {//idservice as 'numero service'  , noms as 'nom service'  , nbr_effictive as 'nombre d'fectives '
			pr=cnx.prepareStatement(sql);
			rs=pr.executeQuery();
		table_1.setModel(DbUtils.resultSetToTableModel(rs));
			
		
		JTableHeader theader=table_1.getTableHeader();
		theader.setBackground(Color.gray);
		theader.setForeground(Color.black);
		theader.setFont(new Font("tahome",Font.BOLD,16));
		table_1.setFont(new Font("tahome",Font.BOLD,12));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
					}
	}
		
	public void uptable11() {
		String sql="select idEtat_stock as 'numero stock',idarticle  as 'numero article',quantite_article as'quantite article',date_acquisition as 'date acquisition' from etat_stock where id_commandont='"+1+"'";
		try {//idservice as 'numero service'  , noms as 'nom service'  , nbr_effictive as 'nombre d'fectives '
			pr=cnx.prepareStatement(sql);
			rs=pr.executeQuery();
		table_3.setModel(DbUtils.resultSetToTableModel(rs));
			
		
		JTableHeader theader=table_3.getTableHeader();
		theader.setBackground(Color.gray);
		theader.setForeground(Color.black);
		theader.setFont(new Font("tahome",Font.BOLD,16));
		table_3.setFont(new Font("tahome",Font.BOLD,12));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
					}
		RenderPintar ren=new RenderPintar();
		table_3.setDefaultRenderer(Object.class, ren);
		
		//table_3.getColumnModel().getColumn(2).setCellRenderer(new RenderPintar());
	}
	
	                                                                                                                  //, idservice as 'numero service'
	public void uptable() {//numch as 'numero chef service',nom,prenom,dtn as 'date de naissance',tel as 'telephone',username as 'nom utilisateur', password as 'mot de passe', idservice as 'numero service' from chef_service
		String sql="select numch as 'numero chef service',nom,prenom,dtn as 'date de naissance',tel as 'telephone',username as 'nom utilisateur', password as 'mot de passe', service_idservice as 'numero service' from chef_service where  id_commandont='"+1+"'";
		try {//idservice as 'numero service'  , noms as 'nom service'  , nbr_effictive as 'nombre d'fectives '
			pr=cnx.prepareStatement(sql);
			rs=pr.executeQuery();
		table_2.setModel(DbUtils.resultSetToTableModel(rs));
			
		
		JTableHeader theader=table_2.getTableHeader();
		theader.setBackground(Color.gray);
		theader.setForeground(Color.black);
		theader.setFont(new Font("tahome",Font.BOLD,13));
		table_2.setFont(new Font("tahome",Font.BOLD,12));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
					}
	}
  	
	
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
	
	public menu_bos() {
          setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1405, 746);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		KGradientPanel gradientPanel = new KGradientPanel();
		 layeredPane = new JLayeredPane();
		layeredPane.setBounds(254, 86, 1106, 610);
		gradientPanel.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		cnx=connexion.connecter();
                    p1 = new JPanel();
		layeredPane.add(p1, "name_7336782116200");
		p1.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("IMAGE_ICON\\contrat-de-maintenance-informatique (1) (1).jpg"));
		lblNewLabel_8.setBounds(0, 0, 1106, 610);
		p1.add(lblNewLabel_8);
		
		
	
		 p2 = new JPanel();
		p2.setBackground(new Color(176, 224, 230));
		layeredPane.add(p2, "name_7383134918200");
		p2.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 175, 1106, 435);
		p2.add(scrollPane_1);
		
		table = new JTable(){
			 public boolean isCellEditable(int d,int c) {
				 return false;
			 }
		 };
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			 //t3.setDateFormatString(table.getModel().getValueAt(ligne, 3).toString());
try {
	
	int ligne= table.getSelectedRow();
	t9.setText(null);
	
	 t8.setText(table.getModel().getValueAt(ligne, 0).toString());
	  id1=table.getModel().getValueAt(ligne, 0).toString();
	 id2= table.getModel().getValueAt(ligne, 7).toString();
	 t7.setText(table.getModel().getValueAt(ligne, 7).toString());
	 t1.setText(table.getModel().getValueAt(ligne, 1).toString());
	 t2.setText(table.getModel().getValueAt(ligne, 2).toString());
	 t4.setText("0"+table.getModel().getValueAt(ligne, 4).toString());
	 t5.setText(table.getModel().getValueAt(ligne, 5).toString());
	 t6.setText(table.getModel().getValueAt(ligne, 6).toString());
	 table.setSelectionBackground(Color.getColor("a", Color.getHSBColor(520, 50, 50)));
	 table.setSelectionForeground(Color.BLACK);
	DefaultTableModel model=(DefaultTableModel) table.getModel();
	Date date = new SimpleDateFormat("yyyy-mm-dd").parse((String) model.getValueAt(ligne, 3).toString());
	t3.setDate(date);
	
} catch (ParseException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
	
}		
			}
		});
		scrollPane_1.setViewportView(table);
		
		JLabel lblNewLabel_9 = new JLabel("Recherche  :");
		lblNewLabel_9.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lblNewLabel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		lblNewLabel_9.setBounds(468, 79, 250, 31);
		p2.add(lblNewLabel_9);
		
		t9 = new JTextField();
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
		t9.setBounds(478, 121, 207, 31);
		p2.add(t9);
		t9.setColumns(10);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("IMAGE_ICON\\loupe.png"));
		label.setBounds(442, 79, 22, 31);
		p2.add(label);
		
		JButton btnSupprimer = new JButton("supprimer");
		btnSupprimer.setBackground(new Color(204, 255, 255));
		btnSupprimer.setBounds(221, 113, 120, 45);
		p2.add(btnSupprimer);
		btnSupprimer.setIcon(new ImageIcon("IMAGE_ICON\\delete.png"));
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(t8.getText().equals("")||t7.getText().equals("")) {JOptionPane.showMessageDialog(null, "veuillez selectionner un reparateur");}else {
					
			{
							String sql1=" delete from reparateur  where  id=? and idservice=? ";
							try {
								pr=cnx.prepareStatement(sql1);
								pr.setString(1,id1);
								pr.setString(2,id2);
								pr.execute();
								uptable2();
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
							}}
					
			}}
		});
		btnSupprimer.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		
		button = new JButton("modifier");
		button.setBackground(new Color(204, 255, 255));
		button.setIcon(new ImageIcon("IMAGE_ICON\\icons8-modifier-32.png"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
String k_1=t1.getText().toString();
		 		
		 		String k_21=t2.getText().toString();
               
		 
		 		String k_41=t4.getText().toString();
		 		
		 		String k_51=t5.getText().toString();
		 
		 		String k_61=t6.getText().toString();
  
		 		
		 		String k_la1=t7.getText().toString();
		           
		 		String k_81=t8.getText().toString();
		 		
		 		if(   k_1.equals("")||k_21.equals("")||t3.getDate()==null||k_41.equals("")||k_51.equals("")||k_61.equals("")||k_la1.equals("")||k_81.equals("")  )
		 			JOptionPane.showMessageDialog(null,"veuillez selectionner un reparateur ");
			else {
				layeredPane.removeAll();
				layeredPane.add(pan);
				layeredPane.repaint();
				layeredPane.revalidate();
				t=1;
			}}
		});
		button.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		button.setBounds(520, 23, 144, 45);
		p2.add(button);
		
		btnAjouter = new JButton("ajouter");
		btnAjouter.setBackground(new Color(204, 255, 255));
		btnAjouter.setIcon(new ImageIcon("IMAGE_ICON\\add.png"));
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(pan);
				layeredPane.repaint();
				layeredPane.revalidate();
				t=2;
			}
		});
		btnAjouter.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		btnAjouter.setBounds(829, 113, 120, 45);
		p2.add(btnAjouter);
		 
		 pan6 = new JPanel();
		 pan6.setBackground(new Color(176, 224, 230));
		 layeredPane.add(pan6, "name_348603830254100");
		 pan6.setLayout(null);
		 
		 scrollPane_5 = new JScrollPane();
		 scrollPane_5.setBounds(88, 28, 745, 233);
		 pan6.add(scrollPane_5);
		 
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
				
					 tx1.setText(table_5.getModel().getValueAt(ligne, 0).toString());
					  //id1=table.getModel().getValueAt(ligne, 0).toString();
					 //id2= table.getModel().getValueAt(ligne, 7).toString();
					 tx2.setText(table_5.getModel().getValueAt(ligne, 1).toString());
					 tx3.setText(table_5.getModel().getValueAt(ligne, 2).toString());
					 tx4.setText(table_5.getModel().getValueAt(ligne, 3).toString());
					 tx6.setText(table_5.getModel().getValueAt(ligne, 4).toString());
					 //tx5.setText(table_5.getModel().getValueAt(ligne, 4).toString());
					 //t5.setText(table.getModel().getValueAt(ligne, 5).toString());
					 //t6.setText(table.getModel().getValueAt(ligne, 6).toString());
					 table_5.setSelectionBackground(Color.getColor("a", Color.getHSBColor(520, 50, 50)));
					 table_5.setSelectionForeground(Color.BLACK);
					
					//DefaultTableModel model=(DefaultTableModel) table.getModel();
					//Date date = new SimpleDateFormat("yyyy-mm-dd").parse((String) model.getValueAt(ligne, 3).toString());
					//t3.setDate(date);
								}			
	});
		 scrollPane_5.setViewportView(table_5);
		 
		 tx1 = new JTextField();
		 tx1.setBounds(398, 281, 165, 30);
		 pan6.add(tx1);
		 tx1.setColumns(10);
		 
		 tx2 = new JTextField();
		 tx2.setColumns(10);
		 tx2.setBounds(398, 326, 165, 30);
		 pan6.add(tx2);
		 
		 tx3 = new JTextField();
		 tx3.setColumns(10);
		 tx3.setBounds(398, 367, 165, 30);
		 pan6.add(tx3);
		 
		 tx4 = new JTextField();
		 tx4.setColumns(10);
		 tx4.setBounds(398, 408, 165, 30);
		 pan6.add(tx4);
		 
		 tx6 = new JTextField();
		 tx6.setColumns(10);
		 tx6.setBounds(398, 449, 165, 30);
		 pan6.add(tx6);
		 
		 x1 = new JLabel("id article");
		 x1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		 x1.setBounds(252, 281, 136, 30);
		 pan6.add(x1);
		 
		 x2 = new JLabel("poids");
		 x2.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		 x2.setBounds(252, 326, 136, 30);
		 pan6.add(x2);
		 
		 x3 = new JLabel("taille");
		 x3.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		 x3.setBounds(252, 367, 136, 30);
		 pan6.add(x3);
		 
		 x4 = new JLabel("couleur");
		 x4.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		 x4.setBounds(252, 408, 136, 30);
		 pan6.add(x4);
		 
		 type = new JLabel("type");
		 type.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		 type.setBounds(252, 449, 136, 30);
		 pan6.add(type);
		 
		 JButton btnAjouter_4 = new JButton("ajouter");
		 btnAjouter_4.setIcon(new ImageIcon("IMAGE_ICON\\add.png"));
		 btnAjouter_4.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		String k1=tx1.getText().toString();
				String l=null;
				String k21=tx2.getText().toString();
               
		
				String k41=tx3.getText().toString();
				
				String k51=tx5.getText().toString();
		
				String k61=tx4.getText().toString();
               
				String k6=tx6.getText().toString();
	            if(k61.equals("") && k1.equals("") && k21.equals("") && k41.equals( "") && k6.equals("")) 
		 			JOptionPane.showMessageDialog(null,"veuillez selectionner un article ");else {
		 		if(k51.equals("")) { 
				   JOptionPane.showMessageDialog(null,"veuillez taper la quantite  de commande ");
		 		}
				else{
        tx6.setText(null); tx4.setText(null);        tx2.setText(null);  tx3.setText(null);       tx1.setText(null);  tx5.setText(null);

		layeredPane.removeAll();
		layeredPane.add(pan5);
		layeredPane.repaint();
		layeredPane.revalidate();
			
        
				}

		 		
					            }}

				
		 	
		 });
		 btnAjouter_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		 btnAjouter_4.setBounds(630, 545, 124, 42);
		 pan6.add(btnAjouter_4);
		 
		 JButton btnAnnuler_1 = new JButton("annuler");
		 btnAnnuler_1.setIcon(new ImageIcon("IMAGE_ICON\\delete.png"));
		 btnAnnuler_1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		 tx6.setText(null);
	               tx4.setText(null);
	               tx2.setText(null);
	               tx3.setText(null);
	               tx5.setText(null);
	               tx1.setText(null);
	             
	         
		 	}
		 });
		 btnAnnuler_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		 btnAnnuler_1.setBounds(439, 545, 112, 42);
		 pan6.add(btnAnnuler_1);
		 
		 JButton btnRetourner_1 = new JButton("retourner");
		 btnRetourner_1.setIcon(new ImageIcon("IMAGE_ICON\\return.png"));
		 btnRetourner_1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		layeredPane.removeAll();
				layeredPane.add(pan5);
				layeredPane.repaint();
				layeredPane.revalidate();
		 	}
		 });
		 btnRetourner_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		 btnRetourner_1.setBounds(243, 545, 124, 42);
		 pan6.add(btnRetourner_1);
		 
		 tx5 = new JTextField();
		 tx5.setColumns(10);
		 tx5.setBounds(398, 490, 165, 30);
		 pan6.add(tx5);
		 
		 label_25 = new JLabel("quantit\u00E9");
		 label_25.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		 label_25.setBounds(252, 490, 136, 30);
		 pan6.add(label_25);
		 
		 pan = new JPanel();
		 pan.setBackground(new Color(176, 224, 230));
		 pan.setForeground(new Color(176, 224, 230));
		 layeredPane.add(pan, "name_439948061450500");
		 pan.setLayout(null);
		 
		 t8 = new JTextField();
		 t8.setColumns(10);
		 t8.setBounds(163, 11, 193, 31);
		 pan.add(t8);
		 
		 t1 = new JTextField();
		 t1.setColumns(10);
		 t1.setBounds(163, 58, 193, 31);
		 pan.add(t1);
		 
		 t2 = new JTextField();
		 t2.setColumns(10);
		 t2.setBounds(163, 100, 193, 31);
		 pan.add(t2);
		 
		 t3 = new JDateChooser();
		 t3.setBounds(163, 142, 193, 36);
		 pan.add(t3);
		 
		 t4 = new JTextField();
		 t4.setColumns(10);
		 t4.setBounds(163, 193, 193, 31);
		 pan.add(t4);
		 
		 t5 = new JTextField();
		 t5.setColumns(10);
		 t5.setBounds(163, 238, 193, 31);
		 pan.add(t5);
		 
		 t6 = new JTextField();
		 t6.setColumns(10);
		 t6.setBounds(163, 296, 193, 31);
		 pan.add(t6);
		 
		 t7 = new JTextField();
		 t7.setColumns(10);
		 t7.setBounds(163, 346, 193, 31);
		 pan.add(t7);
		 
		 JLabel label_3 = new JLabel("numero reparateur");
		 label_3.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 label_3.setBounds(23, 16, 129, 31);
		 pan.add(label_3);
		 
		 JLabel label_4 = new JLabel("nom");
		 label_4.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 label_4.setBounds(23, 58, 129, 31);
		 pan.add(label_4);
		 
		 JLabel label_5 = new JLabel("prenom");
		 label_5.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 label_5.setBounds(23, 100, 129, 31);
		 pan.add(label_5);
		 
		 JLabel label_6 = new JLabel("date de naissance");
		 label_6.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 label_6.setBounds(23, 147, 129, 31);
		 pan.add(label_6);
		 
		 JLabel label_7 = new JLabel("telephone");
		 label_7.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 label_7.setBounds(23, 193, 129, 31);
		 pan.add(label_7);
		 
		 JLabel label_8 = new JLabel("nom d'utilisateur");
		 label_8.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 label_8.setBounds(23, 238, 129, 31);
		 pan.add(label_8);
		 
		 JLabel label_9 = new JLabel("mot de passe");
		 label_9.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 label_9.setBounds(23, 296, 129, 31);
		 pan.add(label_9);
		 
		 JLabel label_10 = new JLabel("numero service");
		 label_10.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 label_10.setBounds(23, 346, 129, 31);
		 pan.add(label_10);
		 
		 btnAjouter_3 = new JButton("Valider");
		 btnAjouter_3.setIcon(new ImageIcon("IMAGE_ICON\\accept.png"));
		 btnAjouter_3.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		 btnAjouter_3.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
		 		if(t==2) {
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
		 			if(t8.getText().toString().length()==4) {
		 		try {
		 			if(!recherche_service(t7.getText().toString()).next()) {JOptionPane.showMessageDialog(null,"ce service n'existe pas !! ");}
		 			else {if(t4.getText().length()>10) {JOptionPane.showMessageDialog(null,"veuillez verifier le numero de telephone que vous avez taper ");}
		 			 else {
		 				String sql="  insert into reparateur (  nom,  prenom, date_naissance, tel, username, password, idservice  , id  ) values ( ? , ? , ? , ?, ? , ? , ? , ? )";
		 				try {
		 					pr=cnx.prepareStatement(sql);
		 						String k=t1.getText().toString();
		 						pr.setString(1,k);
		 						String k2=t2.getText().toString();
		 						pr.setString(2,k2);
		 						SimpleDateFormat date =new SimpleDateFormat("yyyy-MM-dd");
		 						String k3=date.format(t3.getDate());
		 						pr.setString(3,k3);
		 						String k4=t4.getText().toString();
		 						pr.setString(4,k4);
		 						String k5=t5.getText().toString();
		 						pr.setString(5,k5);
		 						String k6=t6.getText().toString();
		 						pr.setString(6,k6);
		 						String kla=t7.getText().toString();
		 						pr.setString(7,kla);
		 						String k8=t8.getText().toString();
		 						pr.setString(8,k8);					
		 								pr.execute();
		 								JOptionPane.showMessageDialog(null,"Reparateur ajouter") ;
		 								
		 								uptable2();
		 								layeredPane.removeAll();
		 								layeredPane.add(p2);
		 								layeredPane.repaint();
		 								layeredPane.revalidate();
		 								t2.setText(null);
		 								t4.setText(null);
		 								t1.setText(null);
		 								t5.setText(null);
		 								t6.setText(null);
		 								t7.setText(null);
		 								t8.setText(null);
		 								t3.setDate(null);}
		 					catch (SQLException ez) {
		 						JOptionPane.showMessageDialog(null,"ce reparateur existe deja dans se service !!");
		 						}}}
		 		}catch (HeadlessException e1) {
		 			// TODO Auto-generated catch block
		 			e1.printStackTrace();
		 		} catch (SQLException e1) {
		 			// TODO Auto-generated catch block
		 			e1.printStackTrace();
		 		}}
		 			else {
		             	   JOptionPane.showMessageDialog(null,"veuillez taper un numero de reparateur de 4 bite ");
		                }}}
		 	
		 	
			 	if(t==1) {
			 		String k_1=t1.getText().toString();
			 				 		
			 				 		String k_21=t2.getText().toString();
			 		               
			 				 
			 				 		String k_41=t4.getText().toString();
			 				 		
			 				 		String k_51=t5.getText().toString();
			 				 
			 				 		String k_61=t6.getText().toString();
			 		  
			 				 		
			 				 		String k_la1=t7.getText().toString();
			 				           
			 				 		String k_81=t8.getText().toString();
			 				 		
			 				 		if(   k_1.equals("")||k_21.equals("")||t3.getDate()==null||k_41.equals("")||k_51.equals("")||k_61.equals("")||k_la1.equals("")||k_81.equals("")  )
			 				 			JOptionPane.showMessageDialog(null,"veuillez selectionner un reparateur ");
			 				 		
			 				 		else {							
			 				 		
			 				 			 if(t8.getText().toString().length()==4 ) {
			 				 				 try {
			 				 					if(!recherche_service(t7.getText().toString()).next()) {JOptionPane.showMessageDialog(null,"ce service n'existe pas !! ");}
			 				 					else {
			 				 						if(t4.getText().length()>10) {JOptionPane.showMessageDialog(null,"veuillez verifier le numero de telephone que vous avez taper ");}
			 				 						 else {
			 				 				
			 				 					SimpleDateFormat date =new SimpleDateFormat("yyyy-MM-dd");
			 				 					
			 				 					String k3=date.format(t3.getDate());
			 				 				String requete="UPDATE reparateur  SET   id='"+t8.getText()
			 				 						+"',nom ='"+t1.getText()
			 				 						+"',date_naissance ='"+k3
			 				 						+"',prenom ='"+t2.getText()
			 				 						+"',tel ='"+t4.getText()
			 				 						+"',username ='"+t5.getText()
			 				 						+"',password ='"+t6.getText()
			 				 						+"',idservice ='"+t7.getText()
			 				 						+"' where id ='"+id1
			 				 						+"'and idservice ='"+id2+"'";
			 				 				try {
			 				 					pr=cnx.prepareStatement(requete);
			 				 					//pr.setString(1,t10.getText().toString());
			 				 					
			 				 					pr.executeUpdate();
			 				 				
			 				 					JOptionPane.showMessageDialog(null, "information  modifier de reparateur");
			 				 					uptable2();

				 							
				 								layeredPane.removeAll();
				 								layeredPane.add(p2);
				 								layeredPane.repaint();
				 								layeredPane.revalidate();
				 						
			 				 					t2.setText(null);
			 				 					t4.setText(null);
			 				 					t1.setText(null);
			 				 					t5.setText(null);
			 				 					t6.setText(null);
			 				 					t7.setText(null);
			 				 					t8.setText(null);
			 				 					t3.setDate(null);}
			 				 				 catch (SQLException e1) {
			 				 					// TODO Auto-generated catch block
			 				 					//e1.printStackTrace();
			 				 					JOptionPane.showMessageDialog(null, "se reparateur  n'existe pas");
			 				 				}}}
			 				 				 	}
			 				 				  catch (HeadlessException e2) {
			 				 					// TODO Auto-generated catch block
			 				 					e2.printStackTrace();
			 				 				} catch (SQLException e2) {
			 				 					// TODO Auto-generated catch block
			 				 					e2.printStackTrace();}
			 				 				}else {  JOptionPane.showMessageDialog(null,"veuillez taper un numero de reparateur de 4 bite ");}
			 				 				 	
			 				 		}
		 	}
		 	
		 	
		
		 	}
		 	
		 });
		 btnAjouter_3.setBounds(486, 184, 120, 45);
		 pan.add(btnAjouter_3);
		 
		 btnOurner = new JButton("Annuler");
		 btnOurner.setIcon(new ImageIcon("IMAGE_ICON\\delete.png"));
		 btnOurner.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		layeredPane.removeAll();
				layeredPane.add(p2);
				layeredPane.repaint();
				layeredPane.revalidate();
		 	}
		 });
		 btnOurner.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		 btnOurner.setBounds(486, 256, 120, 45);
		 pan.add(btnOurner);
		
		 p3 = new JPanel();
		 p3.setBackground(new Color(176, 224, 230));
		layeredPane.add(p3, "name_7385635862500");
		p3.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(0, 159, 1106, 451);
		p3.add(scrollPane_3);
		
		table_2 = new JTable(){
			 public boolean isCellEditable(int d,int c) {
				 return false;
			 }
		 };
		table_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				  try {
	
	int ligne= table_2.getSelectedRow();
	f9.setText(null);
	
	 f1.setText(table_2.getModel().getValueAt(ligne, 0).toString());
	  id11=table_2.getModel().getValueAt(ligne, 0).toString();
	 id21= table_2.getModel().getValueAt(ligne, 7).toString();
	 f2.setText(table_2.getModel().getValueAt(ligne, 1).toString());
	 f3.setText(table_2.getModel().getValueAt(ligne, 2).toString());
	 f5.setText(table_2.getModel().getValueAt(ligne, 4).toString());
	 f6.setText("0"+table_2.getModel().getValueAt(ligne, 5).toString());
	 f7.setText(table_2.getModel().getValueAt(ligne, 6).toString());
	 f8.setText(table_2.getModel().getValueAt(ligne, 7).toString());
	 table_2.setSelectionBackground(Color.getColor("a", Color.getHSBColor(520, 50, 50)));
	 table_2.setSelectionForeground(Color.BLACK);
	DefaultTableModel model=(DefaultTableModel) table_2.getModel();
	Date date = new SimpleDateFormat("yyyy-mm-dd").parse((String) model.getValueAt(ligne, 3).toString());
	f4.setDate(date);
	
} catch (ParseException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
	
}		
			
				
				
				
			}
		});
		scrollPane_3.setViewportView(table_2);
		
		JLabel lblRechercheParNumero = new JLabel("Recherche :");
		lblRechercheParNumero.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		lblRechercheParNumero.setBounds(438, 80, 117, 24);
		p3.add(lblRechercheParNumero);
		
		JButton btnAjouter_2 = new JButton("ajouter");
		btnAjouter_2.setIcon(new ImageIcon("IMAGE_ICON\\add.png"));
		btnAjouter_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				layeredPane.removeAll();
				layeredPane.add(pan2);
				layeredPane.repaint();
				layeredPane.revalidate();
				m=1;
				
			}
		});
		btnAjouter_2.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		btnAjouter_2.setBounds(734, 11, 130, 40);
		p3.add(btnAjouter_2);
		
		JButton btnSupprimer_2 = new JButton("supprimer");
		btnSupprimer_2.setIcon(new ImageIcon("IMAGE_ICON\\delete.png"));
		btnSupprimer_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f1.getText().equals("")) {JOptionPane.showMessageDialog(null, "veuillez selectionner un chef service");}else {
					
					{
									String sql1=" delete from chef_service where  numch=?   and service_idservice=?";
									try {
										pr=cnx.prepareStatement(sql1);
										pr.setString(1,f1.getText());
										pr.setString(2,f8.getText());
										
										pr.execute();
										uptable();
										f2.setText(null);
										f3.setText(null);
										f1.setText(null);
										f5.setText(null);
										f6.setText(null);
										f7.setText(null);
										f8.setText(null);
										f4.setDate(null);
									
									} catch (SQLException e1) {
								
										
										e1.printStackTrace();
									}
			}
		}}});
		btnSupprimer_2.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		btnSupprimer_2.setBounds(177, 11, 144, 40);
		p3.add(btnSupprimer_2);
		
		JButton btnModifer = new JButton("modifer");
		btnModifer.setIcon(new ImageIcon("IMAGE_ICON\\icons8-modifier-32.png"));
		btnModifer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String k1=f1.getText().toString();
				
				String k21=f2.getText().toString();
               
		
				String k41=f8.getText().toString();
				
				String k51=f5.getText().toString();
		
				String k61=f3.getText().toString();
  
				
				String kla1=f6.getText().toString();
		
				String k81=f7.getText().toString();
	               	
				if(   k1.equals("")||k21.equals("")||f4.getDate()==null||k51.equals("")||k41.equals("")||k61.equals("")||kla1.equals("")||k81.equals("")  )
					JOptionPane.showMessageDialog(null,"veuillez selecctionner un chef service ");
				
				else {
				
				
				layeredPane.removeAll();
				layeredPane.add(pan2);
				layeredPane.repaint();
				layeredPane.revalidate();
				m=2;
				}	
			}
		});
		btnModifer.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		btnModifer.setBounds(425, 11, 130, 40);
		p3.add(btnModifer);
		
		f9 = new JTextField();
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
		f9.setBounds(393, 115, 206, 33);
		p3.add(f9);
		f9.setColumns(10);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("IMAGE_ICON\\loupe.png"));
		label_2.setBounds(403, 89, 25, 15);
		p3.add(label_2);
           
           pan7 = new JPanel();
           pan7.setBackground(new Color(176, 224, 230));
           layeredPane.add(pan7, "name_400482899941800");
           pan7.setLayout(null);
           
           JScrollPane scrollPane = new JScrollPane();
           scrollPane.setBounds(90, 11, 942, 285);
           pan7.add(scrollPane);
           
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
				  //id1=table.getModel().getValueAt(ligne, 0).toString();
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
           
           JButton btnRdigerUnRapport = new JButton("Valider le rapport");
           btnRdigerUnRapport.setIcon(new ImageIcon("IMAGE_ICON\\accept.png"));
           btnRdigerUnRapport.addActionListener(new ActionListener() {
           	public void actionPerformed(ActionEvent e) {
           		
           		
           		//JOptionPane.showMessageDialog(null,"veuillez selecctionner un rapport 1");
           		if(!id22.equals(" "))
           		{
           			if (id22.equals("non") && !id23.equals(" ")) {
           				
           				String requete="UPDATE rapport_chef_service SET   valide='"+"oui"
						+"' where num_rapport ='"+id23+"'";
				try {
					pr=cnx.prepareStatement(requete);
					//pr.setString(1,t10.getText().toString());
					
					pr.executeUpdate();
				
					JOptionPane.showMessageDialog(null, "rapport valider");
					rapport();
					id23=null;
					id22=null;
				}
				 catch (SQLException e1) {
					// TODO Auto-generated catch block
					//e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "veuillez selecctionner un rapport");
				}
           			
           			}else {if(id22.equals("oui")) {
           				
           				JOptionPane.showMessageDialog(null, "ce rapport est déja valider");
    					id23=null;
    					id22=null;
           			}
           			}
           		
           		}else {
           			JOptionPane.showMessageDialog(null,"veuillez selecctionner un rapport ");
           		}
           	
           		}
           });
           btnRdigerUnRapport.setFont(new Font("Tahoma", Font.BOLD, 13));
           btnRdigerUnRapport.setBounds(466, 317, 181, 43);
           pan7.add(btnRdigerUnRapport);
		
           p4 = new JPanel();
           p4.setBackground(new Color(176, 224, 230));
		layeredPane.add(p4, "name_7414096282500");
		p4.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 154, 1106, 456);
		p4.add(scrollPane_2);
		
		table_1 = new JTable(){
			 public boolean isCellEditable(int d,int c) {
				 return false;
			 }
		 };
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
								
					int ligne= table_1.getSelectedRow();
					
					 s1.setText(table_1.getModel().getValueAt(ligne, 0).toString());
					  kilo=table_1.getModel().getValueAt(ligne, 0).toString();
					 
					 s2.setText(table_1.getModel().getValueAt(ligne, 1).toString());
					
					 table_1.setSelectionBackground(Color.getColor("a", Color.getHSBColor(520, 50, 50)));
					 table_1.setSelectionForeground(Color.BLACK);
					
			
			}
		});
		scrollPane_2.setViewportView(table_1);
		
		s1 = new JTextField();
		s1.setBounds(161, 12, 264, 26);
		p4.add(s1);
		s1.setColumns(10);
		
		s2 = new JTextField();
		s2.setColumns(10);
		s2.setBounds(161, 49, 264, 26);
		p4.add(s2);
		
		JButton btnAjouter_1 = new JButton("ajouter");
		btnAjouter_1.setIcon(new ImageIcon("IMAGE_ICON\\add.png"));
		btnAjouter_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql="  insert into service(  idservice  , noms     ) values ( ? , ?  )";
				try {
						pr=cnx.prepareStatement(sql);
						String k=s1.getText().toString();
						pr.setString(1,k);
						//String p=t2.getText().toString();
						//InputStream imgg =new FileInputStream(new File(pi));
						//pr.setString(3,s);					
						String kla=s2.getText().toString();
						pr.setString(2,kla);
					//p.equals("") ||
						
						if(   k.equals("")||kla.equals("")  )
							JOptionPane.showMessageDialog(null,"veuillez remplire tous les champs vide ");
						else {if(s1.getText().toString().length()==4)							
								{pr.execute();
								uptable1();}else JOptionPane.showMessageDialog(null,"veuillez taper un numero service de 4 bite   ");
						}}
					catch (SQLException eE) {
						JOptionPane.showMessageDialog(null,"ce service existe deja  ");
						//e.printStackTrace();
					}
			
			
			
			
			}
		});
		btnAjouter_1.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 12));
		btnAjouter_1.setBounds(487, 24, 152, 40);
		p4.add(btnAjouter_1);
		
		JButton btnModifier_1 = new JButton("modifier");
		btnModifier_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String requete="UPDATE service SET   idservice='"+s1.getText()
				+"',noms ='"+s2.getText()
				+"' where idservice ='"+kilo
				+"'";
		try {
			if(s1.getText().toString().length()==4)							
			{ 
			pr=cnx.prepareStatement(requete);
			pr.executeUpdate();
		
			JOptionPane.showMessageDialog(null, "information  modifier de service");
			uptable1();
			s2.setText(null);
			s1.setText(null);
			}else JOptionPane.showMessageDialog(null,"veuillez taper un numero service de 4 bite   ");}
		 catch (SQLException e1) {
			JOptionPane.showMessageDialog(null, "se service  n'existe pas");
		}
			}
		});
		btnModifier_1.setIcon(new ImageIcon("IMAGE_ICON\\icons8-modifier-32.png"));
		btnModifier_1.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 12));
		btnModifier_1.setBounds(676, 24, 152, 40);
		p4.add(btnModifier_1);
		
		JButton btnSupprimer_1 = new JButton("supprimer");
		btnSupprimer_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql21=" delete from reparateur  where  idservice = ? ";
				try {
					pr=cnx.prepareStatement(sql21);
					pr.setString(1,s1.getText().toString());
					if(s1.getText().toString().equals(" ") ){
					}else{
					pr.execute();
				
					}
					
				
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					//JOptionPane.showMessageDialog(null,"ce cours n'existe pas  ");
			
				}
				String sql211=" delete from chef_service  where  idservice = ? ";
				try {
					pr=cnx.prepareStatement(sql211);
					pr.setString(1,s1.getText().toString());
					if(s1.getText().toString().equals(" ") ){
						
					}else{
					pr.execute();
				
					}
					
				
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					//JOptionPane.showMessageDialog(null,"ce cours n'existe pas  ");
			
				}
				
				
				
				String sql1=" delete from service  where  idservice = ? ";
				try {
					pr=cnx.prepareStatement(sql1);
					pr.setString(1,s1.getText().toString());
				
					
					if(s1.getText().toString().equals(" ")){
						JOptionPane.showMessageDialog(null, "veuillez selectionné un service  ");
					}else{
					pr.execute();
					uptable1();
					}
					
					//t3.setText(null);
					
					
				} catch (SQLException e1) {
					e1.printStackTrace();
			
				}
				
			}
		});
		btnSupprimer_1.setIcon(new ImageIcon("IMAGE_ICON\\delete.png"));
		btnSupprimer_1.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 12));
		btnSupprimer_1.setBounds(872, 24, 155, 40);
		p4.add(btnSupprimer_1);
		
		JLabel lblNumeroDeService = new JLabel("numero de service");
		lblNumeroDeService.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 12));
		lblNumeroDeService.setBounds(10, 11, 155, 26);
		p4.add(lblNumeroDeService);
		
		JLabel lblNomDeService = new JLabel("   nom de service");
		lblNomDeService.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 12));
		lblNomDeService.setBounds(0, 48, 155, 26);
		p4.add(lblNomDeService);
		
		s3 = new JTextField();
		s3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				 DefaultTableModel ta=(DefaultTableModel)table_1.getModel(); 
					String s=s3.getText().toLowerCase();
		TableRowSorter<DefaultTableModel> tr=new  TableRowSorter<DefaultTableModel>(ta);
		table_1.setRowSorter(tr);
		tr.setRowFilter(RowFilter.regexFilter(s));
					
				
			}
		});
		s3.setBounds(520, 107, 198, 26);
		p4.add(s3);
		s3.setColumns(10);
		
		JLabel lblRecherecheParNumero = new JLabel("Rechereche :");
		lblRecherecheParNumero.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblRecherecheParNumero.setBounds(418, 106, 95, 26);
		p4.add(lblRecherecheParNumero);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("IMAGE_ICON\\loupe.png"));
		label_1.setBounds(399, 106, 26, 26);
		p4.add(label_1);
		
		pan2 = new JPanel();
		pan2.setBackground(new Color(176, 224, 230));
		layeredPane.add(pan2, "name_448297305773400");
		pan2.setLayout(null);
		
		f8 = new JTextField();
		f8.setColumns(10);
		f8.setBounds(219, 380, 188, 33);
		pan2.add(f8);
		
		label_11 = new JLabel(" numero service");
		label_11.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		label_11.setBounds(21, 378, 188, 33);
		pan2.add(label_11);
		
		label_12 = new JLabel(" mot de passe");
		label_12.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		label_12.setBounds(21, 331, 188, 33);
		pan2.add(label_12);
		
		label_13 = new JLabel(" nom d'utilisateur");
		label_13.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		label_13.setBounds(21, 279, 188, 33);
		pan2.add(label_13);
		
		label_14 = new JLabel(" telephone");
		label_14.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		label_14.setBounds(21, 228, 188, 33);
		pan2.add(label_14);
		
		label_15 = new JLabel(" date de naissance");
		label_15.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		label_15.setBounds(21, 172, 188, 33);
		pan2.add(label_15);
		
		label_16 = new JLabel(" prenom");
		label_16.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		label_16.setBounds(21, 123, 188, 33);
		pan2.add(label_16);
		
		label_17 = new JLabel(" nom");
		label_17.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		label_17.setBounds(21, 71, 188, 33);
		pan2.add(label_17);
		
		label_18 = new JLabel(" numero chef service");
		label_18.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		label_18.setBounds(21, 27, 188, 33);
		pan2.add(label_18);
		
		f1 = new JTextField();
		f1.setColumns(10);
		f1.setBounds(219, 29, 188, 33);
		pan2.add(f1);
		
		f2 = new JTextField();
		f2.setColumns(10);
		f2.setBounds(219, 73, 188, 33);
		pan2.add(f2);
		
		f3 = new JTextField();
		f3.setColumns(10);
		f3.setBounds(219, 125, 188, 33);
		pan2.add(f3);
		
		f4 = new JDateChooser();
		f4.setBounds(219, 175, 188, 33);
		pan2.add(f4);
		
		f5 = new JTextField();
		f5.setColumns(10);
		f5.setBounds(219, 228, 188, 33);
		pan2.add(f5);
		
		f6 = new JTextField();
		f6.setColumns(10);
		f6.setBounds(219, 281, 188, 33);
		pan2.add(f6);
		
		f7 = new JTextField();
		f7.setColumns(10);
		f7.setBounds(219, 333, 188, 33);
		pan2.add(f7);
		
		btnValider = new JButton("Valider");
		btnValider.setIcon(new ImageIcon("IMAGE_ICON\\accept.png"));
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (m==1) {
						String k1=f1.getText().toString();
						
						String k21=f2.getText().toString();
		               
				
						String k41=f8.getText().toString();
						
						String k51=f5.getText().toString();
				
						String k61=f3.getText().toString();
		  
						
						String kla1=f6.getText().toString();
				
						String k81=f7.getText().toString();
			               	
						if(   k1.equals("")||k21.equals("")||f4.getDate()==null||k51.equals("")||k41.equals("")||k61.equals("")||kla1.equals("")||k81.equals("")  )
							JOptionPane.showMessageDialog(null,"veuillez remplire tous les champs vide ");
						
						else {
							if(f1.getText().toString().length()==4) {
						try {
							if(!recherche_service(f8.getText().toString()).next()) {JOptionPane.showMessageDialog(null,"ce service n'existe pas !! ");}
							else {if(f5.getText().length()>10) {JOptionPane.showMessageDialog(null,"veuillez verifier le numero de telephone que vous avez taper ");}
							 else {
								String sql="  insert into chef_service (   numch,nom,  prenom, dtn, tel, username, password, service_idservice  ,id_commandont  ) values ( ? , ? , ? , ?, ? , ? , ? , ?,? )";
								try {
									pr=cnx.prepareStatement(sql);
										String k=f1.getText().toString();
										pr.setString(1,k);
										String k2=f2.getText().toString();
										pr.setString(2,k2);
										SimpleDateFormat date =new SimpleDateFormat("yyyy-MM-dd");
										String k3=date.format(f4.getDate());
										pr.setString(4,k3);
										String k4=f3.getText().toString();
										pr.setString(3,k4);
										String k5=f6.getText().toString();
										pr.setString(6,k5);
										String kd5=f5.getText().toString();
										pr.setString(5,kd5);
										String k6=f7.getText().toString();
										pr.setString(7,k6);
										String kla=f8.getText().toString();
										pr.setString(8,kla);
										//String k8=t8.getText().toString();
										pr.setString(9,"1");					
												pr.execute();
												JOptionPane.showMessageDialog(null,"chef service ajouter") ;
												f8.setText(null);
												uptable();
												layeredPane.removeAll();
												layeredPane.add(p3);
												layeredPane.repaint();
												layeredPane.revalidate();
												//f8.setText(null);
												f2.setText(null);
												f3.setText(null);
												f1.setText(null);
												f5.setText(null);
												f6.setText(null);
												f7.setText(null);
												f4.setDate(null);
										}
									catch (SQLException ez) {
										JOptionPane.showMessageDialog(null,"ce chef service existe deja dans se service !!");
										ez.printStackTrace();
									}}
							}
						
						}catch (HeadlessException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}}
							else {
				            	   JOptionPane.showMessageDialog(null,"veuillez taper un numero de chef service de 4 bite ");
				               }}
						
						
				}
				
				if(m==2) {
					String k_1=f1.getText().toString();
					
					String k_21=f2.getText().toString();
	               
			
					String k_41=f3.getText().toString();
					
					String k_51=f5.getText().toString();
			
					String k_61=f6.getText().toString();
	  
					
					String k_la1=f7.getText().toString();
			          
					String k_81=f8.getText().toString();
					
					if(   k_1.equals("")||k_21.equals("")||f4.getDate()==null||k_41.equals("")||k_51.equals("")||k_61.equals("")||k_la1.equals("")||k_81.equals("")  )
						JOptionPane.showMessageDialog(null,"veuillez selectionner un chef service ");
					
					else {							
					
						 if(f1.getText().toString().length()==4 ) {
							 try {
								if(!recherche_service(f8.getText().toString()).next()) {JOptionPane.showMessageDialog(null,"ce service n'existe pas !! ");}
								else {
									if(f5.getText().length()>10) {JOptionPane.showMessageDialog(null,"veuillez verifier le numero de telephone que vous avez taper ");}
									 else {
							
								SimpleDateFormat date =new SimpleDateFormat("yyyy-MM-dd");
								
								String k3=date.format(f4.getDate());
							String requete="UPDATE chef_service SET   numch='"+f1.getText()
									+"',nom ='"+f2.getText()
									+"',dtn ='"+k3
									+"',prenom ='"+f3.getText()
									+"',tel ='"+f5.getText()
									+"',username ='"+f6.getText()
									+"',password ='"+f7.getText()
									+"',service_idservice ='"+f8.getText()
									+"' where numch ='"+id11
									+"'and service_idservice ='"+id21+"'";
							try {
								pr=cnx.prepareStatement(requete);
								//pr.setString(1,t10.getText().toString());
								
								pr.executeUpdate();
							
								JOptionPane.showMessageDialog(null, "information  modifier de chef service");
								uptable();
								f2.setText(null);
								f3.setText(null);
								f1.setText(null);
								f5.setText(null);
								f6.setText(null);
								f7.setText(null);
								f8.setText(null);
								f4.setDate(null);}
							 catch (SQLException e1) {
								// TODO Auto-generated catch block
								//e1.printStackTrace();
								JOptionPane.showMessageDialog(null, "se chef service   n'existe pas");
							}}}
							 	}
							  catch (HeadlessException e2) {
								// TODO Auto-generated catch block
								e2.printStackTrace();
							} catch (SQLException e2) {
								// TODO Auto-generated catch block
								e2.printStackTrace();}
							}else {  JOptionPane.showMessageDialog(null,"veuillez taper un numero de chef service  de 4 bite ");}
							 	
					}
			
				}
			}
		});
		btnValider.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		btnValider.setBounds(474, 179, 112, 45);
		pan2.add(btnValider);
		
		btnRetourner = new JButton("Annuler");
		btnRetourner.setIcon(new ImageIcon("IMAGE_ICON\\delete.png"));
		btnRetourner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(p3);
				layeredPane.repaint();
				layeredPane.revalidate();
		 	
			}
		});
		btnRetourner.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		btnRetourner.setBounds(474, 253, 112, 45);
		pan2.add(btnRetourner);
		
		pan3 = new JPanel();
		pan3.setBackground(new Color(176, 224, 230));
		layeredPane.add(pan3, "name_448303123023100");
		pan3.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(0, 123, 1106, 487);
		pan3.add(scrollPane_4);
		
		table_3 = new JTable(){
			 public boolean isCellEditable(int d,int c) {
				 return false;
			 }
		 };
		scrollPane_4.setViewportView(table_3);
		
		pan5 = new JPanel();
		pan5.setBackground(new Color(176, 224, 230));
		layeredPane.add(pan5, "name_140683561765200");
		pan5.setLayout(null);
		Font f =new Font("Arial",Font.BOLD,15);
		
		pan4 = new JPanel();
		pan4.setBackground(new Color(176, 224, 230));
		layeredPane.add(pan4, "name_121817075301600");
		pan4.setLayout(null);
		
		JLabel lblConcepteur = new JLabel("numero agent ");
		lblConcepteur.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lblConcepteur.setBounds(10, 23, 188, 33);
		pan4.add(lblConcepteur);
		
		JLabel lblLibell = new JLabel("nom");
		lblLibell.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lblLibell.setBounds(10, 67, 188, 33);
		pan4.add(lblLibell);
		
		JLabel lblPoids = new JLabel("pr\u00E9nom");
		lblPoids.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lblPoids.setBounds(10, 119, 188, 33);
		pan4.add(lblPoids);
		
		v3 = new JTextField();
		v3.setColumns(10);
		v3.setBounds(208, 121, 188, 33);
		pan4.add(v3);
		
		v2 = new JTextField();
		v2.setColumns(10);
		v2.setBounds(208, 69, 188, 33);
		pan4.add(v2);
		
		v1 = new JTextField();
		v1.setColumns(10);
		v1.setBounds(208, 25, 188, 33);
		pan4.add(v1);
		
		JLabel lblQuantit = new JLabel("grade");
		lblQuantit.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lblQuantit.setBounds(10, 209, 188, 33);
		pan4.add(lblQuantit);
		
		v5 = new JTextField();
		v5.setColumns(10);
		v5.setBounds(208, 211, 188, 33);
		pan4.add(v5);
		
		JLabel lblDscription = new JLabel("code postale");
		lblDscription.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lblDscription.setBounds(10, 253, 188, 33);
		pan4.add(lblDscription);
		
		v6 = new JTextField();
		v6.setColumns(10);
		v6.setBounds(208, 255, 188, 33);
		pan4.add(v6);
		
		v7 = new JTextField();
		v7.setColumns(10);
		v7.setBounds(208, 299, 188, 33);
		pan4.add(v7);
		
		JLabel lblCouleur = new JLabel("username");
		lblCouleur.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lblCouleur.setBounds(10, 297, 188, 33);
		pan4.add(lblCouleur);
		
		v8 = new JTextField();
		v8.setColumns(10);
		v8.setBounds(208, 345, 188, 33);
		pan4.add(v8);
		
		JLabel lblTaille = new JLabel("password");
		lblTaille.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lblTaille.setBounds(10, 343, 188, 33);
		pan4.add(lblTaille);
		
		v4 = new JDateChooser();
		v4.setBounds(208, 167, 188, 33);
		pan4.add(v4);
		
		JLabel lblDate = new JLabel(" date de naissance");
		lblDate.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lblDate.setBounds(0, 165, 188, 33);
		pan4.add(lblDate);
		
		JButton btnValider_1 = new JButton("Valider");
		btnValider_1.setIcon(new ImageIcon("IMAGE_ICON\\accept.png"));
		btnValider_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnValider_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(m==2) {
			 		String k1=v1.getText().toString();
					 
			 		String k21=v2.getText().toString();
	               
			 
			 		String k41=v3.getText().toString();
			 		
			 		String k51=v5.getText().toString();
			 
			 		String k61=v6.getText().toString();
	  
			 		
			 		String kla1=v7.getText().toString();
			 
			 		String k81=v8.getText().toString();
		               	
			 		if(  v9.getText().toString().equals("") || k1.equals("")||k21.equals("")||k41.equals("")||v4.getDate()==null||k51.equals("")||k61.equals("")||kla1.equals("")||k81.equals("")  )
			 			JOptionPane.showMessageDialog(null,"veuillez remplire tous les champs vide ");
			 		
			 		else {
			 			
			 		try {
			 			if(!recherche_service(v9.getText().toString()).next()) {JOptionPane.showMessageDialog(null,"ce service n'existe pas !! ");}
			 			else {
			 				String sql="  insert into agent ( idagent, nom,  prenom, dtn,grade, codepostale, username, password, idservice   ) values ( ? , ? , ? , ?, ? , ? , ? , ?,? )";
			 				try {
			 					pr=cnx.prepareStatement(sql);
			 						String k=v1.getText().toString();
			 						pr.setString(1,k);
			 						String k2=v2.getText().toString();
			 						pr.setString(2,k2);
			 						SimpleDateFormat date =new SimpleDateFormat("yyyy-MM-dd");
			 						String k3=date.format(v4.getDate());
			 						pr.setString(4,k3);
			 						String k4=v3.getText().toString();
			 						pr.setString(3,k4);
			 						String k5=v5.getText().toString();
			 						pr.setString(5,k5);
			 						String k6=v6.getText().toString();
			 						pr.setString(6,k6);
			 						String kla=v7.getText().toString();
			 						pr.setString(7,kla);
			 						String k8=v8.getText().toString();
			 						pr.setString(8,k8);					
			 						String k811=v9.getText().toString();
			 						pr.setString(9,k811);					
			 								pr.execute();
			 								JOptionPane.showMessageDialog(null,"agent ajouter") ;
			 							    agent();

			 								layeredPane.removeAll();
			 								layeredPane.add(pan9);
			 								layeredPane.repaint();
			 								layeredPane.revalidate();

			 								v2.setText(null);
			 								v3.setText(null);
			 								v1.setText(null);
			 								v5.setText(null);
			 								v6.setText(null);
			 								v7.setText(null);
			 								v8.setText(null);
			 								v9.setText(null);
			 								v4.setDate(null);}
			 					catch (SQLException ez) {
			 						JOptionPane.showMessageDialog(null,"ce agent existe deja dans se service !!");
			 						}}
			 		}catch (HeadlessException e1) {
			 			// TODO Auto-generated catch block
			 			e1.printStackTrace();
			 		} catch (SQLException e1) {
			 			// TODO Auto-generated catch block
			 			e1.printStackTrace();
			 		}}}
			 	
			 	
				 	if(t==2) {
				 		String k_1=v1.getText().toString();
				 				 		
				 				 		String k_21=v2.getText().toString();
				 		               
				 				 
				 				 		String k_41=v3.getText().toString();
				 				 		
				 				 		String k_51=v5.getText().toString();
				 				 
				 				 		String k_61=v6.getText().toString();
				 		  
				 				 		
				 				 		String k_la1=v7.getText().toString();
				 				           
				 				 		String k_81=v8.getText().toString();
				 				 		
				 				 		if(v9.getText().toString().equals("")||   k_1.equals("")||k_21.equals("")||v4.getDate()==null||k_41.equals("")||k_51.equals("")||k_61.equals("")||k_la1.equals("")||k_81.equals("")  )
				 				 			JOptionPane.showMessageDialog(null,"veuillez remplire tous les champs vide");
				 				 		
				 				 		else {							
				 				 		
				 				 			 if(v1.getText().toString().length()==4 ) {
				 				 				 try {
				 				 					if(!recherche_service(v9.getText().toString()).next()) {JOptionPane.showMessageDialog(null,"ce service n'existe pas !! ");}
				 				 					else {
				 				 						
				 				 						 
				 				 				
				 				 					SimpleDateFormat date =new SimpleDateFormat("yyyy-MM-dd");
				 				 					
				 				 					String k3=date.format(v4.getDate());
				 				 				String requete="UPDATE agent  SET   idagent='"+v1.getText()
				 				 						+"',nom ='"+v2.getText()
				 				 						+"',prenom='"+v3.getText()
				 				 						+"',dtn ='"+k3
				 				 						+"',grade ='"+v5.getText()
				 				 						+"',codepostale ='"+v6.getText()
				 				 						+"',username ='"+v7.getText()
				 				 						+"',password ='"+v8.getText()
				 				 						+"',idservice ='"+v9.getText()
				 				 						+"' where idagent ='"+i60
				 				 						+"'and idservice ='"+i61+"'";
				 				 				try {
				 				 					pr=cnx.prepareStatement(requete);
				 				 					//pr.setString(1,t10.getText().toString());
				 				 					
				 				 					pr.executeUpdate();
				 				 				
				 				 					JOptionPane.showMessageDialog(null, "information  modifier de l'agent");
				 				 					agent();

				 				 					layeredPane.removeAll();
				 				 					layeredPane.add(pan9);
				 				 					layeredPane.repaint();
				 				 					layeredPane.revalidate();
				 				 				

				 				 					v2.setText(null);
				 				 					v3.setText(null);
				 				 					v1.setText(null);
				 				 					v5.setText(null);
				 				 					v6.setText(null);
				 				 					v7.setText(null);
				 				 					v8.setText(null);
				 				 					v9.setText(null);
				 				 					v4.setDate(null);}
				 				 				 catch (SQLException e1) {
				 				 					// TODO Auto-generated catch block
				 				 					//e1.printStackTrace();
				 				 					JOptionPane.showMessageDialog(null, "se agent  n'existe pas");
				 				 				}}}
				 				 				 	
				 				 				  catch (HeadlessException e2) {
				 				 					// TODO Auto-generated catch block
				 				 					e2.printStackTrace();
				 				 				} catch (SQLException e2) {
				 				 					// TODO Auto-generated catch block
				 				 					e2.printStackTrace();}
				 				 				}else {  JOptionPane.showMessageDialog(null,"veuillez taper un numero de l'agent de 4 bite ");}
				 				 				 	
				 				 		}
			 	}
		
				
				
				
			}
		});
		btnValider_1.setBounds(468, 299, 133, 38);
		pan4.add(btnValider_1);
		
		JButton btnRetourner_2 = new JButton("Annuler");
		btnRetourner_2.setIcon(new ImageIcon("IMAGE_ICON\\delete.png"));
		btnRetourner_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRetourner_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				layeredPane.removeAll();
				layeredPane.add(pan9);
				layeredPane.repaint();
				layeredPane.revalidate();
			

					v2.setText(null);
					v3.setText(null);
					v1.setText(null);
					v5.setText(null);
					v6.setText(null);
					v7.setText(null);
					v8.setText(null);
					v9.setText(null);
					v4.setDate(null);

			
			}
		});
		btnRetourner_2.setBounds(468, 362, 133, 38);
		pan4.add(btnRetourner_2);
		
		v9 = new JTextField();
		v9.setColumns(10);
		v9.setBounds(208, 391, 188, 33);
		pan4.add(v9);
		
		JLabel lblNumeroService = new JLabel("numero service");
		lblNumeroService.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lblNumeroService.setBounds(10, 387, 188, 33);
		pan4.add(lblNumeroService);
		
		gradientPanel.kGradientFocus = 200;
		gradientPanel.kStartColor = new Color(51, 51, 255);
		gradientPanel.kEndColor = new Color(255, 51, 51);
		gradientPanel.setBounds(-10, 11, 1370, 707);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		 pan8 = new JPanel();
		 pan8.setBackground(new Color(176, 224, 230));
		 layeredPane.add(pan8, "");
		pan8.setBounds(0, 0, 10, 10);
		pan8.setLayout(null);
		
		scrollPane_9 = new JScrollPane();
		scrollPane_9.setBounds(10, 44, 1086, 409);
		pan8.add(scrollPane_9);
		
		table_7 = new JTable();
		scrollPane_9.setViewportView(table_7);
		
		pan9 = new JPanel();
		layeredPane.add(pan9, "name_946180764740900");
		pan9.setLayout(null);
		pan9.setBackground(new Color(176, 224, 230));
		
		scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(0, 159, 1106, 451);
		pan9.add(scrollPane_7);
		
		table_6 = new JTable(){
			 public boolean isCellEditable(int d,int c) {
				 return false;
			 }
		 };
		table_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				  try {
						
						int ligne= table_6.getSelectedRow();
						//f9.setText(null);
						d1=null;
						 v1.setText(table_6.getModel().getValueAt(ligne, 0).toString());
						 i60=v1.getText();
						  d1=table_6.getModel().getValueAt(ligne, 0).toString();
						 id21= table_6.getModel().getValueAt(ligne, 7).toString();
						 v2.setText(table_6.getModel().getValueAt(ligne, 1).toString());
						 v3.setText(table_6.getModel().getValueAt(ligne, 2).toString());
						 v5.setText(table_6.getModel().getValueAt(ligne, 4).toString());
						 v6.setText(table_6.getModel().getValueAt(ligne, 5).toString());
						 v7.setText(table_6.getModel().getValueAt(ligne, 6).toString());
						 v8.setText(table_6.getModel().getValueAt(ligne, 7).toString());
						 v9.setText(table_6.getModel().getValueAt(ligne, 8).toString());
						 i61=v9.getText();	
						 table_6.setSelectionBackground(Color.getColor("a", Color.getHSBColor(520, 50, 50)));
						 table_6.setSelectionForeground(Color.BLACK);
						DefaultTableModel model=(DefaultTableModel) table_6.getModel();
						Date date = new SimpleDateFormat("yyyy-mm-dd").parse((String) model.getValueAt(ligne, 3).toString());
						v4.setDate(date);
						
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						
					}	
				
				
				
			}
		});
		scrollPane_7.setViewportView(table_6);
		
		label_27 = new JLabel("Recherche :");
		label_27.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		label_27.setBounds(438, 80, 117, 24);
		pan9.add(label_27);
		
		button_1 = new JButton("ajouter");
		button_1.setIcon(new ImageIcon("IMAGE_ICON\\add.png"));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				layeredPane.removeAll();
				layeredPane.add(pan4);
				layeredPane.repaint();
				layeredPane.revalidate();
				m=2;
			
			}
		});
		button_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		button_1.setBounds(734, 11, 130, 40);
		pan9.add(button_1);
		
		button_2 = new JButton("supprimer");
		button_2.setIcon(new ImageIcon("IMAGE_ICON\\delete.png"));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(v1.getText().equals("")) {JOptionPane.showMessageDialog(null, "veuillez selectionner un agent");}else {
					
			{
							String sql1=" delete from agent where  idagent=?  ";
							try {
								pr=cnx.prepareStatement(sql1);
								pr.setString(1,d1);
							
								pr.execute();
								agent();
								v1.setText(null);
								v2.setText(null);
								v3.setText(null);
								v5.setText(null);
								v6.setText(null);
								v7.setText(null);
								v8.setText(null);
								v9.setText(null);
								v4.setDate(null);
								
							} catch (SQLException e1) {
						
								
								e1.printStackTrace();
							}}
					
			}}
			
		});
		button_2.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		button_2.setBounds(178, 11, 158, 40);
		pan9.add(button_2);
		
		button_3 = new JButton("modifer");
		button_3.setIcon(new ImageIcon("IMAGE_ICON\\icons8-modifier-32.png"));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                 String k1=v1.getText().toString();
				
				String k21=v2.getText().toString();
               
		
				String k41=v8.getText().toString();
				
				String k51=v5.getText().toString();
		
				String k61=v3.getText().toString();
  
				
				String kla1=v6.getText().toString();
		
				String k81=v7.getText().toString();
				String k8=v9.getText().toString();   	
				if(   k1.equals("")||k21.equals("")||v4.getDate()==null||k51.equals("")||k41.equals("")||k61.equals("")||kla1.equals("")||k81.equals("") ||k8.equals("") )
					JOptionPane.showMessageDialog(null,"veuillez selecctionner un agent ");
				
				else {
				
				
				layeredPane.removeAll();
				layeredPane.add(pan4);
				layeredPane.repaint();
				layeredPane.revalidate();
				t=2;
				}	
	
			}
		});
		button_3.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		button_3.setBounds(425, 11, 130, 40);
		pan9.add(button_3);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				 DefaultTableModel ta=(DefaultTableModel)table_6.getModel(); 
					String s=textField_10.getText().toLowerCase();
		TableRowSorter<DefaultTableModel> tr=new  TableRowSorter<DefaultTableModel>(ta);
		table_6.setRowSorter(tr);
		tr.setRowFilter(RowFilter.regexFilter(s));
				
			}
		});
		textField_10.setColumns(10);
		textField_10.setBounds(393, 115, 206, 33);
		pan9.add(textField_10);
		
		label_28 = new JLabel("");
		label_28.setBounds(403, 89, 25, 15);
		pan9.add(label_28);
		
		 pan10 = new JPanel();
		pan10.setBackground(new Color(176, 224, 230));
		layeredPane.add(pan10, "name_1266599730398200");
		pan10.setLayout(null);
		//gradientPanel.add(pan8);
	
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(10, 11, 245, 685);
		gradientPanel.add(panel);
		panel.setLayout(null);
		
		 e1 = new JPanel();
		e1.setBackground(Color.BLACK);
		e1.setBounds(70, 11, 162, 35);
		panel.add(e1);
		e1.setLayout(null);
		
		 a1 = new JLabel("Home");
		 a1.setBackground(Color.GRAY);
		a1.setBounds(0, 0, 162, 35);
		e1.add(a1);
		a1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(p1);
				layeredPane.repaint();
				layeredPane.revalidate();
				e6.setBackground(Color.black);
				e1.setBackground(Color.WHITE);
				a7.setForeground(Color.white);
				e2.setBackground(Color.black);
				e3.setBackground(Color.black);
				e7.setBackground(Color.black);
				e4.setBackground(Color.black);
				e5.setBackground(Color.black);
				e8.setBackground(Color.black);
				a1.setForeground(Color.BLACK);
				a2.setForeground(Color.WHITE);
				a3.setForeground(Color.WHITE);
				a4.setForeground(Color.WHITE);
				a5.setForeground(Color.WHITE);
				a6.setForeground(Color.WHITE);
				a8.setForeground(Color.WHITE);
			}
		});
		a1.setFont(new Font("MS Reference Sans Serif", Font.BOLD | Font.ITALIC, 17));
		a1.setForeground(Color.WHITE);
		
		 e2 = new JPanel();
		e2.setLayout(null);
		e2.setBackground(Color.BLACK);
		e2.setBounds(70, 57, 162, 35);
		panel.add(e2);
		
		 a2 = new JLabel("Services");
		a2.setBounds(0, 0, 162, 35);
		e2.add(a2);
		a2.setBackground(Color.BLACK);
		a2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				layeredPane.removeAll();
				layeredPane.add(p4);
				layeredPane.repaint();
				uptable1();
				layeredPane.revalidate();
			
				e6.setBackground(Color.black);
				e2.setBackground(Color.WHITE);
				e1.setBackground(Color.black);
				e7.setBackground(Color.black);
				e3.setBackground(Color.black);
				e4.setBackground(Color.black);
				e5.setBackground(Color.black);
				a7.setForeground(Color.white);
				e8.setBackground(Color.black);
				a2.setForeground(Color.BLACK);
				a1.setForeground(Color.WHITE);
				a3.setForeground(Color.WHITE);
				a4.setForeground(Color.WHITE);
				a5.setForeground(Color.WHITE);
				a6.setForeground(Color.WHITE);
				a8.setForeground(Color.WHITE);
			}
		});
		a2.setFont(new Font("MS Reference Sans Serif", Font.BOLD | Font.ITALIC, 17));
		a2.setForeground(Color.WHITE);
		
    e3 = new JPanel();
		e3.setLayout(null);
		e3.setBackground(Color.BLACK);
		e3.setBounds(70, 103, 162, 35);
		panel.add(e3);
		
		 a3 = new JLabel("Chefs de service");
		a3.setBounds(0, 0, 163, 35);
		e3.add(a3);
		a3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(p3);
				layeredPane.repaint();
				layeredPane.revalidate();
				e6.setBackground(Color.black);
				e3.setBackground(Color.WHITE);
				a7.setForeground(Color.white);
				e1.setBackground(Color.black);
				e7.setBackground(Color.black);
				e2.setBackground(Color.black);
				e4.setBackground(Color.black);
				e5.setBackground(Color.black);
				e8.setBackground(Color.black);
				a6.setForeground(Color.WHITE);
				a3.setForeground(Color.BLACK);
				a1.setForeground(Color.WHITE);
				a2.setForeground(Color.WHITE);
				a4.setForeground(Color.WHITE);
				a5.setForeground(Color.WHITE);
				a8.setForeground(Color.WHITE);
			
				uptable();
			pan.setVisible(false);
			}
		});
		a3.setForeground(Color.WHITE);
		a3.setFont(new Font("MS Reference Sans Serif", Font.BOLD | Font.ITALIC, 17));
		
		 e4 = new JPanel();
		e4.setLayout(null);
		e4.setBackground(Color.BLACK);
		e4.setBounds(70, 149, 162, 35);
		panel.add(e4);
		
		 a4 = new JLabel("R\u00E9parateurs");
		a4.setBounds(0, 0, 162, 35);
		e4.add(a4);
		a4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(p2);
				layeredPane.repaint();
				layeredPane.revalidate();
				uptable2();
					e4.setBackground(Color.WHITE);
				e1.setBackground(Color.black);
				e3.setBackground(Color.black);
				e6.setBackground(Color.black);
				e2.setBackground(Color.black);
				e5.setBackground(Color.black);
				e7.setBackground(Color.black);
				a7.setForeground(Color.white);
				e8.setBackground(Color.black);
				a4.setForeground(Color.BLACK);
				a1.setForeground(Color.WHITE);
				a3.setForeground(Color.WHITE);
				a2.setForeground(Color.WHITE);
				a5.setForeground(Color.WHITE);
				a8.setForeground(Color.WHITE); 		
				
			pan.setVisible(false);
			}
		});
		a4.setForeground(Color.WHITE);
		a4.setFont(new Font("MS Reference Sans Serif", Font.BOLD | Font.ITALIC, 17));
		 
		   e6 = new JPanel();
		 e6.setLayout(null);
		 e6.setBackground(Color.BLACK);
		 e6.setBounds(70, 241, 162, 35);
		 panel.add(e6);
		 
		 a6 = new JLabel("Etat stock");
		 a6.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent e) {
		 		layeredPane.removeAll();
				layeredPane.add(pan3);
				layeredPane.repaint();
				layeredPane.revalidate();
				uptable11();
				e8.setBackground(Color.black);
		 		e6.setBackground(Color.WHITE);
				e1.setBackground(Color.black);
				e3.setBackground(Color.black);
				e4.setBackground(Color.black);
				e2.setBackground(Color.black);
				e5.setBackground(Color.black);
				e7.setBackground(Color.black);
				a7.setForeground(Color.white);
				a6.setForeground(Color.BLACK);
				a1.setForeground(Color.WHITE);
				a3.setForeground(Color.WHITE);
				a4.setForeground(Color.WHITE);
				a2.setForeground(Color.WHITE);
				a5.setForeground(Color.WHITE);
				a8.setForeground(Color.WHITE);
		 	}
		 });
		 a6.setForeground(Color.WHITE);
		 a6.setFont(new Font("MS Reference Sans Serif", Font.BOLD | Font.ITALIC, 17));
		 a6.setBounds(0, 0, 162, 35);
		 e6.add(a6);
		
		 e5 = new JPanel();
		e5.setLayout(null);
		e5.setBackground(Color.BLACK);
		e5.setBounds(70, 333, 162, 35);
		panel.add(e5);
		
		 a5 = new JLabel("Rapports");
		 a5.setBounds(0, 0, 162, 35);
		 e5.add(a5);
		 a5.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent e) {
		 		
		 		layeredPane.removeAll();
				layeredPane.add(pan7
						);
				layeredPane.repaint();
				layeredPane.revalidate();
				rapport();
				
		 		e5.setBackground(Color.WHITE);
				e1.setBackground(Color.black);
				e3.setBackground(Color.black);
				e4.setBackground(Color.black);
				e2.setBackground(Color.black);
				e7.setBackground(Color.black);
				e6.setBackground(Color.black);
				a5.setForeground(Color.BLACK);
				a1.setForeground(Color.WHITE);
				a7.setForeground(Color.white);
				a3.setForeground(Color.WHITE);
				a4.setForeground(Color.WHITE);
				a2.setForeground(Color.WHITE);
				a6.setForeground(Color.WHITE);
		 	}
		 });
		 a5.setFont(new Font("MS Reference Sans Serif", Font.BOLD | Font.ITALIC, 17));
		 a5.setForeground(Color.WHITE);
		
		label_19 = new JLabel("");
		label_19.setBounds(12, 11, 48, 14);
		panel.add(label_19);
		
		label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon("IMAGE_ICON\\home.png"));
		label_20.setBounds(22, 11, 38, 35);
		panel.add(label_20);
		
		label_21 = new JLabel("");
		label_21.setIcon(new ImageIcon("IMAGE_ICON\\traffic-cone.png"));
		label_21.setBounds(22, 149, 38, 35);
		panel.add(label_21);
		
		label_22 = new JLabel("");
		label_22.setIcon(new ImageIcon("IMAGE_ICON\\electrician.png"));
		label_22.setBounds(22, 103, 38, 35);
		panel.add(label_22);
		
		label_23 = new JLabel("");
		label_23.setIcon(new ImageIcon("IMAGE_ICON\\mechanism.png"));
		label_23.setBounds(22, 57, 38, 35);
		panel.add(label_23);
		
		label_24 = new JLabel("");
		label_24.setIcon(new ImageIcon("IMAGE_ICON\\seo-report.png"));
		label_24.setBounds(22, 333, 38, 35);
		panel.add(label_24);
		
		label_26 = new JLabel("");
		label_26.setIcon(new ImageIcon("IMAGE_ICON\\investment (1).png"));
		label_26.setBounds(22, 241, 38, 35);
		panel.add(label_26);
		
		 e7 = new JPanel();
		e7.setLayout(null);
		e7.setBackground(Color.BLACK);
		e7.setBounds(70, 287, 162, 35);
		panel.add(e7);
		
		 a7 = new JLabel("pannes");
		 a7.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent e) {
		 		layeredPane.removeAll();
				layeredPane.add(pan8);
				layeredPane.repaint();
				layeredPane.revalidate();
				
				e8.setBackground(Color.black);
		 		e6.setBackground(Color.BLACK);
				e1.setBackground(Color.black);
				e3.setBackground(Color.black);
				e4.setBackground(Color.black);
				e2.setBackground(Color.black);
				e5.setBackground(Color.black);
				e7.setBackground(Color.WHITE);
				a7.setForeground(Color.BLACK);
				a6.setForeground(Color.WHITE);
				a1.setForeground(Color.WHITE);
				a3.setForeground(Color.WHITE);
				a4.setForeground(Color.WHITE);
				a2.setForeground(Color.WHITE);
				a5.setForeground(Color.WHITE);
				a8.setForeground(Color.WHITE);
				panne();
				
		 	}
		 });
		a7.addKeyListener(new KeyAdapter() {

		});
		a7.setForeground(Color.WHITE);
		a7.setFont(new Font("MS Reference Sans Serif", Font.BOLD | Font.ITALIC, 17));
		a7.setBounds(0, 0, 162, 35);
		e7.add(a7);
		
		e8 = new JPanel();
		e8.setLayout(null);
		e8.setBackground(Color.BLACK);
		e8.setBounds(70, 195, 162, 35);
		panel.add(e8);
		
		a8 = new JLabel("agents");
		a8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(pan9);
				layeredPane.repaint();
				layeredPane.revalidate();
				e6.setBackground(Color.black);
				e8.setBackground(Color.WHITE);
				a7.setForeground(Color.white);
				e2.setBackground(Color.black);
				e3.setBackground(Color.black);
				e7.setBackground(Color.black);
				e4.setBackground(Color.black);
				e5.setBackground(Color.black);
				e1.setBackground(Color.black);
				agent();
				a1.setForeground(Color.WHITE);
				a8.setForeground(Color.BLACK);
				a2.setForeground(Color.WHITE);
				a3.setForeground(Color.WHITE);
				a4.setForeground(Color.WHITE);
				a5.setForeground(Color.WHITE);
				a6.setForeground(Color.WHITE);
			
			}
		});
		a8.setForeground(Color.WHITE);
		a8.setFont(new Font("MS Reference Sans Serif", Font.BOLD | Font.ITALIC, 17));
		a8.setBounds(0, 0, 162, 35);
		e8.add(a8);
		
		JLabel label_29 = new JLabel("");
		label_29.setIcon(new ImageIcon("IMAGE_ICON\\tow.png"));
		label_29.setBounds(22, 287, 38, 35);
		panel.add(label_29);
		
		JLabel label_30 = new JLabel("");
		label_30.setIcon(new ImageIcon("IMAGE_ICON\\worker (1).png"));
		label_30.setBounds(22, 195, 38, 35);
		panel.add(label_30);
		
		JLabel lblDconnecter = new JLabel("D\u00E9connecter");
		lblDconnecter.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Login_gmao frame = new Login_gmao();
				frame.setVisible(true);	
			}
		});
		lblDconnecter.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
		lblDconnecter.setForeground(Color.WHITE);
		lblDconnecter.setBounds(70, 516, 165, 30);
		panel.add(lblDconnecter);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBackground(new Color(102, 0, 0));
		panel_1.setBounds(254, 11, 1106, 76);
		gradientPanel.add(panel_1);
		panel_1.setLayout(null);
		
	 l2 = new JLabel("");
		l2.setForeground(new Color(255, 255, 255));
		l2.setFont(new Font("Microsoft YaHei UI", Font.BOLD | Font.ITALIC, 17));
		l2.setBounds(337, 22, 259, 30);
		panel_1.add(l2);
		
		JLabel lblNewLabel_1 = new JLabel("commandont de bord");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1.setBounds(758, 22, 205, 30);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("IMAGE_ICON\\icons8-administrator-male-60.png"));
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
					//int day=cal.get(Calendar.DAY_OF_MONTH);
					//int month =cal.get(Calendar.MONTH)+1;
					//int year=cal.get(Calendar.YEAR);
					//int second =cal.get(Calendar.SECOND);
					//int minute =cal.get(Calendar.MINUTE);
					int am=cal.get(Calendar.AM_PM);
					
					if(am==1) {pa="PM";}else {pa="AM";}
					//String kk=cal.get(ABORT);
					
					//DateFormat date =new SimpleDateFormat("hh:mm:ss aa");
					//String d=date.format(new Date(hour, hour, hour)).toString();
					//l1.setText(""+hour+":"+minute+":"+second);
					//l2.setText(""+year+"-"+month+"-"+day);
					sleep(1000);
			
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		clock.start();
 
			
		try {
			LocalDateTime fe=LocalDateTime.now();
			DateTimeFormatter dat=DateTimeFormatter.ofPattern("YYYY-mm-dd  h:m:s  " );
			l2.setText("  "+dat.format(fe)+" "+pa);
			
			
		}catch(Exception e) {
		
		}
		
		
			
	}
	public JTable getTable_5() {
		return table_5;
	}
}
