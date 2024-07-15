/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Store.DAO;

import Store.Model.Store;
import java.util.List;

/**
 *
 * @author Tshiamo
 */
public interface StoreDAOInterface {
    Store getUser(String address);
    void updateUser(Store store);
    List<Store> storeList();
    void createUser(Store user);
    
}
