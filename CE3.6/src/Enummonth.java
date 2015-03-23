import javax.swing.JOptionPane;


public class Enummonth {
	enum monthchoice {December,January,Febuary,March,April,May,June,July,August,September,October,November};
	public static void main(String[] args){
		monthchoice [] Month = {monthchoice.December,monthchoice.January,monthchoice.Febuary,monthchoice.March,monthchoice.April,monthchoice.May,monthchoice.June,
				monthchoice.July,monthchoice.August,monthchoice.September,monthchoice.October,monthchoice.November};
		while (true){
			monthchoice choice = (monthchoice)JOptionPane.showInputDialog(null,"Select Your month","Month", JOptionPane.QUESTION_MESSAGE,null,Month,
					Month[11].equals(JOptionPane.CANCEL_OPTION));
			switch(choice){
			case December:
				JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
				break;
			case January:
				JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
				break;
			case Febuary:
				JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
				break;
			case March:
				JOptionPane.showMessageDialog(null, "Happy Spring days!");
				break;
			case April:
				JOptionPane.showMessageDialog(null, "Happy Spring days!");
				break;
			case May:
				JOptionPane.showMessageDialog(null, "Happy Spring days!");
				break;
			case June:
				JOptionPane.showMessageDialog(null, "It’s a summer time.");
				break;
			case July:
				JOptionPane.showMessageDialog(null, "It’s a summer time.");
				break;
			case August:
				JOptionPane.showMessageDialog(null, "It’s a summer time.");
				break;
			case September:
				JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
				break;
			case October:
				JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
				break;
			case November:
				JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "That choice is invalid");
				break;
		}
	}
	}
}
