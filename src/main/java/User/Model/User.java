/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User.Model;

/**
 *
 * @author Tshiamo
 */
public class User {
    
    private String employeeID;
    private String firstname;
    private String surname;
    private String email;
    private int accessLevel;
    private String password;

    public User() {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }



    public User(String employeeID, String firstname, String surname, String email, int accessLevel, String password) {
        this.employeeID = employeeID;
        this.firstname = firstname;
        this.surname = surname;
        this.email = email;
        this.accessLevel = accessLevel;
        this.password = password;
    }

    public User(String employeeID, String firstname, String surname, String email, String password) {
        this.employeeID = employeeID;
        this.firstname = firstname;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }
    
    

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
