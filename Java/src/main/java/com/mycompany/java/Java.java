/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.java;

/**
 *
 * @author dell
 */
import java.util.Scanner;

public class Java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 1;
        Product listOfProduct[] = new Product[10];
        int listOfCode[] = new int[10];
        Worker listOfWorker[] = new Worker[10];
        Cashier listOfCashier[] = new Cashier[10];
        String dataBaseOfCashier[][] = new String[10][2];
        Employee listOfEmployee[] = new Employee[20];
        String listOfName[] = new String[20];

        int LCP = 0; //list of products
        int LW = 0; //list of workers
        int LC = 0; //list of cashiears
        int LE = 0; //list of employees
        int LN = 0; //list of names

        do {
            System.out.println("For product enter 1 \n For empolyee enter 2 \n To end program enter 0");
            int firstLoop = sc.nextInt();
            //product section
            if (firstLoop == 1) {
                do {
                    System.out.println("To add product enter 1 \n To sell product enter 2 \n To show product enter 3 \n To return enter 0");
                    int secondLoop1 = sc.nextInt();
                    if (secondLoop1 == 1) {
                        System.out.println("Enter product name");
                        String name = sc.next();

                        System.out.println("Enter product price");
                        double price = sc.nextDouble();

                        System.out.println("Enter number of product ");
                        int count = sc.nextInt();

                        System.out.println("Enter product code");
                        int code = sc.nextInt();

                        System.out.println("Enter product position( product section then press enter then product shelf )");
                        String section = sc.next();
                        String shelf = sc.next();
                        Position position = new Position(section, shelf);

                        listOfCode[LCP] = code;
                        listOfProduct[LCP] = Product.newProduct(name, code, price, count,position );
                        LCP++;
                    } else if (secondLoop1 == 2) {
                        System.out.println("Enter product code then press enter then amount");
                        int searchCode = sc.nextInt();
                        int amount = sc.nextInt();
                        for (int j = 0; j < listOfCode.length; j++) {
                            if (searchCode == listOfCode[j]) {
                                listOfProduct[j].sellProduct(amount);
                            }
                        }
                    } else if (secondLoop1 == 3) {
                        System.out.println("Enter product code");
                        int searchCode = sc.nextInt();
                        for (int j = 0; j < listOfCode.length; j++) {
                            if (searchCode == listOfCode[j]) {
                                System.out.println(listOfProduct[j].toString());
                            }
                        }
                    } else if (secondLoop1 == 0) {
                        break;

                    }

                } while (x != 0);

            } //employee section
            else if (firstLoop == 2) {
                do {
                    System.out.println("To add an employee enter 1 \n To show an employee enter 2 \n To return enter 0");
                    int secondLoop2 = sc.nextInt();
                    //add employee
                    if (secondLoop2 == 1) {

                        System.out.println("To add worker enter 1 \n To add cashier enter 2 \n To return enter 0");
                        //add worker
                        int thirdLoop = sc.nextInt();
                        if (thirdLoop == 1) {
                            System.out.println("Enter Employee name ");
                            String name = sc.next();

                            System.out.println("Enter phone numper ");
                            String phoneNumper = sc.next();

                            System.out.println("Enter Employee's salary");
                            double salary = sc.nextDouble();

                            System.out.println("Enter worker adress : country ==> ");
                            String country = sc.next();

                            System.out.println("City ==>");
                            String city = sc.next();

                            System.out.println("Street ==>");
                            String street = sc.next();

                            System.out.println("Zip code ==>");
                            String zipCode = sc.next();

                            System.out.println("Enter start hour then press enter then start minute");
                            int hour1 = sc.nextInt();
                            int min1 = sc.nextInt();

                            System.out.println("Enter end hour then press enter then end minute");
                            int hour2 = sc.nextInt();
                            int min2 = sc.nextInt();

                            listOfWorker[LW] = Worker.newWorker(name, phoneNumper, salary, country, city, street, zipCode, hour1, min1, hour2, min2);

                            listOfEmployee[LE] = listOfWorker[LW];
                            LE++;
                            LW++;

                            listOfName[LN] = name;
                            LN++;

                        } //add casher
                        else if (thirdLoop == 2) {
                            System.out.println("Enter Employee name ");
                            String name = sc.next();

                            System.out.println("Enter phone numper ");
                            String phoneNumper = sc.next();

                            System.out.println("Enter Employee's salary");
                            double salary = sc.nextDouble();

                            System.out.println("Enter worker adress : country ==> ");
                            String country = sc.next();

                            System.out.println("City ==>");
                            String city = sc.next();

                            System.out.println("Street ==>");
                            String street = sc.next();

                            System.out.println("Zip code ==>");
                            String zipCode = sc.next();

                            System.out.println("Enter userName: ");
                            String userName = sc.next();
                            dataBaseOfCashier[LC][0] = userName;

                            System.out.println("Enter password: ");
                            String password = sc.next();
                            dataBaseOfCashier[LC][1] = password;

                            listOfCashier[LC] = Cashier.newCashier(name, userName, password, phoneNumper, salary, country, city, street, zipCode);

                            listOfEmployee[LE] = listOfCashier[LC];
                            LW++;
                            LC++;

                            listOfName[LN] = name;
                            LN++;

                        }
                    } else if (secondLoop2 == 2) {
                        System.out.println("Enter employee's Name");
                        String name = sc.next();
                        int i;
                        boolean j;
                        for (i = 0; i < name.length(); i++) {
                            if (name.equals(listOfName[i])) {
                                j = true;
                                break;
                            }
                        }
                        System.out.println(listOfEmployee[i].toString());
                    } else if (secondLoop2 == 0) {
                        break;
                    }

                } while (x != 0);
            } else if (firstLoop == 0) {
                break;
            }
        } while (x != 0); // first loop
    }// main method
}// java class

