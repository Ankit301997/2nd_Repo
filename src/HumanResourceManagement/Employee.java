package HumanResourceManagement;

public class Employee {
	int name;
	int email;
	String address;
	int birthday;

	public Employee(int name,int email, String address,int birthday){
	this.email=email;
	this.name=name;
	this.address=address;
	this.birthday=birthday;
	}
	void work() {
	System.out.println("Behaviour of the employee is work");
	}
	}
