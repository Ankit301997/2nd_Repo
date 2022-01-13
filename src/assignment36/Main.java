package assignment36;

import java.util.*; 
import java.io.*;
public class Main 
{
	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines in the summary"); 
		int n = sc.nextInt();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[n];
		TitleCaseThread[] t = new TitleCaseThread[n];
		for(int i=0;i<n;i++)
		{
			str[i] = br.readLine();
			t[i] = new TitleCaseThread(str[i]);
			} 
		for(int i=0;i<n;i++) 
		{
			System.out.print("Sentence "+(i+1)+" : ");
			System.out.println(t[i].getModifiedSummary());
			} 
		sc.close(); 
		}
	}

