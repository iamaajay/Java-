import javax.swing.*;
import javax.swing.text.JTextComponent;

import java.awt.event.*;
class A1 implements ActionListener
{
	private Object b1;
	private JTextComponent t2;
	private JTextComponent t1;
	private Object b2;
	private JTextComponent t3;
	A1()
	{
JFrame f=new JFrame();
JTextField t1=new JTextField("");
JTextField t2=new JTextField("");
JTextField t3=new JTextField();
JButton b1=new JButton("+");
JButton b2=new JButton("-");
b1.setBounds(40,160,80,25);
b2.setBounds(150,160,80,25);
t1.setBounds(40,40,80,25);
t2.setBounds(40,80,80,25);
t3.setBounds(40,120,80,25);
f.add(b1);
f.add(b2);
f.add(t1);
f.add(t2);
f.add(t3);
f.setSize(600,600);
f.setLayout(null);
f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=t1.getText();
		String s2=t2.getText();
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int c=0;
		if(e.getSource()==b1)
		{
			c=a+b;
		}
		else if(e.getSource()==b2)
		{
			c=a-b;
		}
		String result=String.valueOf(c);
		t3.setText(result);
	}
	public static void main(String...x)
	{
		new A1();
	}
}