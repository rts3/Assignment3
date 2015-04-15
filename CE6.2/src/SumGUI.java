
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
public class SumGUI implements ActionListener{
	private JFrame SF;
	private JPanel SP;
	private JLabel SL;
	private JLabel SL2;
	private JTextField ST;
	private JTextField ST2;
	private JButton SB; 
	public SumGUI(){
		//JFrame modifications
		SF= new JFrame("Sum Programm");
		SF.setVisible(true);
		SF.setSize(320,100);
		SF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JPanel modifications
		SP = new JPanel();
		SP.setBackground(Color.RED);
		//JLabel modifications
		SL = new JLabel();
		SL.setText("Enter the numbers");
		SL2 = new JLabel();
		SL2.setText("--------");
		//JTextField modifications
		ST= new JTextField(5);
		ST2 = new JTextField(5);
		//JButton modifications
		SB= new JButton("Add");
		SB.addActionListener(this);
		//Adding the text, buttons, and boxes to the Panel 
		SP.add(SL);
		SP.add(ST);
		SP.add(ST2);
		SP.add(SB);
		SP.add(SL2);
		//Adding the color to the Frame
		SF.add(SP);
	}
	public void actionPerformed(ActionEvent e){
		//Taking the input and converting it into a double
		double num1 =Double.parseDouble(ST.getText());
		double num2 =Double.parseDouble(ST2.getText());
		//creating the sum
		double sum = num1 +num2;
		//displaying the output
		SL2.setText(String.valueOf(sum));
	}
}
