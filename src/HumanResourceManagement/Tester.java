package HumanResourceManagement;

public class Tester extends Employee {
	String Testing_Methodloogies;
	public Tester(String Testing_Methodloogies, int name,int email, String address,int birthday) {
	super(name, email, address, birthday);
	this.Testing_Methodloogies = Testing_Methodloogies;
	}
	public void Test() {
	System.out.println("Behiour is test");
	}
	public void verify() {
	System.out.println("Behiour is to verify the code");

	}
	}