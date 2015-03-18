import javax.swing.JOptionPane;
public class Size {
	public static void main(String[] args) {	
	String path = JOptionPane.showInputDialog("Please select which version of the program you want. 1 or 2");
	int path2 = Integer.parseInt(path);
	if(path2 == 1){
		int numPeople2,groupSize;
		String numPeople;
		numPeople="";
		numPeople = JOptionPane.showInputDialog("Please enter the number people in your group");
		numPeople2=Integer.parseInt(numPeople);
		if(numPeople2>10){
			groupSize=numPeople2/2;	
			JOptionPane.showMessageDialog(null,"Number of people:"+ numPeople2+" Group size"+groupSize);
			}
		else if ((numPeople2<=10)&&(numPeople2>=3)){
			groupSize=numPeople2/3;
			JOptionPane.showMessageDialog(null, "Number of people:"+ numPeople2+" Group size"+groupSize);
			}
		else{
			JOptionPane.showMessageDialog(null,"The number of people has to be at least 3");

			}
		

		}
	else if(path2 == 1){
		int numPlayers2,teamSize;
		String numPlayers;
		numPlayers="";
		numPlayers = JOptionPane.showInputDialog("Please enter the number players in your group");
		numPlayers2=Integer.parseInt(numPlayers);
		if ((numPlayers2<=55)&&(numPlayers2>=11)){
			teamSize=numPlayers2/11;
			JOptionPane.showInputDialog(null,"Number of players:"+ numPlayers2+" Team Size size"+teamSize);
			}
		else{
			teamSize=1;
			JOptionPane.showMessageDialog(null,"Number of players:"+ numPlayers2+" Team Size size"+teamSize);
			}
		}	
	else{	
		JOptionPane.showMessageDialog(null,"Invalid choice");
		}
	}
}

