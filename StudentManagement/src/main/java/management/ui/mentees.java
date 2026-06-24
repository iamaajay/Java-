package management.ui;

import javax.swing.*;

public class mentees extends JFrame {

    public mentees() {
        setTitle("Mentees Management System");
        setSize(400, 300);
        setLayout(null);

        JButton addBtn = new JButton("Add Mentee");
        JButton viewBtn = new JButton("Manage Mentees");

        addBtn.setBounds(100, 80, 200, 40);
        viewBtn.setBounds(100, 140, 200, 40);

        add(addBtn);
        add(viewBtn);

        addBtn.addActionListener(e -> new AddMenteeForm());
        viewBtn.addActionListener(e -> new ViewMenteeForm());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new mentees();
    }
}
