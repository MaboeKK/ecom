<%-- 
    Document   : GetInventory
    Created on : Jul 5, 2024, 1:01:04 PM
    Author     : Tshiamo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="Stylepages/lookupItem.css" rel="stylesheet" type="text/css"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inventory Page</title>
    </head>
    <style>
                .formB
        {
            width: 90%;
            height: 90%;
            /*background-color: #C11AF2;*/
            padding: 0 50px;
            
        }
        .searchF
        {
            align-content: center;
            
            
            padding: 10px 0;
        }
        .window
        {
            width: 100%;
            height: 80%;
            /*background-color: #8106EA:*/
            align-content: center;
            
        }
        .findings
        {
            background-color: white;
            width: 100%;
            height: 80%;
            border-radius: 5px;
            box-shadow: 0px 10px 20px -18px;
        }
        h1
        {
            text-align: center;
            margin: 100px 0 0 0;
        }
        h5
        {
            text-align: center;
        }
    </style>
    <body>
        <h1>Hello World!</h1>
        <h5>
            Look Up Remaining Inventory?
        </h5>
        <hr>
        <div class="window">
           <div class="formB">
            <div class="searchF">
                <input class="input" name="text" placeholder="Search Department..." type="search">
                <input class="input" name="date" placeholder="date" type="date">
                <div class="findings">
                    <div class="itemList">
                    <table>   
                        <tr>
                            <td>c2</td>
                            <td>c2</td>
                            <td>c2</td>
                            <td>c2</td>
                            <td>c2</td>
                        </tr>
                        <tr>
                            <td>c2</td>
                            <td>c2</td>
                            <td>c2</td>
                            <td>c2</td>
                            <td>c2</td>
                        </tr>
                        <tr>
                            <td>c2</td>
                            <td>c2</td>
                            <td>c2</td>
                            <td>c2</td>
                            <td>c2</td>
                        </tr>
                        <tr>
                            <td>c2</td>
                            <td>c2</td>
                            <td>c2</td>
                            <td>c2</td>
                            <td>c2</td>
                        </tr>
                    </table>
                </div>
                </div>
            </div>
        </div> 
        </div>
    </body>
</html>
