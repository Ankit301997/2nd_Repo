package controlflow;
import java.util.Scanner;
public class MoneyManagement {

	public static void main(String[] args) {
		int n=0;
		System.out.println("Enter Your Salary Details");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
        int NEC=(55*n)/100;
        System.out.println("The sum in account 1 NEC is"+NEC);
        int FFA=(10*n)/100;
        System.out.println("The sum in account 2 FFA is"+FFA);
        int EDU=(10*n)/100;
        System.out.println("The sum in account 3 EDU is"+EDU);
        int LTSS=(10*n)/100;
        System.out.println("The sum in account 4 LTSS is"+LTSS);
        int PLAY=(10*n)/100;
        System.out.println("The sum in account 5 PLAY is"+PLAY);
        int GIVE=(5*n)/100;
        System.out.println("The sum in account 6 GIVE is"+GIVE);
        
        System.out.println("Thank You!");
	}

}
