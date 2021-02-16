package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 class Area extends JFrame implements ActionListener{
	 
	JTextArea afield=new JTextArea();
	JTextField tfield=new JTextField();
	JButton bt1=new JButton("clear");
	Container c;
	
	Area(){
		
	 c=this.getContentPane();
     c.setBackground(Color.GRAY);
	 c.setLayout(null);
	 
	 area_text();
    }
	
    void area_text(){
	  
		
		tfield.setBounds(90,60,150,30);
		 
		bt1.setBounds(100,150,100,30);
		
		afield.setBounds(280,70,300,250);
		afield.setBackground(Color.white);
		
		 
		Font f=new Font("arial",Font.ITALIC,20);
		 tfield.setFont(f);
		 bt1.setFont(f);
		 afield.setFont(f);
		 
		 c.add(bt1);
		 c.add(tfield);
		 c.add(afield);
		 
		 bt1.addActionListener(this);
		 tfield.addActionListener(this); 
		 
	 }
	 
	
	public void actionPerformed(ActionEvent s){
		
		String name =tfield.getText();
		if(s.getSource()==tfield){
			
		  afield.setText(""+name);	
		}
		else{
			
		 tfield.setText(" ");
		 afield.setText(" ");	
		}
	}
	
	
}

public class jtextarea {

	public static void main(String[] args) {
		Area frame=  new Area();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(mybox.EXIT_ON_CLOSE);
		
		frame.setBounds(250, 260, 700, 450);
		
		frame.setTitle("sajib pal");

	}

}
