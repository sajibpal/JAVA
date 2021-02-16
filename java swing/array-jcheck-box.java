package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class k extends JFrame implements ItemListener {
	

	JCheckBox[] box=new JCheckBox[4];
	JTextArea area=new JTextArea();
	
	k(){
	Container c=this.getContentPane();
	 c.setLayout(null);
	 
	 for(int  i=0;i<box.length;i++){
		 
		box[i]=new JCheckBox("checkbox"+(i));
		box[i].setBounds(80,50+(50*i),100,30);
		c.add(box[i]);
		box[i].addItemListener(this);
	  }
	 
	 area.setBounds(200,90,180,100);
	 c.add(area);
	 
	 }
  	public void itemStateChanged(ItemEvent d){
  		
  		area.setText(" ");
  		for(int i=0;i<box.length;i++){
  			
  			if(box[i].isSelected()){
  				
  				area.append(box[i].getText()+"\n");
  			}
  		}
  	}
	
}

public class arrayjcheckbox {

	public static void main(String[] args) {
		
       
		
		k frame= new k();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(k.EXIT_ON_CLOSE);
		
		frame.setBounds(250, 260, 500, 320);
		
		frame.setTitle("sajib pal");
		
	
	}

}
