package swing;

import java.awt.*;
import javax.swing.*;


public class boxlayout {

	public static void main(String[] args) {
		
		JFrame frame= new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBounds(250, 260, 500, 320);
		
		frame.setTitle("sajib pal");
		
		Container c=frame.getContentPane();
		
		BoxLayout obj=new BoxLayout(c,BoxLayout.X_AXIS);
		c.setLayout(obj);
		
		JButton bt1=new JButton("Button1");
		JButton bt2=new JButton("Button2");
		JButton bt3=new JButton("Button3");
		JButton bt4=new JButton("Button4");
		JButton bt5=new JButton("Button5");
		
		c.add(bt1);
		c.add(bt2);
		
		c.add(bt3);
		c.add(bt4);
		c.add(bt5);
	}

}
