/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecom.Controller;

import User.DAO.UserDAOImp;
import User.Model.User;
import User.Service.UserServiceInterface;
import User.Service.UserServiceImp;
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
@WebServlet(name = "EmployeeController", urlPatterns = {"/EmployeeController"})
public class EmployeeController extends HttpServlet {

    UserServiceInterface service;
  
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
        
        
        System.out.println(request.getParameter("submit") == null ? "request param`submit` is null" : "request param`submit` is not null");
        try 
        {
            String e;
            service = new UserServiceImp(new UserDAOImp());
            if(request.getParameter("submit") != null)
            {
                User user1 = new User();
                //LOOK FOR USER USING THE EMAIL PROVIDED

                //AUTHENTICATE THE USER
                try
                {
                    System.out.println(request.getParameter("email"));
                    e = request.getParameter("email");
                    user1 = service.getUser(e);
                
                if(user1.getEmail().equals(request.getParameter("email")) && user1.getPassword().equals(request.getParameter("password")))
                {
                     
                    //CHECK USERS ACCESS LEVEL AND DIRECT THEM TO TEIR RESPECTIVE PLACES
                    System.out.println("Access granter");
                    System.out.println(user1.getAccessLevel());
                    //Cashier
                    if(user1.getAccessLevel() == 1)
                    {
                        request.getRequestDispatcher("cashierWel.jsp").forward(request, response);
                    }
                    //Floor Manager
                    else if(user1.getAccessLevel() == 2)
                    {
                        request.getRequestDispatcher("cashierWel.jsp").forward(request, response);
                    }
                    //Manager
                    else if(user1.getAccessLevel() == 3)
                    {
                        request.getRequestDispatcher("managerWelcome.jsp").forward(request, response);
                    }
                    //Regional Manager
                    else if(user1.getAccessLevel() == 4)
                    {
                        request.getRequestDispatcher("rejonalManager.jsp").forward(request, response);
                    }
                    //Owner
                    else if(user1.getAccessLevel() == 5)
                    {
                        request.getRequestDispatcher("Owner.jsp").forward(request, response);
                    }
                    else
                    {
                        System.out.println("BUMBA/// HACKER ALERT//HACKER ALERT");
                    }
                }
                else
                {
                        String msg = "Oops the something went wrong,\n Please re-register and double check if all the fields were entered before registering";
                        request.setAttribute("msg", msg);
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                }
                }
                catch(Exception ex)
                {
                    ex.printStackTrace();
                    System.out.println("The users email or password was incorrect");
                }
            }
            

        } 
        catch (Exception e) 
        {
            
        }
        
        /*
            
        */
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
