package swing;

import javax.swing.JOptionPane;
//import javax.swing.ImageIcon;

public class showinputdialogandoutput {

	public static void main(String[] args) {

		String na=JOptionPane.showInputDialog(null ,"enter your first name","this is title");
		String na1=JOptionPane.showInputDialog(null ,"enter your last name","this is title");
	    
		String name=na+" "+na1;
		//ImageIcon obj= new ImageIcon("SAJIB.jpg");
		
	   JOptionPane.showMessageDialog (null,"your fullname "+name);


	}

}
