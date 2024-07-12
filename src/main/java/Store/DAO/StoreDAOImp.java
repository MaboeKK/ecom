/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Store.DAO;

import Store.Model.Store;
import User.DAO.UserDAOImp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tshiamo
 */
public class StoreDAOImp implements StoreDAOInterface{

    private static String URL = "jdbc:mysql://localhost:3306/ecom?useSSL=false";
    private static String username = "root";
    private static String password = "root";
    private static String JDBC = "com.mysql.cj.jdbc.Driver";
    
    private static ResultSet resultSet;
    private static PreparedStatement preparedStatement;
    private static Connection myCon;
    private static List<Store> storeList;
    public StoreDAOImp() {
        try 
        {
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
    public Store getUser(String address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateUser(Store store) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Store> storeList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createUser(Store store) {
        String sql = "INSERT INTO STORE(STORE_LOCATION_PROVINCE, STORE_LOCATION_CITY,STORE_LOCATION_ADDRESS,MANAGER_ID) VALUES(?,?,?,?)";
        
        try {
            preparedStatement = myCon.prepareStatement(sql);
            preparedStatement.setString(1, store.getSTORE_LOCATION_PROVINCE());
            preparedStatement.setString(2, store.getSTORE_LOCATION_CITY());
            preparedStatement.setString(3, store.getSTORE_LOCATION_ADDRESS());
            preparedStatement.setInt(4, Integer.parseInt(store.getMANAGER_ID()));
            preparedStatement.executeUpdate();
            System.out.println("Store Created");
            storeList.add(store);
            //New store added to database
            System.out.println("Added to Database");
        } catch (Exception ex) {
            Logger.getLogger(StoreDAOImp.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        
    }
    
}
