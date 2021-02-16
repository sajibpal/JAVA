package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

 class student extends JFrame implements ActionListener{

JTextField field1,field2,field3,field4;
JButton bt, bt1, bt2, bt3;
JTable tabel;
DefaultTableModel model;
JScrollPane scroll;
String[] column={"frist name","last name","phone","gpa"};
String[] column1=new String[4];

	student(){
		
	Container c=this.getContentPane();
	c.setLayout(null);
	Color h=new Color(131,71,255);
	c.setBackground(h);
	
	JLabel label=new JLabel("first name");
	label.setBounds(60, 60, 80, 20);
	c.add(label);
	
	JLabel label1=new JLabel("last name");
	label1.setBounds(60, 100, 80, 20);
	c.add(label1);
	
	
	JLabel label2=new JLabel("phone");
	label2.setBounds(60, 140, 80, 20);
	c.add(label2);
	
	
	JLabel label3=new JLabel("gpa");
	label3.setBounds(60, 180, 80, 20);
	c.add(label3);
	
	 field1=new JTextField();
	field1.setBounds(140,60,80,30);
	c.add(field1);
	
	 field2=new JTextField();
	field2.setBounds(140,100,80,30);
	c.add(field2);
	
	 field3=new JTextField();
	field3.setBounds(140,140,80,30);
	c.add(field3);
	
	 field4=new JTextField();
	field4.setBounds(140,180,80,30);
	c.add(field4);
	
	 bt=new JButton("add");
	bt.setBounds(300, 60, 80, 30);
	c.add(bt);
	
	 bt1=new JButton("delete");
	bt1.setBounds(300, 100, 80, 30);
	c.add(bt1);
	
	 bt2=new JButton("update");
	bt2.setBounds(300, 140, 80, 30);
	c.add(bt2);
	
	 bt3=new JButton("clear");
	bt3.setBounds(300, 180, 80, 30);
	c.add(bt3);
	
	 tabel=new JTable();
	
	 model=new DefaultTableModel();
    model.setColumnIdentifiers(column);
    tabel.setModel(model);
    tabel.setSelectionBackground(Color.green);
    tabel.setBackground(Color.white);
    tabel.setRowHeight(30);
    
     scroll=new JScrollPane(tabel);
    scroll.setBounds(10,250,700,265);
    c.add(scroll);
    
    bt.addActionListener(this);
    bt1.addActionListener(this);
    bt2.addActionListener(this);
    bt3.addActionListener(this);
    
    tabel.addMouseListener(new MouseAdapter(){
    	
    	public void mouseClicked(MouseEvent e){
    	
    	         int rownumber=tabel.getSelectedRow();
    		      
    			  String fname=(String)model.getValueAt(rownumber, 0);
    		      String lname=(String)model.getValueAt(rownumber, 1);
    		      String phone=(String)model.getValueAt(rownumber, 2);
    		      String gpa=(String)model.getValueAt(rownumber, 3);
    	   
    		     field1.setText(fname);
    		     field2.setText(lname);
    		     field3.setText(phone);
    		     field4.setText(gpa);
    			
    		}
    	
    	
    	
    });
	
}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==bt){
			column1[0]=field1.getText();
			column1[1]=field2.getText();
			column1[2]=field3.getText();
			column1[3]=field4.getText();
			model.addRow(column1);
		}
		else if(e.getSource()==bt3){
			
			field1.setText(" ");
			field2.setText(" ");
			field3.setText(" ");
			field4.setText(" ");
			
		}
		else if(e.getSource()==bt1){
			
			int rownumber=tabel.getSelectedRow();
			 if(rownumber>0){
				
			  model.removeRow(rownumber);
			  }
			 else{
				 
				JOptionPane.showMessageDialog(null, "no selecte row");
			 }
		
		 }
		else if(e.getSource()==bt2){
			
			 int rownumber=tabel.getSelectedRow();
			 
				String fname =field1.getText();
				String lname=field2.getText();
				String phone=field3.getText();
				String gpa=field4.getText();
				
			  model.setValueAt(fname, rownumber, 0);
		      model.setValueAt(lname,rownumber, 1);
		      model.setValueAt(phone,rownumber, 2);
		      model.setValueAt(gpa,rownumber, 3);
		
	   }
		
 
   }
 
 } 

public class srtudentmanagement {

	public static void main(String[] args) {
		
		student frame= new student();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(student.EXIT_ON_CLOSE);
		
		frame.setBounds(250, 260, 700, 620);
		
		frame.setTitle("sajib pal");
	  
		

	}

}
