
import java.util.Scanner;
class VorC
{
	public static void main(String arg[])
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=ob.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("The entered character is vowel");
		}
		else
		{
			System.out.println("The entered character is consonant");
		}
	}
}

