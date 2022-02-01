package com.company.FRS;

public abstract class Ticket {
    String pnr;
    String from;
    String to;
    String departureDateTime;
    String arrivalDateTime;
    String seatNo;
    float price;
    boolean cancelled;

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

    Ticket(String pnr,String from,String to,String departureDateTime,String arrivalDateTime,String seatNo,
           float price,boolean cancelled,Flight flight,Passenger passenger){
        this.pnr=pnr;
        this.from=from;
        this.to=to;
        this.departureDateTime=departureDateTime;
        this.arrivalDateTime=arrivalDateTime;
        this.seatNo=seatNo;
        this.price=price;
        this.cancelled=cancelled;
        this.flight=flight;
        this.passenger=passenger;
    }

}
