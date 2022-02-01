package com.company.FRS;

public abstract class Ticket {
    private String pnr;//variable declaration
    private String from;
    private String to;
    private String departureDateTime;
    private String arrivalDateTime;
    private String seatNo;
    private float price;
    private boolean cancelled;

    Flight flight;
    Passenger passenger;

    public String getPnr(){//getters
        return this.pnr;
    }
    public String getDepartureDateTime(){
        return  departureDateTime;
    }
    public String getArrivalDateTime(){
        return this.arrivalDateTime;
    }

    String checkStatus(){
        return "";
    }
    int getFlightDuration(){
        return Integer.valueOf(getArrivalDateTime())-Integer.valueOf(getDepartureDateTime());//24 hour time
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
