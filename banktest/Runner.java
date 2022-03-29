package banktest;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICIBank icici1 = new ICICIBank();
		icici1.setBranch("chennai");
		icici1.setBalance(10000);
		icici1.setInterstRate(6);
		System.out.println("the interest amount is"+icici1.calInterest());
		Bank bank= new HDFCBank();
		bank.setBranch("pune");
		bank.setBalance(10000);
		bank.setInterstRate(7);
		System.out.println("the interest amount is"+ bank.calInterest());
		Bank bank1 = new ICICIBank();
		System.out.println("the interest amount is"+ bank.calInterest());
	}

}
