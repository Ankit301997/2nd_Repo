package Friday;
import java.util.*;
public class players {
	String name;
	String country;
	String skill;


	players(String name, String country, String skill){
	this.name = name;
	this.country = country;
	this.skill = skill;
	}

	public String toString(){
	return name+" "+country+" "+skill;
	}
	}



	class playerBO{
	void viewDetails(players[] playerList){
	for(int i=0;i<playerList.length;i++)
	{
	System.out.println(playerList[i]);
	}
	}



	void printPlayerDetailsWithSkill(players[] playerList, String skill)
	{
	for(int j=0; j<playerList.length;j++)
	{
	if(playerList[j].skill==skill)
	{
	System.out.println(playerList[j]);
	}
	else
	{
	System.out.println("Skill not found");
	}
	}
	}
	}
	class playersMain{
	public static void main(String[] args) {
		int responce;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of player");
		int count = sc.nextInt();

		players p[] = new players[count];
		for(int i=1;i<=count;i++)
		{
		System.out.println("Enter player"+(i)+" name"+"\n");
		String name = sc.nextLine();
		System.out.println("Enter player"+(i)+" country");
		String country = sc.nextLine();
		System.out.println("Enter player"+(i)+" skill");
		String skill = sc.nextLine();

		p[i] = new players(name, country, skill);
		}

		playerBO pbo = new playerBO();

		do{
		System.out.println("Menu");
		System.out.println("1. View Details");
		System.out.println("2. Filter with skills");
		System.out.println("3. exit");



		responce = sc.nextInt();

		switch(responce)
		{
		case 1: pbo.viewDetails(p);
		break;
		case 2: System.out.println("Enter skill");
		String skip = sc.nextLine();
		String skillResponce = sc.nextLine();
		pbo.printPlayerDetailsWithSkill(p, skillResponce);
		break;
		case 3: System.exit(0);
		}

		}while(responce!=3);

		}
		

	}


