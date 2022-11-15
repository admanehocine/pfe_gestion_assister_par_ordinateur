import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.Rectangle;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Details extends JFrame {

	private JPanel contentPane;
	private static Connection cnx=null;
	private JLabel lblEquipe = new JLabel("EQUIPEMENT");
	private JLabel lblHistorique = new JLabel("HISTORIQUE");
	private JPanel panel_general = new JPanel();
	private JPanel panel_equipe = new JPanel();
	private JPanel panel_historique = new JPanel();
	private JTextField txt_nom_chef= new JTextField();
	private JTextField txtNomDuService= new JTextField();
	private JTextField textField_code_art_gen= new JTextField();
	private JTextField textField_date_ela= new JTextField();
	private JTextField textField_qte= new JTextField();
	private JTextField txt_statut= new JTextField();
	private JTextField txt_prenom_chef= new JTextField();
	private JTextField textField_code_chef= new JTextField();
	private JTextField textField_code_s= new JTextField();
	private JTextField textField_code_art_eq= new JTextField();
	private JTextField textField_libel= new JTextField();
	private JTextField textField_num_s= new JTextField();
	private JTextField textField_concept= new JTextField();
	private JTextField textField_poid= new JTextField();
	private JTextField textField_couleur= new JTextField();
	private JTextField textField_date_acqui= new JTextField();
	private JTextField textField_date_ex= new JTextField();
	private JTextField textField_duree_vie= new JTextField();
	private JTextField textField_cond= new JTextField();
	private JTable table_chef_service;
	private JTable table_piece;
	private JTextArea textArea_desc = new JTextArea();
	private JTextField textField_taille= new JTextField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Details frame = new Details();
					frame.setVisible(true);
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
	 * @throws SQLException 
	 */
	public Details() throws SQLException {
		cnx=connexion.connecter();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 633, 593);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PreparedStatement ps =cnx.prepareStatement("select * from bon_commande where idarticle=? and idservice=? and article_numero_serie=?");
		ps.setInt(1, (int) Gestion_Stock.table_1.getValueAt(Gestion_Stock.table_1.getSelectedRow(), 2));
		ps.setInt(2, (int) Gestion_Stock.table_1.getValueAt(Gestion_Stock.table_1.getSelectedRow(), 1));
		ps.setInt(3, (int) Gestion_Stock.table_1.getValueAt(Gestion_Stock.table_1.getSelectedRow(), 3));
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			
			String s =rs.getString(12);
			System.out.println(s);
			textField_code_chef.setText(s);
			textField_code_s.setText((String)rs.getString(13));
			textField_code_art_gen.setText(rs.getString(14));
			textField_qte.setText(rs.getString(5));
			textField_code_art_eq.setText(rs.getString(14));
			textField_concept.setText(rs.getString(1));
			textField_libel.setText(rs.getString(2));
			textField_poid.setText(rs.getString(3));
			textArea_desc.setText(rs.getString(6));
			textField_couleur.setText(rs.getString(7));
			textField_date_acqui.setText(rs.getString(8));
			textField_duree_vie.setText(rs.getString(9));
			textField_date_ex.setText(rs.getString(10));
			textField_cond.setText(rs.getString(11));
			textField_num_s.setText(rs.getString(15));
			textField_taille.setText(rs.getString(4));
			
	    }
