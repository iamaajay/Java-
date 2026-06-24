package c1;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class abc {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					abc window = new abc();
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
	public abc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 398, 588);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton b4 = new JButton("4");
		b4.setFont(new Font("Tahoma", Font.BOLD, 25));
		b4.setBounds(10, 287, 75, 83);
		frame.getContentPane().add(b4);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 28));
		textField.setBounds(10, 29, 349, 68);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1.setBounds(10, 195, 75, 83);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnBack,"Thank you for using");
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnBack.setBounds(11, 107, 75, 83);
		frame.getContentPane().add(btnBack);
		
		JButton btnNewButton_3 = new JButton("8");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_3.setBounds(95, 195, 75, 83);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=textField.getText()+b1.getText();
				textField.setText(s1);
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 25));
		b1.setBounds(10, 380, 75, 83);
		frame.getContentPane().add(b1);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_5.setBounds(95, 287, 75, 83);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton b2 = new JButton("2");
		b2.setFont(new Font("Tahoma", Font.BOLD, 25));
		b2.setBounds(95, 380, 75, 83);
		frame.getContentPane().add(b2);
		
		JButton btnNewButton_3_1 = new JButton("C");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_3_1.setBounds(95, 107, 75, 83);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_3_1_1 = new JButton("%");
		btnNewButton_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_3_1_1.setBounds(185, 107, 75, 83);
		frame.getContentPane().add(btnNewButton_3_1_1);
		
		JButton b3 = new JButton("3");
		b3.setFont(new Font("Tahoma", Font.BOLD, 25));
		b3.setBounds(180, 380, 75, 83);
		frame.getContentPane().add(b3);
		
		JButton btnNewButton_3_1_1_1_1 = new JButton("6");
		btnNewButton_3_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_3_1_1_1_1.setBounds(185, 287, 75, 83);
		frame.getContentPane().add(btnNewButton_3_1_1_1_1);
		
		JButton btnNewButton_3_1_1_1_2 = new JButton("9");
		btnNewButton_3_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_3_1_1_1_2.setBounds(185, 195, 75, 83);
		frame.getContentPane().add(btnNewButton_3_1_1_1_2);
		
		JButton btnNewButton_3_1_1_2 = new JButton("+");
		btnNewButton_3_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_3_1_1_2.setBounds(284, 107, 75, 83);
		frame.getContentPane().add(btnNewButton_3_1_1_2);
		
		JButton btnNewButton_3_1_1_1_2_1 = new JButton("-");
		btnNewButton_3_1_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_3_1_1_1_2_1.setBounds(284, 195, 75, 83);
		frame.getContentPane().add(btnNewButton_3_1_1_1_2_1);
		
		JButton btnNewButton_3_1_1_1_1_1 = new JButton("*");
		btnNewButton_3_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_3_1_1_1_1_1.setBounds(284, 287, 75, 83);
		frame.getContentPane().add(btnNewButton_3_1_1_1_1_1);
		
		JButton btnNewButton_3_1_1_1_3 = new JButton("/");
		btnNewButton_3_1_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_3_1_1_1_3.setBounds(279, 380, 75, 83);
		frame.getContentPane().add(btnNewButton_3_1_1_1_3);
		
		JButton btnBack_1 = new JButton("0");
		btnBack_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnBack_1.setBounds(11, 473, 75, 83);
		frame.getContentPane().add(btnBack_1);
		
		JButton btnNewButton_3_1_2 = new JButton("00");
		btnNewButton_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_3_1_2.setBounds(95, 473, 75, 83);
		frame.getContentPane().add(btnNewButton_3_1_2);
		
		JButton btnNewButton_3_1_1_1 = new JButton(".");
		btnNewButton_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_3_1_1_1.setBounds(185, 473, 75, 83);
		frame.getContentPane().add(btnNewButton_3_1_1_1);
		
		JButton btnNewButton_3_1_1_2_1 = new JButton("=");
		btnNewButton_3_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_3_1_1_2_1.setBounds(284, 473, 75, 83);
		frame.getContentPane().add(btnNewButton_3_1_1_2_1);
	}
}
