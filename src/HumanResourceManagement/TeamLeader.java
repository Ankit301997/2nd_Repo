package HumanResourceManagement;

public class TeamLeader extends Programmer{
	String team_collaboration_tools;
	String development_methods;

	public TeamLeader(String team_collaboration_tools,String development_methods,String programming_Languages, int name, int email, String address, int birthday) {

	super(programming_Languages, name, email, address, birthday);

	this.team_collaboration_tools=team_collaboration_tools;
	this.development_methods=development_methods;
	}

	public void schedule() {
	System.out.println("Team leader have the schdule of meetings");
	}

	public void organize() {
	System.out.println("Team leader is the organizer meetings");
	}

	public void manage_programmers() {
	System.out.println("manage programmers");
	}

	public void designers() {
	System.out.println("Team leader have to manage the deisgner work");
	}

	public void testers() {
	System.out.println("Team leader give work to the tester");
	}
	}

