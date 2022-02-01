package com.company.FRS;

public class TouristTicket  {
    String pnr;
    String from;
    String to;
    String departureDateTime;
    String arrivalDateTime;
    String seatNo;
    float price;
    boolean cancelled;

    String hotelAddress;
    String[] selectedTouristLocation=new String[5];

    Flight flight;
    Passenger passenger;


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

    TouristTicket(Flight flight,Passenger passenger){

        this.flight=flight;
        this.passenger=passenger;
    }
}
