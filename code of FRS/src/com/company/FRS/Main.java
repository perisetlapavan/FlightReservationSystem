package com.company.FRS;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args){
        Address address=new Address();
        Contact contact=new Contact();
        Flight flight=new Flight();
        Passenger passenger=new Passenger();
        RegularTicket regularTicket=new RegularTicket();
        TouristTicket touristTicket=new TouristTicket();

        address.city="hyderabad";
        System.out.println(address.city);

        contact.name="pavan";
        System.out.println(contact.name);

        flight.airline="jetAirways";
        System.out.println(flight.airline);

        passenger.id=321213;
        System.out.println(passenger.id);

        regularTicket.cancelled=false;
        System.out.println(regularTicket.cancelled);

        touristTicket.from="hyderabad";
        System.out.println(touristTicket.from);
    }
}
