package com.company.FRS;



public class Main {
    public static void main(String[] args){
        Flight jetAirways=new Flight("4339","jetAirways",440);
        Passenger pavanKalyan=new Passenger("miyapur","Hyderabad","telangana","pavanKalyan"
        ,"9765788794","pavankattupalli@gmail.com");
        RegularTicket regularTicket=new RegularTicket("123456","Hyderabad","Tel Aviv","2.30",
                "12.30","14A",70000.00f,false,"food",jetAirways,pavanKalyan);

        Flight emirates=new Flight("5668","emirates",520);
        String[] str={"NYC","Central Park","Rockefeller Center & Top of the Rock Observation Deck",
                "Metropolitan Museum of Art","Broadway and the Theater District"};
        TouristTicket touristTicket=new TouristTicket("785666","mumbai","new York","1.00",
               "24.00","16A",160000,false,"fifth Avenue",str,emirates,
                pavanKalyan);

        printTicKetDetails(regularTicket);
        printTicKetDetails(touristTicket);

    }

    private static void printTicKetDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }
}
