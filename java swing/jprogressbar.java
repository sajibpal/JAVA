package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class jprogressbar {

static JTextField  field;
static JProgressBar ber;
	
	public static void main(String[] args) {
		
		JFrame frame= new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);	
		frame.setBounds(250, 260, 580, 400);
		frame.setTitle("sajib pal");
		
		Container c=frame.getContentPane();
		c.setLayout(null);
		
		 ber=new JProgressBar(0,100);
		 ber.setBounds(180, 60, 150, 20);
		 ber.setBackground(Color.CYAN);
		 ber.setForeground(Color.RED);
		 c.add(ber);
		 
		 field=new JTextField();
		field.setBounds(60,60,100,30);
		c.add(field);
		
		JButton bt1=new JButton("jprogressbar");
		bt1.setBounds(60,100,120,30);
		c.add(bt1);
		
		bt1.addActionListener(new ActionListener(){

		 public void actionPerformed(ActionEvent e) {
				
				bt1(e);
		  }
			
		});
	}
	

	public static void bt1(ActionEvent e) {
		
		int value=Integer.parseInt(field.getText());
		ber.setValue(value);
	}	
}
