package controlflow;
import java.util.*;
public class UserInput {

	public static void main(String[] args) {
		
		String choice = "";
		double sum = 0.0;
		double sub = 0.0;
		double product=1.0;
		double div=0.0;
		
		Scanner sc = new Scanner(System.in);
		
		while(!choice.equals("q")) {
			System.out.println("Enter the numbers you want to for calculation or enter q to exit");
			choice = sc.next();
			
			if(!choice.equals("q")) {
				double num= Double.parseDouble(choice);
				//sum = sum + num;
				//sub= sub - num;
				//product= product*num;
				//div=div/num;
			}
		}
		System.out.println("the sum is "+sum);
		System.out.println("the sub is "+sub);
		System.out.println("the product is "+product);
		System.out.println("the division is"+div);
			}
		

	}


