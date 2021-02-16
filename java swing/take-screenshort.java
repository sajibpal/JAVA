package swing;


import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;

class ho extends JFrame implements ActionListener{
	JButton bt;
 	JPanel panel;
 	
	ho(){
		
  
		Container c=this.getContentPane();
			c.setLayout(null);	
			
			JTabbedPane tp=new JTabbedPane();
			tp.setBounds(100, 60, 550, 420);
			c.add(tp);
			
			panel= new JPanel();
			panel.setLayout(null);
			
		    bt=new JButton("take pic");
		    bt.setBounds(40, 60, 100, 30);
			panel.setBackground(Color.GREEN);
			panel.add(bt);
			
			tp.addTab("home", panel);
			
	    	bt.addActionListener(this); 
   		
	 }

	 public  BufferedImage getScreenShot(Component component){
			
			
		   BufferedImage image=new BufferedImage(component.getWidth(),component.getHeight(),BufferedImage.TYPE_INT_RGB);
		  
		   component.paint(image.getGraphics());
		   return image;
			}
		
		
		public void SaveScreenShot (Component component,String name) throws Exception{
			
			 BufferedImage img=getScreenShot(component);
			 ImageIO.write(img, "jpg",new File (name));
		}
	
	public  void actionPerformed(ActionEvent e) {
		
		try {
			SaveScreenShot(panel,"my panel image.jpg"); //frame screenshot hole akhane this hobe variable name ate;
		  } 
		catch (Exception e1) {                          //windows biulder project hole frame variable name hobe directed;
			JOptionPane.showMessageDialog(null, e1);
		} 
	}
	
} 
public class takescreenshort {

	public static void main(String[] args) {
		
		ho frame=  new ho();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(ho.EXIT_ON_CLOSE);
		frame.setBounds(250, 260, 700, 450);
		frame.setTitle("sajib pal");
		
			
			
	}
}	

