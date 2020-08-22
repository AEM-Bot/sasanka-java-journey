package com.company;


//object composition -- bit complex one --Address --> Home address and Work Address
public class Customer {

    private String name;
    private Address homeAddress;
    private Address workAddress;


    //constructor thinking should be done
    public Customer(String name, Address homeAddress) {
        this.name = name;
        this.homeAddress = homeAddress;
    }

    //Operations
    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", homeAddress=" + homeAddress +
                ", workAddress=" + workAddress +
                '}';
    }
}
