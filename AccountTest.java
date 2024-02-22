public class AccountTest(){

	public static void main (String[] args){

         // Execute test methods
        testAccountCreation();
        testToString();
    }


      /*
	 * Test methods 
	 */
	private static void testAccountCreation() {
		System.out.println("-->testAccountCreation() ");
		Account myAccount = new Account("1234", 10000.0); //set acct to active state
        myAccount.activate(); // displays "Account is already activated!"
		System.out.println("balance should be $1000, balance=$" + a1.getBalance());

	}

	private static void testToString() {
		System.out.println("-->testToString()");
		System.out.println("Account is activated!=" + myAccount);
	}


    //Deposit to the account
    private static void testDeposit() {
		System.out.println("-->testDeposit()");
		Account myAccount  = new Account(1000.0);
		myAccount .deposit(500.0);
		System.out.println("balance should be $1500, balance=$" + myAccount .getBalance());
	}

	private static void testDepositWithNegativeAmount() {
		System.out.println("-->testDepositWithNegativeAmount()");
		Account myAccount  = new Account(1000.0);
		myAccount .deposit(-500.0);
		System.out.println("balance should be $1000, balance=$" + myAccount .getBalance());
	}

	private static void testMultipleDeposits() {
		System.out.println("-->testMultipleDeposits()");
		Account myAccount  = new Account(1000.0);
		myAccount .deposit(500.0);
		myAccount .deposit(300.0);
		System.out.println("balance should be $1800, balance=$" + myAccount .getBalance());
	}

	private static void testWithdraw() {
		System.out.println("-->testWithdraw()");
		Account myAccount  = new Account(1000.0);
		myAccount .withdraw(600.0);
		System.out.println("balance should be $400, balance=$" + myAccount .getBalance());
	}



}

