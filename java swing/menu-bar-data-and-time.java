package swing;

import java.awt.event.*;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.*;
import javax.swing.*;

class menu extends JFrame {
	
  JMenuBar menubar;
  JMenu file,time,date,print,pdf;
  JMenuItem open,copy,cut,rename,move;
 
	menu(){
	
	 
	 menubar=new JMenuBar();
	 this.setJMenuBar(menubar);
	 
	 file=new JMenu("file");
	 date=new JMenu("date");
	 time=new JMenu("time");
	 print=new JMenu("print");
	 pdf=new JMenu("pdf");
	 
	 menubar.add(file); 
	 menubar.add(time);
	 menubar.add(date);
	 menubar.add(print);
	 menubar.add(pdf);
	 
	 open=new JMenuItem("open");
	 copy=new JMenuItem("copy");
	 move=new JMenuItem("move");
	 rename=new JMenuItem("rename");
	 
	 file.add(open);
	 file.add(copy);
	 file.add(move);
	 file.add(rename);
	 
	 
	 Thread clock=new Thread(){
		 
		public void run(){
			
		 
		for(;;){
			 
			 Calendar cal=new GregorianCalendar();
			 int month=cal.get(Calendar.MONTH);
			 int year=cal.get(Calendar.YEAR);
			 int day=cal.get(Calendar.DAY_OF_MONTH);
			 date.setText("Date "+year+"/"+month+"/"+day);
				
			 int hour=cal.get(Calendar.HOUR);
			 int minute=cal.get(Calendar.MINUTE);
			 int seconds=cal.get(Calendar.SECOND);
			 time.setText("Time "+hour+":"+minute+":"+seconds);
			  
		 
		  }
		} 
	 };
	 clock.start();
	 
	
	 
	 }

	
	
 }

	

public class menubardataandtime {

	public static void main(String[] args) {
		
		menu frame= new menu();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(menu.EXIT_ON_CLOSE);
		
		frame.setBounds(250, 260, 500, 420);
		
		frame.setTitle("sajib pal");
	}

}
