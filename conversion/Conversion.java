import java.util.Scanner;
class Conversion
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value in meter \n");
		Double meters = sc.nextDouble();
		Double feet=3.28*meters;
		System.out.println("The value in feet: "+feet);
	}
		
}
