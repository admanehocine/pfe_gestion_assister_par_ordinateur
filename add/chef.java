package add;

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


public class chef extends JFrame {
	private int i=0;
	private JLabel a1,a2,a3,a4,a5,a6,a7;
	private JPanel e1,e2,e4,e3,e5,e6,e7;
	@SuppressWarnings("unused")
	private String kle,var ,id1,id2,id22=null,id45=null,kilo ,id21,id23=null,id11;
    private JLabel d, l1,l2;
	private JPanel contentPane;
	private JLayeredPane layeredPane;	
	private JTable table;
     private JDateChooser t3;
     private JTextArea t5,t6;
      private int t,m;
     /**
	 * Launch the application.
	 */
	private JPanel p1,p2,p3,p4;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chef frame = new chef();
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
	private JTextArea area;
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
	private JTextField t7;
	private JPanel pan;
	private JButton btnAjouter_3;
	private JButton btnOurner;
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
	private JPanel pan4;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JPanel pan5,pan8;
	private JTextArea te;
	private JPanel pan6;
	private JScrollPane scrollPane_5;
	private JTable table_5;
	private JButton btnNewButton;
	private JLabel label_26;
	private JPanel pan7;
	private JTable table_4;
	private JTable table_6;
	//DefaultListModel dn=new DefaultListModel();
	Statement s=null;
	private JTable table_7;
	
	
public void intervention() {//as 'numero rapport'   as 'numero chef service ' , ouvrier_id as'numero reparateur' 
		
		String sql="select numero as 'numero intervention' ,type ,date,dure,remarque,modification,numero_panne as 'numero panne' , cout from intervention";
		                                                                                                                                                                    
		
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
		
		String sql="select idrapport as 'numero rapport'  , type  , description , ouvries_id as'numero reparateur',valide from rapport where chef_service_numch='"+Logine.getCle_chef()+"'";
		                                                                                                                                                                    
		
		try {
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
public void inter() {//as 'numero rapport'   as 'numero chef service ' , ouvrier_id as'numero reparateur' 
		
		String sql="select id as 'numero intervention',date_i as'date intervention', type_i as'type intervention' , panne_nump as'numero de panne' from intervention ,agent  where intervention.idagent=	agent.idagent and agent.chef_service_numch='"+Logine.getCle_chef()+"' ";
		                                                                                                                                                                    
		//JOptionPane.showMessageDialog(null, ""+Logine.getCle_chef());
		try {
			pr=cnx.prepareStatement(sql);
			rs=pr.executeQuery();
		table_5.setModel(DbUtils.resultSetToTableModel(rs));
			
		
		JTableHeader theader=table_5.getTableHeader();
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
		String sql="select article.idarticle as 'numero article',poids, taille ,couleur,type  from article , etat_stock where etat_stock.idarticle=article.idarticle and etat_stock.quantite_article<=40 and etat_stock.quantite_article>10 ";
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
		

	
	
	
	
	public void uptable11() {
		String sql="select idEtat_stock as 'numero stock',idarticle  as 'numero article',quantite_article as'quantite article',date_acquisition as 'date acquisition' from etat_stock where id_commandont='"+Logine.getCle_commandant()+"'";
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
	
	
	public void uptable() {
		String sql="select   numch as 'numero chef service',nom,prenom,dtn as 'date de naissance',tel as 'telephone',username as 'nom utilisateur', password as 'mot de passe', idservice as 'numero service' from chef_service where id_commandont='"+Logine.getCle_commandant()+"'";
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
	
	public chef() {

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
                    p1 = new JPanel();
		layeredPane.add(p1, "name_7336782116200");
		p1.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\lenovo\\Downloads\\contrat-de-maintenance-informatique (1) (1).jpg"));
		lblNewLabel_8.setBounds(0, 0, 1072, 610);
		p1.add(lblNewLabel_8);
		
		
	
		 p2 = new JPanel();
		p2.setBackground(new Color(176, 224, 230));
		layeredPane.add(p2, "name_7383134918200");
		p2.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 175, 1072, 435);
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
		label.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\add\\IMAGE_ICON\\loupe.png"));
		label.setBounds(442, 79, 22, 31);
		p2.add(label);
		
		JButton btnSupprimer = new JButton("Ordonner");
		btnSupprimer.setBounds(221, 113, 120, 45);
		p2.add(btnSupprimer);
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		/**
		 * 		if(t8.getText().equals("")||t7.getText().equals("")) {JOptionPane.showMessageDialog(null, "veuillez selectionner un reparateur");}else {
		 
					
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
					
			}}*/
				//String d="";
			if(id1!=null)  {
				layeredPane.removeAll();
				layeredPane.add(pan6);
				layeredPane.repaint();
				layeredPane.revalidate();
				inter();
			}else { JOptionPane.showMessageDialog(null, "veuillez selectionner un reparateur");}
		}});
		btnSupprimer.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		
		btnAjouter = new JButton("");
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
		 
		 scrollPane_5 =  new JScrollPane();
		 scrollPane_5.setBounds(69, 41, 961, 307);
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
		 
		 JButton btnAjouter_4 = new JButton("valider");
		 btnAjouter_4.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\add\\IMAGE_ICON\\accept.png"));
		 btnAjouter_4.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 	
		 	//	JOptionPane.showMessageDialog(null,"***"+id1+"***"+id45);
		 		
				
		 		if(id45!=null) {
		 		String sql="  insert into ordonner (  id_reparateur, id_chef_service,id_intervention  ) values ( ? , ? , ?  )";
 				try {
 					pr=cnx.prepareStatement(sql);
 						
 						pr.setString(1,id1);
 						//String k2=t2.getText().toString();
 						pr.setString(2,Logine.getCle_chef());
 						
 						pr.setString(3,id45);					
 								pr.execute();
 								JOptionPane.showMessageDialog(null,"reparateur ordonner") ;
 								
 								}
 					catch (SQLException ez) {
 						JOptionPane.showMessageDialog(null,"vous avez déja ordonner se reparateur a cette intérvention !!");
 						ez.printStackTrace();
 						}	 	
							
		 		
		 		

				
		 	}else JOptionPane.showMessageDialog(null,"veuiller choissir une intérvention") ;			
        
				}

		 		
					            }

				
		 	
		 );
		 btnAjouter_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		 btnAjouter_4.setBounds(630, 545, 124, 42);
		 pan6.add(btnAjouter_4);
		 
