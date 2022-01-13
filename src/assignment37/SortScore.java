package assignment37;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class SortScore {
		public void displayDetails(String[] matchType,ArrayList<String> score)
		{
			int m=matchType.length;
			System.out.println("Ordered Score List"); for(int j=0;j<m;j++)
			{
				System.out.println("Match:"+" "+matchType[j]);
				ArrayList<String> list = new ArrayList<String>();
				list.add(score.get(j));
				String lines[]= list.toArray(new String[] {});
				String input = lines[0];
				String[] word = input.split(",");
				int l= word.length;
				int[] arr = new int[l]; for (int v = 0; v < l; v++) {
					arr[v] = Integer.valueOf(word[v]);
				}
				Arrays.sort(arr);
				for(int k=0;k<l;k++)
				{
					System.out.println(arr[k]);
				}
			} 
		}
	}



