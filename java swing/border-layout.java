package swing;

import java.awt.*;

import javax.swing.*;

public class borderlayout {

	public static void main(String[] args) {
		JFrame frame= new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBounds(250, 260, 500, 320);
		
		frame.setTitle("sajib pal");
		
		Container c=frame.getContentPane();
		
		BorderLayout obj=new BorderLayout(10,15);
		
		c.setLayout(obj);
		
		JButton bt1=new JButton("page start");
		JButton bt2=new JButton("page end");
		JButton bt3=new JButton("line start");
		JButton bt4=new JButton("center");
		JButton bt5=new JButton("line end");
		
		c.add(bt1,BorderLayout.PAGE_START);
		c.add(bt2,BorderLayout.PAGE_END);
		c.add(bt3,BorderLayout.LINE_START);
		c.add(bt4,BorderLayout.CENTER);
		c.add(bt5,BorderLayout.LINE_END);

	}

}
