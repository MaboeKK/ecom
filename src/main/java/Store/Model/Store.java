/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Store.Model;

/**
 *
 * @author Tshiamo
 */
public class Store {
   
    private String STORE_LOCATION_PROVINCE;
    private String STORE_LOCATION_CITY;
    private String STORE_LOCATION_ADDRESS;
    private String MANAGER_ID ;

    public Store() {
    }

    public Store(String STORE_LOCATION_PROVINCE, String STORE_LOCATION_CITY, String STORE_LOCATION_ADDRESS, String MANAGER_ID) {
        this.STORE_LOCATION_PROVINCE = STORE_LOCATION_PROVINCE;
        this.STORE_LOCATION_CITY = STORE_LOCATION_CITY;
        this.STORE_LOCATION_ADDRESS = STORE_LOCATION_ADDRESS;
        this.MANAGER_ID = MANAGER_ID;
    }

    public Store(String STORE_LOCATION_PROVINCE, String STORE_LOCATION_CITY, String STORE_LOCATION_ADDRESS) {
        this.STORE_LOCATION_PROVINCE = STORE_LOCATION_PROVINCE;
        this.STORE_LOCATION_CITY = STORE_LOCATION_CITY;
        this.STORE_LOCATION_ADDRESS = STORE_LOCATION_ADDRESS;
    }

    public String getSTORE_LOCATION_PROVINCE() {
        return STORE_LOCATION_PROVINCE;
    }

    public void setSTORE_LOCATION_PROVINCE(String STORE_LOCATION_PROVINCE) {
        this.STORE_LOCATION_PROVINCE = STORE_LOCATION_PROVINCE;
    }

    public String getSTORE_LOCATION_CITY() {
        return STORE_LOCATION_CITY;
    }

    public void setSTORE_LOCATION_CITY(String STORE_LOCATION_CITY) {
        this.STORE_LOCATION_CITY = STORE_LOCATION_CITY;
    }

    public String getSTORE_LOCATION_ADDRESS() {
        return STORE_LOCATION_ADDRESS;
    }

    public void setSTORE_LOCATION_ADDRESS(String STORE_LOCATION_ADDRESS) {
        this.STORE_LOCATION_ADDRESS = STORE_LOCATION_ADDRESS;
    }

    public String getMANAGER_ID() {
        return MANAGER_ID;
    }

    public void setMANAGER_ID(String MANAGER_ID) {
        this.MANAGER_ID = MANAGER_ID;
    }
    
}
