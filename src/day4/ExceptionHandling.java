package day4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling {
	public static void main(String[] args) throws NumberFormatException,IOException
	 {
		// int totalOversFaced = 30;
		 //int totalRunsScored = 20;
	try {
		//Scanner sc=new Scanner(System.in);
		final InputStreamReader isr = new InputStreamReader(System.in);
	    final BufferedReader br = new BufferedReader(isr);
	    System.out.println("Enter the total runs scored: ");
	    final double totalRunsScored = Integer.parseInt(br.readLine());
	    System.out.println("Enter the total overs faced");
	    final double totalOversFaced = Integer.parseInt(br.readLine());
	    if (  totalOversFaced < 0.0 || totalOversFaced >= 20.0) {
	        throw new OverRangeException("Over is not in the specified range");
	    }
	    final double rate = totalRunsScored / totalOversFaced;
	    System.out.println("Current Run Rate : " + rate);
	}
	catch (OverRangeException e) {
	    System.out.println("OverRangeException:" + e.getMessage());
	}
	
	}

}
