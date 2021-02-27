public class Mat
{
	public static void main(String args[])
	{
		int a[][] = new int[6][6] ;
		int temp;
                      	int x=0;
		int y=1;
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=5;j++)
			{
				
				if(j%2==0)
				{
					a[i][j]=x;
				}
				else
				{
					a[i][j]=y;
				}
					
			}
			temp=x;
			x=y;
			y=temp;
			
		}
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=5;j++)
			{
  				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}			