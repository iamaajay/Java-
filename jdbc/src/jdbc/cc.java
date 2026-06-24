package jdbc;

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

public class cc extends JFrame implements ActionListener {

	JLabel l1, l2;
	JTextField tf1;
	JPasswordField pf1;
	JButton b1;

	cc() {

		setTitle("Login Form");

		l1 = new JLabel("Username");
		l2 = new JLabel("Password");

		tf1 = new JTextField();
		pf1 = new JPasswordField();

		b1 = new JButton("Login");

		l1.setBounds(50, 50, 100, 30);
		l2.setBounds(50, 100, 100, 30);

		tf1.setBounds(150, 50, 150, 30);
		pf1.setBounds(150, 100, 150, 30);

		b1.setBounds(120, 160, 100, 30);

		add(l1);
		add(l2);
		add(tf1);
		add(pf1);
		add(b1);

		b1.addActionListener(this);

		setSize(400, 300);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {

		String username = tf1.getText();
		String password = pf1.getText();

		try {

			// Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/login", "root", "22031988");

			// SQL Query
			PreparedStatement ps = con.prepareStatement("SELECT * FROM log WHERE name=? AND password=?");

			ps.setString(1, username);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				JOptionPane.showMessageDialog(this, "Login Successful");
			} else {
				JOptionPane.showMessageDialog(this, "Invalid Username or Password");
			}

			con.close();

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static void main(String[] args) {
		new cc();
	}
}