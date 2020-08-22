package com.company;

public class CustomerRunner {

    public static void main(String[] args) {

        //below is basic way of doing address
//        Customer customer =
//                new Customer("sasanka",
//                        new Address("56 Beacon Way", "Jersey City", "07306"));

        Address homeAddress = new Address("56 Beacon Way", "Jersey City", "07306");

        Address workAddress = new Address("20 Corporate Pl", "Piscataway", "08854");

        Customer customer = new Customer("Sasanka", homeAddress);

        customer.setWorkAddress(workAddress);

        System.out.println(customer);

    }
}
