package swing;

//import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
class hi extends JFrame {
	
	
	hi(){
		
		  Container c=this.getContentPane();
			c.setLayout(null);
			
			JTextField tfield=new JTextField();
			tfield.setBounds(90,70,150,30);
			c.add(tfield);
			
			tfield.addKeyListener(new KeyAdapter(){
				
			 public void keyTyped(KeyEvent e) {
					
				 tfield(e);
					
				}
		
			});
	}

	private void tfield(KeyEvent e) {
		
		char c=e.getKeyChar();
		
	 if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
		 
		
		 getToolkit().beep();
		 e.consume();
	   }	
	}
	
}
public class onlyinsertnumbertextfield {

	public static void main(String[] args) {
		
		hi frame=  new hi();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(hi.EXIT_ON_CLOSE);
		frame.setBounds(250, 260, 700, 450);
		frame.setTitle("sajib pal");	
	

	}

}
