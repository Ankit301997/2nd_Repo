package assignment34;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class InvalidRangeException extends Exception { 
	private static final long serialVersionUID = 1L;

	InvalidRangeException(String e) {
		super(e);
	}
}

public class Portion
{
	public static void main(String[] args) throws IOException 
	{
		
		Scanner sc = new Scanner(System.in);
		BufferedReader fileBufferReader = null;
		
		try {
			fileBufferReader = new BufferedReader(new FileReader("C:\\Users\\ANKITGHO\\OneDrive - Capgemini\\Desktop\\Assignment 4\\Assignemnt 4\\src\\assignment34\\outcome.txt"));
			System.out.println("Enter start index");
			int startIndex = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter end index");
			int endIndex = Integer.parseInt(sc.nextLine());
			
			if (startIndex > endIndex) {
				throw new InvalidRangeException("start index should not be greater than end index");
			}
			
			fileBufferReader.skip(startIndex);
			 
			int c;
			while(true) {
				c = fileBufferReader.read();
				
				// if buffer reaches end of the file should break the loop
				if (c == -1) {
					break;
				}
				
				// should break the loopif the endIndex reached 
				if (startIndex == endIndex) {
					break;
				}
				startIndex++;
				
				System.out.print((char) c);
				
			}
		} catch(InvalidRangeException e) {
			System.out.print(e);
		} finally {
			fileBufferReader.close();
			sc.close();
		}
		
	}
}


