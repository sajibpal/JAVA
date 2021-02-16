package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


@SuppressWarnings("serial")
class mframe extends JFrame implements ActionListener{
	

	Container c;
	
	JButton bt;
	JButton bt1=new JButton();
	JButton bt2=new JButton();
	
	mframe(){
		
	c=this.getContentPane();
	c.setLayout(null);
	
	
	ImageIcon icon=new ImageIcon("SAJIB.jpg");
	bt=new JButton(icon);
	bt.setBounds(100,120,icon.getIconHeight(),icon.getIconWidth());
	bt.setText("red");
	bt.setForeground(Color.RED);
	Cursor obj= new Cursor(Cursor.HAND_CURSOR);
	bt.setCursor(obj);
	
	
	bt1.setBounds(190,120,80,30);
	bt1.setText("green");
	bt1.setForeground(Color.GREEN);
	bt1.setBackground(Color.BLUE);
	Cursor obj1= new Cursor(Cursor.MOVE_CURSOR);
	bt1.setCursor(obj1);
	
	bt2.setBounds(280,120,80,30);
	bt2.setText("blue");
	bt2.setForeground(Color.BLUE);
	bt2.setHorizontalAlignment(SwingConstants.RIGHT);
	Cursor obj2= new Cursor(Cursor.TEXT_CURSOR);
	bt2.setCursor(obj2);
	
	bt.addActionListener(this);
	bt1.addActionListener(this);
	bt2.addActionListener(this);
	
	c.add(bt);
	c.add(bt1);
	c.add(bt2);
	
	
	}
	public void actionPerformed(ActionEvent h){
		
		 
		 if(h.getSource()==bt){
			c.setBackground(Color.RED); 		
		 }

		 else if(h.getSource()==bt1){
			c.setBackground(Color.GREEN); 		
		 }

		 else{
			c.setBackground(Color.BLUE); 		
		 }
        
	}
}

public class jbottom {

	public static void main(String[] args) {
		
		mframe frame= new mframe();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(mframe.EXIT_ON_CLOSE);
		
		frame.setBounds(250, 260, 500, 420);
		
		frame.setTitle("sajib pal");
		

	}

}
