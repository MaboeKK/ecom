/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User.Controller;

import User.DAO.UserDAOImp;
import User.Model.User;
import User.Service.UserServiceInterface;
import User.Service.UserServiceImp;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Tshiamo
 */
@WebServlet(name = "UserController", urlPatterns = {"/UserController"})
public class UserController extends HttpServlet {
    private UserServiceInterface service;

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        service = new UserServiceImp(new UserDAOImp());
        //MANAGER OF THE STORE SECTION
        int Access;
        System.out.println(request.getParameter("submit") == null ?"submit is null":"submit is not null");
        System.out.println(request.getParameter("accessLevel"));
        switch (request.getParameter("submit")) {

            case "registration":
                //CHECK IF ALL THE VARIBLES FOR REGISTERING HAVE BEEN ENTERIRD
            if(!request.getParameter("employeeID").isEmpty() && !request.getParameter("firstname").isEmpty() && !request.getParameter("surname").isEmpty() && !request.getParameter("email").isEmpty()
                    && !request.getParameter("password").isEmpty() && !request.getParameter("confirmPassword").isEmpty())
            {

                //CHECK WHICH USER IS BEING CREATED BY THE MANAGER
                System.out.println(request.getParameter("accessLevel").equalsIgnoreCase("Standard worker") ?"Manager created a standard worker":"Manager created a Flo0r Manager");
                if(request.getParameter("accessLevel").equalsIgnoreCase("Standard worker"))
                {
                    //This will be a standard worker that does day to day tasks
                    Access = 1;
                }
                else
                {
                    //This worker will have overriding and refund password privillages;
                    Access = 2;
                }
                if(request.getParameter("accessLevel").equalsIgnoreCase("Store Manager"))
                {
                    Access = 3;
                }
                 //CHECK IF THE PASSWORD MATCHES THE CONFIRMATIOON PASSWORD
                if(!request.getParameter("password").equals(request.getParameter("confirmPassword")) )
                {
                    String msg = "Oops the password and the confirm password do not match,\n Please re-register and double chech to be safe";
                    request.setAttribute("msg", msg);
                    request.getRequestDispatcher("Register.jsp").forward(request, response);
                }
                User user;
                user = new User(request.getParameter("employeeID"), request.getParameter("firstname"), request.getParameter("surname") ,request.getParameter("email"), Access, request.getParameter("password"));
                service.createUser(user);
                
                System.out.println("Registration Successful");
                request.getRequestDispatcher("index.jsp").forward(request, response);
                
            }
            else
            {
                    String msg = "Oops the something went wrong,\n Please re-register and double check if all the fields were entered before registering";
                    request.setAttribute("msg", msg);
                    request.getRequestDispatcher("Register.jsp").forward(request, response);
            }
                
                
                break;
        }
        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
