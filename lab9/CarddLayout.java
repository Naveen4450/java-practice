
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;


public class CarddLayout implements ActionListener {
	JFrame f ; 
	Container c ;
	CardLayout card ;
	CarddLayout() {
		f = new JFrame();
		
		c= f.getContentPane();
		card = new CardLayout(40,30);
		
		c.setLayout(card);
		
		JButton b1 = new JButton("Hello");
		JButton b2 = new JButton("World");
		JButton b3 = new JButton("Java");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		c.add("a" , b1);
		c.add("b" ,b2);
		c.add("c" ,b3);
		
		f.setSize(400,400);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		card.next(c);
	}
	
	public static void main(String[] args) {
		new CarddLayout();
	}
}
