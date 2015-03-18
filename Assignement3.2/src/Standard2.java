/*
 * Name:Ryan Sullivan
 * Last date modified:3/18/15
 * Description: This program Ask the user to type in a user and password, the program then searches for a match stored in AcctNames and AcctPwords.
 * If a match is found the program will display "Welcome user". Otherwise the program will ask the user to renter the user name and password. If the user gets it 
 * wrong 3 times the program will display "System lock. Please contact Administrator"
 */
import javax.swing.JOptionPane;
public class Standard2 {
		public static void main(String[] args) {
			//initializes variables
			int attempt = 0; //start attempt
			int limit = 2;//number of tries
			//The user names and passwords stored into the system
			String[] AcctNames = {"ryan","Brianna","Shea","Kailee","Kate","Matt"};//The user names stored into the system
			String[] AcctPwords = {"deadbeef","deadbeef","deadbeef","deadbeef","deadbeef","deadbeef"};//The passwords stored into the system
			String username = "";
			String password = "";
			//prompts the user for the user name and password
			username = JOptionPane.showInputDialog("User Name:");
			password = JOptionPane.showInputDialog("Password:");
			while (attempt <= limit) {
				//Call ValidAccount
				if ( ValidAccount ( username, password, AcctNames, AcctPwords) )  {
					//correct user name and password
					JOptionPane.showMessageDialog(null, "Welcome user! ");
					break;//end if program
				} 
				else {
						//wrong user name or password
						JOptionPane.showMessageDialog(null, " Either the username or the password is invalid, please try again.");
						attempt++;//eliminates a try
						if (attempt>limit){
							//when the user has run out of tries
							JOptionPane.showMessageDialog(null, "System locked.Please contact the administrator");
						}
						else{
							// when the user still has some tries left
							username = JOptionPane.showInputDialog("User Name:");
							password = JOptionPane.showInputDialog("Password:");				
							}
				}

			}   
			

			
		}
		
	public static boolean ValidAccount (String username, String password, String [] AcctNames, String [] AcctPasswords) {
	//This part of the program verifies if the user name and password is correct depending whether VAcct is returned as true of false.  
			int ii, Alen;//initializes variable 
			boolean VAcct = false;//value that is returned
			ii=0;
			Alen = AcctNames.length;
			while ( ii<Alen && !VAcct )
				{
				//When the user name and password is correct 
				if ( username.equalsIgnoreCase(AcctNames[ii]) && password.equals(AcctPasswords[ii]) )
					{
					VAcct = true;
					return (VAcct);//user name and password correct
					}
				ii++; //exit from while loop	
				}
			return (VAcct);//when the user name and/or password is determined to be correct or incorrect
		}
}
