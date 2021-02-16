package swing;

import java.awt.*;

import javax.swing.*;

public class jcheackbox {

	public static void main(String[] args) {
		JFrame frame= new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBounds(250, 260, 500, 320);
		
		frame.setTitle("sajib pal");
		
		Container c=frame.getContentPane();
		c.setLayout(null);
      
		JCheckBox box=new JCheckBox("sajib");
		 box.setBounds(100,60,100,30);
		 box.setSelected(true);
		 
		 JCheckBox box1=new JCheckBox("pal");
		 box1.setBounds(200,60,100,30);
		 box1.setEnabled(false);
		 
		 
		 ButtonGroup ok=new ButtonGroup();
		   ok.add(box1);
		   ok.add(box);
		 
		c.add(box);
		c.add(box1);
	}

}
