import java.util.Scanner;

public class Frac
{
 public static void main(String[] args) 
 {
	  Scanner input = new Scanner(System.in);
 	System.out.println("Enter a decimal value");
	String[] str= input.nextLine().split("\\.");
	
	System.out.println("Number part is  "+str[0]);
	System.out.println("Fraction part is  "+str[1]);

  }
}
