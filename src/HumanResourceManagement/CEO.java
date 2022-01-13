package HumanResourceManagement;

public class CEO extends Employee{
	String vission;
	String mission;

	public CEO(String vission,String mission, int name,int email, String address,int birthday) {
	super(name, email, address, birthday);
	this.vission=vission;
	this.mission=mission;
	}
	void executive_management() {
	System.out.println("Executive Management");
	}
	}