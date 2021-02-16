package swing;

import java.awt.*;
import javax.swing.*;


public class jtooltip {

	public static void main(String[] args) {
		
		JFrame frame= new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);	
		frame.setBounds(250, 260, 380, 300);
		frame.setTitle("sajib pal");
		
		Container c=frame.getContentPane();
		c.setLayout(null);
		
		JTextField  nfield=new JTextField();
		nfield.setBounds(140,60,100,30);
		nfield.setToolTipText("enter your text");
		c.add(nfield);
		
	}

}
