package controlflow;

import java.util.ArrayList;

public class HRM {
	public class Employee {



		String name, email, address, birthday;
		void work() {
		System.out.println("working");
		}



		}



		}




		class Programmer1 extends HRM {



		String prog_lanuguages;



		void code() {
		System.out.println("coding");



		}



		void fixbugs () {



		System.out.println("fixing the bugs");



		}




		}





		class Tester1 extends HRM {



		ArrayList<String> testing_methodologies =new ArrayList<String>(); void test() {



		System.out.println("testing");



		}



		void verify() {



		System.out.println("verifying code");
		}



		class Designer1 extends HRM {
		String design_philosophy;
		ArrayList<String>design_tools_used=new ArrayList<String>();
		}




		void design () {





		System.out.println("designing application");



		}



		class BusinessDeveloper extends HRM {

		ArrayList<String>specialized_domains=new ArrayList<String>();
		void collectRequirements () {
		System.out.println("collecting requirements");
		}



		void analyzeRequirements() {
		System.out.println("analyzing requirements");
		}



		void writeDocuments() {
		System.out.println("writing documents");
		}
		}

}
