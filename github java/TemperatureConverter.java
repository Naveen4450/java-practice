import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TemperatureConverter extends JFrame implements ActionListener{
	JTextField jtextfield;
	JButton jbutton;
	JLabel jlabel1 , jlabel2;
	double resultInCelcius ;
	
	TemperatureConverter(){
		resultInCelcius = 0 ; 
		
		jtextfield = new JTextField();		
		jbutton = new JButton("Convert");
		jlabel1 = new JLabel("Enter Fahrenheit temperature:");
		jlabel2 = new JLabel("In celcius : ");
		
		jlabel1.setBounds(10,50,200,30);
		jtextfield.setBounds(230 , 50 , 50,30);
		jlabel2.setBounds(100 , 100 , 200 , 30);
		jbutton.setBounds(100,100 , 80,20);
		jbutton.addActionListener(this);

		
		this.setSize(400,300);
		
		this.add(jlabel1 );
		this.add(jtextfield );
		this.add(jbutton );
		this.add(jlabel2);
		
		this.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		String text = jtextfield.getText();
		System.out.println(text);
		double fahrenhiet = Double.parseDouble(text);
		System.out.println(fahrenhiet);
		resultInCelcius = ((5/9.0)*(fahrenhiet-32.0));
		
		String resultText = resultInCelcius + "";
		resultText = resultText.substring(0 , 4);
		jlabel2.setText("In celcius : " + resultText + " C");
		
	}
	
	public static void main(String[] args) {
		new TemperatureConverter();
	}
	
}
