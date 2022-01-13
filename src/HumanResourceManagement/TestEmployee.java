package HumanResourceManagement;

public class TestEmployee{
	public static void main(String[] args)
	{

	Employee emp = new Employee(000012,000013,"333 s7 tsreet",01-04-2021);
	emp.work();

	Programmer pmp = new Programmer("C Programming",000012,000013,"333 s7 tsreet",01-04-1985);
	pmp.work();
	pmp.programming_Languages();
	Tester tt = new Tester("Unit Tester",5512,13,"322 s7 tsreet",01-05-1990);
	tt.work();
	tt.Test();

	CEO ce = new CEO("Vission","No.1 company in the world",5002,13,"342 s7 tsreet",01-05-1980);
	ce.executive_management();
	ce.work();
	}
	}
