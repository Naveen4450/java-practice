import java.awt.*;  
    import java.awt.event.*;  
    public class CheckboxExample  
    {  
         CheckboxExample(){  
			 
			 //for menu
			 
			 Frame f= new Frame("Menu and MenuItem Example");  
             MenuBar mb=new MenuBar();  
             Menu menu=new Menu("Menu");  
             Menu submenu=new Menu("Sub Menu");  
             MenuItem i1=new MenuItem("Item 1");  
             MenuItem i2=new MenuItem("Item 2");  
             MenuItem i3=new MenuItem("Item 3");  
             MenuItem i4=new MenuItem("Item 4");  
             MenuItem i5=new MenuItem("Item 5");  
             menu.add(i1);  
             menu.add(i2);  
             menu.add(i3);  
             submenu.add(i4);  
             submenu.add(i5);  
             menu.add(submenu);  
             mb.add(menu);  
             f.setMenuBar(mb);  
             f.setSize(500,500);  
             f.setLayout(null);  
             f.setVisible(true);
             
             //for checkbox
            //Frame check= new Frame("CheckBox Example");  
            final Label label = new Label();          
            label.setAlignment(Label.RIGHT);  
            label.setSize(400,100);  
            Checkbox checkbox1 = new Checkbox("C++");  
            checkbox1.setBounds(100,100,60,30);  
            Checkbox checkbox2 = new Checkbox("Java");  
            checkbox2.setBounds(100,150, 60,30);  
            f.add(checkbox1); f.add(checkbox2);f.add(label);  
            checkbox1.addItemListener(new ItemListener() {  
                 public void itemStateChanged(ItemEvent e) {               
                    label.setText("C++ Checkbox: "   
                    + (e.getStateChange()==1?"checked":"unchecked"));  
                 }  
              });  
            checkbox2.addItemListener(new ItemListener() {  
                 public void itemStateChanged(ItemEvent e) {               
                    label.setText("Java Checkbox: "   
                    + (e.getStateChange()==1?"checked":"unchecked"));  
                 }  
              });  
            f.setSize(400,400);  
            f.setLayout(null);  
            f.setVisible(true);  
            f.setBackground(Color.CYAN);
         }
	   
public static void main(String args[])  
    {  
        new CheckboxExample();  
     }
 }