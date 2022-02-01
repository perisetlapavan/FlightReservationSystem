package com.company.FRS;

public class TouristTicket {
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

    String checkStatus(){
        return "";
    }
    int getFlightDuration(){
        return 2;
    }
    void cancel(){

    }
    String getHotelAddress(){
        return "";
    }
    String[] getTouristLocation(){
        return selectedTouristLocation;
    }
    void removeTouristLocations(String Location){

    }
    void addTouristLocations(String location){

    }
}
