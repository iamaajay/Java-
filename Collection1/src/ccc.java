import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ccc {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JButton b2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ccc window = new ccc();
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
	public ccc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 729, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		t1 = new JTextField();
		t1.setBounds(137, 69, 96, 49);
		frame.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setBounds(137, 150, 96, 49);
		frame.getContentPane().add(t2);
		t2.setColumns(10);

		t3 = new JTextField();
		t3.setBounds(137, 239, 96, 49);
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
					JOptionPane.showMessageDialog(b1, c);
				}
				String result = String.valueOf(c);
				t3.setText(result);
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 27));
		b1.setBounds(96, 377, 84, 49);
		frame.getContentPane().add(b1);

		b2 = new JButton("-");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int a = Integer.parseInt(s1);
				int b = Integer.parseInt(s2);
				int c = 0;
				if (e.getSource() == b2) {
					c = a - b;
					JOptionPane.showMessageDialog(b2, c);
				} else {
					JOptionPane.showMessageDialog(b2, e);
				}
				String result = String.valueOf(c);
				t3.setText(result);
			}
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 27));
		b2.setBounds(245, 377, 84, 41);
		frame.getContentPane().add(b2);
	}
}
