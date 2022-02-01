package com.company.FRS;

public class TouristTicket extends Ticket {


    String hotelAddress;
    String[] selectedTouristLocation=new String[5];

    public TouristTicket(String pnr, String from, String to, String departureDateTime,
                         String arrivalDateTime, String seatNo, int price, boolean cancelled,
                         String hotelAddress, String[] selectedTouristLocation, Flight flight,Passenger passenger) {
        super(pnr,from,to,departureDateTime,arrivalDateTime,seatNo,price,cancelled,flight,passenger);
        this.hotelAddress=hotelAddress;
        this.selectedTouristLocation=selectedTouristLocation;


    }


    String checkStatus(){
        return "";
    }
    int getFlightDuration(){
        return Integer.valueOf(arrivalDateTime)-Integer.valueOf(departureDateTime);//24 hour time
    }
    void cancel(){

    }

    String getHotelAddress(){
        return hotelAddress;
    }
    String[] getTouristLocation(){
        return selectedTouristLocation;
    }
    void removeTouristLocations(String Location){

    }
    void addTouristLocations(String location){

    }



   TouristTicket(String pnr,String from,String to,String departureDateTime,String arrivalDateTime,String seatNo,
                 float price,boolean cancelled,String hotelAddress,String[] selectedTouristLocation,Flight flight,
                 Passenger passenger){
        super(pnr,from,to,departureDateTime,arrivalDateTime,seatNo,price,cancelled,flight,passenger);
        this.hotelAddress=hotelAddress;
        this.selectedTouristLocation=selectedTouristLocation;

   }

}
