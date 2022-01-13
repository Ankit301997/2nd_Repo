package assignment35;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class PlayerDetails {
@SuppressWarnings("resource")
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
try (PrintWriter writer = new PrintWriter("C:\\Users\\ANKITGHO\\OneDrive - Capgemini\\Desktop\\Assignment 4\\Assignemnt 4\\src\\assignment35\\PlayerDetails.csv")) {
StringBuilder sb=new StringBuilder();



System.out.println("Enter the Player Name:");
String name=sc.nextLine();



System.out.println("Enter the Team name:");
String team=sc.nextLine();



System.out.println("Enter number of matches played:");
int played=sc.nextInt();



sb.append("name: "+name+",teamName: "+team+",numberofmatchces: "+played);



writer.write(sb.toString());



System.out.println("INPUT DATA IS SAVED.");
}
catch(FileNotFoundException e){
System.out.println(e.getMessage());




}
}
}