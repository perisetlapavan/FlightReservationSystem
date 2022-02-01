package com.company.FRS;

public class TouristTicket extends Ticket {


    private String hotelAddress;
    private String[] selectedTouristLocation=new String[5];



    String getHotelAddress(){//getters
        return this.hotelAddress;
    }
    String[] getTouristLocation(){
        return this.selectedTouristLocation;
    }
    void removeTouristLocations(String Location){//removing tourist location
      for(int i=0;i<5;i++){
          if(selectedTouristLocation[i]==Location){
              selectedTouristLocation[i]=null;
          }
      }
    }
    void addTouristLocations(String location){//adding tourist location
       for(int i=0;i<5;i++){
           if(selectedTouristLocation[i]==null){
               selectedTouristLocation[i]=location;
               break;
           }
       }
    }



   TouristTicket(String pnr,String from,String to,String departureDateTime,String arrivalDateTime,String seatNo,
                 float price,boolean cancelled,String hotelAddress,String[] selectedTouristLocation,Flight flight,
                 Passenger passenger){//constructots including super keyword in it.
        super(pnr,from,to,departureDateTime,arrivalDateTime,seatNo,price,cancelled,flight,passenger);
        this.hotelAddress=hotelAddress;
        this.selectedTouristLocation=selectedTouristLocation;

   }

}
