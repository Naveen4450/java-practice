

import java.awt.*;

public class FlowwLayout {
	
	Frame f;
	FlowwLayout(){
		f = new Frame();
		
		Label l1 = new Label("One");
		Label l2 = new Label("Two");
		Label l3 = new Label("Three");
		Label l4 = new Label("Four");
		Label l5 = new Label("Five");
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		
		f.setLayout(new FlowLayout());
		f.setSize(400,300);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlowwLayout();
	}
	
}
