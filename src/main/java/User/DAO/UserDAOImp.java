/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User.DAO;

import User.Model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tshiamo
 */
public class UserDAOImp implements UserDaoInterface{
    
    private static String URL = "jdbc:mysql://localhost:3306/ecommerce?useSSL=false";
    private static String username = "root";
    private static String password = "root";
    private static String JDBC = "com.mysql.cj.jdbc.Driver";
    
    private static ResultSet resultSet;
    private static PreparedStatement preparedStatement;
    private static Connection myCon;
    private static List<User> userList = new ArrayList<>();
    public UserDAOImp() 
    {
        try {
            Class.forName(JDBC);
            System.out.println("Loaded...");
            myCon = DriverManager.getConnection(URL,username,password);
            System.out.println("Connected");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

         
         
    @Override
    public User getUser(String email) {
        String sql = "SELECT EMPLOYEEID,FIRSTNAME,SURNAME,EMAIL,PASSWORD,ACCESS_LEVEL FROM USER WHERE email=? ";
             try {
                 User user;
                 preparedStatement = myCon.prepareStatement(sql);
                 preparedStatement.setString(1, email);
                 resultSet = preparedStatement.executeQuery();
                 if(resultSet.next())
                 {
                     String EMPLOYEEID = resultSet.getString("EMPLOYEEID");
                     String FIRSTNAME = resultSet.getString("FIRSTNAME");
                     String SURNAME = resultSet.getString("SURNAME");
                     String EMAIL = resultSet.getString("EMAIL");
                     String PASSWORD = resultSet.getString("PASSWORD");
                     String ACCESS_LEVEL = resultSet.getString("ACCESS_LEVEL");
                     
                     user = new User(EMPLOYEEID, FIRSTNAME, SURNAME, EMAIL, Integer.parseInt(ACCESS_LEVEL), PASSWORD);  
                     return user;
                 }
                 
             } catch (SQLException ex) {
                 ex.printStackTrace();
                 Logger.getLogger(UserDAOImp.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             return null;
    }

    @Override
    public void updateUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> userList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createUser(User user) {
       String sql = "INSERT INTO USER(EMPLOYEEID,FIRSTNAME,SURNAME,EMAIL,PASSWORD,ACCESS_LEVEL) VALUES(?,?,?,?,?,?)";
        
             try {
                 preparedStatement= myCon.prepareStatement(sql);
                 preparedStatement.setString(1, user.getEmployeeID());
                 preparedStatement.setString(2, user.getFirstname());
                 preparedStatement.setString(3, user.getSurname());
                 preparedStatement.setString(4, user.getEmail());
                 preparedStatement.setString(5, user.getPassword());
                 preparedStatement.setInt(6, user.getAccessLevel());
                 preparedStatement.executeUpdate();
                 System.out.println("User Created");
                 
             } catch (Exception ex) {
                 Logger.getLogger(UserDAOImp.class.getName()).log(Level.SEVERE, null, ex);
                 ex.printStackTrace();
             }
    }

 


}
