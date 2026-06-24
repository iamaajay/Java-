package calculator1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calci {

	private JFrame frmCalculator;
	private JTextField t;

	/**
	 * Launch the application.
	 */
	String operation;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setFont(new Font("Dialog", Font.BOLD, 16));
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 323, 454);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		t = new JTextField();
		t.setFont(new Font("Tahoma", Font.BOLD, 18));
		t.setBounds(13, 29, 283, 51);
		frmCalculator.getContentPane().add(t);
		t.setColumns(10);
		
		JButton t7 = new JButton("7");
		t7.setFont(new Font("Tahoma", Font.BOLD, 20));
		t7.setBounds(10, 180, 74, 51);
		frmCalculator.getContentPane().add(t7);
		
		JButton btnNewButton_1 = new JButton("<-");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(10, 119, 74, 51);
		frmCalculator.getContentPane().add(btnNewButton_1);
		
		JButton t8 = new JButton("8");
		t8.setFont(new Font("Tahoma", Font.BOLD, 20));
		t8.setBounds(83, 180, 74, 51);
		frmCalculator.getContentPane().add(t8);
		
		JButton t4 = new JButton("4");
		t4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s4=t.getText()+t4.getText();
				t.setText(s4);
			}
		});
		t4.setFont(new Font("Tahoma", Font.BOLD, 20));
		t4.setBounds(10, 241, 74, 51);
		frmCalculator.getContentPane().add(t4);
		
		JButton t1 = new JButton("1");
		t1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=t.getText()+t1.getText();
				t.setText(s1);
				
				
			}
		});
		t1.setFont(new Font("Tahoma", Font.BOLD, 20));
		t1.setBounds(10, 302, 74, 51);
		frmCalculator.getContentPane().add(t1);
		
		JButton btnNewButton_3_1_1 = new JButton("0");
		btnNewButton_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3_1_1.setBounds(10, 363, 74, 51);
		frmCalculator.getContentPane().add(btnNewButton_3_1_1);
		
		JButton btnNewButton_2_1 = new JButton("C");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.setText(null);
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2_1.setBounds(83, 119, 74, 51);
		frmCalculator.getContentPane().add(btnNewButton_2_1);
		
		JButton t5 = new JButton("5");
		t5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s5=t.getText()+t5.getText();
				t.setText(s5);
			}
		});
		t5.setFont(new Font("Tahoma", Font.BOLD, 20));
		t5.setBounds(83, 241, 74, 51);
		frmCalculator.getContentPane().add(t5);
		
		JButton t2 = new JButton("2");
		t2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s2=t.getText()+t2.getText();
				t.setText(s2);
			}
		});
		t2.setFont(new Font("Tahoma", Font.BOLD, 20));
		t2.setBounds(83, 302, 74, 51);
		frmCalculator.getContentPane().add(t2);
		
		JButton btnNewButton_2_2_1_1 = new JButton("=");
		btnNewButton_2_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(operation=="+")
				{
			
				}
			}
		});
		btnNewButton_2_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2_2_1_1.setBounds(154, 363, 74, 51);
		frmCalculator.getContentPane().add(btnNewButton_2_2_1_1);
		
		JButton btnNewButton_2_1_1 = new JButton("00");
		btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2_1_1.setBounds(154, 119, 74, 51);
		frmCalculator.getContentPane().add(btnNewButton_2_1_1);
		
		JButton b3 = new JButton("*");
		b3.setFont(new Font("Tahoma", Font.BOLD, 20));
		b3.setBounds(222, 241, 74, 51);
		frmCalculator.getContentPane().add(b3);
		
		JButton b2 = new JButton("-");
		b2.setFont(new Font("Tahoma", Font.BOLD, 20));
		b2.setBounds(222, 180, 74, 51);
		frmCalculator.getContentPane().add(b2);
		
		JButton t3 = new JButton("3");
		t3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s3=t.getText()+t3.getText();
				t.setText(s3);
			}
		});
		t3.setFont(new Font("Tahoma", Font.BOLD, 20));
		t3.setBounds(154, 302, 74, 51);
		frmCalculator.getContentPane().add(t3);
		
		JButton btnNewButton_2_2_1_1_1 = new JButton(".");
		btnNewButton_2_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2_2_1_1_1.setBounds(83, 363, 74, 51);
		frmCalculator.getContentPane().add(btnNewButton_2_2_1_1_1);
		
		JButton b1 = new JButton("+");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double first=Double.parseDouble(t.getText());
				t.setText("");
				String operation = "+";
				
				
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 20));
		b1.setBounds(222, 119, 74, 51);
		frmCalculator.getContentPane().add(b1);
		
		JButton t9 = new JButton("9");
		t9.setFont(new Font("Tahoma", Font.BOLD, 20));
		t9.setBounds(154, 180, 74, 51);
		frmCalculator.getContentPane().add(t9);
		
		JButton t6 = new JButton("6");
		t6.setFont(new Font("Tahoma", Font.BOLD, 20));
		t6.setBounds(154, 241, 74, 51);
		frmCalculator.getContentPane().add(t6);
		
		JButton b4 = new JButton("/");
		b4.setFont(new Font("Tahoma", Font.BOLD, 20));
		b4.setBounds(222, 302, 74, 51);
		frmCalculator.getContentPane().add(b4);
		
		JButton b5 = new JButton("%");
		b5.setFont(new Font("Tahoma", Font.BOLD, 20));
		b5.setBounds(222, 363, 74, 51);
		frmCalculator.getContentPane().add(b5);
	}
}
