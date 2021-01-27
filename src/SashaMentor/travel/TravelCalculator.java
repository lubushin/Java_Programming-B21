package SashaMentor.travel;

public class TravelCalculator {

 public void airFare(String airPlanePrice, String hotelPrice){
     airPlanePrice = airPlanePrice.substring(1);
     hotelPrice = hotelPrice.substring(1);//will print from

  //400.90
 double airPlanePriceInt = Double.parseDouble(airPlanePrice);
double hotelPriceInt = Double.parseDouble(hotelPrice);
double sum= airPlanePriceInt + hotelPriceInt;
if(sum<=500){
    System.out.println("We are byuing ticket");
}else{
    System.out.println("We are not byuing");
}
     //public String airFare(String airPlanePrice, String hotelPrice, String carRental){



 }

}
//our budget $500
//print true if total(ticket+hotel) cost less or equal $500 and say something
// otherway print false ans say "too expensive"