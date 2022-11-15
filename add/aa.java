package add;

import java.applet.Applet;
import java.awt.*;
import javax.swing.*;
import javax.swing.JList;
import java.awt.event.*;
import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class aa extends JApplet implements MouseListener {

public static String newline;
public static JList list;
int gold = 123;

    public void init() {



ArrayList<String> arr = new ArrayList<String>();
arr.add("Hatchet");
arr.add("Sword");
arr.add("Shield");
arr.add(gold + " Gold");
System.out.println("You have " + arr.size() + " items in your inventory.");
showInventory(arr);



        list = new JList(arr.toArray());

        add(list);

        list.addMouseListener(this);

        list.setVisible(true);

    }

public static void showInventory (ArrayList<String> theList) {
for (int i = 0; i < theList.size(); i++) {
System.out.println(theList.get(i));
}
}

public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}}
