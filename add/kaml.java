package add;

import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class kaml extends JFrame {
	public static JList list;
	public static void main(String[] args) {
		String r="ekekr rkjfjrgg";
		
		String l="dde";
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kaml frame = new kaml();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
ArrayList<String> arr = new ArrayList<String>();
arr.add("Hatchet");
arr.add("Sword");
arr.add("Shield");
arr.add( " Gold");
System.out.println("You have " + arr.size() + " items in your inventory.");




        list = new JList(arr.toArray());

        
         
        list.addMouseListener(null);

        list.setVisible(true);

	}
	
}
