package swing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class gotowevpage {

 static JButton bt1;
 static JTextField field;
	public static void main(String[] args) {
		
		JFrame frame= new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(mframe.EXIT_ON_CLOSE);
		
		frame.setBounds(250, 260, 700, 520);
		
		frame.setTitle("sajib pal");
		
	   Container c=frame.getContentPane();
		c.setLayout(null);

		JLabel label=new JLabel("Enten your URL");
		label.setBounds(30, 60, 100, 20);
		c.add(label);
		
		 field=new JTextField(); 
		field.setBounds(130,60,200,30);
		c.add(field);
		
	    bt1=new JButton("goto webpage");
		bt1.setBounds(140,120,140,30);
		c.add(bt1);
		
		bt1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				
				bt1(e);
			}
		
		});
		
	}
	
	public static void bt1(ActionEvent e) {
		
	try{	
		String url1 =field.getText();
		//String url=url1;
		java.awt.Desktop.getDesktop().browse(java.net.URI.create(url1));
		
	  }
	  catch(Exception e2){
		 
	   }
	}

}
