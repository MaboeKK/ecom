<%-- 
    Document   : cashierRefund
    Created on : Jul 4, 2024, 12:28:16 PM
    Author     : Tshiamo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href='https://fonts.googleapis.com/css?family=Allura' rel='stylesheet'>
<link href='https://fonts.googleapis.com/css?family=Advent Pro' rel='stylesheet'>
<link href="Stylepages/refund.css" rel="stylesheet" type="text/css"/>
<link href='https://fonts.googleapis.com/css?family=Babylonica' rel='stylesheet'>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Refund Page</title>
    </head>    <header>
        <h1>CAROL'S BOUTIQUE</h1>
    </header>
    <div class="use">
        <div class="paste-button">
        <button class="button">PK </button>
        <div class="dropdown-content">
            <a id="top" href="cashierWel.jsp">Go back to previous page</a>
            <a id="middle" href="index.jsp">Logout</a>
          
        </div>
        </div>
    </div>
    <style>
        body
        {
            
            
            align-items: center;
            
        }
        h5
        {
            margin: 50px 0 10px 50px;
        }
                header
        {
            background-color: #8106EA;
            width: 100%;
            height: 10%;
            align-content: center;
        }
        header h1
        {
            text-align: center;
            color: #fff;
        }
        .myFoot h2
        {
            text-align: right;
            color: #8106EA;
            margin-top: 150px;
            font-family: 'Advent Pro';
        }
        .Refund
        {text-align: center;}

        header
{
    background-color: #8106EA;
    width: 100%;
    height: 10%;
    align-content: center;
}
header h1
{
    text-align: center;
    color: #fff;
}
.whou
{
    margin-top: 20px;
    width: 100%;
    height: 10%;
    background-color: #fff;
}
.use
{
    margin-top: 20px;
    width: 5%;
    
    text-align: center;
}
.use h1
{
    background-color: #8106EA;
    border-radius: 50%;
    padding: 10px 10px;
}

    </style>
    <%
        String msg = (String)request.getAttribute("msg");
        if(msg != null){
    %>
    
    <body>
        <h1> <%= msg %> </h1>
        <% } %>
        <h5>To the customer, ask what was the problem and how we can better improve the item</h5>
        <div class="refund">
            <div class="form-container">
                <p class="title">Refund Form</p>
                <form class="form" method="post" action="AuthorizingServlet">
                  <label>Receipt ID</label>
                  <input type="text" class="input" placeholder="">
                  <label>Item Name</label>
                  <input name="ItemName"type="text" class="input" placeholder="">
                  <label>Stock code/Barcode</label>
                  <input name="Barcode"type="text" class="input" placeholder="">
                  <label>Amount</label>
                  <input name="Amount"type="text" class="input" placeholder="">
                  <input class="form-btn" name="refund" type="submit" value="refund">
                </form>

             </div>
        </div>
        
    </body>
    <footer class="myFoot">
        <h2>Vought Softwares</h2>
    </footer>
</html>
