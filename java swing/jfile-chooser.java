package swing;

import java.awt.Container;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

class u extends JFrame{
	
	JFileChooser chooser;
	BufferedImage image;
	JLabel lfield,lfield1;
	Container c;
	
	u(){
		
		 c=this.getContentPane();
		c.setLayout(null);
		
		JButton bt=new JButton("filechooset");
		bt.setBounds(20, 30, 100, 30);
		c.add(bt);
		
		 lfield=new JLabel();
		lfield.setBounds(130, 30, 150, 30);
		c.add(lfield);
		
		chooser=new JFileChooser();
		//chooser.setCurrentDirectory(new File("E:\\song mp3\\image\\image-1"));
		chooser.setFileFilter(new FileNameExtensionFilter("png","jpg","gif"));
		
		bt.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				bt(e);
				
		  }		
	});
		
 }
	   public void bt(ActionEvent e) {
		   
	       int value=chooser.showOpenDialog(null);
				
			if(value==JFileChooser.APPROVE_OPTION){
					
			   try{
						
			 image=ImageIO.read(chooser.getSelectedFile());
			 
			 ImageIcon icon=new ImageIcon(image);
			 lfield1=new JLabel(icon);
			 lfield1.setBounds(100, 60, icon.getIconWidth(),icon.getIconHeight());
			 c.add(lfield1);
						 
			}catch(Exception e2){
						
						
		       }
		   
		  }
		else {
			
		lfield.setText("no file choose");
		
			}
	}
}
public class jfilechooser {

	public static void main(String[] args) {
		u frame= new u();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(u.EXIT_ON_CLOSE);
		
		frame.setBounds(250, 260, 500, 320);
		
		frame.setTitle("sajib pal");
		

	}

}
