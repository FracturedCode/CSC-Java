
/*
***********************************************************
BankTester.java
Author: Adam Carpenter
Class: CSC100AB
Date: 6/20/19
Use BankAccount class to create and manage Henry's and Joe's
bank accounts. Complete code in this class. Use comments as
your guide. Check out the expected output at the bottom. 

************************************************************/
public class BankTester
{
	public static void main(String[] args)
	{
	  
	 System.out.println(" Welcome to the Bank ");
		BankAccount acct1;  // Creating a reference/pointer to BankAccount object
                            //no objects exist yet only the reference variable acct1
		BankAccount acct2;  // creating  a reference/pointer to another BankAccount object
                            //no object exist yet only the reference variable acct2

	//create BankAccount object using the default constructor refer to by acct1
	acct1 = new BankAccount();
	
	
	//create BankAccount object using constructor with parameters 
	//(overloaded constructor) refer to by acct2
	//use acctNum as 3567, name as "Henry" and balance of 10000
	acct2 = new BankAccount(3567, "Henry", 10000);
	
	
	//Display summaries (state) of both the objects
	System.out.println("acct1 summary:\n" + acct1.toString() + "\n");
	System.out.println("acct2 summary:\n" + acct2.toString() + "\n");
	
	
	//set the name of acct1 to Joe, acct number to 2345 and deposits $400
	//invoke setName, setAcctNumber and deposit methods of acct1 object
	acct1.setName("Joe");
	acct1.setAcctNum(2345);
	acct1.deposit(400);

	
	//deposit $500 to acct1 object
	acct1.deposit(500);
	
	//withdraw $200 from acct2 object 
	acct2.withdraw(200);
	
	//print acct1's new balance (use getBalance())
	System.out.println("acct1 balance: " + acct1.getBalance());
	
	
	//print summaries of both objects refer to by acct1 and acct2 
	//reference variables.
	System.out.println("acct1 summary:\n" + acct1.toString() + "\n");
	System.out.println("acct2 summary:\n" + acct2.toString());
	
	
	
	}
}

/*
 * Expected output

Welcome to the Bank 
	acct1 summary:
Name: unknown
Account Number: 0
Balance: 0.0
	acct2 Summary: 
Name: Henry
Account Number: 3567
Balance: 10000.0

acct1 Balance: 900.0

	acct1 summary:
Name: Joe
Account Number: 2345
Balance: 900.0
	acct2 Summary: 
Name: Henry
Account Number: 3567
Balance: 9800.0


 */
