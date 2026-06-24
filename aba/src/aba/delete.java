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
import javax.swing.JTextField;

public class delete extends JFrame implements ActionListener {

	JLabel l1;
	JTextField t1;
	JButton b1;

	Connection con;
	PreparedStatement pst;

	delete() {

		// Frame
		setTitle("Delete Record");
		setSize(400, 200);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Label
		l1 = new JLabel("Enter ID to Delete:");
		l1.setBounds(50, 40, 150, 30);
		add(l1);

		// TextField
		t1 = new JTextField();
		t1.setBounds(180, 40, 120, 30);
		add(t1);

		// Button
		b1 = new JButton("Delete");
		b1.setBounds(130, 100, 100, 30);
		b1.addActionListener(this);
		add(b1);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		try {

			// Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Database Connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/college", "root", "22031988");

			// Delete Query
			String sql = "DELETE FROM student WHERE id=?";

			pst = con.prepareStatement(sql);

			pst.setInt(1, Integer.parseInt(t1.getText()));

			int rows = pst.executeUpdate();

			if (rows > 0) {
				JOptionPane.showMessageDialog(this, "Record Deleted Successfully");
			} else {
				JOptionPane.showMessageDialog(this, "Record Not Found");
			}

			con.close();

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex);
		}
	}

	public static void main(String[] args) {
		new delete();
	}
}