package log1;

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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class log {

	private JFrame frame;
	private JTextField t1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					log window = new log();
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
	public log() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 579, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Login Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(146, 40, 332, 37);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(76, 142, 89, 26);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2.setBounds(76, 224, 89, 26);
		frame.getContentPane().add(lblNewLabel_2);

		t1 = new JTextField();
		t1.setBounds(271, 139, 152, 37);
		frame.getContentPane().add(t1);
		t1.setColumns(10);

		JButton b1 = new JButton("Login");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = t1.getText();
				String password = p1.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/login", "root",
							"22031988");
					PreparedStatement ps = con.prepareStatement("SELECT *FROM log WHERE name=? AND password=?");
					ps.setString(1, username);
					ps.setString(2, password);
					ResultSet rs = ps.executeQuery();
					if (rs.next()) {
						JOptionPane.showMessageDialog(null, "Login Successfully");
					} else {
						JOptionPane.showMessageDialog(null, "Sorry Login Failed");

					}
					con.close();
				} catch (Exception e1) {
					System.out.println(e1);
				}

			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 25));
		b1.setBounds(164, 325, 103, 52);
		frame.getContentPane().add(b1);

		p1 = new JPasswordField();
		p1.setBounds(271, 219, 152, 37);
		frame.getContentPane().add(p1);
	}
}
