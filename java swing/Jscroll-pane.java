package swing;

import java.awt.Color;
import java.awt.*;

import javax.swing.*;

public class Jscrollpane {

	public static void main(String[] args) {
		
		JFrame frame=  new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setBounds(250, 260, 700, 450);
		frame.setTitle("sajib pal");
      
		Container c=frame.getContentPane();
		FlowLayout obj=new FlowLayout(FlowLayout.LEFT,100,60);
		 c.setLayout(obj);
		
		 JTextArea afield=new JTextArea(10,20);

		
		JScrollPane scroll=new JScrollPane(afield,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		c.add(scroll);

	}

}
