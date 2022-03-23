import java.util.Scanner;

public class FloatingPointNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a floating point number:");
		double num1= sc.nextDouble();
		System.out.print("Enter another Floating point number:");
		double num2 =sc.nextDouble();
		num1= Math.round(num1*1000);
		num1=num1/1000;
		num2= Math.round(num2*1000);
		num2=num2/1000;
		if (num1 == num2)  {
		     System.out.println("These numbers are the same."); 
		}
		 else {
		     System.out.println("These numbers are different."); 
		 }
	}

}
