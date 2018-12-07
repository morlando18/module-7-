import java.util.Date;

//9.7
public class AccountTest {
	public static void main(String[] args){
		Account account1 = new Account(1122, 20000, 4.5);
		account1.withdraw(2500);
		account1.deposit(3000);
		System.out.println("balance = $" + account1.getBalance() + ", monthly Interest = $" + account1.getMonthlyInterest()
							+ ", date when this account was created: " + account1.getDateCreated() );
	}	
}

class Account{
	private int id ;
	private double balance ;
	private double annualInterestRate ;
	private Date dateCreated;
	
	public Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}
	public Account(int id, double balance, double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate ;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public String getDateCreated() {
		dateCreated = new Date();
		return dateCreated.toString();
	}
	public double getMonthlyInterestRate(double annualInterestRate){
		//return monthly interest RATE
		return annualInterestRate / 12;
	}
	public double getMonthlyInterest(){
		//returns monthly interest 
		return balance * (getMonthlyInterestRate(annualInterestRate) / 100) ;
	}
	public double withdraw(double withdrawed){
		//withdraws a specified amount from the account
		return balance -= withdrawed;
	}
	public double deposit(double deposited){
		//Deposits a specified amount to the account.
		return balance += deposited;
	}
	
}