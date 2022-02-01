package com.company.FRS;

public class RegularTicket extends Ticket  {//child class inheriting from parent class


    private String specialServices;



    public String getSpecialServices(){//getters and setters
        return specialServices;
    }

    public void setSpecialServices(String specialServices){
        this.specialServices=specialServices;
    }


    RegularTicket(String pnr,String from,String to,String departureDateTime,String arrivalDateTime,String seatNo,
                  float price,boolean cancelled,String specialServices,Flight flight,
                  Passenger passenger){//Constructor
        super(pnr,from,to,departureDateTime,arrivalDateTime,seatNo,price,cancelled,flight,passenger);
        this.specialServices=specialServices;
    }


}
