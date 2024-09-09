/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

/**
 *
 * @author dell
 */
/*
 * سامي عوض عبدالسلام المجريسي 6389 
 * ظافر اسامه حسن المدني 6388
 *عثمان هيثم عثمان شنيب  6385
 */
public class Employee {

    private String employeeName;
    private static int employeesNumber;
    private String phoneNo;
    private Adress employeeAdress;
    private double salary;
    private double load;
    private static final String storeName = "DSO";

    public Employee() {
        employeesNumber++;
    }

    public Employee(String employeeName, String phoneNo, double salary, String country, String city, String street, String zipCode) {
        this.employeeName = employeeName;
        this.phoneNo = phoneNo;
        this.salary = salary;
        employeesNumber++;
        this.employeeAdress = new Adress(country, city, street, zipCode);
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public double getSalary() {
        return salary;
    }

    public static int getEmployeesNumber() {
        return employeesNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load + this.load;
    }

    public static String getStoreName() {
        return storeName;
    }

    public double calcTotalSalary() {

        return this.salary + this.load;
    }

    @Override
    public String toString() {
        return "Employee{" + "Employee name=" + employeeName + ", phoneNo=" + phoneNo + ", employeeAdress=" + employeeAdress + ", salary=" + salary + ", load=" + load + '}';
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

}
