package banktest;

public class ICICIBank extends Bank {
	public double calInterest() {
		return ((getInterstRate()/100)*getBalance());
	}
		


}
