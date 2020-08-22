package com.company;


//added constructor in person
public class Employee extends PersonNew {

    private String title;

    private String employer;

    private String employeeGrade;

    private int salary;

    //super class is called from Person Constructor Always
    public Employee(String name, String title) {
        // System.out.println("Employee Constructor Default");
        super(name);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(String employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //one method of printing values from super class

//    @Override
//    public String toString() {
//        return String.format("Title - %s, Employer - %s, EmployeeGrade - %s, Salary - %d, Name - %s, PhoneNumber - %s,Email-%s",
//                title, employer, employeeGrade, salary, super.getName(), super.getPhoneNumber(), super.getEmail());
//    }


    //use super toString method --> so that the values appended before the employee details
    @Override
    public String toString() {
        return super.toString() + "Employee{" +
                "title='" + title + '\'' +
                ", employer='" + employer + '\'' +
                ", employeeGrade='" + employeeGrade + '\'' +
                ", salary=" + salary +
                '}';
    }
}
