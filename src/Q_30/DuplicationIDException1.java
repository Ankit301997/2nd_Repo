package Q_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DuplicationIDException1 {


	public static void main(String[] args) throws IOException
	{


	int numberofplayers ;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	System.out.println("Enter the team name:");
	@SuppressWarnings("unused")
	String teamname = br.readLine();


	System.out.println("Enter the number of players suggested");
	numberofplayers = Integer.parseInt(br.readLine());
	String playerid[] = new String[numberofplayers];
	String playername[] = new String[numberofplayers];


	for(int i=0;i<numberofplayers;i++)
	{
	System.out.println("enter the player "+(i+1)+" details");
	playerid[i] = br.readLine();
	playername[i] = br.readLine();
	}


	for(int k1=0;k1<numberofplayers;k1++)
	{
	for(int j1=k1+1;j1<numberofplayers;j1++)
	{


	if(playerid[k1].equals(playerid[j1]))
	{
	try
	{
	throw new DuplicationIdException();
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	}
	else
	for(int l=0;l<numberofplayers;l++)
	{
	System.out.println(playerid[l]+" "+playername[l]); //display all unique id and name of player
	}
	}
	}

}
}
