package Day3;

import java.util.Scanner;

public class Extra_16 {
	 String name;
	 String country;
	 String skill;
	 
	 Extra_16(String name,String country, String skill){
		 this.name=name;
		 this.country=country;
		 this.skill=skill;	 	
	 }
	 public String toString(){//overriding the toString() method  
		  return name+" "+country+" "+skill;  
		 }  
	 public static void main(String args[]){   
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the name");
		 String name=sc.nextLine();
		 System.out.println("Enter the country");
		 String country=sc.nextLine();
		 System.out.println("Enter the skill");
		 String skill=sc.nextLine();
		   Extra_16 s1=new Extra_16(name,country,skill);  
		   Extra_16 s2=new Extra_16("RAM","IND","WORKER");  
		     
		   System.out.println(s1);//compiler writes here s1.toString()  
		   System.out.println(s2);//compiler writes here s2.toString()  
		 }  
}
