package controlflow;
import java.util.*;
public class extra {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double first_num;
		double second_num;
		String ch;
		do {
		System.out.println("Enter first number:");
		first_num=sc.nextDouble();
		System.out.println("Enter second number:");
		second_num=sc.nextDouble();
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for Subtraction");
		System.out.println("Enter 3 for Multiplication");
		System.out.println("Enter 4 for Division");
		System.out.println("Enter quit to exit");

		System.out.println("Enter your choice:");
		int i=sc.nextInt();

		double result=0;


		switch(i)
		{
		case 1:
		result=first_num+second_num;
		System.out.println("The sum is "+result);
		break;
		case 2:
		result=first_num-second_num;
		System.out.println("The sub is "+result);
		break;
		case 3:
		result=first_num*second_num;
		System.out.println("The product is "+result);
		break;
		case 4:
		result=first_num/second_num;
		System.out.println("The division is "+result);
		break;



		default:



		break;
		}
		
		ch=sc.next();
		}
		while(!ch.equals("quit"));
		}
			}
	
