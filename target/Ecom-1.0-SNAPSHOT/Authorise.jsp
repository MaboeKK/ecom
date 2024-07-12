<%-- 
    Document   : Authorise
    Created on : Jul 7, 2024, 4:22:03 PM
    Author     : Tshiamo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="Stylepages/authorize.css" rel="stylesheet" type="text/css"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Authorize Page</title>
    </head>
    <style>
        h5
        {
            text-align: center;
        }
    </style>
    <body>
        
        <h5>To the Floor Manager, please make sure that the cashier is not committing any fraud\n OR you will be implicated</h5>
        <div class="authorize">
            <div class="form-container">
                <p class="title">Authorize Password</p>
                <form class="form" method="post" action="forgotpassword">
                  <label>Authorize Password</label>
                  <input type="password" class="input" placeholder="">
                  <input class="form-btn" name="submit" type="submit" value="login">
                </form>

             </div>
        </div>
    </body>
</html>
