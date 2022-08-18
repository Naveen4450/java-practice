import java.awt.FlowLayout;

import javax.swing.*;


public class JavaSwing {
	JFrame jframe ;
	JButton jbutton ;
	JLabel jlabel;
	JTextField jtextfield;
	JTextArea jtextarea;
	JPasswordField jpasswordfield;
	JCheckBox jcheckbox;
	JRadioButton jradiobutton;
	JComboBox<String> jcombobox;
	JTable jtable;
	JList jlist;
	
	public JavaSwing() {
		jframe = new JFrame("Swing");
		jbutton = new JButton("swing btn");
		jlabel = new JLabel("swing label");
		jtextfield = new JTextField("swing text field");
		jtextarea = new JTextArea("swing text area");
		jpasswordfield = new JPasswordField("password");
		jcheckbox = new JCheckBox("JCheckBox");
		jradiobutton = new JRadioButton("JRadioButton");
		String companies[] = { "microsoft" , "google" , "acer" , "amazon" };
		jcombobox = new JComboBox(companies);
		
		String data[][] = {
				{ "1" , "person1" , "10000"},
				{ "2" , "person2" , "20000"},
				{ "3" , "person3" , "35000"},
				{ "4" , "person4" , "50000"}
		};
		
		String column[] = { "slNo" , "person" , "salary" };
		jtable = new JTable(data , column);
		
		
		jlist = new JList(column);
		
		
		jframe.add(jbutton);
		jframe.add(jlabel);
		jframe.add(jtextfield);
		jframe.add(jtextarea);
		jframe.add(jpasswordfield);
		jframe.add(jcheckbox);
		jframe.add(jradiobutton);
		jframe.add(jcombobox);
		jframe.add(jtable);
		jframe.add(jlist);
		
		jframe.setLayout(new FlowLayout());
		jframe.setVisible(true);
		jframe.setSize(300,300);
	}
	
	public static void main(String[] args) {
		new JavaSwing();
	}
}
