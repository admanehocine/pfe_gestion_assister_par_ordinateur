import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import java.awt.Color;
import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

public class Info_fournisseur extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private static Connection cnx=null;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				    cnx = connexion.connecter();
					Info_fournisseur frame = new Info_fournisseur();
					frame.setLocationRelativeTo(null);
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
	public Info_fournisseur() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 777, 427);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 40, 719, 330);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBackground(SystemColor.window);
		
		lblNewLabel_1 = new JLabel(""+(String)Gestion_Stock.table_2.getValueAt(Gestion_Stock.table_2.getSelectedRow(),4));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblNewLabel_1.setBackground(SystemColor.menu);
		lblNewLabel_1.setBounds(220, 11, 170, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Historique des articles de ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(SystemColor.control);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel.setBounds(20, 11, 223, 31);
		contentPane.add(lblNewLabel);
		
		try {
			PreparedStatement ps = cnx.prepareStatement("select idarticle as 'ArticleID',numero_serie as 'N° de serie',concepteur as 'Concepteur',prix_unitaire as 'Prix Unitaire',quantite_stock as 'Quantité',date_acquisition as 'Date d''acquisition' from article where idarticle in (select idarticle from fournit where numf =?)");
			ps.setInt(1, (int)Gestion_Stock.table_2.getValueAt(Gestion_Stock.table_2.getSelectedRow(),0));
			ResultSet rs = ps.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
