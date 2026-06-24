package jdbc;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class conn {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					conn window = new conn();
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
	public conn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 678, 557);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(76, 118, 44, 12);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(76, 197, 44, 12);
		frame.getContentPane().add(lblNewLabel_1);

		t1 = new JTextField();
		t1.setBounds(210, 115, 96, 18);
		frame.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setBounds(210, 194, 96, 18);
		frame.getContentPane().add(t2);
		t2.setColumns(10);

		JButton b1 = new JButton("Login");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					System.out.println("all done");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/login", "root",
							"22031988");
					PreparedStatement ps = con.prepareStatement("Insert into log values(?,?)");
					// String name=;
					ps.setString(1, "t1");
					ps.setString(2, "t2");

					ResultSet rs = ps.executeQuery();
					if (rs.next()) {
						JOptionPane.showMessageDialog(null, "Login Successfully");

					} else {
						JOptionPane.showMessageDialog(null, "Incorrect username and password");
						con.close();
					}
				} catch (Exception e1) {
				}
			}

		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 20));
		b1.setBounds(99, 314, 119, 44);
		frame.getContentPane().add(b1);

		JButton b2 = new JButton("New button");
		b2.setBounds(252, 314, 84, 20);
		frame.getContentPane().add(b2);
	}
}
