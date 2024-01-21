package project;
import java.util.Scanner;
public class add_two_numebrs {
	public static void main(String[] args)
	{
		int n1,n2,sum;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number1 and number2:");
		n1=scan.nextInt();
		n2=scan.nextInt();
		sum=n1+n2;
		System.out.println("Sum:"+sum);
		
	
	}
}
