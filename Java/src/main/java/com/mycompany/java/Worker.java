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
import java.time.LocalTime;

public class Worker extends Employee {

    private static int workersNumber;
    private int hour1, hour2, hour3, minute1, minute2, minute3;

    private LocalTime time1 = LocalTime.of(hour1, minute1);
    private LocalTime time2 = LocalTime.of(hour2, minute2);

    public Worker() {
        workersNumber++;
    }

    public Worker(int hour1, int minute1, int hour2, int minute2, String employeeName, String phoneNo, double salary, String country, String city, String street, String zipCode) {
        super(employeeName, phoneNo, salary, country, city, street, zipCode);
        this.hour1 = hour1;
        this.hour2 = hour2;
        this.minute1 = minute1;
        this.minute2 = minute2;
        workersNumber++;
    }

    public static int getWorkersNumber() {
        return workersNumber;
    }

    public LocalTime getTime1() {
        return time1;
    }

    public void setTime1(LocalTime time1) {
        this.time1 = time1;
    }

    public LocalTime getTime2() {
        return time2;
    }

    public void setTime2(int hour2, int minute2) {
        this.hour2 = hour2;
        this.minute2 = minute2;
    }

    public void setTimeOut(int hour3, int minute3) {

        LocalTime time3 = LocalTime.of(hour3, minute3);
        if (time3.isAfter(time2)) {
            this.setLoad(10);

        }
    }

    public static Worker newWorker(String employeeName, String phoneNo, double salary, String country, String city, String street, String zipCode, int hour1, int minute1, int hour2, int minute2) {
        Worker obj = new Worker(hour1, minute1, hour2, minute2, employeeName, phoneNo, salary, country, city, street, zipCode);
        return obj;
    }
}
