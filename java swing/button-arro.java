package swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.plaf.basic.BasicArrowButton;

public class buttonarroe {

	public static void main(String[] args) {
		
		JFrame frame= new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(mframe.EXIT_ON_CLOSE);
		frame.setBounds(250, 260, 500, 420);
		frame.setTitle("sajib pal");
		
	Container c=frame.getContentPane();
		c.setLayout(null);
		
		
		JButton nort=new JButton();
		nort.setBounds(90,60,80,30);
		nort.add(new BasicArrowButton(BasicArrowButton.NORTH));
		c.add(nort);
		

		JButton east=new JButton();
		east.setBounds(90,120,80,30);
		east.add(new BasicArrowButton(BasicArrowButton.EAST));
		c.add(east);
		

		JButton west=new JButton();
		west.setBounds(90,160,80,30);
		west.add(new BasicArrowButton(BasicArrowButton.WEST));
		c.add(west);
		
		JButton south=new JButton();
		south.setBounds(90,200,80,30);
		south.add(new BasicArrowButton(BasicArrowButton.SOUTH));
		c.add(south);
	}

}
