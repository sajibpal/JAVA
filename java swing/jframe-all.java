package swing;

import java.awt.*;
import javax.swing.*;
public class jframeall {

	public static void main(String[] args) {
		
		JFrame frame= new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//frame.setSize(100,120);
		//frame.setLocation(50, 80);
		frame.setBounds(150, 160, 300, 220);
		
		frame.setTitle("sajib pal");
		frame.setResizable(false);
		
		ImageIcon obj= new ImageIcon("SAJIB.jpg");
		frame.setIconImage(obj.getImage());
		
		Container c=frame.getContentPane();
		c.setBackground(Color.BLUE);
		
		

	}

}
