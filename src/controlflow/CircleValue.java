package controlflow;
import java.util.Scanner;
public class CircleValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		double r=0.0;
		System.out.println("Enter the value of the radius");
		r= sc.nextDouble();
		double a = 22.0/7.0*(r*r);
		System.out.println("The value of area of circle is"+a);
		

	}

}
