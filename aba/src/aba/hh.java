package aba;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class hh extends JFrame implements ActionListener {

	JLabel l1, l2;
	JTextField t1;
	JPasswordField t2;
	JButton b1;

	Connection con;
	PreparedStatement pst;

	hh() {

		// Labels
		l1 = new JLabel("Username");
		l1.setBounds(50, 50, 100, 30);

		l2 = new JLabel("Password");
		l2.setBounds(50, 100, 100, 30);

		// Text Fields
		t1 = new JTextField();
		t1.setBounds(150, 50, 150, 30);

		t2 = new JPasswordField();
		t2.setBounds(150, 100, 150, 30);

		// Button
		b1 = new JButton("Insert");
		b1.setBounds(120, 170, 100, 30);

		b1.addActionListener(this);

		// Add Components
		getContentPane().add(l1);
		getContentPane().add(l2);
		getContentPane().add(t1);
		getContentPane().add(t2);
		getContentPane().add(b1);

		// Frame Settings
		setTitle("Registration Form");
		setSize(400, 300);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		try {
			String name = t1.getText();
			String password = t2.getText();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/login", "root", "22031988");
			PreparedStatement ps = con.prepareStatement("Insert into log(name,password) values(?,?)");
			ps.setString(1, name);
			ps.setString(2, password);
			int i = ps.executeUpdate();
			if (i > 0) {
				new jj();
				JOptionPane.showMessageDialog(null, "data Insert Sucessfully");

			} else {
				JOptionPane.showMessageDialog(null, "Login Failed");

			}
			con.close();

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static void main(String[] args) {
		new hh();
	}
}