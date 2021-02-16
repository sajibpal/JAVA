package swing;

import java.awt.*;
import javax.swing.*;

public class jpassword {

	public static void main(String[] args) {
		JFrame frame= new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBounds(250, 260, 500, 320);
		
		frame.setTitle("sajib pal");
		
		Container c=frame.getContentPane();
		c.setLayout(null);
		
		JPasswordField field=new JPasswordField();
		field.setBounds(100,120,80,30);
		//field.setEchoChar('*');
		
		field.setBackground(Color.BLUE);
		field.setForeground(Color.LIGHT_GRAY);
		
		c.add(field);

	}

}
