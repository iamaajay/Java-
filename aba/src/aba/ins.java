package aba;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ins {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JPasswordField t3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ins window = new ins();
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
	public ins() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 672, 623);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		t1 = new JTextField();
		t1.setBounds(139, 104, 203, 37);
		frame.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setBounds(139, 190, 203, 37);
		frame.getContentPane().add(t2);
		t2.setColumns(10);

		t3 = new JPasswordField();
		t3.setBounds(139, 292, 203, 37);
		frame.getContentPane().add(t3);

		JButton btnNewButton = new JButton("save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String name = t2.getText();
				String password = t3.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/college", "root",
							"22031988");
					PreparedStatement ps = con.prepareStatement("Insert into student(id,name,password) values(?,?,?)");
					ps.setString(1, id);
					ps.setString(2, name);
					ps.setString(3, password);
					int i = ps.executeUpdate();
					if (i > 0) {
						JOptionPane.showMessageDialog(btnNewButton, "Data save Successfully");
					} else {
						JOptionPane.showMessageDialog(btnNewButton, "Failed to Save Data");
					}
					con.close();
				} catch (Exception e1) {
					System.out.println(e1);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(154, 431, 164, 50);
		frame.getContentPane().add(btnNewButton);
	}
}
