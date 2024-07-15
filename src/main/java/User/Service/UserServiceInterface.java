/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User.Service;

import User.Model.User;
import java.util.List;

/**
 *
 * @author Tshiamo
 */
public interface UserServiceInterface {
    
    void createUser(User user);
    String loginUser(String email,String password); 
    User getUser(String email);
    void update(User user);
    void viewUsers(List<User> userlist);
}
