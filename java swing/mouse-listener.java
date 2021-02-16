package swing;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class t extends JFrame implements MouseListener{
	
 
	JTextArea afield=new JTextArea();
	JTextArea afield1=new JTextArea();
	
	t(){
		
		Container c=this.getContentPane();
		c.setBackground(Color.GRAY);
		c.setLayout(null);
		
		afield.setBounds(40,60,150,150);
		afield1.setBounds(280,60,300,250);
		
		afield.addMouseListener(this);
		
		c.add(afield1);
		c.add(afield);
		 
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		afield1.append("mouseClicked\n");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		afield1.append("mouseClicked\n");
		afield1.setText("x="+e.getX()+" y="+e.getY()+"\n");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		afield1.append("mouseReleased\n");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		afield1.append("mouseEntered\n");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		afield1.append("mouseExited\n");
	}
	
}
public class mouselistener {

	public static void main(String[] args) {
		
		t frame=  new t();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(t.EXIT_ON_CLOSE);
		
		frame.setBounds(250, 260, 700, 450);
		
		frame.setTitle("sajib pal");

	}

}
