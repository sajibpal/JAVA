package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class bframe extends JFrame implements ActionListener{
	
	JLabel label=new JLabel("user name");
	JLabel label1=new JLabel("password");
	
	JTextField tfield=new JTextField();
	JPasswordField pfield=new JPasswordField();
	
	JButton bt1=new JButton("Login");
	JButton bt2=new JButton("Cancel");
	
	Container c;
	bframe(){
		 
	 c=this.getContentPane();
	 c.setLayout(null);
	 c.setBackground(Color.MAGENTA);
	 
	label.setBounds(100, 60, 150, 40);
	label1.setBounds(100, 160, 100, 40);
	
    tfield.setBounds(200,60,150,30);
    
    pfield.setBounds(200,160,150,30);
    
    bt1.setBounds(200,220,100,30);
    bt2.setBounds(330,220,100,30);
	
	
	
	Font f=new Font("arial",Font.ITALIC,20);
	
	label.setFont(f);
	label1.setFont(f);
	tfield.setFont(f);
	pfield.setFont(f);
	bt1.setFont(f);
	bt2.setFont(f);
	
	c.add(label);
	c.add(label1);
	c.add(tfield);
	c.add(pfield);
	c.add(bt1);
	c.add(bt2);
	
	bt1.addActionListener(this);
	bt2.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent j){
		 
		if(j.getSource()==bt1){
			
		  String obj=tfield.getText();
		  String obj1=pfield.getText();
		  
		  if(obj.equals("abc")&& obj1.equals("12345")){
			
			  JOptionPane.showMessageDialog(null, "ok");
		   }
		  else{
		 
			  JOptionPane.showMessageDialog(null, "rong input");  
			  
		   }
		 }
		
	 else {
			
		 	tfield.setText("");	
		 	pfield.setText("");
		
		 }

	  }
  }
public class loginbutton {

	public static void main(String[] args) {
	 bframe frame=new bframe();
	 frame.setVisible(true);
	 frame.setDefaultCloseOperation(bframe.EXIT_ON_CLOSE);
	 frame.setBounds(200,100,500,450);

	}

}
