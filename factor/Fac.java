import java.util.Scanner;
class Fac
{
	public static void main(String args[])
	{
		int rem,div;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter a value");
		int value=sc.nextInt();
		System.out.println("Factorials are:---");
		for(int i=2;i<=9;i++)
		{
 			while(value%i==0)
			{
				System.out.println(i);
				value=value/i;
			}
		}
	}
}
	
			
			
			
