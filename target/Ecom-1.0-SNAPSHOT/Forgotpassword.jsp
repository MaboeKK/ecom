<%-- 
    Document   : Forgotpassword
    Created on : Jul 6, 2024, 10:16:24 AM
    Author     : Tshiamo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="Stylepages/ForgotPass.css" rel="stylesheet" type="text/css"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forgot password Page</title>
    </head>
    <style>
        h5
        {
            text-align: center;
        }
    </style>
    <body>
       <h5>To the Manager, please make sure that the user is a valid one and that the details are correct</h5>
        <div class="forgot">
            <div class="form-container">
                <p class="title">Forgot Password</p>
                <form class="form" method="post" action="forgotpassword">
                  <label>Email</label>
                  <input type="email" class="input" placeholder="">
                  <label>Managers Code</label>
                  <input type="password" class="input" placeholder="">
                  <label>Password</label>
                  <input type="password" class="input" placeholder="">
                  <label>Confirm Password</label>
                  <input type="password" class="input" placeholder="">
                  <input class="form-btn" name="submit" type="submit" value="login">
                </form>

             </div>
        </div>
    </body>
</html>
