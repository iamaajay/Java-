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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SAVEDATA1 {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JPasswordField p1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SAVEDATA1 window = new SAVEDATA1();
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
	public SAVEDATA1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 561, 554);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		t1 = new JTextField();
		t1.setBounds(200, 95, 96, 18);
		frame.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setBounds(200, 158, 96, 18);
		frame.getContentPane().add(t2);
		t2.setColumns(10);

		p1 = new JPasswordField();
		p1.setBounds(200, 230, 88, 18);
		frame.getContentPane().add(p1);

		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String name = t2.getText();
				String password = p1.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/college", "root",
							"22031988");
					PreparedStatement ps = con.prepareStatement("insert into student(id,name,password) values(?,?,?)");
					ps.setString(1, id);
					ps.setString(2, name);
					ps.setString(3, password);
					int i = ps.executeUpdate();
					if (i > 0) {
						JOptionPane.showMessageDialog(null, "Data save Successfully");
					} else {
						JOptionPane.showMessageDialog(null, "Data save Failed TryAgain");
					}
					con.close();
				} catch (Exception e1) {
					System.out.println(e1);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton.setBounds(131, 345, 126, 40);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("New labIDel");
		lblNewLabel.setBounds(44, 98, 44, 12);
		frame.getContentPane().add(lblNewLabel);

		lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setBounds(44, 161, 44, 12);
		frame.getContentPane().add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setBounds(44, 244, 44, 12);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
