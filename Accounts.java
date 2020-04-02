package BankingDemo;

public class Accounts {
	private double Balance;

	public void Account() {
		Balance = 100;
	}
	
	public void deposits(double Amount) {
		Balance = Balance + Amount;
	}
	
	public void Withdrawals(Double Amount) {
		
		Balance = Balance - Amount;
		
		if(Balance >= Amount) {
			Balance = Balance - Amount;
		}
		
		else {
			System.err.println("Transaction cancelled!");
		}
		
		}
	
	public double getBalance() {
		return Balance;
	}

	
}
