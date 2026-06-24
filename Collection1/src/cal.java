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
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;

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
		frame.setBounds(100, 100, 628, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel(" Enter The No-1");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(22, 98, 163, 23);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel(" Enter The No-2");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(22, 162, 163, 23);
		frame.getContentPane().add(lblNewLabel_1);

		tf1 = new JTextField();
		tf1.setBounds(174, 102, 104, 31);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);

		tf2 = new JTextField();
		tf2.setBounds(174, 166, 104, 31);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);

		JButton b1 = new JButton("+");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = tf1.getText();
				String s2 = tf2.getText();
				int a = Integer.parseInt(s1);
				int b = Integer.parseInt(s2);
				int c = 0;
				if (e.getSource() == b1) {
					c = a + b;
				} else {
					JOptionPane.showMessageDialog(b1, c);
				}
				String result = String.valueOf(c);
				tf3.setText(result);
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 24));
		b1.setBounds(82, 276, 84, 37);
		frame.getContentPane().add(b1);

		JButton b2 = new JButton("-");
		b2.setFont(new Font("Tahoma", Font.BOLD, 25));
		b2.setBounds(209, 276, 84, 37);
		frame.getContentPane().add(b2);

		JLabel lblNewLabel_2 = new JLabel("RESULT");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2.setBounds(22, 229, 104, 23);
		frame.getContentPane().add(lblNewLabel_2);

		tf3 = new JTextField();
		tf3.setBounds(174, 221, 109, 31);
		frame.getContentPane().add(tf3);
		tf3.setColumns(10);
	}
}