//		ps=cnx.prepareStatement("select nomS from service where idservice=?");
//		ps.setInt(1,(int) Gestion_Stock.table_1.getValueAt(Gestion_Stock.table_1.getSelectedRow(), 1));
//		rs =ps.executeQuery();
//		while(rs.next()) {
//			txtNomDuService.setText(rs.getString(1));
//		}
//		ps=cnx.prepareStatement("select nom,prenom from chef_service where numch=?");
//		ps.setInt(1, (int) Gestion_Stock.table_1.getValueAt(Gestion_Stock.table_1.getSelectedRow(), 0));
//		rs=ps.executeQuery();
//		while(rs.next()) {
//			txt_nom_chef.setText(rs.getString(1));
//			txt_prenom_chef.setText(rs.getString(2));
//		}
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(10, 11, 597, 532);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblGeneral = new JLabel("GENERAL");
		lblGeneral.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_general.setVisible(true);
				panel_equipe.setVisible(false);
				panel_historique.setVisible(false);
				lblGeneral.setBackground(SystemColor.controlHighlight);
				lblEquipe.setBackground(SystemColor.controlShadow);
				lblHistorique.setBackground(SystemColor.controlShadow);
			}
		});
		
		
		lblHistorique.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_general.setVisible(false);
				panel_equipe.setVisible(false);
				panel_historique.setVisible(true);
				lblHistorique.setBackground(SystemColor.controlHighlight);
				lblGeneral.setBackground(SystemColor.controlShadow);
				lblEquipe.setBackground(SystemColor.controlShadow);
				
				try {
					PreparedStatement ps = cnx.prepareStatement("select chef_service_numch as 'ID Chef De Service',idservice as 'ID Service',idarticle as 'ID Artcile',article_numero_serie as 'Numero De Serie',date_acquisition as 'Date d''acquisition',quantite as 'Quantité' from bon_commande where chef_service_numch=?");
					ps.setInt(1, (int) Gestion_Stock.table_1.getValueAt(Gestion_Stock.table_1.getSelectedRow(), 0));
					ResultSet rs = ps.executeQuery();
					table_chef_service.setModel(DbUtils.resultSetToTableModel(rs));
					
					ps = cnx.prepareStatement("select idarticle as 'ID Artcile',chef_service_numch as 'ID Chef De Service',idservice as 'ID Service',article_numero_serie as 'Numero De Serie',date_acquisition as 'Date d''acquisition',quantite as 'Quantité' from bon_commande where idarticle=?");
					ps.setInt(1, (int) Gestion_Stock.table_1.getValueAt(Gestion_Stock.table_1.getSelectedRow(), 2));
					rs = ps.executeQuery();
					table_piece.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			
		});
		lblHistorique.setOpaque(true);
		lblHistorique.setHorizontalAlignment(SwingConstants.CENTER);
		lblHistorique.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblHistorique.setBackground(SystemColor.controlShadow);
		lblHistorique.setBounds(186, 11, 88, 27);
		panel.add(lblHistorique);
		lblGeneral.setBackground(SystemColor.controlHighlight);
		lblGeneral.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblGeneral.setHorizontalAlignment(SwingConstants.CENTER);
		lblGeneral.setOpaque(true);
		lblGeneral.setBounds(0, 11, 88, 27);
		panel.add(lblGeneral);
		
		
		lblEquipe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_general.setVisible(false);
				panel_equipe.setVisible(true);
				panel_historique.setVisible(false);
				lblGeneral.setBackground(SystemColor.controlShadow);
				lblEquipe.setBackground(SystemColor.controlHighlight);
				lblHistorique.setBackground(SystemColor.controlShadow);
			}
		});
		lblEquipe.setBackground(SystemColor.controlShadow);
		lblEquipe.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblEquipe.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipe.setOpaque(true);
		lblEquipe.setBounds(93, 11, 88, 27);
		
		panel.add(lblEquipe);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 38, 597, 494);
		panel.add(layeredPane);
		panel_historique.setBackground(SystemColor.control);
		
		panel_historique.setVisible(false);
		panel_equipe.setBackground(SystemColor.control);
		
		panel_equipe.setVisible(false);
		panel_equipe.setBounds(0, 0, 597, 494);
		layeredPane.add(panel_equipe);
		panel_equipe.setLayout(null);
		

		textField_code_art_eq.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_code_art_eq.setEditable(false);
		textField_code_art_eq.setColumns(10);
		textField_code_art_eq.setBorder(new LineBorder(new Color(128, 128, 128)));
		textField_code_art_eq.setBackground(SystemColor.controlHighlight);
		textField_code_art_eq.setBounds(165, 11, 136, 25);
		panel_equipe.add(textField_code_art_eq);
		
		JLabel lblNewLabel_1 = new JLabel("Code article");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_1.setBounds(11, 11, 144, 25);
		panel_equipe.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Numero de S\u00E9rie");
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(11, 82, 144, 25);
		panel_equipe.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Concepteur");
		lblNewLabel_1_1_1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(11, 118, 144, 25);
		panel_equipe.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Libelle");
		lblNewLabel_1_1_2.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_1_1_2.setBounds(11, 46, 144, 25);
		panel_equipe.add(lblNewLabel_1_1_2);
		
		textField_libel.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_libel.setEditable(false);
		textField_libel.setColumns(10);
		textField_libel.setBorder(new LineBorder(new Color(128, 128, 128)));
		textField_libel.setBackground(SystemColor.controlHighlight);
		textField_libel.setBounds(165, 47, 184, 25);
		panel_equipe.add(textField_libel);
		
		textField_num_s.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_num_s.setEditable(false);
		textField_num_s.setColumns(10);
		textField_num_s.setBorder(new LineBorder(new Color(128, 128, 128)));
		textField_num_s.setBackground(SystemColor.controlHighlight);
		textField_num_s.setBounds(165, 82, 184, 25);
		panel_equipe.add(textField_num_s);
		

		textField_concept.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_concept.setEditable(false);
		textField_concept.setColumns(10);
		textField_concept.setBorder(new LineBorder(new Color(128, 128, 128)));
		textField_concept.setBackground(SystemColor.controlHighlight);
		textField_concept.setBounds(165, 118, 184, 25);
		panel_equipe.add(textField_concept);
		

		textField_poid.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_poid.setEditable(false);
		textField_poid.setColumns(10);
		textField_poid.setBorder(new LineBorder(new Color(128, 128, 128)));
		textField_poid.setBackground(SystemColor.controlHighlight);
		textField_poid.setBounds(164, 153, 137, 25);
		panel_equipe.add(textField_poid);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Poids");
		lblNewLabel_1_1_2_1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_1_1_2_1.setBounds(10, 154, 194, 25);
		panel_equipe.add(lblNewLabel_1_1_2_1);
		
		textField_couleur.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_couleur.setEditable(false);
		textField_couleur.setColumns(10);
		textField_couleur.setBorder(new LineBorder(new Color(128, 128, 128)));
		textField_couleur.setBackground(SystemColor.controlHighlight);
		textField_couleur.setBounds(165, 189, 136, 25);
		panel_equipe.add(textField_couleur);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("Couleur");
		lblNewLabel_1_1_2_2.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_1_1_2_2.setBounds(11, 190, 194, 25);
		panel_equipe.add(lblNewLabel_1_1_2_2);
		
		textField_date_acqui.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_date_acqui.setEditable(false);
		textField_date_acqui.setColumns(10);
		textField_date_acqui.setBorder(new LineBorder(new Color(128, 128, 128)));
		textField_date_acqui.setBackground(SystemColor.controlHighlight);
		textField_date_acqui.setBounds(165, 258, 136, 25);
		panel_equipe.add(textField_date_acqui);
		
		JLabel lblNewLabel_1_1_2_3 = new JLabel("Date d'acquisition");
		lblNewLabel_1_1_2_3.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_1_1_2_3.setBounds(11, 255, 194, 25);
		panel_equipe.add(lblNewLabel_1_1_2_3);
		
		textField_date_ex.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_date_ex.setEditable(false);
		textField_date_ex.setColumns(10);
		textField_date_ex.setBorder(new LineBorder(new Color(128, 128, 128)));
		textField_date_ex.setBackground(SystemColor.controlHighlight);
		textField_date_ex.setBounds(165, 294, 136, 25);
		panel_equipe.add(textField_date_ex);
		
		JLabel lblNewLabel_1_1_2_4 = new JLabel("Date d'experimentation");
		lblNewLabel_1_1_2_4.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_1_1_2_4.setBounds(11, 291, 194, 25);
		panel_equipe.add(lblNewLabel_1_1_2_4);
		
		textField_duree_vie.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_duree_vie.setEditable(false);
		textField_duree_vie.setColumns(10);
		textField_duree_vie.setBorder(new LineBorder(new Color(128, 128, 128)));
		textField_duree_vie.setBackground(SystemColor.controlHighlight);
		textField_duree_vie.setBounds(165, 330, 136, 25);
		panel_equipe.add(textField_duree_vie);
		
		JLabel lblNewLabel_1_1_2_5 = new JLabel("Dur\u00E9e de vie moyenne");
		lblNewLabel_1_1_2_5.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_1_1_2_5.setBounds(11, 327, 194, 25);
		panel_equipe.add(lblNewLabel_1_1_2_5);
		
		textField_cond.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_cond.setEditable(false);
		textField_cond.setColumns(10);
		textField_cond.setBorder(new LineBorder(new Color(128, 128, 128)));
		textField_cond.setBackground(SystemColor.controlHighlight);
		textField_cond.setBounds(165, 366, 136, 25);
		panel_equipe.add(textField_cond);
		
		JLabel lblNewLabel_1_1_2_6 = new JLabel("Conditionnement");
		lblNewLabel_1_1_2_6.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_1_1_2_6.setBounds(11, 358, 194, 25);
		panel_equipe.add(lblNewLabel_1_1_2_6);
		
		JLabel lblNewLabel_1_1_2_7 = new JLabel("Description");
		lblNewLabel_1_1_2_7.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_1_1_2_7.setBounds(11, 402, 194, 25);
		panel_equipe.add(lblNewLabel_1_1_2_7);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(359, 11, 229, 304);
		panel_equipe.add(lblNewLabel_2);
		
		
		textArea_desc.setBorder(new LineBorder(Color.GRAY));
		textArea_desc.setBackground(SystemColor.controlHighlight);
		textArea_desc.setBounds(165, 402, 423, 81);
		panel_equipe.add(textArea_desc);
		
		textField_taille.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_taille.setEditable(false);
		textField_taille.setColumns(10);
		textField_taille.setBorder(new LineBorder(new Color(128, 128, 128)));
		textField_taille.setBackground(SystemColor.controlHighlight);
		textField_taille.setBounds(165, 225, 136, 25);
		panel_equipe.add(textField_taille);
		
		JLabel lblNewLabel_1_1_2_2_1 = new JLabel("Taille");
		lblNewLabel_1_1_2_2_1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_1_1_2_2_1.setBounds(11, 225, 194, 25);
		panel_equipe.add(lblNewLabel_1_1_2_2_1);
		
		
		panel_general.setBackground(SystemColor.control);
		panel_general.setBounds(0, 0, 597, 494);
		layeredPane.add(panel_general);
		panel_general.setLayout(null);
		
		txt_nom_chef.setEditable(false);
		txt_nom_chef.setText("");
		txt_nom_chef.setFont(new Font("Century Gothic", Font.BOLD, 12));
		txt_nom_chef.setBorder(new LineBorder(new Color(128, 128, 128)));
		txt_nom_chef.setBackground(SystemColor.controlHighlight);
		txt_nom_chef.setBounds(206, 66, 136, 25);
		panel_general.add(txt_nom_chef);
		txt_nom_chef.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Chef de service");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 66, 194, 25);
		panel_general.add(lblNewLabel);
		
		JLabel lblCodeService = new JLabel("Service");
		lblCodeService.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblCodeService.setBounds(10, 102, 194, 25);
		panel_general.add(lblCodeService);
		
		JLabel lblCodeArticle = new JLabel("Code article");
		lblCodeArticle.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblCodeArticle.setBounds(10, 138, 194, 25);
		panel_general.add(lblCodeArticle);
		
		JLabel lblDateDlaborationDu = new JLabel("Date d'\u00E9laboration du bon");
		lblDateDlaborationDu.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblDateDlaborationDu.setBounds(10, 174, 194, 25);
		panel_general.add(lblDateDlaborationDu);
		
		JLabel lblQuantitCommand = new JLabel("Quantit\u00E9 command\u00E9");
		lblQuantitCommand.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblQuantitCommand.setBounds(10, 210, 194, 25);
		panel_general.add(lblQuantitCommand);
		
		txtNomDuService.setText("Nom du service");
		txtNomDuService.setFont(new Font("Century Gothic", Font.BOLD, 12));
		txtNomDuService.setEditable(false);
		txtNomDuService.setColumns(10);
		txtNomDuService.setBorder(new LineBorder(new Color(128, 128, 128)));
		txtNomDuService.setBackground(SystemColor.controlHighlight);
		txtNomDuService.setBounds(206, 102, 194, 25);
		panel_general.add(txtNomDuService);
		
		textField_code_art_gen.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_code_art_gen.setEditable(false);
		textField_code_art_gen.setColumns(10);
		textField_code_art_gen.setBorder(new LineBorder(new Color(128, 128, 128)));
		textField_code_art_gen.setBackground(SystemColor.controlHighlight);
		textField_code_art_gen.setBounds(206, 138, 194, 25);
		panel_general.add(textField_code_art_gen);
		
		textField_date_ela.setText("23-05-2019");
		textField_date_ela.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_date_ela.setEditable(false);
		textField_date_ela.setColumns(10);
		textField_date_ela.setBorder(new LineBorder(new Color(128, 128, 128)));
		textField_date_ela.setBackground(SystemColor.controlHighlight);
		textField_date_ela.setBounds(206, 174, 194, 25);
		panel_general.add(textField_date_ela);
		
		textField_qte.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_qte.setEditable(false);
		textField_qte.setColumns(10);
		textField_qte.setBorder(new LineBorder(new Color(128, 128, 128)));
		textField_qte.setBackground(SystemColor.controlHighlight);
		textField_qte.setBounds(206, 210, 194, 25);
		panel_general.add(textField_qte);
		
		JLabel lblStatus = new JLabel("Statut");
		lblStatus.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblStatus.setBounds(10, 246, 194, 25);
		panel_general.add(lblStatus);
		
		txt_statut.setText("Non trait\u00E9");
		txt_statut.setFont(new Font("Century Gothic", Font.BOLD, 12));
		txt_statut.setEditable(false);
		txt_statut.setColumns(10);
		txt_statut.setBorder(new LineBorder(new Color(128, 128, 128)));
		txt_statut.setBackground(SystemColor.controlHighlight);
		txt_statut.setBounds(206, 246, 194, 25);
		panel_general.add(txt_statut);
		
	
		txt_prenom_chef.setFont(new Font("Century Gothic", Font.BOLD, 12));
		txt_prenom_chef.setEditable(false);
		txt_prenom_chef.setColumns(10);
		txt_prenom_chef.setBorder(new LineBorder(new Color(128, 128, 128)));
		txt_prenom_chef.setBackground(SystemColor.controlHighlight);
		txt_prenom_chef.setBounds(352, 66, 133, 25);
		panel_general.add(txt_prenom_chef);
		
		textField_code_chef.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_code_chef.setEditable(false);
		textField_code_chef.setColumns(10);
		textField_code_chef.setBorder(new LineBorder(new Color(128, 128, 128)));
		textField_code_chef.setBackground(SystemColor.controlHighlight);
		textField_code_chef.setBounds(546, 66, 41, 25);
		panel_general.add(textField_code_chef);
		
		JLabel lblCode = new JLabel("Code");
		lblCode.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblCode.setBounds(495, 66, 41, 25);
		panel_general.add(lblCode);
		
		textField_code_s.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textField_code_s.setEditable(false);
		textField_code_s.setColumns(10);
		textField_code_s.setBorder(new LineBorder(new Color(128, 128, 128)));
		textField_code_s.setBackground(SystemColor.controlHighlight);
		textField_code_s.setBounds(461, 102, 41, 25);
		panel_general.add(textField_code_s);
		
		JLabel lblCode_1 = new JLabel("Code");
		lblCode_1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblCode_1.setBounds(410, 102, 41, 25);
		panel_general.add(lblCode_1);
		
		JLabel lblInformationsDtaillDu = new JLabel("Informations d\u00E9taill\u00E9es du bon de commande :");
		lblInformationsDtaillDu.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblInformationsDtaillDu.setBounds(10, 20, 345, 25);
		panel_general.add(lblInformationsDtaillDu);
		panel_historique.setBounds(0, 0, 597, 494);
		layeredPane.add(panel_historique);
		panel_historique.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 57, 577, 189);
		panel_historique.add(scrollPane);
		
		table_chef_service = new JTable();
		scrollPane.setViewportView(table_chef_service);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 303, 577, 189);
		panel_historique.add(scrollPane_1);
		
		table_piece = new JTable();
		scrollPane_1.setViewportView(table_piece);
		
		JLabel lblNewLabel_1_2 = new JLabel("Historique du chef de service :");
		lblNewLabel_1_2.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(10, 22, 246, 25);
		panel_historique.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Historique de la pi\u00E8ce :");
		lblNewLabel_1_2_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblNewLabel_1_2_1.setBounds(10, 268, 246, 25);
		panel_historique.add(lblNewLabel_1_2_1);
		
	}
}
