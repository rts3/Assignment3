/*
 * Name:Ryan Sullivan
 * Last date modified:3/18/15
 * Description: This program forms like the last one except that program while additionally ask the user which account it would like to use. If the user types 
 * in the user name and password for the right account the program will either display "Welcome Student! You can only read file.","Welcome Staff! You can 
 * update, read, add, delete file.", or "Welcome Admin! You can update and read file.". If the user name and password is wrong three times instead of shutting 
 * down the program will do a loop where it ask the user to chose an account again
 */
import javax.swing.JOptionPane;
public class useraccount2 {
	public static void main(String[] args) {
		//initializes variables
		int attempt = 0;//start attempt
		int limit = 2;//maximun number of tries
		//The variables determines when the program starts and ends
		int account = 0;
		int rerun=1;
		
		
		
		String[] StudentNames = {"Ryan","Brianna","Shea","Kailee","Kate","Matt"};//The user names for students stored into the system
		String[] StaffNames = {"John","Jamie","Chris","Peter","Mark","Dave"};//The user names for staff stored into the system
		String[] FacultyNames = {"Jack","Lois","Shelby","Nancy","Heather","Kathy"};//The user names for faculty stored into the system
		String[] StudentPwords = {"deadbeef","deadbeef","deadbeef","deadbeef","deadbeef","deadbeef"};//The passwords for students stored into the system
		String[] FacultyPwords = {"livebeef","livebeef","livebeef","livebeef","livebeef","livebeef"};	//The passwords for staff stored into the system
		String[] StaffPwords = {"cookedbeef","cookedbeef","cookedbeef","cookedbeef","cookedbeef","cookedbeef"};	//The passwords for faculty stored into the system
		String[] choices = { "Admin", "Student", "Staff"};// the list of accounts the user can pick from
		
		String Uname = "";
		String Pword = "";
		
		
	
	while (account<=rerun){
		if(account<rerun)//when the program starts or when the user has failed three times to enter the user name and password
			{
		
		String input = (String) JOptionPane.showInputDialog(null, "Choose account "
				+ "type...","Account Type",JOptionPane.QUESTION_MESSAGE, 
				null,choices,choices[1]); //opens the choice box and gives the user 3 accounts to choose from
		System.out.println(input);// serves to remind the user of the account he/she has chosen
		Uname = JOptionPane.showInputDialog("User Name:");//stores the user's user name
		Pword = JOptionPane.showInputDialog("Password:");//stores the user's password
			switch (input)//Case depends which account the user chooses
				{
					case "Student"://when the user selects students
				while (attempt <= limit)//
					{
					
					if ( ValidAccount ( Uname, Pword, StudentNames, StudentPwords) )//Call ValidAccount and when the given user name and password is correct 
						{
						JOptionPane.showMessageDialog(null, "Welcome Student! You can only read file.");
						account++;//When the programs loops back to if(account<rerun), the increment ensures that the program choose the last else statement
						break;//end of while statement
						} else//when the user name and/or password is wrong
						{
							JOptionPane.showMessageDialog(null, " Either the username or the password is invalid for an student account.");
							attempt++;// records how many tries the user has used 			
						
						if (attempt>limit)//when the user runs out of tries
							{
								
							attempt=0;//when the programs loops back this reset the original value of attempts	
							break;//end of while statement
							
							}else//when the user has some tries left
								{
								//Re-prompts for the user name and password
								Uname = JOptionPane.showInputDialog("User Name:");
								Pword = JOptionPane.showInputDialog("Password:");
								}
							
						}	
					
				}
				
				break;//End of switch
				
			
			case "Staff"://when the user selects staff	
				while (attempt <= limit) {
					if (ValidAccount ( Uname, Pword, StaffNames, StaffPwords) )//Call ValidAccount and when the given user name and password is correct
						{
						JOptionPane.showMessageDialog(null, "Welcome Staff! You can update, read, add, delete file.");
						account++;//When the programs loops back to if(account<rerun), the increment ensures that the program choose the last else statement
						break;//end of while statement
						} else//when the user name and/or password is wrong
						{
							JOptionPane.showMessageDialog(null, " Either the username or the password is invalid for an Staff account.");
							attempt++;// records how many tries the user has used 			
						
						if (attempt>limit)//when the user runs out of tries
							{
								
							attempt=0;//when the programs loops back this reset the original value of attempts	
							break;//end of while statement
							
							}else//when the user has some tries left
								{
								//Re-prompts for the user name and password
								Uname = JOptionPane.showInputDialog("User Name:");
								Pword = JOptionPane.showInputDialog("Password:");
								}
						}	
				}
				
				break;//End of switch
			
			case "Admin"://when the user selects Admin
				while (attempt <= limit) {
					if (ValidAccount ( Uname, Pword, FacultyNames, FacultyPwords ))//Call ValidAccount and when the given user name and password is correct
						{
						JOptionPane.showMessageDialog(null, "Welcome Admin! You can update and read file.");
						account++;//When the programs loops back to if(account<rerun), the increment ensures that the program choose the last else statement
						break;//end of while statement
						} else//when the user name and/or password is wrong
						{
							JOptionPane.showMessageDialog(null, " Either the username or the password is invalid for an admin account.");
							attempt++;// records how many tries the user has used 			
						
						if (attempt>limit)//when the user runs out of tries
							{
								
							attempt=0;//when the programs loops back this reset the original value of attempts	
							break;//end of while statement
							
							}else//when the user has some tries left
								{
								//Re-prompts for the user name and password
								Uname = JOptionPane.showInputDialog("User Name:");
								Pword = JOptionPane.showInputDialog("Password:");
								}
						}	
				}
				
				break;//End of switch
		}
				
		}
		
		else//When the user has typed in the right user name and password for the right account
		{
			break;//ends the while loop
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
				return (VAcct);//when the user name and/or password is wrong
			}
}
