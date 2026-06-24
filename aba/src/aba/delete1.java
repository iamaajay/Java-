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
import javax.swing.JTextField;

public class delete1 {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					delete1 window = new delete1();
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
	public delete1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 606, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		t1 = new JTextField();
		t1.setBounds(179, 120, 179, 47);
		frame.getContentPane().add(t1);
		t1.setColumns(10);

		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/college", "root",
							"22031988");
					PreparedStatement ps = con.prepareStatement("Delete from student where id=?");
					ps.setString(1, id);
					int i = ps.executeUpdate();
					if (1 > 0) {
						JOptionPane.showMessageDialog(null, "Data Delete Successfully");
					} else {
						JOptionPane.showMessageDialog(null, "Data Not Delete TryAgain");
					}
					con.close();
				} catch (Exception e1) {
					System.out.println(e1);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(169, 276, 167, 60);
		frame.getContentPane().add(btnNewButton);
	}

}
