package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class registration {

	
  static JTextField tfield;
  static JTextField tfield1;
  static JComboBox box;
  static JComboBox box1;
  static JComboBox box2;
  static JRadioButton button;
  static JRadioButton button1;
  static JTextArea area;
  static  JButton bt;
  static JCheckBox cbox;
  static JTextArea outarea;
 	public static void main(String[] args) {

		JFrame frame=  new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBounds(250, 260, 900, 600);
		
		frame.setTitle("sajib pal");

	    Container c=frame.getContentPane();
	    c.setBackground(Color.CYAN);
		c.setLayout(null);

		JLabel label=new JLabel("Name");
		label.setBounds(80, 40, 80,20);
		
		JLabel label1=new JLabel("Mobile");
		label1.setBounds(80, 100, 90, 20);
		
		JLabel label2=new JLabel("Birthday");
		label2.setBounds(80, 160, 90, 20);
		
	    JLabel label3=new JLabel("Gender");
		label3.setBounds(80, 220, 90, 20);
		
	    JLabel label4=new JLabel("Address");
		label4.setBounds(80, 280, 90, 20);
		
		JLabel label5=new JLabel("Enter input data");
		label5.setBounds(450, 30, 100, 30);
		  
		 tfield=new JTextField();
		tfield.setBounds(150,40,120,30);
		
		
		 tfield1=new JTextField();
		tfield1.setBounds(150,100,130,30);
		
				
		String[] day=new String[40];
		for(int i=0;i<33;i++){
		 
			day[i]=Integer.toString(i);
		}
		 box=new JComboBox(day);
		box.setBounds(150, 160, 50, 30);
		

		String[] month={"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
	    box1=new JComboBox(month);
	   box1.setBounds(250, 160, 50, 30);
		

		String[] year=new String[80];
		for(int i=1970;i<2030;i++){
		 
		   year[i-1970]=Integer.toString(i);
		}
		box2=new JComboBox(year);
		box2.setBounds(350, 160, 60, 30);
		
		 button=new JRadioButton("Male");
		 button.setBounds(150,220,60,20);
		 
		  button1=new JRadioButton("Female");
		 button1.setBounds(250,220,70,20);
		 
		   cbox=new JCheckBox("I accept all condition");
		   cbox.setBounds(150,400,150,20);
		   
		  area=new  JTextArea();
		  area.setBounds(150,280,180,100);
		  
		  Font f=new Font("arial",Font.ITALIC,20);
		  outarea=new JTextArea();
		  outarea.setBounds(450,60,190,200);
		  outarea.setFont(f);
		  
		   bt=new JButton("Submit");
		  bt.setBounds(200,450,90,30);
		   
		c.add(tfield1);
		c.add(tfield);
		c.add(label);
		c.add(label1);
		c.add(label2);
		c.add(label3);
		c.add(label4);
		c.add(label5);
		c.add(box);
		c.add(box1);
		c.add(box2);
		c.add(cbox);
		c.add(button);
		c.add(button1);
		c.add(bt);
		c.add(area);
		c.add(outarea);
		
		
		bt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent d){
				
				bt(d);
				
			 }
		});

		
	}
 	public static void bt(ActionEvent d){
 		if(cbox.isSelected()){
 		String name=tfield.getText();
		String mobile=tfield1.getText();
		String address=area.getText();
		String day=(String)box.getSelectedItem();
		String month=(String)box1.getSelectedItem();
		String year=(String)box2.getSelectedItem();
		String gender="Male";
		if(button1.isSelected()){
		 gender="Female";
		 }

		outarea.setText("name:"+name+"\nmobile:"+mobile+"\nBirthday:"+day+" "+month+" "+year+" "+"\ngender:"+gender+"\naddress:"+address);
 	 }	
 	else{
 		outarea.setText("Check all option");
 	 }
 		
 	}

}
