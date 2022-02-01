package com.company.FRS;

public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;//still didn't wrote method for it

    public String getFlightNumber(){
        return flightNumber;
    }
    public String getAirline(){
        return airline;
    }
    public int getCapacity(){
        return capacity;
    }

    public void setFlightNumber(String flightNumber){
        this.flightNumber=flightNumber;
    }

    public void setAirline(String airline){
        this.airline=airline;
    }

    public void setCapacity(int capacity){
        this.capacity=capacity;
    }

    public boolean checkAvailablity(){
        if(bookedSeats<capacity)
            return true;
        else
            return false;
    }
    Passenger passenger;
    void incrementSeatsBooked(){
        bookedSeats=passenger.getIdCounter();
    }
}
