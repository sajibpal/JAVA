package swing;

import java.awt.*;
import javax.swing.*;

public class colorchooserbox {

	public static void main(String[] args) {
		menu frame= new menu();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(menu.EXIT_ON_CLOSE);
		
		frame.setBounds(250, 260, 500, 420);
		
		frame.setTitle("sajib pal");
		
		Container c= frame.getContentPane();
		 
		Color color=JColorChooser.showDialog(null, "select color",Color.blue);
		//c.setBackground(color);
		
		 Color g=new Color(0,194,89);
		 c.setBackground(g);
	}

}
