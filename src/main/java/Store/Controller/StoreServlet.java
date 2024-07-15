/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Store.Controller;

import Store.DAO.StoreDAOImp;
import Store.Model.Store;
import Store.Service.StoreServiceInterface;
import Store.Service.StoreServicesImp;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tshiamo
 */
@WebServlet(name = "StoreServlet", urlPatterns = {"/StoreServlet"})
public class StoreServlet extends HttpServlet {
    private StoreServiceInterface storeService;
    private Store store;
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        storeService = new StoreServicesImp(new StoreDAOImp());
        
        String AllocatedManager = (request.getParameter("MANAGER_ID"));
        System.out.println();
        
        System.out.println(AllocatedManager);
        
        System.out.println(request.getParameter("submit") == null ?"is null":"is not null");
            
      
        switch (request.getParameter("submit")) {

            case "create":
                    if(!request.getParameter("STORE_LOCATION_PROVINCE").isEmpty()|| !request.getParameter("STORE_LOCATION_CITY").isEmpty()|| !request.getParameter("STORE_LOCATION_ADDRESS").isEmpty())
                     {
                        if(!AllocatedManager.isEmpty())
                        {
                            store = new Store(request.getParameter("STORE_LOCATION_PROVINCE"), request.getParameter("STORE_LOCATION_CITY"), request.getParameter("STORE_LOCATION_ADDRESS"), AllocatedManager);
                            storeService.createStore(store);
                            System.out.println("Store created");
                            String msg = "Store created";
                            request.setAttribute("msg", msg);
                            request.getRequestDispatcher("CreateStore.jsp").forward(request, response);

                        }
                        else
                        {
                            store = new Store(request.getParameter("STORE_LOCATION_PROVINCE"), request.getParameter("STORE_LOCATION_CITY"), request.getParameter("STORE_LOCATION_ADDRESS"));
                            request.getRequestDispatcher("CreateStore.jsp").forward(request, response);
                        }
                     }
                    else
                    {
                          String msg = "OOPs please dont leave fileds empty \n(Except) ManagerID";
                          request.setAttribute("msg", msg);
                          request.getRequestDispatcher("CreateStore.jsp").forward(request, response);
                    }
                    break;
                     
                    
                    
        }
      
        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
