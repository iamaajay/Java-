package aba;

import java.awt.GridLayout;
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

public class sea extends JFrame implements ActionListener {

	JLabel l1, l2, l3;
	JTextField t1, t2, t3;
	JButton b1;

	Connection con;
	PreparedStatement pst;
	ResultSet rs;

	sea() {

		setTitle("Search Data From MySQL");
		setSize(400, 300);
		setLayout(new GridLayout(4, 2, 10, 10));

		l1 = new JLabel("Enter ID:");
		l2 = new JLabel("Name:");
		l3 = new JLabel("Password:");

		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();

		b1 = new JButton("Search");

		add(l1);
		add(t1);

		add(l2);
		add(t2);

		add(l3);
		add(t3);

		add(new JLabel());
		add(b1);

		b1.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/college", "root", "22031988");

			pst = con.prepareStatement("SELECT * FROM student WHERE id=?");

			pst.setInt(1, Integer.parseInt(t1.getText()));

			rs = pst.executeQuery();

			if (rs.next()) {

				t2.setText(rs.getString("name"));
				t3.setText(rs.getString("password"));

				JOptionPane.showMessageDialog(this, "Record Found");

			} else {

				JOptionPane.showMessageDialog(this, "Record Not Found");

				t2.setText("");
				t3.setText("");
			}

			con.close();

		} catch (Exception ex) {

			JOptionPane.showMessageDialog(this, ex);

		}
	}

	public static void main(String[] args) {

		new sea();
	}
}