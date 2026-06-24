package com.student;

import javax.swing.JOptionPane;

public record AppLicense() {

	static boolean checkLicense() {
		// TODO Auto-generated method stub
		return false;
	}

	public static void main(String[] args) {

		if (!AppLicense.checkLicense()) {

			JOptionPane.showMessageDialog(null, "Software License Expired!");

			System.exit(0);
		}

		new LoginForm();

	}

}
