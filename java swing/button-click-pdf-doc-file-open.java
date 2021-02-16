package swing;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class buttonclickpdfdockfileopen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					buttonclickpdfdockfileopen window = new buttonclickpdfdockfileopen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public buttonclickpdfdockfileopen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 595, 361);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnPdf = new JButton("pdf document");
		btnPdf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 try {
						Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:\\Users\\sajib\\Documents\\154045 (2).docx");
					   } 
					  
					  catch (Exception e1) {
						
						JOptionPane.showMessageDialog(null, e);
					   }
			}
		});
		btnPdf.setBounds(112, 143, 142, 34);
		frame.getContentPane().add(btnPdf);
	}
}
