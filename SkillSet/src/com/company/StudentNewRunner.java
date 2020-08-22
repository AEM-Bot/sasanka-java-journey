package com.company;

public class StudentNewRunner {


    //Inheritance is a relationship
    //student is a person
    public static void main(String[] args) {
        //StudentFromPerson studentFromPerson1 = new StudentFromPerson();

        // studentFromPerson. will show all methods available -> inherited from Person Class


       // PersonNew personNew = new PersonNew();
        //personNew. --> gives equals hashcode
        //By Default Every Class will always extend from Object class
        //Object is top of class hierarchy


        //Method Overriding --> Same method but different logic is subclass
        //Example: toString() method is from Object class override the same method with custom code/logic
        //as per the requirement

        Employee employee = new Employee("sasanka","Associate");
        StudentFromPerson studentFromPerson = new StudentFromPerson("sasa","BUllBull");

        employee.setEmployer("Virtusa");
        employee.setEmployeeGrade("Associate-Consultant");
        employee.setSalary(10000);
      //  employee.setName("Sasanka");
        employee.setPhoneNumber("123456");
        employee.setEmail("chintam@gmail.com");

        System.out.println(employee.toString());
    }
}
