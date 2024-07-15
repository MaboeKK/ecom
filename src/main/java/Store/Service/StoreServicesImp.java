/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Store.Service;

import Store.DAO.StoreDAOInterface;
import Store.Model.Store;

/**
 *
 * @author Tshiamo
 */
public class StoreServicesImp implements StoreServiceInterface{
    private StoreDAOInterface storeDAO;

    public StoreServicesImp(StoreDAOInterface storeDAO) {
        this.storeDAO = storeDAO;
    }

    @Override
    public void createStore(Store store) {
         if (store != null) {

            storeDAO.createUser(store);
        }
    }

    @Override
    public Store getStore(String address) {
        return storeDAO.getUser(address);
    }
    
    
}
