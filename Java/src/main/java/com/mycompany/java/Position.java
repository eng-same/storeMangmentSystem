/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

/*
 * سامي عوض عبدالسلام المجريسي 6389 
 * ظافر اسامه حسن المدني 6388
 *عثمان هيثم عثمان شنيب  6385
 */
/**
 *
 * @author dell
 */
public class Position {

    private String sectoin;
    private String shelf;

    public Position() {
    }

    public Position(String section, String shelf) {
        this.sectoin = section;
        this.shelf = shelf;
    }

    public void setSectoin(String sectoin) {
        this.sectoin = sectoin;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public String toString() {
        return "Position{ " + sectoin + shelf + '}';
    }

}
