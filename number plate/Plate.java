import java.util.*;
class Plate
{
	public static void main(String args[])
	{
		int a,b,c,d;
		char x,y,z;
		Random r= new Random();
		x=(char)(r.nextInt(26)+'A');
		y=(char)(r.nextInt(26)+'A');
		z=(char)(r.nextInt(26)+'A');
		a=r.nextInt(10);
		b=r.nextInt(10);
		c=r.nextInt(10);
		d=r.nextInt(10);
                            
		System.out.println(x+" "+y+" "+z);
		System.out.println(a+"  "+b+" "+c+" "+d);
	}
}