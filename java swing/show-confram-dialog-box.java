package swing;

import javax.swing.JOptionPane;

public class showconframdialogboxx {

	public static void main(String[] args) {
		
	int obj=JOptionPane.showConfirmDialog(null,"Do you want exit","Quit",JOptionPane.YES_NO_CANCEL_OPTION);	
    
	 if(obj==JOptionPane.YES_OPTION){
		 
		System.exit(0); 
	 }
	 else{
		
		 System.out.println("no select");
	 }
	}

}
