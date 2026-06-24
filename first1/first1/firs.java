package first1;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class firs {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					firs window = new firs();
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
	public firs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 585);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("Enter no");
		l1.setFont(new Font("Tahoma", Font.BOLD, 14));
		l1.setBounds(10, 36, 150, 37);
		frame.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("Enter no 2");
		l2.setFont(new Font("Tahoma", Font.BOLD, 14));
		l2.setBounds(10, 119, 101, 17);
		frame.getContentPane().add(l2);
		
		JButton b1 = new JButton("OK");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b1,"Thank you sir");
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 16));
		b1.setBounds(64, 192, 85, 21);
		frame.getContentPane().add(b1);
	}
}
