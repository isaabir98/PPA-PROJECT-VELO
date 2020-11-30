/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author mhd sathlan
 */
public class BuyN {

    int productID;
    String productName;
    String brandName;
    float price;
    String size;
    String Name;
    String NIC;
    String Address;
    String Email;
    int Telephone;

    public BuyN(int productID, String productName, String brandName, float price, String size, String Name, String NIC, String Address, String Email, int Telephone) {
        this.productID = productID;
        this.productName = productName;
        this.brandName = brandName;
        this.price = price;
        this.size = size;
        this.Name = Name;
        this.NIC = NIC;
        this.Address = Address;
        this.Email = Email;
        this.Telephone = Telephone;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getTelephone() {
        return Telephone;
    }

    public void setTelephone(int Telephone) {
        this.Telephone = Telephone;
    }

    
}
