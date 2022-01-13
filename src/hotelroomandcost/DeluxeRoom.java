package hotelroomandcost;

class DeluxeRoom extends HotelRoom{
private int ratePerSqFeet;
public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi)
{
super(hotelName, numberOfSqFeet, hasTV, hasWifi);
ratePerSqFeet = 10;



}




public int getRatePerSqFeet()
{
if (this.isHasWifi())
{
return this.ratePerSqFeet+2;
}
else {
return this.ratePerSqFeet;
}

}



int rate = this.calculateTariff();




}



class DeluxeACRoom extends DeluxeRoom
{
private int ratePerSqFeet;



public DeluxeACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
super(hotelName, numberOfSqFeet, hasTV, hasWifi);
this.ratePerSqFeet = 12;
}



int rate = this.calculateTariff();




}
