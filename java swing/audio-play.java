package swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JButton;
import javax.swing.JFrame;

import sun.audio.*;
class p extends JFrame implements ActionListener{
	
	p(){
		
	 Container c=this.getContentPane();
		c.setLayout(null);
		
		JButton bt1=new JButton("play");
		bt1.setBounds(60,60,80,30);
		c.add(bt1);
		
		bt1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		 try {
			 
			 File audio=new File("F:\\sajib\\java program\\java swing\\Ta Tan Tana [SAJIB].wav");
			 FileInputStream fi=new FileInputStream(audio);
			 
			AudioStream ok=new AudioStream(fi);
			AudioPlayer.player.start(ok);
			
		} catch (Exception e1) {
			
		}
	}
	
}
public class audioplay {

	public static void main(String[] args) {
		
		p frame= new p();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(p.EXIT_ON_CLOSE);
		
		frame.setBounds(250, 260, 500, 420);
		
		frame.setTitle("sajib pal");
	}

}
