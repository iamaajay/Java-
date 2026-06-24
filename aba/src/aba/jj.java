package aba;

import java.awt.EventQueue;
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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class jj {

	private JFrame frame;
	private JTextField t1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jj window = new jj();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public jj() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 663, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setBounds(92, 105, 117, 40);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_1.setBounds(92, 259, 117, 24);
		frame.getContentPane().add(lblNewLabel_1);

		t1 = new JTextField();
		t1.setBounds(297, 116, 137, 40);
		frame.getContentPane().add(t1);
		t1.setColumns(10);

		p1 = new JPasswordField();
		p1.setBounds(297, 259, 137, 39);
		frame.getContentPane().add(p1);

		JButton b1 = new JButton("Login");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = t1.getText();
				String password = p1.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/login", "root",
							"22031988");
					PreparedStatement ps = con.prepareStatement("Select * from log where name=? and password=?");
					ps.setString(1, name);
					ps.setString(2, password);
					ResultSet rs = ps.executeQuery();
					if (rs.next()) {
						new home();
						JOptionPane.showMessageDialog(null, "Login Successfully");

					} else {
						JOptionPane.showMessageDialog(null, "Login Failed");
						new home();

					}
					con.close();
				} catch (Exception e1) {
					System.out.println(e1);
				}
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 32));
		b1.setBounds(186, 392, 137, 39);
		frame.getContentPane().add(b1);
	}

	protected void dispose() {
		// TODO Auto-generated method stub

	}
}
