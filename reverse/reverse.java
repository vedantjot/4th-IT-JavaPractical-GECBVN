import java.util.Scanner;
class Operation
{
	static void rev(int a[])
	{
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			int temp=0;
			while(a[i]>0)
			{
			 temp=(temp*10)+(a[i]%10);
			a[i]=a[i]/10;
			}
		System.out.println(temp);
		}
	}
}

class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int num[] = new int[10];
		System.out.println("Enter 10 numbers");
		for(int i=0;i<10;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println("Reversed number are");
		Operation.rev(num);
	}
}
		

		
			
