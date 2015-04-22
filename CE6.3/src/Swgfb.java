import javax.swing.*;

import java.awt.*;
import java.awt.event.*; 
public class Swgfb extends JFrame{
	final int SIZE =5; 
	JTextField[]tfs = new JTextField[SIZE];
	private JPanel pt= new JPanel();
	private JPanel pm= new JPanel();
	private JButton b1,b2,b3,b4,b5;
	public Swgfb(){
		
	
		pt.setLayout(new FlowLayout());
		pm.setLayout(new GridLayout(2,2));
		
		b1= new JButton("1");
		b2= new JButton("2");
		b3= new JButton("3");
		b4= new JButton("4");
		b5= new JButton("5");
		tfs[0]= new JTextField(10);
		tfs[1]= new JTextField(10);
		tfs[2]= new JTextField(10);
		tfs[3]= new JTextField(10);
		tfs[4]= new JTextField(10);
		
		
		
		pt.add(tfs[0]);
		pt.add(tfs[1]);
		pt.add(tfs[2]);
		pt.add(tfs[3]);
		pt.add(tfs[4]);
		pm.add(b1);
		pm.add(b2);
		pm.add(b3);
		pm.add(b4);
		pm.add(b5);
		add(pt, BorderLayout.NORTH);
		add(pm, BorderLayout.CENTER);
		
		setVisible(true);
		setSize(new Dimension(500,500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

