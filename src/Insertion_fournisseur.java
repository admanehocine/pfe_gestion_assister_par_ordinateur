import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Insertion_fournisseur extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private static Connection cnx=null;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Insertion_fournisseur frame = new Insertion_fournisseur();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					cnx = connexion.connecter();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Insertion_fournisseur() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 431, 380);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(null);
		panel.setBounds(10, 11, 405, 330);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBorder(null);
		textField.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		textField.setBounds(182, 73, 187, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("N\u00B0 Fournisseur");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNewLabel.setBounds(42, 73, 118, 27);
		panel.add(lblNewLabel);
		
		JLabel lblIdArticle = new JLabel("N\u00B0 Contrat");
		lblIdArticle.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblIdArticle.setBounds(42, 111, 118, 27);
		panel.add(lblIdArticle);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBounds(182, 111, 187, 27);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Adresse");
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(42, 149, 118, 27);
		panel.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBounds(182, 149, 187, 27);
		panel.add(textField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("N\u00B0 Telephone");
		lblNewLabel_1_1_1.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNewLabel_1_1_1.setBounds(42, 187, 118, 27);
		panel.add(lblNewLabel_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("YYYY/MM/DD\r\n");
		textField_3.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBounds(182, 187, 187, 27);
		panel.add(textField_3);
		
		JButton btnNewButton = new JButton("AJOUTER");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!textField.getText().isEmpty() && !textField_1.getText().isEmpty() && !textField_2.getText().isEmpty() && !textField_3.getText().isEmpty() && !textField_4.getText().isEmpty()) {			
				try {
					PreparedStatement ps = cnx.prepareStatement("insert into fournisseur values(?,?,?,?,?)");
//					double a =Double.parseDouble(textField.getText());
					ps.setString(1, textField.getText());
//					a =Double.parseDouble(textField_1.getText());
					ps.setString(2, textField_1.getText());
//					a =Double.parseDouble(textField_2.getText());
					ps.setString(3, textField_2.getText());
					ps.setString(4, textField_3.getText());
					ps.setString(5, textField_4.getText());
					
					ps.executeUpdate();
					
					dispose();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}else {
					JOptionPane.showMessageDialog(contentPane, "Un ou plusieurs champs sont vides !", "Erreur !", JOptionPane.ERROR_MESSAGE);
				}
				}
		});
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 13));
		btnNewButton.setBounds(27, 278, 355, 27);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Nouveau fournisseur");
		lblNewLabel_1.setBackground(SystemColor.control);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblNewLabel_1.setBounds(27, 37, 219, 25);
		panel.add(lblNewLabel_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBorder(null);
		textField_4.setBounds(182, 225, 187, 27);
		panel.add(textField_4);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Nom du fournisseur");
		lblNewLabel_1_1_1_1.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNewLabel_1_1_1_1.setBounds(42, 225, 152, 27);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(SystemColor.controlHighlight);
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBounds(27, 62, 355, 205);
		panel.add(lblNewLabel_2);
	}
}
