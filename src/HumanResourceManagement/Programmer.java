package HumanResourceManagement;

public class Programmer extends Employee{

	String programming_Languages;

	public Programmer(String programming_Languages,int name,int email, String address,int birthday) {
	super(name, email, address, birthday);
	this.programming_Languages=programming_Languages;
	}
	
	public void programming_Languages() {
	System.out.println("Programmer Work is to write code");
	}
	
	public void fix_bugs() {
	System.out.println("Programmer Work is also to fix the bugs");
	}
}