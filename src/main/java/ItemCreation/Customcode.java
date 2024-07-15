/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ItemCreation;

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
@WebServlet(name = "Customcode", urlPatterns = {"/Customcode"})
public class Customcode extends HttpServlet {


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
        Barcode bc = new Barcode();
        StringBuilder sb = new StringBuilder();
        //Check if the batch number from endor has been entered
        if(request.getParameter("batchNum").isEmpty())
        {
            String msg = "Please make sure that all the fields have been insereted ins";
            request.setAttribute("msg", msg);
            request.getRequestDispatcher("CustomCode.jsp").forward(request, response);
        }
        //Take the customers inputs and create a new barcode
        String batchNumber = request.getParameter("batchNum").substring(0, 4);
        String gender = request.getParameter("Gender");
        String department = request.getParameter("Department");
        
        String departmentR;
        String genderR;
        sb.append(batchNumber);
        System.out.println(sb);
        
        System.out.println(request.getParameter("submit")== null ? "null":"not null");
        switch(request.getParameter("submit"))
        {
            case"submit":
                if(!batchNumber.isEmpty()||gender.isEmpty()||department.isEmpty()||request.getParameter("itemName").isEmpty())
                {
                    switch(gender)
                    {
                        case"UNI-SEX":
                            genderR = "0";
                            System.out.println(genderR);
                            sb.append(genderR);
                            break;

                        case"MALE":
                            genderR = "1";
                            System.out.println(genderR);
                            sb.append(genderR);
                            break;

                        case"FEMALE":
                            genderR = "2";
                            System.out.println(genderR);
                            sb.append(genderR);
                            break;
                    }

                    switch(department)
                    {
                        case"TOPS":
                            departmentR = "0";
                            System.out.println(departmentR);
                            sb.append(departmentR);
                            break;

                        case"BOTTOMS":
                            departmentR = "1";
                            System.out.println(departmentR);
                            sb.append(departmentR);
                            break;

                        case"SHOES":
                             departmentR = "2";
                            System.out.println(departmentR);
                            sb.append(departmentR);
                            break;
                    }

                }
                else
                {
                    String msg = "Please make sure that all the fields have been insereted ins";
                    request.setAttribute("msg", msg);
                    request.getRequestDispatcher("CustomCode.jsp").forward(request, response);
                }
                break;
        }
        String customCode = sb.toString();
        bc.barCode(customCode);
        request.getRequestDispatcher("cashierWel.jsp").forward(request, response);
        
        
        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
