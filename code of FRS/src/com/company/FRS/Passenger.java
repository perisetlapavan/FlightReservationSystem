package com.company.FRS;

public class Passenger {
    int id;                  //variable declaration
    private Address address;
    private Contact contact;

    private static int idCounter=1;

    private static class Address {//nested class
        private String street;
        private String city;
        private String state;

        public String getStreet() {//getters and setters of a nested class
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
        Address(String street,String city,String state){//constructor of a nested class
            this.street=street;
            this.city=city;
            this.state=state;
        }

    }

    private static class Contact {//nested class
        private String name;
        private String phone;
        private String email;


        public String getName(){//getters and setters of a nested class
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
        Contact(String name,String phone,String email){//constructor of a nested class
            this.name=name;
            this.phone=phone;
            this.email=email;
        }
    }

    public Address getAddress(){//getters and setters
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


    Passenger(String street,String city,String state,String name,String phone,String email){//constructor
        this.address=new Address(street,city,state);
        this.contact=new Contact(name,phone,email);
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
