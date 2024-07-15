/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User.Service;

import User.DAO.UserDaoInterface;
import User.Model.User;
import java.util.List;

/**
 *
 * @author Tshiamo
 */
public class UserServiceImp implements UserServiceInterface{

    private UserDaoInterface userDao;

    public UserServiceImp(UserDaoInterface userDao) {
        this.userDao = userDao;
    }
    
    
   

    @Override
    public String loginUser(String email,String password) {
        
        User user = userDao.getUser(email);
        String Access_Denied= "Access_Denied";
        if(user.getEmail().equals(email)&& user.getPassword().equals(password))
        {
            String access_Granted = "access_Granted";
            return access_Granted;
        }
        else
            return Access_Denied;
    }

    @Override
    public void update(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void viewUsers(List<User> userlist) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public User getUser(String email) {
        return userDao.getUser(email);
    }

    @Override
    public void createUser(User user) {
         if (user != null) {

            userDao.createUser(user);
        } else {
            // invalidUserException
            throw new NullPointerException("Something was not initialized in the user Login Implementation");
        }
    }
    
}
