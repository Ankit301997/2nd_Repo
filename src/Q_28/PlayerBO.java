package Q_28;

import java.util.Scanner;

public class PlayerBO {
	public static void main(String[] args) {
	 
	 String CapName ="sachin";
	 String CapCountry="india";
	 String CapSkill="winner";
	 String dec;
	Scanner sc=new Scanner(System.in);
   
{
	        System.out.println(" Enter Number of players");
	     int num=   sc.nextInt();
	     try {
	    	 System.out.println("Do you know the details of captain:Type yes/no");
	    	 dec=sc.next();
	    	 if(dec.equals("yes"))
	    	 {
	    		 throw new NullPointerException();
	    		 
	    	 }
	    	 else if(dec.equals("no"))
	    	 {
	    		 System.out.println(" Enter name of captain");
	    		 CapName=sc.next();
	    		 System.out.println("Enetr country of the captain");
	    		 CapCountry=sc.next();
	    		 System.out.println(" Enetr Skill of the captain");
	    		 CapSkill=sc.next();
	    		 
	    		 
	    		 
	    	 }
	     
	     System.out.println("Player Details:");
	     Player[] p1=new Player[num];
	     for(int i=0;i<num;i++)
	     {
	     System.out.println("Enter name of player "+(i+1));
	     String name1=sc.next();


	     System.out.println("Enter country player "+(i+1));
	     String country1=sc.next();


	     System.out.println("Enter skill of player "+(i+1));
	     String skill1=sc.next();
	     p1[i]= new Player(name1,country1,skill1);
	     }
	     System.out.println("Captain Details:");
	     System.out.println(CapName+" "+CapCountry+" "+CapSkill);
	     System.out.println("Player Details:");
	     for(int i=0;i<num;i++)
	     {


	     System.out.println(p1[i].getName()+" "+p1[i].getCountry()+" "+p1[i].getSkill());


	     }
	     
	     }

	     catch(NullPointerException np)
	     {


	     System.out.println("Player Details:");


	     Player[] p1=new Player[num];
	     for(int i=0;i<num;i++)
	     {
	     System.out.println("Enter name of player "+(i+1));
	     String name1=sc.next();


	     System.out.println("Enter country of player"+(i+1));
	     String country1=sc.next();


	     System.out.println("Enter skill of player "+(i+1));
	     String skill1=sc.next();


	     p1[i]= new Player(name1,country1,skill1);
	     }
	     System.out.println(np);
	     System.out.println("Captains Details not available");
	     System.out.println("Player Details:");
	     for(int i=0;i<num;i++)
	     {
	     System.out.println(p1[i].getName()+" "+p1[i].getCountry()+" "+p1[i].getSkill());
	     }
	     }
	}
	}
}