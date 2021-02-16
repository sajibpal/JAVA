package swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class jTEXTfieldall {

	
 static JTextField field1;
	
	public static void main(String[] args) {
		JFrame frame= new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBounds(250, 260, 500, 320);
		
		frame.setTitle("sajib pal");
		
		Container c=frame.getContentPane();
		c.setLayout(null);
		
		JTextField field=new JTextField(); 
		field.setBounds(100,120,80,30);
		
		field.setBackground(Color.BLUE);
		field.setForeground(Color.LIGHT_GRAY);
		field.setHorizontalAlignment(JTextField.CENTER);
		
		c.add(field);
		
		 field1=new JTextField(); 
		field1.setBounds(100,60,80,30);
		c.add(field1);
		
		field1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			
				field1(e);
			}

		});
		
	}
		public static void field1(ActionEvent e) {

        String obj=field1.getText();
        int age =Integer.parseInt(obj);
        if(age>25){
        	
        	field1.setBackground(Color.BLUE);
        }
        else{
        	
        	field1.setBackground(Color.RED);
    
        }
			}
			
		
	}

	
	
	

