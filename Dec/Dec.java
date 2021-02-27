import java.util.Scanner;
class Dec
{	
	public static void main(String arg[])
	{
	Scanner ob = new Scanner(System.in);
	System.out.println("Enter three number  ");
	int num1=ob.nextInt();
	int num2=ob.nextInt();
	int num3=ob.nextInt();
	int temp;
	if(num2>num1||num3>num1)
	{
		if(num2>num1)
		{
			temp=num1;
			num1=num2;
			num2=temp;
		}
		if(num3>num1)
		{
			temp=num1;
			num1=num3;
			num3=temp;
		}
		if(num3>num2)
		{
			temp=num2;
			num2=num3;
			num3=temp;
		}
	}
		System.out.println("Numbers in Decending order are:- ");
		System.out.println(num1+" "+num2+" "+num3);
	
	}
}
