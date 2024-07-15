<%-- 
    Document   : lookupItem
    Created on : Jul 4, 2024, 9:43:25 PM
    Author     : Tshiamo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="Stylepages/lookupItem.css" rel="stylesheet" type="text/css"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Look Up Item Page</title>
    </head>
    <style>
        .formB {
            width: 90%;
            height: 90%;
            padding: 0 50px;
        }
        .searchF {
            align-content: center;
            padding: 10px 0;
        }
        .window {
            width: 80%;
            height: 80%;
            align-content: center;
        }
        .findings {
            background-color: white;
            width: 100%;
            height: 80%;
            border-radius: 5px;
            box-shadow: 0px 10px 20px -18px;
        }
        h1 {
            text-align: center;
            margin: 100px 0 0 0;
        }
        h5 {
            text-align: center;
        }
        .itemList table {
        width: 80%;
    }
    .itemList table td {
        text-align: center;
        padding: 10px;
        max-width: 10px; /* Adjust maximum width as per your requirement */
        max-height: 10px; /* Adjust maximum height as per your requirement */
    }
    .itemList table td img {
        max-width: 90%;
        max-height: 90%;
    }
        
    </style>
    <body>
        <h1>Hello World!</h1>
        <h5>
            Which product are we looking for?
        </h5>
        <hr>
        <div class="window">
           <div class="formB">
            <div class="searchF">
                <input class="input" name="text" placeholder="Search..." type="search">
                <div class="findings">
                    <div class="itemList">
                    <table>   
                        <tr>
                            <td>
                                 <img src="Images/Items/ProActive Cross-Trainers.png">
                            </td>
                            <td>
                                <img src="Images/Items/Retro Style Casual Trainers.png">
                            </td>
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
