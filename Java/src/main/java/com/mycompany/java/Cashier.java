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
public class Cashier extends Employee {

    static boolean checkUser;
    private String userName;
    private String password;
    private static int cashersNumber;

    public Cashier() {
        cashersNumber++;
    }

    public Cashier(String employeeName, String userName, String password, String phoneNo, double salary, String country, String city, String street, String zipCode) {
        super(employeeName, phoneNo, salary, country, city, street, zipCode);
        this.userName = userName;
        this.password = password;
        cashersNumber++;
    }

    public static int getCashersNumber() {
        return cashersNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.password = password;
    }

    public boolean checkUser(String Name, String passWord) {
        if (this.userName == userName && this.password == password) {
            System.out.println("welcome again ");
            return true;
        } else {
            System.out.println("invailed input, try again");
            return false;
        }

    }

    public static Cashier newCashier(String employeeName, String userName, String passWord, String phoneNo, double salary, String country, String city, String street, String zipCode) {
        Cashier obj = new Cashier(employeeName, userName, passWord, phoneNo, salary, country, city, street, zipCode);
        return obj;
    }

}
