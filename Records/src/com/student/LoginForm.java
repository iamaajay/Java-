package com.student;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends JFrame {

	JTextField txtUser;
	JPasswordField txtPass;

	public LoginForm() {

		setTitle("Admin Login");
		setSize(350, 200);
		setLayout(null);

		JLabel l1 = new JLabel("Username");
		l1.setBounds(30, 30, 80, 25);
		add(l1);

		txtUser = new JTextField();
		txtUser.setBounds(120, 30, 150, 25);
		add(txtUser);

		JLabel l2 = new JLabel("Password");
		l2.setBounds(30, 70, 80, 25);
		add(l2);

		txtPass = new JPasswordField();
		txtPass.setBounds(120, 70, 150, 25);
		add(txtPass);

		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(120, 110, 100, 30);
		add(btnLogin);

		btnLogin.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String user = txtUser.getText();
				String pass = String.valueOf(txtPass.getPassword());

				if (user.equals("admin") && pass.equals("admin123")) {

					dispose();

					new StudentRecord();

				} else {

					JOptionPane.showMessageDialog(null, "Invalid Username or Password");
				}
			}
		});

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
