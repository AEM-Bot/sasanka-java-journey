package com.company;

public class PersonNew {

    private String name;
    private String email;
    private String phoneNumber;


    //
    public PersonNew(String name) {
        super();
        System.out.println("Super Class Constructor");
        this.name = name;
    }

//    public PersonNew(){
//        System.out.println("Person default constructor");
//    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PersonNew{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
