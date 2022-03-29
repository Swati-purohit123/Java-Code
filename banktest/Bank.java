package banktest;

public class Bank {
	private String branch;
	private double interstRate;
	private double Balance;
	public String getBranch() {
		return branch;
	}
	public double getInterstRate() {
		return interstRate;
	}
	public void setInterstRate(double interstRate) {
		this.interstRate = interstRate;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double calInterest()
	{
		return 5000;
	}
	public double getBalance() {
		return Balance;
	}
	
	public void setBalance(double balance) {
		// TODO Auto-generated method stub
		this.Balance= balance;
	}
	
	
	
	

}
