
package controlflow;
import java.util.Scanner;
public class DoubleAverage {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        double a,b;
       
        System.out.println("Enter the value of a:");
        if(sc.hasNextDouble()){  
            System.out.println("Found Double Value: ");  
        }  
        else{  
            System.out.println("Not Found Double Value: ");  
        }  
        a=sc.nextDouble();
        System.out.println("Enter the value of b:");
        if(sc.hasNextDouble()){  
            System.out.println("Found Double Value: ");  
        }  
        else{  
            System.out.println("Not Found Double Value: ");  
        }
        b=sc.nextDouble();
        double c= (a+b)/2.0;
        System.out.println("The average is "+c);
	}

}
