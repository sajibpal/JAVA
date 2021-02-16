package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class jlsider {
	
	static JLabel label;
	static JSlider slider;

	public static void main(String[] args) {
		JFrame frame= new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);	
		frame.setBounds(250, 260, 480, 300);
		frame.setTitle("sajib pal");
		
		Container c=frame.getContentPane();
		c.setLayout(null);
		
		 slider=new JSlider(JSlider.HORIZONTAL,0,50,0);
		 slider.setMajorTickSpacing(5);
		 slider.setPaintTicks(true);
		 slider.setBounds(150, 60, 150, 30);
		 slider.setBackground(Color.CYAN);
		 c.add(slider);
		 
		 label=new JLabel("default value 0");
		label.setBounds(60,60,100,30);
		c.add(label);
		
		
		
		slider.addChangeListener(new ChangeListener(){

			public void stateChanged(ChangeEvent e) {
				
				slider(e);
				
			 }

		});
	}
	

	public static void slider(ChangeEvent e) {
	
		int value=slider.getValue();
		label.setText("current value"+value);
		
	}

}
