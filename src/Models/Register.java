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
public class Register {
    String Name;
    String NIC;
    String Address;
    String Email;
    int Telephone;

    public Register(String Name, String NIC, String Address, String Email, int Telephone) {
        this.Name = Name;
        this.NIC = NIC;
        this.Address = Address;
        this.Email = Email;
        this.Telephone = Telephone;
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
