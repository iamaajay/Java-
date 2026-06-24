package call;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JSlider;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class NNN {

	private JFrame frame;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NNN window = new NNN();
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
	public NNN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 627);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton R1 = new JRadioButton("MALE");
		R1.setEnabled(false);
		R1.setBounds(76, 57, 103, 21);
		frame.getContentPane().add(R1);
		
		JRadioButton R2 = new JRadioButton("FEMALE");
		R2.setSelected(true);
		R2.setBounds(76, 104, 103, 21);
		frame.getContentPane().add(R2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(261, 102, 138, 151);
		frame.getContentPane().add(textArea);
		
		JSlider slider = new JSlider();
		slider.setBounds(47, 204, 200, 26);
		frame.getContentPane().add(slider);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(273, 57, 153, 35);
		frame.getContentPane().add(passwordField);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(119, 27, 93, 21);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JMenu mnNewMenu = new JMenu("COUNTRY");
		mnNewMenu.setBounds(47, 0, 115, 26);
		frame.getContentPane().add(mnNewMenu);
		
		JMenuItem J1 = new JMenuItem("INDIA");
		J1.setBounds(0, 10, 135, 26);
		frame.getContentPane().add(J1);
		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		mnNewMenu_1.setBounds(34, 344, 115, 26);
		frame.getContentPane().add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("GOA");
		mntmNewMenuItem.setBounds(58, 391, 77, 26);
		frame.getContentPane().add(mntmNewMenuItem);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem = new JRadioButtonMenuItem("New radio item");
		rdbtnmntmNewRadioItem.setBounds(226, 477, 133, 26);
		frame.getContentPane().add(rdbtnmntmNewRadioItem);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_1 = new JRadioButtonMenuItem("New radio item");
		rdbtnmntmNewRadioItem_1.setBounds(114, 524, 133, 26);
		frame.getContentPane().add(rdbtnmntmNewRadioItem_1);
	}
}
