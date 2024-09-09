/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 /*
 * سامي عوض عبدالسلام المجريسي 6389 
 * ظافر اسامه حسن المدني 6388
 *عثمان هيثم عثمان شنيب  6385
 */
package com.mycompany.java;
/**
 *
 * @author dell
 */
public class Product {

    private String productName;
    private final int productCode;
    private double price;
    private int productCount;
    private Position productPlace;

    public Product() {
        this.productCode = 0;
    }

    public Product(String productName, int productCode, double price, int productCount, Position position) {

        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
        this.productCount = productCount;
        this.productPlace = position;

    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public int getProductCount() {
        return productCount;
    }

    public int getProductCode() {
        return productCode;
    }

    public Position getProductPlace() {
        return productPlace;
    }

    public static Product newProduct(String productName, int productCode, double price, int productCount, Position position) {

        Product obj = new Product(productName, productCode, price, productCount, position);
        return obj;
    }

    public void sellProduct(int productCount) {
        if (productCount > this.productCount) {
            System.out.println("we do not have that number of " + this.productName + "\n we only have " + this.productCount);
        } else {
            this.productCount -= productCount;
            System.out.println("Amount = "+productCount+"\nprice = "+this.price*productCount+"\nThank you for shopping");
        }
    }

    public String toString() {
        return "Product{" + "productName=" + productName + ", productCode=" + productCode + ", price=" + price + ", productCount=" + productCount + ", productPlace=" + productPlace + '}';
    }
}
