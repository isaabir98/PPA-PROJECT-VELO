/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;

/**
 *
 * @author mhd sathlan
 */
public class Delivery {

   String sellerNIC ;
   String deliveryDate ;
   int  Telephone ;
   int ProductId ;
   String buyerName ;
   String CustomerAddress ;
  String  sellerEmail ;

    public Delivery(String sellerNIC, String deliveryDate, int Telephone, int ProductId, String buyerName, String CustomerAddress, String sellerEmail) {
        this.sellerNIC = sellerNIC;
        this.deliveryDate = deliveryDate;
        this.Telephone = Telephone;
        this.ProductId = ProductId;
        this.buyerName = buyerName;
        this.CustomerAddress = CustomerAddress;
        this.sellerEmail = sellerEmail;
    }

    public String getSellerNIC() {
        return sellerNIC;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public int getTelephone() {
        return Telephone;
    }

    public int getProductId() {
        return ProductId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public String getSellerEmail() {
        return sellerEmail;
    }

    public void setSellerNIC(String sellerNIC) {
        this.sellerNIC = sellerNIC;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setTelephone(int Telephone) {
        this.Telephone = Telephone;
    }

    public void setProductId(int ProductId) {
        this.ProductId = ProductId;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }

    public void setSellerEmail(String sellerEmail) {
        this.sellerEmail = sellerEmail;
    }


   

}
