package management.ui;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import management.controller.DB;

public class UpdateMenteeForm extends JFrame {

	JTextField nameField, courseField, contactField;
	int menteeId;
	ViewMenteeForm parent;

	public UpdateMenteeForm(int id, String name, String course, String contact, ViewMenteeForm parent) {

		this.menteeId = id;
		this.parent = parent;

		setTitle("Update Mentee");
		setSize(400, 300);
		setLayout(null);

		JLabel n1 = new JLabel("Name:");
		JLabel n2 = new JLabel("Course:");
		JLabel n3 = new JLabel("Contact:");

		nameField = new JTextField(name);
		courseField = new JTextField(course);
		contactField = new JTextField(contact);

		JButton updateBtn = new JButton("Update");

		n1.setBounds(30, 30, 100, 30);
		nameField.setBounds(150, 30, 200, 30);

		n2.setBounds(30, 80, 100, 30);
		courseField.setBounds(150, 80, 200, 30);

		n3.setBounds(30, 130, 100, 30);
		contactField.setBounds(150, 130, 200, 30);

		updateBtn.setBounds(150, 180, 100, 40);

		add(n1);
		add(nameField);
		add(n2);
		add(courseField);
		add(n3);
		add(contactField);
		add(updateBtn);

		updateBtn.addActionListener(e -> updateData());
		setVisible(true);
	}

	private void updateData() {
		try {
			Connection con = DB.getConnection();
			PreparedStatement ps = con.prepareStatement("UPDATE mentees SET name=?, course=?, contact=? WHERE id=?");

			ps.setString(1, nameField.getText());
			ps.setString(2, courseField.getText());
			ps.setString(3, contactField.getText());
			ps.setInt(4, menteeId);

			ps.executeUpdate();

			JOptionPane.showMessageDialog(this, "Updated Successfully!");
			parent.refreshTable();
			this.dispose();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