		 JButton btnAnnuler_1 = new JButton("retourner");
		 btnAnnuler_1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		layeredPane.removeAll();
				layeredPane.add(p2);
				layeredPane.repaint();
				layeredPane.revalidate();
				
				id45=null;
				id1=null;
		 	}
		 });
		 btnAnnuler_1.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\add\\IMAGE_ICON\\return.png"));
		 
		 	
		 btnAnnuler_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		 btnAnnuler_1.setBounds(439, 545, 129, 42);
		 pan6.add(btnAnnuler_1);
		 
		 
		 
		 
		 pan = new JPanel();
		 pan.setBackground(new Color(176, 224, 230));
		 pan.setForeground(new Color(176, 224, 230));
		 layeredPane.add(pan, "name_439948061450500");
		 pan.setLayout(null);
		 
		 t8 = new JTextField();
		 t8.setColumns(10);
		 t8.setBounds(163, 17, 193, 31);
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
		 
		 t7 = new JTextField();
		 t7.setColumns(10);
		 t7.setBounds(158, 454, 198, 31);
		 pan.add(t7);
		 
		 JLabel lblNumeroIntervention = new JLabel("numero d'intervention");
		 lblNumeroIntervention.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 lblNumeroIntervention.setBounds(10, 16, 152, 31);
		 pan.add(lblNumeroIntervention);
		 
		 JLabel lblCoutIntervention = new JLabel("cout d'intervention");
		 lblCoutIntervention.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 lblCoutIntervention.setBounds(23, 58, 129, 31);
		 pan.add(lblCoutIntervention);
		 
		 JLabel lblTypeDintervention = new JLabel("type d'intervention");
		 lblTypeDintervention.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 lblTypeDintervention.setBounds(23, 100, 129, 31);
		 pan.add(lblTypeDintervention);
		 
		 JLabel lblDateDintervention = new JLabel("date d'intervention");
		 lblDateDintervention.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 lblDateDintervention.setBounds(23, 147, 129, 31);
		 pan.add(lblDateDintervention);
		 
		 JLabel lblDurDintervention = new JLabel("dur\u00E9 d'intervention");
		 lblDurDintervention.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 lblDurDintervention.setBounds(23, 193, 129, 31);
		 pan.add(lblDurDintervention);
		 
		 JLabel lblModification = new JLabel("modification");
		 lblModification.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 lblModification.setBounds(23, 264, 129, 31);
		 pan.add(lblModification);
		 
		 JLabel lblRemarque = new JLabel("remarque");
		 lblRemarque.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 lblRemarque.setBounds(33, 361, 119, 31);
		 pan.add(lblRemarque);
		 
		 JLabel lblNumeroPanne = new JLabel("numero panne");
		 lblNumeroPanne.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		 lblNumeroPanne.setBounds(23, 453, 129, 31);
		 pan.add(lblNumeroPanne);
		 
		 btnAjouter_3 = new JButton("valider");
		 btnAjouter_3.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\add\\IMAGE_ICON\\add.png"));
		 btnAjouter_3.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		 btnAjouter_3.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
		 		if(m==2) {
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
		 			
		 		try {
		 			if(!recherche_service(t7.getText().toString()).next()) {JOptionPane.showMessageDialog(null,"ce service n'existe pas !! ");}
		 			
		 			 else {
		 				String sql="  insert into intervention (  numero, type ,date,dure,remarque,modification,numero_panne  , cout ,chef_service  ) values ( ? , ? , ? , ?, ? , ? , ? , ? ,? )";
		 				try {
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
		 						pr.setString(8,"2112");
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
		 						}}}
		 		catch (HeadlessException e1) {
		 			// TODO Auto-generated catch block
		 			e1.printStackTrace();
		 		} catch (SQLException e1) {
		 			// TODO Auto-generated catch block
		 			e1.printStackTrace();
		 		}}
		 			
		                }
		 	
		 	
			 	if(m==1) {
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
		 
		 btnOurner = new JButton("retourner");
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
		 
		 t6 = new JTextArea();
		 t6.setBounds(158, 347, 198, 84);
		 pan.add(t6);
		 
		  t5 = new JTextArea();
		 t5.setBounds(163, 242, 193, 84);
		 pan.add(t5);
		 
		
		
		
		
		 p3 = new JPanel();
		 p3.setBackground(new Color(176, 224, 230));
		layeredPane.add(p3, "name_7385635862500");
		p3.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(0, 159, 1072, 451);
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

	
	 t8.setText(table_2.getModel().getValueAt(ligne, 0).toString());
	 t2.setText(table_2.getModel().getValueAt(ligne, 1).toString());
	 t4.setText(table_2.getModel().getValueAt(ligne, 3).toString());
	 t5.setText(table_2.getModel().getValueAt(ligne, 4).toString());
	 t6.setText(table_2.getModel().getValueAt(ligne, 5).toString());
	 t7.setText(table_2.getModel().getValueAt(ligne, 6).toString());
	 t1.setText(table_2.getModel().getValueAt(ligne, 7).toString());
	 
	 table_2.setSelectionBackground(Color.getColor("a", Color.getHSBColor(520, 50, 50)));
	 table_2.setSelectionForeground(Color.BLACK);
	DefaultTableModel model=(DefaultTableModel) table_2.getModel();
	Date date = new SimpleDateFormat("yyyy-mm-dd").parse((String) model.getValueAt(ligne, 2).toString());
	t3.setDate(date);
	
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
		btnAjouter_2.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\add\\IMAGE_ICON\\add.png"));
		btnAjouter_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				layeredPane.removeAll();
				layeredPane.add(pan);
				layeredPane.repaint();
				layeredPane.revalidate();
				m=1;
				
			}
		});
		btnAjouter_2.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		btnAjouter_2.setBounds(734, 11, 130, 40);
		p3.add(btnAjouter_2);
		
		JButton btnSupprimer_2 = new JButton("supprimer");
		btnSupprimer_2.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\add\\IMAGE_ICON\\delete.png"));
		btnSupprimer_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t8.getText().equals("")||t7.getText().equals("")) {JOptionPane.showMessageDialog(null, "veuillez selectionner une intervention");}else {
					
					{
									String sql1=" delete from intervention where  numero=? ";
									try {
										pr=cnx.prepareStatement(sql1);
										pr.setString(1,t8.getText());
										
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
		}}});
		btnSupprimer_2.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		btnSupprimer_2.setBounds(177, 11, 143, 40);
		p3.add(btnSupprimer_2);
		
		JButton btnModifer = new JButton("modifer");
		btnModifer.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\add\\IMAGE_ICON\\icons8-modifier-32.png"));
		btnModifer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String k1=t1.getText().toString();
				
				String k21=t2.getText().toString();
               
		
				String k41=t8.getText().toString();
				
				String k51=t5.getText().toString();
		
				String k61=t4.getText().toString();
  
				
				String kla1=t6.getText().toString();
		
				String k81=t7.getText().toString();
	               	
				if(   k1.equals("")||k21.equals("")||t3.getDate()==null||k51.equals("")||k41.equals("")||k61.equals("")||kla1.equals("")||k81.equals("")  )
					JOptionPane.showMessageDialog(null,"veuillez selecctionner une intervention ");
				
				else {
				
				
				layeredPane.removeAll();
				layeredPane.add(pan);
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
		label_2.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\add\\IMAGE_ICON\\loupe.png"));
		label_2.setBounds(403, 89, 25, 15);
		p3.add(label_2);
           
           pan7 = new JPanel();
           pan7.setBackground(new Color(176, 224, 230));
           layeredPane.add(pan7, "name_400482899941800");
           pan7.setLayout(null);
           
           JScrollPane scrollPane = new JScrollPane();
           scrollPane.setBounds(120, 11, 726, 233);
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
           
           JButton btnRdigerUnRapport = new JButton("valider le rapport");
           btnRdigerUnRapport.addActionListener(new ActionListener() {
           	public void actionPerformed(ActionEvent e) {
           		if(id22==null)
           			JOptionPane.showMessageDialog(null,"veuillez selecctionner un rapport ");
           		else 
           		{
           			if (id22.equals("false") && id23!=null) {
           				
           				String requete="UPDATE rapport SET   valide='"+"true"
						+"' where idrapport ='"+id23+"'";
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
           			
           			}else {if(id22.equals("true")) {
           				JOptionPane.showMessageDialog(null, "ce rapport est déja valider");
           			}
           			}
           		
           		}}
           });
           btnRdigerUnRapport.setFont(new Font("Tahoma", Font.BOLD, 13));
           btnRdigerUnRapport.setBounds(517, 338, 181, 43);
           pan7.add(btnRdigerUnRapport);
           
           JButton btnAnnuler_2 = new JButton("ordonner");
           btnAnnuler_2.addActionListener(new ActionListener() {
           	public void actionPerformed(ActionEvent e) {
           	}
           });
           btnAnnuler_2.setFont(new Font("Tahoma", Font.BOLD, 13));
           btnAnnuler_2.setBounds(237, 338, 141, 43);
           pan7.add(btnAnnuler_2);
		
           p4 = new JPanel();
           p4.setBackground(new Color(176, 224, 230));
		layeredPane.add(p4, "name_7414096282500");
		p4.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 154, 1072, 456);
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
		btnAjouter_1.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\add\\IMAGE_ICON\\add.png"));
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
		btnModifier_1.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\add\\IMAGE_ICON\\icons8-modifier-32.png"));
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
		btnSupprimer_1.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\add\\IMAGE_ICON\\delete.png"));
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
		label_1.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\add\\IMAGE_ICON\\loupe.png"));
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
		
		btnValider = new JButton("valider");
		btnValider.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\add\\IMAGE_ICON\\accept.png"));
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
								String sql="  insert into chef_service (   numch,nom,  prenom, dtn, tel, username, password, idservice  ,id_commandont  ) values ( ? , ? , ? , ?, ? , ? , ? , ?,? )";
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
										pr.setString(9,Logine.getCle_commandant());					
												pr.execute();
												JOptionPane.showMessageDialog(null,"chef service ajouter") ;
												f8.setText(null);
												uptable();
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
										//ez.printStackTrace();
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
									+"',idservice ='"+f8.getText()
									+"' where numch ='"+id11
									+"'and idservice ='"+id21+"'";
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
		
		btnRetourner = new JButton("retourner");
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
		scrollPane_4.setBounds(0, 123, 1072, 487);
		pan3.add(scrollPane_4);
		
		table_3 = new JTable(){
			 public boolean isCellEditable(int d,int c) {
				 return false;
			 }
		 };
		scrollPane_4.setViewportView(table_3);
		
		JButton btnImprimer = new JButton("rediger le bon");
		btnImprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(pan5);
				layeredPane.repaint();
				layeredPane.revalidate();
				article();
			}
		});
		btnImprimer.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		btnImprimer.setBounds(472, 23, 169, 49);
		pan3.add(btnImprimer);
		
		pan5 = new JPanel();
		pan5.setBackground(new Color(176, 224, 230));
		layeredPane.add(pan5, "name_140683561765200");
		pan5.setLayout(null);
		
	           area = new JTextArea();
	           area.setWrapStyleWord(true);
		area.setBackground(Color.WHITE);
		Font f =new Font("Arial",Font.BOLD,15);
		area.setEditable(false);
		area.setBounds(0, -4, 641, 610);
		pan5.add(area);
		area.setFont(f);
		area.setText("\r\n                       \t\t  Bon de commande\r\n\r\nD\u00E9scription:\r"
				
				
				
				
				);
		
		 d = new JLabel("D\u00E9scription");
		d.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		d.setBounds(651, 122, 108, 42);
		pan5.add(d);
		
		te = new JTextArea();
		te.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				 kle=te.getText();
				
				
				
				
			}
		});
		te.setBounds(767, 107, 295, 57);
		pan5.add(te);
		
		JButton btnImprimer_1 = new JButton("imprimer");
		btnImprimer_1.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\add\\IMAGE_ICON\\print.png"));
		btnImprimer_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnImprimer_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(i!=0) {
				area.setText(area.getText()+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"+"\t\t\t\t\t"
			+"Signature"+"\n\n"+"date:"+l2.getText()
					);
			try {
				area.print();
				
			} catch (PrinterException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
area.setText(null);
             
			
			area.setText("\r\n                       \t\t  Bon de commande\r\n\r\nD\u00E9scription:\n\n\n"
					
					);
			te.setVisible(true);
			te.setText(null);
			d.setVisible(true);
			
			
				
				
				}else  JOptionPane.showMessageDialog(null,"veuillez remplire le bon de commande ");
			
			}
		});
		btnImprimer_1.setBounds(782, 364, 160, 50);
		pan5.add(btnImprimer_1);
		
		JButton btnAnnuler = new JButton("annuler");
		btnAnnuler.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\add\\IMAGE_ICON\\delete.png"));
		btnAnnuler.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//te.setVisible(false);
			area.setText(null);
             
			
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
			}}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(782, 280, 160, 50);
		pan5.add(btnNewButton);
		
		pan4 = new JPanel();
		pan4.setBackground(new Color(176, 224, 230));
		layeredPane.add(pan4, "name_121817075301600");
		pan4.setLayout(null);
		
		JLabel lblConcepteur = new JLabel("concepteur");
		lblConcepteur.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lblConcepteur.setBounds(10, 23, 188, 33);
		pan4.add(lblConcepteur);
		
		JLabel lblLibell = new JLabel("libell\u00E9");
		lblLibell.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lblLibell.setBounds(10, 67, 188, 33);
		pan4.add(lblLibell);
		
		JLabel lblPoids = new JLabel("poids");
		lblPoids.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lblPoids.setBounds(10, 119, 188, 33);
		pan4.add(lblPoids);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(208, 121, 188, 33);
		pan4.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(208, 69, 188, 33);
		pan4.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(208, 25, 188, 33);
		pan4.add(textField_2);
		
		JLabel lblQuantit = new JLabel("quantit\u00E9");
		lblQuantit.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lblQuantit.setBounds(10, 209, 188, 33);
		pan4.add(lblQuantit);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(208, 211, 188, 33);
		pan4.add(textField_3);
		
		JLabel lblDscription = new JLabel("d\u00E9scription");
		lblDscription.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lblDscription.setBounds(10, 253, 188, 33);
		pan4.add(lblDscription);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(208, 255, 188, 33);
		pan4.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(208, 299, 188, 33);
		pan4.add(textField_5);
		
		JLabel lblCouleur = new JLabel("couleur");
		lblCouleur.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lblCouleur.setBounds(10, 297, 188, 33);
		pan4.add(lblCouleur);
		
		JLabel lblDureVieMoyenne = new JLabel("dure vie moyenne ");
		lblDureVieMoyenne.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lblDureVieMoyenne.setBounds(10, 343, 188, 33);
		pan4.add(lblDureVieMoyenne);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(208, 345, 188, 33);
		pan4.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(208, 167, 188, 33);
		pan4.add(textField_7);
		
		JLabel lblTaille = new JLabel("taille");
		lblTaille.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lblTaille.setBounds(10, 165, 188, 33);
		pan4.add(lblTaille);
		
		JLabel lblConditionnement = new JLabel("conditionnement ");
		lblConditionnement.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lblConditionnement.setBounds(10, 392, 188, 33);
		pan4.add(lblConditionnement);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(208, 394, 188, 33);
		pan4.add(textField_8);
		
		JLabel lblNumeroService = new JLabel("numero service");
		lblNumeroService.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lblNumeroService.setBounds(10, 436, 188, 33);
		pan4.add(lblNumeroService);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(208, 438, 188, 33);
		pan4.add(textField_9);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(208, 488, 188, 33);
		pan4.add(dateChooser);
		
		JLabel lblDateD = new JLabel(" date d'acquisition");
		lblDateD.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lblDateD.setBounds(10, 488, 188, 33);
		pan4.add(lblDateD);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(208, 532, 188, 33);
		pan4.add(dateChooser_1);
		
		JLabel lblDate = new JLabel(" date exp\u00E9rmentation");
		lblDate.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lblDate.setBounds(10, 532, 188, 33);
		pan4.add(lblDate);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(651, 398, 321, 181);
		pan4.add(textArea);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(467, 34, 582, 208);
		pan4.add(scrollPane_6);
		
		table_6 = new JTable();
		scrollPane_6.setViewportView(table_6);
		
		gradientPanel.kGradientFocus = 200;
		gradientPanel.kStartColor = new Color(51, 51, 255);
		gradientPanel.kEndColor = new Color(255, 51, 51);
		gradientPanel.setBounds(0, 0, 1370, 707);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		 pan8 = new JPanel();
		 pan8.setBackground(new Color(176, 224, 230));
		 layeredPane.add(pan8, "");
		pan8.setBounds(0, 0, 10, 10);
		pan8.setLayout(null);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(0, 345, 1072, 265);
		pan8.add(scrollPane_7);
		
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
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Dialogue dialog = new Dialogue();
				//dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
						
			}
		});
		btnNewButton_1.setBounds(464, 211, 89, 46);
		pan8.add(btnNewButton_1);
		//gradientPanel.add(pan8);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(10, 11, 279, 685);
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
				//e1.setBackground(Color.black);
				a1.setForeground(Color.BLACK);
				a2.setForeground(Color.WHITE);
				a3.setForeground(Color.WHITE);
				a4.setForeground(Color.WHITE);
				a5.setForeground(Color.WHITE);
				a6.setForeground(Color.WHITE);
			
			}
		});
		a1.setFont(new Font("MS Reference Sans Serif", Font.BOLD | Font.ITALIC, 17));
		a1.setForeground(Color.WHITE);
		
		 e2 = new JPanel();
		e2.setLayout(null);
		e2.setBackground(Color.BLACK);
		e2.setBounds(70, 57, 162, 35);
		panel.add(e2);
		
		 a2 = new JLabel("R\u00E9parateurs");
		a2.setBounds(0, 0, 162, 35);
		e2.add(a2);
		a2.setBackground(Color.BLACK);
		a2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(p2);
				layeredPane.repaint();
				layeredPane.revalidate();
				uptable2();
				e6.setBackground(Color.black);
				e2.setBackground(Color.WHITE);
				e1.setBackground(Color.black);
				e7.setBackground(Color.black);
				e3.setBackground(Color.black);
				e4.setBackground(Color.black);
				e5.setBackground(Color.black);
				a7.setForeground(Color.white);
				//e1.setBackground(Color.black);
				a2.setForeground(Color.BLACK);
				a1.setForeground(Color.WHITE);
				a3.setForeground(Color.WHITE);
				a4.setForeground(Color.WHITE);
				a5.setForeground(Color.WHITE);
				a6.setForeground(Color.WHITE);
			}
		});
		a2.setFont(new Font("MS Reference Sans Serif", Font.BOLD | Font.ITALIC, 17));
		a2.setForeground(Color.WHITE);
		
    e3 = new JPanel();
		e3.setLayout(null);
		e3.setBackground(Color.BLACK);
		e3.setBounds(70, 103, 162, 35);
		panel.add(e3);
		
		 a3 = new JLabel("");
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
				//e1.setBackground(Color.black);
				a6.setForeground(Color.WHITE);
				a3.setForeground(Color.BLACK);
				a1.setForeground(Color.WHITE);
				a2.setForeground(Color.WHITE);
				a4.setForeground(Color.WHITE);
				a5.setForeground(Color.WHITE);
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
		
		 a4 = new JLabel("");
		a4.setBounds(0, 0, 162, 35);
		e4.add(a4);
		a4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				layeredPane.removeAll();
				layeredPane.add(p4);
				layeredPane.repaint();
				layeredPane.revalidate();
				e4.setBackground(Color.WHITE);
				e1.setBackground(Color.black);
				e3.setBackground(Color.black);
				e6.setBackground(Color.black);
				e2.setBackground(Color.black);
				e5.setBackground(Color.black);
				e7.setBackground(Color.black);
				a7.setForeground(Color.white);
				//e1.setBackground(Color.black);
				a4.setForeground(Color.BLACK);
				a1.setForeground(Color.WHITE);
				a3.setForeground(Color.WHITE);
				a2.setForeground(Color.WHITE);
				a5.setForeground(Color.WHITE);
			uptable1();
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
		 
		 a6 = new JLabel("");
		 a6.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent e) {
		 		layeredPane.removeAll();
				layeredPane.add(pan3);
				layeredPane.repaint();
				layeredPane.revalidate();
				uptable11();
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
		 	}
		 });
		 a6.setForeground(Color.WHITE);
		 a6.setFont(new Font("MS Reference Sans Serif", Font.BOLD | Font.ITALIC, 17));
		 a6.setBounds(0, 0, 162, 35);
		 e6.add(a6);
		
		 e5 = new JPanel();
		e5.setLayout(null);
		e5.setBackground(Color.BLACK);
		e5.setBounds(70, 195, 162, 35);
		panel.add(e5);
		
		 a5 = new JLabel("Rapports");
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
		a5.setBounds(0, 0, 162, 35);
		e5.add(a5);
		a5.setFont(new Font("MS Reference Sans Serif", Font.BOLD | Font.ITALIC, 17));
		a5.setForeground(Color.WHITE);
		
		label_19 = new JLabel("");
		label_19.setBounds(12, 11, 48, 14);
		panel.add(label_19);
		
		label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\add\\IMAGE_ICON\\home.png"));
		label_20.setBounds(22, 11, 38, 35);
		panel.add(label_20);
		
		label_21 = new JLabel("");
		label_21.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\add\\IMAGE_ICON\\traffic-cone.png"));
		label_21.setBounds(22, 57, 38, 35);
		panel.add(label_21);
		
		label_22 = new JLabel("");
		label_22.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\add\\IMAGE_ICON\\electrician.png"));
		label_22.setBounds(22, 103, 38, 35);
		panel.add(label_22);
		
		label_23 = new JLabel("");
		label_23.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\add\\IMAGE_ICON\\mechanism.png"));
		label_23.setBounds(22, 149, 38, 35);
		panel.add(label_23);
		
		label_24 = new JLabel("");
		label_24.setBounds(22, 195, 38, 35);
		panel.add(label_24);
		
		label_26 = new JLabel("");
		label_26.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\add\\IMAGE_ICON\\investment (1).png"));
		label_26.setBounds(22, 241, 38, 35);
		panel.add(label_26);
		
		 e7 = new JPanel();
		e7.setLayout(null);
		e7.setBackground(Color.BLACK);
		e7.setBounds(70, 287, 162, 35);
		panel.add(e7);
		
		 a7 = new JLabel("interventions");
		 a7.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent e) {
		 		layeredPane.removeAll();
				layeredPane.add(p3);
				layeredPane.repaint();
				layeredPane.revalidate();
				intervention();
		     
				e2.setBackground(Color.black);
				e7.setBackground(Color.WHITE);
				e1.setBackground(Color.black);
				e3.setBackground(Color.black);
				e4.setBackground(Color.black);
				e5.setBackground(Color.black);
				e6.setBackground(Color.black);
				
				a7.setForeground(Color.BLACK);
				a1.setForeground(Color.WHITE);
				a3.setForeground(Color.WHITE);
				a4.setForeground(Color.WHITE);
				a5.setForeground(Color.WHITE);
				a6.setForeground(Color.WHITE);
				a2.setForeground(Color.WHITE);
		 	}
		 });
		a7.addKeyListener(new KeyAdapter() {

		});
		a7.setForeground(Color.WHITE);
		a7.setFont(new Font("MS Reference Sans Serif", Font.BOLD | Font.ITALIC, 17));
		a7.setBounds(0, 0, 162, 35);
		e7.add(a7);
		
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
	public JTable getTable_5() {
		return table_5;
	}
}
