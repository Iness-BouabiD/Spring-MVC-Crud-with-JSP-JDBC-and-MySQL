<%-- 
    Document   : details
    Created on : 19 déc. 2021, 20:45:22
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    </head>
    <body>
        <h3 style="text-align: center;margin-bottom:100px;margin-top:50px;">Details de l'article : ${message.getDesignation()}</h3>
        
        <ul class="list-group" style="width :350px;text-align: center;margin-left: 700px;font-size:20px;">
            <li  class="list-group-item">Designation : ${message.getDesignation()}</li>
            <li  class="list-group-item list-group-item-warning">Categorie : ${message.getCategorie()}</li>
            <li  class="list-group-item">Quantité stock : ${message.getQuantite()}</li>
            <li  class="list-group-item list-group-item-warning">Prix : ${message.getPrix()}</li>
        </ul>
    </body>
</html>
