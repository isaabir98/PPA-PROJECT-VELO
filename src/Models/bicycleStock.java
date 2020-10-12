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
public class bicycleStock {
    private int id;
    private String brand;
    private String model;
    private String size;
    private int stock;
    

    public bicycleStock(String brand, String model, String size, int stock,int id) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.stock = stock;
        this.id= id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public int getStock() {
        return stock;
    }
   
    public int getid(){
    return id;
    }
}
