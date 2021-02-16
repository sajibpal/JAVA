package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class box extends JFrame implements ActionListener{
	
	Container c;
	Color[] name={Color.black,Color.DARK_GRAY,Color.GREEN,Color.lightGray};
	JComboBox box=new JComboBox(name);
	JTextField tfield=new JTextField();
	
	box(){
	c=this.getContentPane();
	c.setLayout(null);
	box.setBounds(100,60,100,30);
	box.setEditable(true);
	
	box.addActionListener(this);
	
	c.add(box);
	}
	
	public void actionPerformed(ActionEvent l){
		
		 Color obj=(Color)box.getSelectedItem();
		 c.setBackground(obj);
	}
		
}	
public class comboboxccolor {

	public static void main(String[] args) {
		
	
		box frame=  new box();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(box.EXIT_ON_CLOSE);
		
		frame.setBounds(250, 260, 500, 320);
		
		frame.setTitle("sajib pal");
		

	}

}
