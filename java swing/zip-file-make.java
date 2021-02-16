package swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class z extends JFrame implements ActionListener{
	
	z(){
		
	 Container c=this.getContentPane();
		c.setLayout(null);
		
		JButton bt1=new JButton("zip create");
		bt1.setBounds(60,60,120,30);
		c.add(bt1);
		
		bt1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		
		try{

			JFileChooser chooser=new JFileChooser();
		       chooser.showOpenDialog(null);
		       File f=chooser.getSelectedFile();
		       String filename=f.getName();
		     String stringpath=f.getAbsolutePath();
		     File path=new File(stringpath);
		       
			FileInputStream fis=new FileInputStream(path);
			ZipOutputStream zos=new ZipOutputStream(new FileOutputStream("F:\\sajib\\java program\\java swing\\sajib.zip"));
			zos.putNextEntry(new ZipEntry( filename));
			
			byte[] buffer=new byte[1024];
			
			int bytread;
			while((bytread=fis.read(buffer))>0){
				
				zos.write(buffer,0,bytread);
				
			}
			zos.closeEntry();
			zos.close();
			fis.close();
			
		}catch(Exception e1){
			
			JOptionPane.showMessageDialog(null, e1);
		}
		
	}
}
public class zipfilemake {

	public static void main(String[] args) {
		z frame= new z();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(z.EXIT_ON_CLOSE);
		
		frame.setBounds(250, 260, 500, 420);
		
		frame.setTitle("sajib pal");

	}

}
