package calculat;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class cal {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cal window = new cal();
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
	public cal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 645, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel l1 = new JLabel("Enter The No-1");
		l1.setFont(new Font("Tahoma", Font.BOLD, 15));
		l1.setBounds(46, 55, 124, 32);
		frame.getContentPane().add(l1);

		JLabel l2 = new JLabel("Enter The No-2");
		l2.setFont(new Font("Tahoma", Font.BOLD, 15));
		l2.setBounds(46, 122, 124, 24);
		frame.getContentPane().add(l2);

		JLabel l3 = new JLabel("Result");
		l3.setFont(new Font("Tahoma", Font.BOLD, 18));
		l3.setBounds(46, 187, 124, 24);
		frame.getContentPane().add(l3);

		t1 = new JTextField();
		t1.setBounds(216, 64, 96, 18);
		frame.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setBounds(216, 127, 96, 18);
		frame.getContentPane().add(t2);
		t2.setColumns(10);

		t3 = new JTextField();
		t3.setBounds(216, 193, 96, 18);
		frame.getContentPane().add(t3);
		t3.setColumns(10);

		JButton b1 = new JButton("+");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int a = Integer.parseInt(s1);
				int b = Integer.parseInt(s2);
				int c = 0;
				if (e.getSource() == b1) {
					c = a + b;
					JOptionPane.showMessageDialog(b1, c);
				} else {

				}
				String result = String.valueOf(c);
				t3.setText(result);
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 30));
		b1.setBounds(46, 298, 84, 43);
		frame.getContentPane().add(b1);

		JButton b2 = new JButton("-");
		b2.setFont(new Font("Tahoma", Font.BOLD, 30));
		b2.setBounds(216, 298, 84, 43);
		frame.getContentPane().add(b2);
	}
}
