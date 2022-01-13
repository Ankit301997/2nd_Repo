package HumanResourceManagement;

public class Designer extends Employee {

	String design_Phliosphy;
	String design_tools_used;

	public Designer(String design_Phliosphy, String design_tools_used, int name,int email, String address,int birthday ) {
	super(name, email, address, birthday);
	this.design_Phliosphy=design_Phliosphy;
	this.design_tools_used=design_tools_used;
	}
	public void design() {
	System.out.println("Designer uses designer tools and philosphy used");
	}
	}
