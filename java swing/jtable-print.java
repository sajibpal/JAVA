package swing;

import java.awt.*;
import java.awt.event.*;
import java.text.MessageFormat;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.*;
import java.awt.print.*;


class a extends JFrame implements ActionListener{

	   JTable tabel;
	    JMenuBar menubar;
	    JMenu print;
	    
	a(){
		Container c=this.getContentPane();
		c.setLayout(null);
		Color h=new Color(131,71,255);
		c.setBackground(h);
		
		 
		 menubar=new JMenuBar();
		 this.setJMenuBar(menubar);
		 
		 print=new JMenu("print");
		 menubar.add(print);
		
		JTable tabel=new JTable();
		DefaultTableModel model=new DefaultTableModel();
		
		String[] column={"frist name","last name","phone","gpa"};
		String[] column1=new String[4];
		
		  model.setColumnIdentifiers(column);
		  tabel.setModel(model); 
		  model.addRow(column1);
		  tabel.setBackground(Color.white);
		  tabel.setRowHeight(30);
		    
		  JScrollPane scroll=new JScrollPane(); 
		    scroll=new JScrollPane(tabel);
		    scroll.setBounds(10,250,700,265);
		    c.add(scroll);
		
		 print.addActionListener(this);
	}

public void actionPerformed(ActionEvent e) {

	 MessageFormat	header=new MessageFormat("Report Print");
	 MessageFormat	footer=new MessageFormat("Page{0,number,integer}");
	try{
		
			
		  tabel.print(JTable.PrintMode.NORMAL,header,footer);	
		}
		catch(PrinterException e3){
			
		System.err.format("connot print %s %n", e3.getMessage());	
		}
  }

}

public class jtableprint {
	
	public static void main(String[] args) {
		
		a frame= new a();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(a.EXIT_ON_CLOSE);
		frame.setBounds(250, 260, 700, 620);
		frame.setTitle("sajib pal");
	  
		}
		 
}

	
	 

