package controlflow;
import java.util.Scanner;
public class FibonacciSequence {

	public static void main(String[] args) {
		System.out.println("Enter the count ");
		int n1=1, n2=1, n3=0, count=0;
		
		Scanner sc = new Scanner(System.in);
		count=sc.nextInt();
		System.out.println("1 \n1");
		while(n3<= count) {
			n3=n1+n2;
			if(n3>=count)
				break;
			
			System.out.println(n3+" ");
			n1=n2;
			n2=n3;
					
		}

	}

}
