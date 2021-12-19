<%-- 
    Document   : hello
    Created on : 18 déc. 2021, 13:23:38
    Author     : HP
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="Model.Article"%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <%@ page isELIgnored="false" %>    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    </head>
    <body> 
        <h1 style="text-align:center;margin-top: 50px;margin-bottom: 50px;"><a href="ajouter.htm" style="text-align:center;">Ajouter un nouvel article</a></h1>
    <table class="table table-hover" style="width:1050px; text-align:center;margin-left: 350px;">
            <thead class="thead-light">
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Designation</th>
                    <th scope="col">Categorie</th>
                    <th scope="col">Quantité Stock</th>
                    <th scope="col">Prix</th>
                    <th scope="col">Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${list}" var="module">
    
                <tr>
               
                    <td>${module.ID_Article}</td>
                    <td>${module.getDesignation()}</td>
                    <td>${module.getCategorie()}</td>
                    <td>${module.getQuantite()}</td>
                    <td>${module.getPrix()}</td>
                    <td>
                        <a href="modifier.htm?id=${module.getID_Article()}" class="btn btn-warning">Modifier</a><!-- comment -->
                        <a href="supprimer.htm?id=${module.getID_Article()}" class="btn btn-danger"  onClick="refreshPage()">Supprimer</a>
                        <a href="details.htm?id=${module.getID_Article()}" class="btn btn-info">Details</a>
                    </td>
                </tr>
                </c:forEach>
            </tbody>
        </table>


    </body>
</html>
