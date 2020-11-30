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
public class organizationalaccounts {
    
    private String username;
    private String email;
    private String Role;

    public organizationalaccounts(String username, String email, String Role) {
        this.username = username;
        this.email = email;
        this.Role = Role;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return Role;
    }
    
}
