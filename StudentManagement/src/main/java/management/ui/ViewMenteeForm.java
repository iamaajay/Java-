package management.ui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import management.controller.DB;

public class ViewMenteeForm extends JFrame {

	JTable table;
	DefaultTableModel model;

	public ViewMenteeForm() {
		setTitle("Manage Mentees");
		setSize(700, 400);

		model = new DefaultTableModel(new String[] { "ID", "Name", "Course", "Contact" }, 0);
		table = new JTable(model);

		loadData();

		JButton updateBtn = new JButton("Update");
		JButton deleteBtn = new JButton("Delete");

		updateBtn.setBounds(150, 320, 100, 30);
		deleteBtn.setBounds(300, 320, 100, 30);

		setLayout(null);

		JScrollPane sp = new JScrollPane(table);
		sp.setBounds(20, 20, 650, 280);

		add(sp);
		add(updateBtn);
		add(deleteBtn);

		updateBtn.addActionListener(e -> openUpdateForm());
		deleteBtn.addActionListener(e -> deleteRecord());

		setVisible(true);
	}

	private void loadData() {
		model.setRowCount(0);
		try {
			Connection con = DB.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM mentees");

			while (rs.next()) {
				model.addRow(new Object[] { rs.getInt("id"), rs.getString("name"), rs.getString("course"),
						rs.getString("contact") });
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void openUpdateForm() {
		int row = table.getSelectedRow();
		if (row == -1) {
			JOptionPane.showMessageDialog(this, "Select a row to update.");
			return;
		}

		int id = (int) table.getValueAt(row, 0);
		String name = (String) table.getValueAt(row, 1);
		String course = (String) table.getValueAt(row, 2);
		String contact = (String) table.getValueAt(row, 3);

		new UpdateMenteeForm(id, name, course, contact, this);
	}

	private void deleteRecord() {
		int row = table.getSelectedRow();
		if (row == -1) {
			JOptionPane.showMessageDialog(this, "Select a row to delete.");
			return;
		}

		int id = (int) table.getValueAt(row, 0);

		int confirm = JOptionPane.showConfirmDialog(this, "Delete this mentee?");
		if (confirm != JOptionPane.YES_OPTION)
			return;

		try {
			Connection con = DB.getConnection();
			PreparedStatement ps = con.prepareStatement("DELETE FROM mentees WHERE id=?");
			ps.setInt(1, id);
			ps.executeUpdate();

			JOptionPane.showMessageDialog(this, "Deleted Successfully!");
			loadData();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void refreshTable() {
		loadData();
	}
}
