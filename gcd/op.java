import java.util.*;
class op
{
	 public static int gcd(int a,int b)
	{
		int sel;
		if(a>b)
		{
			sel=a;
		}
		else
		{
			sel=b;
		}
		for(int i=sel;i>=1;i--)
		{
			if(a%i==0 && b%i==0)
			{
				
				return i;
			}
		}
    		return 0;
	}
}
class Main
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
 		int a,b;
		System.out.println("ENTER TWO NUMBER ");
		a=sc.nextInt();
		b=sc.nextInt();
		int gcd=op.gcd(a,b);
		System.out.println("GCD IS =  "+gcd);
	}
}
		