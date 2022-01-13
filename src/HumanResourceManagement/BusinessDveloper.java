package HumanResourceManagement;

public class BusinessDveloper extends Employee {
	String specialized_Domain;
	public BusinessDveloper(String specialized_Domain, int name,int email, String address,int birthday){
	super(name, email, address, birthday);
	this.specialized_Domain = specialized_Domain;
	}
	public void collect_requirements() {
	System.out.println("Collect Requirement related to the business");
	}
	public void analyze_requirements() {
	System.out.println("Analyze Requirement related to the business");
	}
	public void write_documents() {
	System.out.println("Write Documents");
	}
	}