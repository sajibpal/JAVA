package swing;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


 class book extends JFrame implements KeyListener{
	
	JTextArea afield=new JTextArea();
	JTextField tfield=new JTextField();
	
	Container c;
    book(){
		
	c=this.getContentPane();
	c.setBackground(Color.GRAY);
	c.setLayout(null);
			
	tfield.setBounds(90,70,150,30);
			 
	afield.setBounds(280,70,300,250);
	afield.setBackground(Color.white);
	 
	 c.add(tfield);
	 c.add(afield);
	 
	
	 tfield.addKeyListener(this);
			 
	}
    public void keyTyped(KeyEvent d) {
    	
    	afield.append("keytype "+d.getKeyChar()+"\n");
    	
    }

    @Override
    public void keyPressed(KeyEvent d) {
    	afield.append("keypass "+d.getKeyChar()+"\n");
    	
    }

    @Override
    public void keyReleased(KeyEvent d) {
    	
    	afield.append("keyrelase "+d.getKeyChar()+"\n");

     }


}
public class keylistenr {

	public static void main(String[] args) {
		book frame=  new book();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(book.EXIT_ON_CLOSE);
		
		frame.setBounds(250, 260, 700, 450);
		
		frame.setTitle("sajib pal");
	}

}
