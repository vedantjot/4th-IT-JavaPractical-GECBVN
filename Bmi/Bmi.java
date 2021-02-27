import java.util.Scanner;
class Bmi
{
	public static void main(String arg[])
	{
	Scanner ob = new Scanner(System.in);
	System.out.println("Enter the weight in pounds:");
	Double weight=ob.nextDouble();
	System.out.println("Enter the height in inches");
	Double height=ob.nextDouble();
	Double wik=weight*0.45359237;
	Double him=height*0.254;
	Double BMI=wik/(him*him);
	System.out.println("BMI is:"+BMI);
	}
}

