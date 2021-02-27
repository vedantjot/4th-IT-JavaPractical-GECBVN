class pel
{
	static  void pelin(int a)
	{
		int rev;
		rev=reverse();
		if(rev==a)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
	static int reverse(int b)
	{
		if(b==0)
		{
			return 0;
		}
		else
		{
			return rev(b/10)*10+(b%10);
		}
	}
}
	class Main
	{
		public static void main(String args[])
		{
			pel.pelin(int 656);
		}
	}
