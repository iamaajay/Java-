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

public class home extends JFrame implements ActionListener {

	JLabel l1, l2;
	JTextField tf1;
	JPasswordField pf1;
	JButton btn;

	Connection con;
	PreparedStatement pst;

	home() {

		// Labels
		l1 = new JLabel("Username");
		l1.setBounds(50, 50, 100, 30);

		l2 = new JLabel("Password");
		l2.setBounds(50, 100, 100, 30);

		// Text Fields
		tf1 = new JTextField();
		tf1.setBounds(150, 50, 150, 30);

		pf1 = new JPasswordField();
		pf1.setBounds(150, 100, 150, 30);

		// Button
		btn = new JButton("Insert");
		btn.setBounds(120, 170, 100, 30);

		btn.addActionListener(this);

		// Add Components
		add(l1);
		add(l2);
		add(tf1);
		add(pf1);
		add(btn);

		// Frame Settings
		setTitle("Registration Form");
		setSize(400, 300);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		String name = tf1.getText();
		String password = pf1.getText();

		try {

			// Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Database Connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/login", "root", "22031988");

			// Insert Query
			pst = con.prepareStatement("INSERT INTO log(name,password) VALUES(?,?)");

			pst.setString(1, name);
			pst.setString(2, password);

			int i = pst.executeUpdate();

			if (i > 0) {
				JOptionPane.showMessageDialog(this, "Data Inserted Successfully");
			} else {
				JOptionPane.showMessageDialog(this, "Insertion Failed");
			}

			con.close();

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static void main(String[] args) {
		new home();
	}
}