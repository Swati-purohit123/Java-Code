import java.util.Scanner;

public class CircleInMethod {
	static double radius;
	static final double pi= 3.14;
	public double calculateArea(double radius)
	{
		return(Math.PI * radius * radius);
	}
	public double calculatePeriMeter(double radius)
	{
		return(2* Math.PI *radius);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleInMethod circle=new CircleInMethod();
		System.out.print("Enter the radius");
		Scanner sc= new Scanner(System.in);
		radius= sc.nextDouble();
		System.out.println("area of circle is:"+circle.calculateArea(radius));
		System.out.println("perimeter of circle is:"+circle.calculatePeriMeter(radius));
	}

}
