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
public class logrecords {
    private int userId;
    private String userName;
    private String userRole;
    private String time;

    public logrecords(int userId, String userName, String userRole, String time) {
        this.userId = userId;
        this.userName = userName;
        this.userRole = userRole;
        this.time = time;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserRole() {
        return userRole;
    }

    public String getTime() {
        return time;
    }
    
}
