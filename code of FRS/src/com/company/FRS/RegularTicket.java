package com.company.FRS;

public class RegularTicket {
    String pnr;
    String from;
    String to;
    String departureDateTime;
    String arrivalDateTime;
    String seatNo;
    float price;
    boolean cancelled;
    String specialServices;

    String checkStatus(){
        return "";
    }
    int getFlightDuration(){
        return 2;
    }
    void cancel(){

    }
    String getSpecialServices(){
        return "";
    }
    void updateSpecialServices(String specialServices){

    }
}
