package HumanResourceManagement;

public class CFO extends Employee {

	String finance_management_skills;

	public CFO(String finance_management_skills, int name,int email, String address,int birthday) {

	super(name, email, address, birthday);
	this.finance_management_skills=finance_management_skills;
	}
	}
