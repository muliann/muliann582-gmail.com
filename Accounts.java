package BankingDemo;

public class Accounts {
	
	private double Balance;
	
	public Accounts(String name, int AccNo, double bal) {
		Balance =bal;
		
		Balance = 0.00;
		
	}
	
	public void deposits(double Amount) {
		Balance = Balance + Amount;
		if(Amount<=0) {
			System.out.println("Invalid amount");
		}
	}
	
	public void Withdrawals(Double Amount) {
		
		Balance = Balance - Amount;
		}
	
public double getBalance() {
		
		return Balance;
	}

		
	
	
}