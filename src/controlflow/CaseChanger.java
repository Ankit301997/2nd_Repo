package controlflow;
import java.util.Scanner;
public class CaseChanger {

	public static void main(String[] args) {
		String Str;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		Str=sc.nextLine();
		String Str2= Str.toUpperCase();
		System.out.println("To upper case \n\t"+Str2);
        String Str3= Str.toLowerCase();
        System.out.println("To lower Case \n\t"+Str3);
        String s="";
        char ch;
        for(int i=0;i<Str.length();i++) {
        	ch=Str.charAt(i);
        	if(ch>=65 && ch<=90) {
        		s+=(char)(ch+32);
        	}
        	else if(ch>=97 && ch<=122) {
        		s+=(char)(ch-32);
        	}
        	else {
        		s+=ch;
        	}
        }
        System.out.println("\n\t Lower to Upper and Vise Versa"+s);
        
		String words[]=Str.split("\\s");
		String newString ="";

		for(String w: words){
		String first = w.substring(0,1); //First Letter
		String rest = w.substring(1); //Rest of the letters

		newString+=first.toUpperCase()+ rest.toLowerCase()+ " ";

		}
		System.out.println("Capitalize:\n\t"+newString.trim()+"\n");


		String cap = Str.substring(0,1).toUpperCase() + Str.substring(1).toLowerCase();
		System.out.println("Sentence case:\n\t"+cap);
	}

}
