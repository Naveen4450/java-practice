

import java.awt.*;



public class BorderedLayout {
	Frame f; 
	BorderedLayout() {
		f = new Frame();
		Label header = new Label("Header");
		Label footer = new Label("Footer");
		Label left = new Label("left");
		Label right = new Label("right");
		Label middle = new Label("middle");
		
		f.add(header , BorderLayout.NORTH);
		f.add(footer , BorderLayout.SOUTH);
		f.add(left , BorderLayout.WEST);
		f.add(right , BorderLayout.EAST);
		f.add(middle , BorderLayout.CENTER);
		
		f.setSize(500,500);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		BorderedLayout bl = new BorderedLayout();
	}
}
