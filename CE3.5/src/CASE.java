import javax.swing.JOptionPane;
public class CASE {
	public static void main(String[] args){
		String[] Options = { "Admin", "Faculty","Student", "Staff", "Guest"};
		String input = (String) JOptionPane.showInputDialog(null, "Choose account "
				+ "type...","Account Type",JOptionPane.QUESTION_MESSAGE, 
				null,Options,Options[1]);
		
		switch (input){
			case "Admin":
				JOptionPane.showMessageDialog(null, "Welcome "+input);
				break;
			case  "Faculty":
				JOptionPane.showMessageDialog(null, "Welcome "+input);
				break;
			case  "Student":
				JOptionPane.showMessageDialog(null, "Welcome "+input);
				break;
			case  "Staff":
				JOptionPane.showMessageDialog(null, "Welcome "+input);
				break;
			case  "Guest":
				JOptionPane.showMessageDialog(null, "Welcome "+input);
				break;
		
		}
		
	}
}