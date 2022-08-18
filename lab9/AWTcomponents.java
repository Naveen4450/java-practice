

import java.awt.*;
import java.awt.event.*;

class myFrame extends Frame implements ActionListener {
	TextField textField ; 
	String text = "";
	Button button ; 
	Label lable ; 
	
	// 
	myFrame() {
		textField = new TextField();
		textField.setBounds(60,50,170,20);
		lable = new Label();
		
		button = new Button("click");
		button.setBounds(100,120,80,30);
		
		button.addActionListener(this);
		
		lable.setBounds(60,150,300,60);
		
		this.add(textField);
		this.add(button) ; 
		this.add(lable);
		this.setSize(300,300);
		this.setLayout(null);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		this.text = this.textField.getText();
		this.lable.setText("You have entered the text : " + this.text);
	}
}

public class AWTcomponents {
	
	public static void main(String args[]) {
		myFrame myframe = new myFrame();
	}
}
