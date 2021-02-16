package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class mybox extends JFrame implements ActionListener{
	
	Container c;
	String[] name={"sajib","pal","roton","utsob"};
	JComboBox box=new JComboBox(name);
	JTextField tfield=new JTextField();
	
	mybox(){
	c=this.getContentPane();
	c.setLayout(null);
	
	
	box.setBounds(100,60,100,30);
	box.setEditable(true);
	box.setSelectedItem("sajib");
	box.addItem("rajib");
	box.removeItem("roton");

	
	JButton obj=new JButton("ok");
	obj.setBounds(100,150,100,30);
	
	tfield.setBounds(250,80,150,40);
	
	obj.addActionListener(this);
	
	c.add(box);
	c.add(obj);
	c.add(tfield);
   
      
	}
	
	public void actionPerformed(ActionEvent l){
		
		
		String ok=(String)box.getSelectedItem();
		
		tfield.setText("Selected "+ok);
	}
}

public class jcombobox {

	public static void main(String[] args) {
		mybox frame=  new mybox();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(mybox.EXIT_ON_CLOSE);
		
		frame.setBounds(250, 260, 500, 320);
		
		frame.setTitle("sajib pal");
		
		
	}

}
