/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User.Model;
import lombok.*;
@Getter@Setter@Builder

public class User {
    
    private String employeeID;
    private String firstname;
    private String surname;
    private String email;
    private int accessLevel;
    private String password;
    //private String empId;

    public User() {
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

    
}
