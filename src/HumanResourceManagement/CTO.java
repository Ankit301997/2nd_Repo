package HumanResourceManagement;

public class CTO extends Architect {

	String technology_domain;

	public CTO(String technology_domain,String design_methodology, String programming_Languages, int name, int email, String address, int birthday) {
	super(design_methodology, programming_Languages, name, email, address, birthday);
	this.technology_domain=technology_domain;
	}
	public void design_System() {
	System.out.println("Design the system");
	}
	}