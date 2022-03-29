package banktest;

public class HDFCBank extends Bank {
	public double calInterest() 
	{
		return ((getInterstRate()/100)*getBalance());
}



}	
