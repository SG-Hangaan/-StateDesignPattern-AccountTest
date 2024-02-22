public class AccountTest {
    public static void main(String[] args) {

        Account myAccount = new Account("1234", 10000.0);
        
        myAccount.activate();
        //  "Account is already activated!"
        
        myAccount.suspend();
        //  "Account is suspended!"

        myAccount.activate();
        // "Account is activated!"

        /
        myAccount.deposit(1000.0);
        // update balance and displays account number and
        // current balance. Call the toString() method in deposit().

       
        myAccount.withdraw(100.0);// update balance and displays account number and
        // current balance. Call the toString() method in deposit().
        
        myAccount.close();

        myAccount.activate();
        //  "You cannot activate a closed account!"

        myAccount.suspend();
        // "You cannot suspend a closed account!"

        myAccount.withdraw(500.0);
        // "You cannot withdraw on a closed account!". Call the toString()
        // to show current balance and account number.

        myAccount.deposit(1000.0);
        // "You cannot deposit on closed
        // account displays account!". Call the toString() to show current balance and
        // account number.
    }
}
