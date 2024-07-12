/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Store.Service;

import Store.Model.Store;

/**
 *
 * @author Tshiamo
 */
public interface StoreServiceInterface {
    void createStore(Store store);
    Store getStore(String address);
}
