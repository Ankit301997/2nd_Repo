
package hotelroomandcost;
class SuiteACRoom extends HotelRoom{
private int ratePerSqFeet; public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
super(hotelName, numberOfSqFeet, hasTV, hasWifi);
this.ratePerSqFeet = 15;
}
public int getRatePerSqFeet() {
//returns (ratePerSqFeet + 2) if wifi is present, else returns ratePerSqFeet.//
if (this.isHasWifi()) {
return this.ratePerSqFeet+2;
}
else {
return this.ratePerSqFeet;
}
}
int rate = this.calculateTariff();
}


