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
public class purchases {
    private int prodid;
    private String buyername;
    private String adress;
    private int postal;
    private String brand;
    private String date;
    private String batchno;
    private String quantity;
    private String branch;

    public purchases(int prodid, String buyername, String adress, int postal, String brand, String date, String batchno, String quantity, String branch) {
        this.prodid = prodid;
        this.buyername = buyername;
        this.adress = adress;
        this.postal = postal;
        this.brand = brand;
        this.date = date;
        this.batchno = batchno;
        this.quantity = quantity;
        this.branch = branch;
    }

    public int getProdid() {
        return prodid;
    }

    public String getBuyername() {
        return buyername;
    }

    public String getAdress() {
        return adress;
    }

    public int getPostal() {
        return postal;
    }

    public String getBrand() {
        return brand;
    }

    public String getDate() {
        return date;
    }

    public String getBatchno() {
        return batchno;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getBranch() {
        return branch;
    }
    
    
    
 
    
}
