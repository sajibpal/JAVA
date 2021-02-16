package swing;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class sajib extends JFrame implements ActionListener {
	
	
	JRadioButton bt=new JRadioButton("sajib");
	JRadioButton bt1=new JRadioButton("Rajib");
	JRadioButton bt2=new JRadioButton("utsab");
	JTextField tfield=new JTextField();
	
	sajib(){
		
	Container c=this.getContentPane();
	c.setLayout(null);
	
     bt.setBounds(100,60,100,30);
    
     bt1.setBounds(200,60,100,30);
     bt1.setSelected(true);

     bt2.setBounds(300,60,100,30);
     
     
     tfield.setBounds(100, 200, 200, 100);
     tfield.setBackground(Color.CYAN);
     
     Font k=new Font("arial",Font.ITALIC,20);
     tfield.setFont(k);
    
    ButtonGroup obj=new ButtonGroup();
     
      obj.add(bt);
      obj.add(bt1);
      obj.add(bt2);
      
      
    c.add(bt);
    c.add(bt1);
    c.add(bt2);
    c.add(tfield);
    
    bt.addActionListener(this);
    bt1.addActionListener(this);
    bt2.addActionListener(this);
    
	}
 
	public void actionPerformed(ActionEvent k){
		
	
		if(bt1.isSelected()){
			
			tfield.setText("Selected Sajib ");
		}
		else if(k.getSource()==bt1){ //or bt1.isSelected use;
			
			tfield.setText("Selected Rajib");
			}
		
		else{
			
			tfield.setText("Selected Utsab");
		 }
		
		}
	}

public class jradiobutton {

	public static void main(String[] args) {
		sajib frame= new sajib();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(sajib.EXIT_ON_CLOSE);
		
		frame.setBounds(250, 260, 700, 520);
		
		frame.setTitle("sajib pal");
		
		
	}

}
