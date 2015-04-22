
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
public class ScoreGui extends JFrame implements ActionListener{
	//initialize the variables
	final int SIZE =9; 
	JTextField[]TFS = new JTextField[SIZE];
	JLabel[] LN = new JLabel[SIZE];
	JPanel PS = new JPanel();
	JPanel PB = new JPanel();
	JButton AB = new JButton("Get Average");
	
	double [] TS= new double[SIZE]; 
	double [] TW= new double[SIZE];
	/**
	 * Construct the graphic user interface for the program
	 */
	public ScoreGui(){
		
		 // All JLabel Objects.
		LN[0]= new JLabel("Test 1: ");
		LN[1]= new JLabel("Test 2: ");
		LN[2]= new JLabel("Test 3: ");
		LN[3]= new JLabel("Test 4: ");
		LN[4]= new JLabel("Weight of Test 1: ");
		LN[5]= new JLabel("Weight of Test 2: ");
		LN[6]= new JLabel("Weight of Test 3: ");
		LN[7]= new JLabel("Weight of Test 4: ");
		LN[8]= new JLabel("Average");
		
		setLayout(new GridLayout(7,3));
		
		//
		for(int i=0; i<SIZE; i++){
			PS.add(LN[i]);
			TFS[i]= new JTextField(10);
			PS.add(TFS[i]);
			
		}
		
		PB.setBackground(Color.GREEN);
		AB.addActionListener(this);
		PB.add(AB);
		
		add(PS,BorderLayout.CENTER);
		add(PB,BorderLayout.SOUTH);
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
	}
	
	@Override
	/**
	 * Calculate the average of the given input(the grade of the test, and the weight of the test
	 */
	public void actionPerformed(ActionEvent e)
	 {
		//initialize Average variables, converts the input values to double, and calculates the average and displays it 
		double Average;
		TS[0]=Double.parseDouble(TFS[0].getText());
		TS[1]=Double.parseDouble(TFS[1].getText());
		TS[2]=Double.parseDouble(TFS[2].getText());
		TS[3]=Double.parseDouble(TFS[3].getText());
		TS[4]=Double.parseDouble(TFS[4].getText());
		TS[5]=Double.parseDouble(TFS[5].getText());
		TS[6]=Double.parseDouble(TFS[6].getText());
		TS[7]=Double.parseDouble(TFS[7].getText());
		Average = TS[0]*TS[4]+TS[1]*TS[5]+TS[2]*TS[6]+TS[3]*TS[7];
		TFS[8].setText(""+Average);
		
	
	 }
}
