package hotelroomandcost;

public class HotelRoom {
private String hotelname;
private int numberOfSqFeet;
private boolean hasTv;
private boolean hasWifi;



public HotelRoom (
String hotelname,
int numberOfSqFeet,
boolean hasTv,
boolean hasWifi)
{
super();
this.hotelname = hotelname;
this.numberOfSqFeet = numberOfSqFeet;
this.hasTv = hasTv;
this.hasWifi = hasWifi;
}
public String getHotelName() {
return hotelname;
}
public int getNumberOfSqFeet() {
return numberOfSqFeet;
}
public boolean isHasTv() {
return hasTv;
}
public boolean isHasWifi() {
return hasWifi;
}
public int calculateTariff() {
return this.numberOfSqFeet*getRatePerSqFeet();
}
public int getRatePerSqFeet() {
return 0;
}

}
