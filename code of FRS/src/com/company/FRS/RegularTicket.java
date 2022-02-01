package com.company.FRS;

public class RegularTicket  {
    String pnr;
    String from;
    String to;
    String departureDateTime;
    String arrivalDateTime;
    String seatNo;
    float price;
    boolean cancelled;

    private String specialServices;

    Flight flight;
    Passenger passenger;


    String checkStatus(){
        return "";
    }
    int getFlightDuration(){
        return 2;
    }
    void cancel(){

    }

    public String getSpecialServices(){
        return specialServices;
    }

    public void setSpecialServices(String specialServices){
        this.specialServices=specialServices;
    }

    public RegularTicket(Flight flight,Passenger passenger){

        this.flight=flight;
        this.passenger=passenger;
    }


}
