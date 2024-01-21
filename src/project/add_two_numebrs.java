package project;
import java.util.Scanner;
public class add_two_numebrs {
	public static void main(String[] args)
	{
		int num1,num2,sum;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number1 and number2:");
		num1=scan.nextInt();
		num2=scan.nextInt();
		
		sum=num1+num2;
		
		System.out.println("Sum:"+sum);
		
	
	}
}
