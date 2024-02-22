
public class Account {
	private double balance;
	private String accountNumber;

    public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

   
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


    //Getter used to retreive balance 
    public double getBalance() {
        return balance;
    }


    public String getAccountNumber() {
        return accountNumber;
    }


    public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


    //Method used to increase balance amount
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }
    // Decreases the balance by amount
    public void withdraw(double amount) {
        if(amount>0) {
            balance -= amount;
        }
    }

    //Getter used to active account
    public double getActive() {
        return active;
    }


    //Getter used to suspend
    public double getSuspend() {
        return suspend;
    }

    //Getter used to close
    public double getClose() {
        return close;
    }


    public void mergeAccount(Account myAccount) {
		if(this.getAccountNumber().equals(myAccount.getAccountNumber())) {
			this.balance += myAccount.getBalance();
		}
	}	
	



}

