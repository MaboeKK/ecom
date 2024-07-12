/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User.DAO;

import User.Model.User;
import java.util.List;

/**
 *
 * @author Tshiamo
 */
public interface UserDaoInterface {
    
    User getUser(String email);
    void updateUser(User user);
    List<User> userList();
    void createUser(User user);
    
}
