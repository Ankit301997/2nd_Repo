package hotelroomandcost;

import java.util.Scanner;



public class AppTest{



public static void main(String[] args) {



System.out.println("Hotel Tarrif Calculator\n\t 1. Delux Room \n\t 2. Delux Ac Room \n\t 3. Suite AC Room");
System.out.println("Select Room Type:");
Scanner sc= new Scanner(System.in);
int response= Integer.parseInt(sc.nextLine());


System.out.println("Hotel Name:");
String hotelname= sc.nextLine();


System.out.println("Room Square Feet Area:");
int squarefeetarea= sc.nextInt();


System.out.println("Room has TV (yes/no):");
String input1=sc.next();
boolean hastv=false;

if (input1.equalsIgnoreCase("yes")) {
hastv= true;
}

System.out.println("Room has Wifi (yes/no:");
String input2=sc.next();
boolean haswifi=false;
if (input2.equalsIgnoreCase("yes")) {
haswifi= true;
}


if (response==1) {
DeluxeRoom room = new DeluxeRoom(hotelname, squarefeetarea, hastv, haswifi);
System.out.println("Room Tariff per day is: " + room.rate);
}
else if (response==2) {
DeluxeACRoom room = new DeluxeACRoom(hotelname, squarefeetarea, hastv, haswifi);
System.out.println("Room Tariff per day is: " + room.rate);
}
else if (response==3) {
SuiteACRoom room = new SuiteACRoom(hotelname, squarefeetarea, hastv, haswifi);
System.out.println("Room Tariff per day is: " + room.rate);
}

}



}
