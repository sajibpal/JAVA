package swing;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class spinner {

	static JSpinner obj;
	static JLabel label;
	public static void main(String[] args) {
		
		JFrame frame= new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBounds(250, 260, 500, 320);
		
		frame.setTitle("sajib pal");
		
		Container c=frame.getContentPane();
		
		c.setLayout(null);
       
		SpinnerNumberModel value=new SpinnerNumberModel(10,0,50,5);
		
	     obj=new JSpinner(value); 
		obj.setBounds(100, 90, 50, 50);
		
		 label=new JLabel("selectedvalue 10");
		 label.setBounds(100,180,120,80);
		 
		 obj.addChangeListener(new ChangeListener(){
			 
					@Override
			public void stateChanged(ChangeEvent e) {
				
						
				obj(e);
			}

				
		 });
		 	
		c.add(obj);
		c.add(label);
	}
	
	public static void obj(ChangeEvent e) {
		
		int number=(Integer)obj.getValue();
		label.setText("selectedvalue"+number);
	}

}
