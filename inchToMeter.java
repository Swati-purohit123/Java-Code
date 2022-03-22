import java.util.Scanner;

public class inchToMeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("Enter length in ");
		double inch= in.nextDouble();
		double meters = inch* 0.0254;
		System.out.print(inch + "inch is" + meters+ "meters");
	}

}
