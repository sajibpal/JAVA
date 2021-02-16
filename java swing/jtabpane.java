package swing;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;


class w extends JFrame{
	

	
	w(){
		
	 Container c=this.getContentPane();
		c.setLayout(null);	
		
		JTabbedPane tp=new JTabbedPane(JTabbedPane.RIGHT);
		tp.setBounds(100, 60, 250, 180);
		c.add(tp);
		
		JPanel panel= new JPanel();
		panel.setLayout(null);
		JLabel label=new JLabel("panel 1");
	    label.setBounds(40, 60, 60, 30);
		panel.setBackground(Color.GREEN);
		panel.add(label);
		tp.addTab("home", panel);
		
		JPanel panel1= new JPanel();
		JButton bt=new JButton("panel 2");
		panel1.setBackground(Color.magenta);
		//panel1.setBorder();
		panel1.add(bt);
		tp.addTab("joom", panel1);
		
		JPanel panel2= new JPanel();
		JTextField field=new JTextField("panel 2");
		panel2.setBackground(Color.pink);
		panel2.add(field);
		tp.addTab("sajib", panel2);
		
		
	} 
	
} 
public class jtabpane {

	public static void main(String[] args) {
		w frame=  new w();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(w.EXIT_ON_CLOSE);
		
		frame.setBounds(250, 260, 700, 450);
		
		frame.setTitle("sajib pal");

	}

}
