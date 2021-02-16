package swing;

import java.awt.*;
import javax.swing.*;;

public class jlabelall {

	public static void main(String[] args) {
		JFrame frame= new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBounds(150, 160, 300, 220);
		
		frame.setTitle("sajib pal");
		
		Container c=frame.getContentPane();
		c.setLayout(null);
		
		JLabel label=new JLabel("user name");
		label.setText("sajib");
		label.setBounds(100, 60, 50, 20);
		
		label.setForeground(Color.GREEN);
		label.setOpaque(true);
		label.setBackground(Color.CYAN);
		
		
		label.setToolTipText("enter your name");
		
		
		Font b=new Font("Arial",Font.ITALIC,20);
		label.setFont(b);
		c.add(label);
		
		ImageIcon obj= new ImageIcon("SAJIB.jpg");
		JLabel label1=new JLabel(obj);
		label1.setBounds(150, 40, obj.getIconHeight(), obj.getIconWidth());
		c.add(label1);
		
	}

}
