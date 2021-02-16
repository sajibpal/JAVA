package swing;

import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;

class myframe extends JFrame implements ActionListener{
	
	Container c;
	JTextField field=new JTextField();
	JTextField field1=new JTextField();
	
	myframe(){
		
	c=this.getContentPane();
	c.setLayout(null);
	  
	
	field.setBounds(100,120,80,30);
	field.setBackground(Color.darkGray);
	field.setForeground(Color.LIGHT_GRAY);

	field1.setBounds(100,160,80,30);
	field1.setBackground(Color.GREEN);
	field1.setForeground(Color.LIGHT_GRAY);
	
	field.addActionListener(this);
	field1.addActionListener(this);
	
	c.add(field);
	c.add(field1);
	
	}
	public void actionPerformed(ActionEvent h){ 
	  
		if(h.getSource()==field){
		  
		 String text= field.getText();
		 if(text.isEmpty()){
			 JOptionPane.showMessageDialog(null,"message is empty");		
		 }
		
        else {
        	JOptionPane.showMessageDialog(null,"message"+text);
        	}
	  }	
	  
	  else {
		  
			 String text1= field1.getText();
			 if(text1.isEmpty()){
				 JOptionPane.showMessageDialog(null,"message is empty");		
			 }
			
	        else {
	        	JOptionPane.showMessageDialog(null,"message"+text1);
	        	}
		  }	 
	}
}

public class jactionlisterwithjtexrfield {

	public static void main(String[] args) {
		myframe frame= new myframe();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(myframe.EXIT_ON_CLOSE);
		
		frame.setBounds(250, 260, 500, 420);
		
		frame.setTitle("sajib pal");
		
		

	}

}
