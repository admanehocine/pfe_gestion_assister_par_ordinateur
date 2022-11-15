package add;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import java.awt.List;

public class kaml1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kaml1 frame = new kaml1();
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
	@SuppressWarnings("rawtypes")
	public kaml1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(10, 41, 80, 265);
		contentPane.add(list);
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Hatchet");
		arr.add("Sword");
		arr.add("Shield");
		arr.add( " Gold");
		System.out.println("You have " + arr.size() + " items in your inventory.");
		         
		         List list_1 = new List();
		         list_1.setBounds(256, 41, 201, 237);
		         contentPane.add(list_1);
		         DefaultListModel ModeleTest = new DefaultListModel();
		         for (Ville maVille : LesVilles) {
		             ModeleTest.addElement();
		         }
		         this.list.setModel(ModeleTest);    
		       
		         

	}
}
