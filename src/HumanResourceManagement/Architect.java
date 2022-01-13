package HumanResourceManagement;

public class Architect extends Programmer{
	String design_methodology;

	public Architect(String design_methodology, String programming_Languages, int name, int email, String address, int birthday) {
	super(programming_Languages, name, email, address, birthday);

	this.design_methodology = design_methodology;
	}

	public void design_System() {
	System.out.println("Architect job to design the system");
	}
	}