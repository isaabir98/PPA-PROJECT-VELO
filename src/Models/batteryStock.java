/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author hp
 */
public class batteryStock {
    
    private int id;
    private String brand;
    private String size;
    private int stock;

    public batteryStock(int id, String brand, String size, int stock) {
        this.id = id;
        this.brand = brand;
        this.size = size;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getSize() {
        return size;
    }

    public int getStock() {
        return stock;
    }
    
    
    
}
