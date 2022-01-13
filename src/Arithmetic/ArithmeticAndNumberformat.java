package Arithmetic;
import java.util.*;
import java.io.*;
public class ArithmeticAndNumberformat {


		public static void main(String[] args)throws IOException {
			// TODO Auto-generated method stub
	     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	     
	     try {
	    	 int num1, num2;
	    	 System.out.println("Enter the total runs scored ");
	    	 num1=Integer.parseInt(br.readLine());
	    	 
	    	 System.out.println("Enter the total overs faced");
	    	 num2=Integer.parseInt(br.readLine());
	    	 
	    	 double output=num1/num2;
	    	 System.out.println("Current Run Rate :"+output);
	         }
	     catch(NumberFormatException ae) {
	    	 System.out.println(ae);
	     }
	     
		

	}

}
