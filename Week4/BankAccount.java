
//*******************************************************
//BankAccount.java
//Author: Adam Carpenter
//Class: CSC100AB
//Date: 6/20/19
//A bank account class with methods to deposit to, withdraw from,
//change the name on, charge a fee to, and return a string
//representation of the account.
//*******************************************************

public class BankAccount
{
	private int acctNum;
	private String name;
	private double balance;
	
/*
The BankAccount default or no-arg constructor. Initializes 
instance variables
*/
	public BankAccount()
	{
		balance = 0;
		name = "unknown";
		acctNum = 0;
	}
	
	/*
	 ADD below The BankAccount constructor with parameters. Initializing 
	instance variables to the corresponding values
	*/
	public BankAccount(int aNum, String aName, double amount) {
		acctNum = aNum;
		name = aName;
		balance = amount;
	}
	

	
	
/*
The setAcctNum method stores a value in the
acctNum variable.
@param aNum The value used to set acctNum
 */
	public void setAcctNum(int aNum) {
		acctNum = aNum;
	}

/*
The setName method stores a value in the
 name field.
@param aName The value used to set name
 */

	public void setName(String aName) {
		name = aName;
	}
	   
/*
The getAcctNum method returns the value of
BankAccount object's instance variable acctNum.
@return the value in the acctNum.
*/

	public int getAcctNum() {
		return acctNum;
	}

/*
The getName method returns the name of
BankAccount object's instance variable name.
@return The value in the name variable.
 */

	public String getName() {
		return name;
	}

/*
The getBalance method returns a BankAccount
object's balance instance variable.
 @return The value in the balance instance variable.
 */
	   
	  public double getBalance()
	  {
	     return balance;
	  }

	  
/*
The deposit method adds amount to the 
balance 
*/		
	public void deposit(double amount) {
		balance += amount;
	}
	
/*
The withdraw checks to see if balance is 
sufficient for withdrawal.If so, decrement 
balance by amount; if not prints message. 
 */

	public void withdraw(double amount) {
		if (balance-amount >= 0) {
			balance -= amount;
		} else {
			System.out.println("Not enough balance to withdraw that amount ($" + amount + ")");
		}
	}

		
/*
Returns a string containing the name, account number, and balance
*/
	public String toString()
	{
		return 
			  "\tName: " + name +
			  "\n\tAccount Number: " + acctNum +
			  "\n\tBalance: " + balance;  
	}
		
			
}
