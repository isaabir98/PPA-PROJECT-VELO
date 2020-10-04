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
public class salesrecord {
    private int prodID;
    private String buyerName;
    private String address;
    private int postal;
    private String brand;
    private String date;
    private String batchNo;
    private String quantity;
    private String branch;
    private String email;

    public salesrecord(int prodID, String buyerName, String address, int postal, String brand, String date, String batchNo, String quantity, String branch, String email) {
        this.prodID = prodID;
        this.buyerName = buyerName;
        this.address = address;
        this.postal = postal;
        this.brand = brand;
        this.date = date;
        this.batchNo = batchNo;
        this.quantity = quantity;
        this.branch = branch;
        this.email = email;
    }

    public int getProdID() {
        return prodID;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public String getAddress() {
        return address;
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

    public String getBatchNo() {
        return batchNo;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getBranch() {
        return branch;
    }

    public String getEmail() {
        return email;
    }

  
     
     
    
}
