import java.util.Scanner;
class Eq
{
	public static void main(String arg[])
	{
		Scanner ob = new Scanner(System.in);
		System.out.print("Give the values of a,b,c,d,e,f: \n");
		Float a = ob.nextFloat();
		Float b = ob.nextFloat();
		Float c = ob.nextFloat();
		Float d = ob.nextFloat();
		Float e = ob.nextFloat();
		Float f = ob.nextFloat();
		
		Float count = a*d-b*c;
		if(count==0)
		{
			System.out.println("The equation has no solution found");
		}
		else
		{
			Float x = (e*d-b*f)/count;
			Float y = (a*f-e*c)/count;
			System.out.println("The value of X ="+x);
			System.out.println("The value of Y ="+y);
		}
	}	
}

