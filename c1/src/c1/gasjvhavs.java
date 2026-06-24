package c1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class gasjvhavs {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gasjvhavs window = new gasjvhavs();
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
	public gasjvhavs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 361, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 23));
		textField.setBounds(12, 35, 329, 55);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton b14 = new JButton("4");
		b14.setFont(new Font("Tahoma", Font.BOLD, 14));
		b14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b14.setBounds(10, 272, 74, 55);
		frame.getContentPane().add(b14);
		
		JButton dzero = new JButton("00");
		dzero.setFont(new Font("Tahoma", Font.BOLD, 14));
		dzero.setBounds(94, 398, 74, 55);
		frame.getContentPane().add(dzero);
		
		JButton b11 = new JButton("1");
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=textField.getText()+b11.getText();
				textField.setText(s1);
				
			}
		});
		b11.setFont(new Font("Tahoma", Font.BOLD, 14));
		b11.setBounds(10, 337, 74, 55);
		frame.getContentPane().add(b11);
		
		JButton b15 = new JButton("5");
		b15.setFont(new Font("Tahoma", Font.BOLD, 14));
		b15.setBounds(94, 272, 74, 55);
		frame.getContentPane().add(b15);
		
		JButton b12 = new JButton("2");
		b12.setFont(new Font("Tahoma", Font.BOLD, 14));
		b12.setBounds(94, 337, 74, 55);
		frame.getContentPane().add(b12);
		
		JButton b18 = new JButton("8");
		b18.setFont(new Font("Tahoma", Font.BOLD, 14));
		b18.setBounds(94, 210, 74, 55);
		frame.getContentPane().add(b18);
		
		JButton Clear = new JButton("C");
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		Clear.setFont(new Font("Tahoma", Font.BOLD, 14));
		Clear.setBounds(94, 153, 74, 55);
		frame.getContentPane().add(Clear);
		
		JButton back = new JButton("Back");
		back.setFont(new Font("Tahoma", Font.BOLD, 14));
		back.setBounds(10, 151, 74, 55);
		frame.getContentPane().add(back);
		
		JButton zero = new JButton("0");
		zero.setFont(new Font("Tahoma", Font.BOLD, 14));
		zero.setBounds(10, 398, 74, 55);
		frame.getContentPane().add(zero);
		
		JButton res = new JButton("=");
		res.setFont(new Font("Tahoma", Font.BOLD, 14));
		res.setBounds(178, 398, 74, 55);
		frame.getContentPane().add(res);
		
		JButton b17 = new JButton("7");
		b17.setFont(new Font("Tahoma", Font.BOLD, 14));
		b17.setBounds(10, 210, 74, 55);
		frame.getContentPane().add(b17);
		
		JButton b1_2_2_3_1_4 = new JButton("1");
		b1_2_2_3_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		b1_2_2_3_1_4.setBounds(178, 153, 74, 55);
		frame.getContentPane().add(b1_2_2_3_1_4);
		
		JButton b1_2_2_3_1_5 = new JButton("1");
		b1_2_2_3_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		b1_2_2_3_1_5.setBounds(178, 153, 74, 55);
		frame.getContentPane().add(b1_2_2_3_1_5);
		
		JButton b19 = new JButton("9");
		b19.setFont(new Font("Tahoma", Font.BOLD, 14));
		b19.setBounds(178, 210, 74, 55);
		frame.getContentPane().add(b19);
		
		JButton b16 = new JButton("6");
		b16.setFont(new Font("Tahoma", Font.BOLD, 14));
		b16.setBounds(178, 272, 74, 55);
		frame.getContentPane().add(b16);
		
		JButton b13 = new JButton("3");
		b13.setFont(new Font("Tahoma", Font.BOLD, 14));
		b13.setBounds(178, 337, 74, 55);
		frame.getContentPane().add(b13);
		
		JButton percentage = new JButton("%");
		percentage.setFont(new Font("Tahoma", Font.BOLD, 14));
		percentage.setBounds(267, 398, 74, 55);
		frame.getContentPane().add(percentage);
		
		JButton sum = new JButton("+");
		sum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sum.setFont(new Font("Tahoma", Font.BOLD, 14));
		sum.setBounds(267, 157, 74, 55);
		frame.getContentPane().add(sum);
		
		JButton sub = new JButton("-");
		sub.setFont(new Font("Tahoma", Font.BOLD, 14));
		sub.setBounds(267, 214, 74, 55);
		frame.getContentPane().add(sub);
		
		JButton mul = new JButton("*");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mul.setFont(new Font("Tahoma", Font.BOLD, 14));
		mul.setBounds(267, 276, 74, 55);
		frame.getContentPane().add(mul);
		
		JButton div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		div.setFont(new Font("Tahoma", Font.BOLD, 14));
		div.setBounds(265, 337, 74, 55);
		frame.getContentPane().add(div);
	}
}
