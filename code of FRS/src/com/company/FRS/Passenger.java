package com.company.FRS;

public class Passenger {
    int id;
    private Address address;
    private Contact contact;

    private static int idCounter=1;

    private static class Address {
        private String street;
        private String city;
        private String state;

        public String getStreet() {
            return this.street;
        }
        public String getCity(){
            return this.city;
        }
        public String getState(){
            return this.state;
        }

        public void setStreet(String street){
            this.street=street;
        }

        public void setCity(String city){
            this.city=city;
        }

        public void setState(String state){
            this.state=state;
        }

    }

    private static class Contact {
        private String name;
        private String phone;
        private String email;


        public String getName(){
            return this.name;
        }
        public String getPhone(){
            return this.phone;
        }
        public String getEmail(){
            return this.email;
        }

        public void setName(String name){
            this.name=name;
        }
        public void setPhone(String phone){
            this.phone=phone;
        }
        public void setEmail(String email){
            this.email=email;
        }
    }

    public Address getAddress(){
        return this.address;
    }
    public Contact getContact(){
        return this.contact;
    }

    public void setAddress(Address address){
        this.address.street=address.street;
        this.address.city=address.city;
        this.address.state=address.state;
    }



    public Passenger(){
        Address address=new Address();
        Contact contact=new Contact();
        this.id=idCounter;
        idCounter++;

    }

    public int getPassengerCount(){
        return idCounter-1;
    }

    public int getIdCounter(){
        return idCounter;
    }

}
