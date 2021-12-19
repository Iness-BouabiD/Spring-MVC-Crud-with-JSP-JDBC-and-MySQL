<%-- 
    Document   : modifier
    Created on : 19 déc. 2021, 17:19:55
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <%@ page isELIgnored="false" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    </head>
    <body>
        
        <h3 style="text-align: center;">Modifier l'article : ${message.getDesignation()}</h3>
      <form method="POST" class="form-horizontal" style="margin-left:630px; margin-top:100px;width :500px; ">
      <table class="table">
          <tr>
              <td>Designation:</td>
              <td><input name="Designation" value="${message.getDesignation()}" class="form-control"/></td>
          </tr>
          <tr>
              <td>Quantite:</td>
              <td><input name="Quantite" value="${message.getQuantite()}" class="form-control"/></td>
          </tr>
              <tr>
              <td>Prix:</td>
              <td><input name="Prix" value="${message.getPrix()}" class="form-control"/></td>
          </tr>
              <tr>
              <td>Categorie:</td>
              <td><input name="Categorie" value="${message.getCategorie()}" class="form-control" /></td>
          </tr>
          <tr>
                <tr>
              <td colspan="1" >
               
              </td>
              <td >
                     <input type="submit" value="Save Changes" class="btn btn-success"/>
                   
              </td>
          </tr>
          </tr>
      </table>
    <a href="hello.htm">Revenir à la page d'acceuil</a>
  </form>
    </body>
</html>
