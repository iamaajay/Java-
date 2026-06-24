package mcastudent;

import java.awt.Color;
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

public class mca extends JFrame implements ActionListener {

	JLabel l1, l2, l3, l4, l5, l6, l7;
	JTextField t1, t2, t3, t4, t5, t6, t7;

	JButton saveBtn, updateBtn, deleteBtn, searchBtn;

	Connection con;
	PreparedStatement pst;

	mca() {
		setBackground(new Color(240, 240, 240));
		setFont(new Font("Dialog", Font.BOLD, 30));

		setTitle("ABES ENGINEERING COLLEGE");
		setSize(610, 566);

		// Labels
		l1 = new JLabel("Admission No");
		l1.setBounds(27, 4, 261, 42);
		l1.setFont(new Font("Tahoma", Font.BOLD, 25));
		l2 = new JLabel("Student Name");
		l2.setBounds(27, 54, 261, 42);
		l2.setFont(new Font("Tahoma", Font.BOLD, 25));
		l3 = new JLabel("Father Name");
		l3.setBounds(27, 106, 261, 42);
		l3.setFont(new Font("Tahoma", Font.BOLD, 25));
		l4 = new JLabel("Mother Name");
		l4.setBounds(27, 158, 261, 42);
		l4.setFont(new Font("Tahoma", Font.BOLD, 25));
		l5 = new JLabel("Roll No");
		l5.setBounds(27, 210, 261, 42);
		l5.setFont(new Font("Tahoma", Font.BOLD, 25));
		l6 = new JLabel("Mobile No");
		l6.setBounds(27, 262, 261, 42);
		l6.setFont(new Font("Tahoma", Font.BOLD, 25));
		l7 = new JLabel("Address");
		l7.setBounds(27, 314, 261, 42);
		l7.setFont(new Font("Tahoma", Font.BOLD, 25));

		// TextFields
		t1 = new JTextField();
		t1.setBounds(298, 2, 288, 42);
		t2 = new JTextField();
		t2.setBounds(298, 54, 288, 42);
		t3 = new JTextField();
		t3.setBounds(298, 106, 288, 42);
		t4 = new JTextField();
		t4.setBounds(298, 158, 288, 42);
		t5 = new JTextField();
		t5.setBounds(298, 210, 288, 42);
		t6 = new JTextField();
		t6.setBounds(298, 262, 288, 42);
		t7 = new JTextField();
		t7.setBounds(298, 314, 288, 42);

		// Buttons
		saveBtn = new JButton("SAVE");
		saveBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		saveBtn.setBounds(0, 366, 288, 42);
		updateBtn = new JButton("UPDATE");
		updateBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		updateBtn.setBounds(298, 366, 288, 42);
		deleteBtn = new JButton("DELETE");
		deleteBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		deleteBtn.setBounds(0, 418, 288, 42);
		searchBtn = new JButton("SEARCH");
		searchBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		searchBtn.setBounds(298, 418, 288, 42);
		getContentPane().setLayout(null);

		// Add Components
		getContentPane().add(l1);
		getContentPane().add(t1);
		getContentPane().add(l2);
		getContentPane().add(t2);
		getContentPane().add(l3);
		getContentPane().add(t3);
		getContentPane().add(l4);
		getContentPane().add(t4);
		getContentPane().add(l5);
		getContentPane().add(t5);
		getContentPane().add(l6);
		getContentPane().add(t6);
		getContentPane().add(l7);
		getContentPane().add(t7);

		getContentPane().add(saveBtn);
		getContentPane().add(updateBtn);
		getContentPane().add(deleteBtn);
		getContentPane().add(searchBtn);

		// Action Listener
		saveBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		searchBtn.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	// Database Connection
	public Connection getConnection() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/studentdb", "root", "22031988");

		} catch (Exception e) {

			JOptionPane.showMessageDialog(this, e);
		}

		return con;
	}

	public void actionPerformed(ActionEvent e) {

		// SAVE DATA
		if (e.getSource() == saveBtn) {

			try {

				con = getConnection();

				pst = con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");

				pst.setString(1, t1.getText());
				pst.setString(2, t2.getText());
				pst.setString(3, t3.getText());
				pst.setString(4, t4.getText());
				pst.setString(5, t5.getText());
				pst.setString(6, t6.getText());
				pst.setString(7, t7.getText());

				pst.executeUpdate();

				JOptionPane.showMessageDialog(this, "Data Saved Successfully");

				con.close();

			} catch (Exception ex) {

				JOptionPane.showMessageDialog(null, ex);
			}
		}

		// UPDATE DATA
		if (e.getSource() == updateBtn) {

			try {

				con = getConnection();

				pst = con.prepareStatement(
						"update student set sname=?,fname=?,mname=?,rollno=?,mobile=?,address=? where admissionno=?");

				pst.setString(1, t2.getText());
				pst.setString(2, t3.getText());
				pst.setString(3, t4.getText());
				pst.setString(4, t5.getText());
				pst.setString(5, t6.getText());
				pst.setString(6, t7.getText());
				pst.setString(7, t1.getText());

				pst.executeUpdate();

				JOptionPane.showMessageDialog(this, "Data Updated Successfully");

				con.close();

			} catch (Exception ex) {

				JOptionPane.showMessageDialog(this, ex);
			}
		}

		// DELETE DATA
		if (e.getSource() == deleteBtn) {

			try {

				con = getConnection();

				pst = con.prepareStatement("delete from student where admissionno=?");

				pst.setString(1, t1.getText());

				pst.executeUpdate();

				JOptionPane.showMessageDialog(this, "Data Deleted Successfully");

				con.close();

			} catch (Exception ex) {

				JOptionPane.showMessageDialog(this, ex);
			}
		}

		// SEARCH DATA
		if (e.getSource() == searchBtn) {

			try {

				con = getConnection();

				pst = con.prepareStatement("select * from student where admissionno=?");

				pst.setString(1, t1.getText());

				ResultSet rs = pst.executeQuery();

				if (rs.next()) {

					t2.setText(rs.getString("sname"));
					t3.setText(rs.getString("fname"));
					t4.setText(rs.getString("mname"));
					t5.setText(rs.getString("rollno"));
					t6.setText(rs.getString("mobile"));
					t7.setText(rs.getString("address"));

					JOptionPane.showMessageDialog(this, "Record Found");

				} else {

					JOptionPane.showMessageDialog(this, "Record Not Found");
				}

				con.close();

			} catch (Exception ex) {

				JOptionPane.showMessageDialog(this, ex);
			}
		}
	}

	public static void main(String[] args) {

		new mca();
	}
}