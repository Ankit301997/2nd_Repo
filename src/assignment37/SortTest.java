package assignment37;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class SortTest {
		public static void main(String args[]) throws IOException {
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of matches");
			int n=sc.nextInt();
			String[] matchType = new String[n];
			ArrayList<String> score = new ArrayList<String>();
			for(int i=0;i<n;i++) {
				//System.out.println("Enter player"+(i+1)+"details");
				System.out.println("Enter the Match");
				matchType[i]=br.readLine();

				System.out.println("Enter the score");
				String scr=br.readLine();
				score.add(scr);
			}
			SortScore fin = new SortScore();
			fin.displayDetails(matchType,score);
		}
	}
