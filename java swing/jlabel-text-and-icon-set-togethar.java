package swing;

import java.awt.*;

import javax.swing.*;

public class jlabeltextandiconsettogethar {

	public static void main(String[] args) {
		JFrame frame= new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBounds(250, 260, 300, 220);
		
		frame.setTitle("sajib pal");
		
		Container c=frame.getContentPane();
		c.setLayout(null);
		
		ImageIcon obj=new ImageIcon("SAJIB.jpg");
		JLabel la = new JLabel("sajb",obj,JLabel.LEFT);
		la.setBounds(120,160,100,40);
        c.add(la);
	}

}
