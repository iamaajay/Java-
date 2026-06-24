package management.ui;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import management.controller.DB;

public class AddMenteeForm extends JFrame {

	JTextField nameField, courseField, contactField;

	public AddMenteeForm() {
		setTitle("Add Mentee");
		setSize(400, 300);
		setLayout(null);

		JLabel n1 = new JLabel("Name:");
		JLabel n2 = new JLabel("Course:");
		JLabel n3 = new JLabel("Contact:");

		nameField = new JTextField();
		courseField = new JTextField();
		contactField = new JTextField();

		JButton saveBtn = new JButton("Save");

		n1.setBounds(30, 30, 100, 30);
		nameField.setBounds(150, 30, 200, 30);

		n2.setBounds(30, 80, 100, 30);
		courseField.setBounds(150, 80, 200, 30);

		n3.setBounds(30, 130, 100, 30);
		contactField.setBounds(150, 130, 200, 30);

		saveBtn.setBounds(150, 180, 100, 40);

		add(n1);
		add(nameField);
		add(n2);
		add(courseField);
		add(n3);
		add(contactField);
		add(saveBtn);

		saveBtn.addActionListener(e -> saveData());
		setVisible(true);
	}

	private void saveData() {
		try {
			Connection con = DB.getConnection();
			PreparedStatement ps = con.prepareStatement("INSERT INTO data(name, course, contact) VALUES(?,?,?)");

			ps.setString(1, nameField.getText());
			ps.setString(2, courseField.getText());
			ps.setString(3, contactField.getText());

			ps.executeUpdate();

			JOptionPane.showMessageDialog(this, "Mentee Added Successfully!");
			this.dispose();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
