<%-- 
    Document   : Add
    Created on : 19 déc. 2021, 16:30:05
    Author     : HP
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    </head>
    <body>
           <h3 style="text-align: center;margin-bottom:100px;margin-top:50px;">Ajouter un article </h3>
<form method="GET" class="form-horizontal" style="margin-left: 600px; margin-top:100px;">
    <div class="form-group">
      <table class="table" style="width :500px">
          <tr>
              <td>Designation:</td>
              <td><input name="Designation" class="form-control" /></td>
          </tr>
          <tr>
              <td>Quantite:</td>
              <td><input name="Quantite" class="form-control"  /></td>
          </tr>
              <tr>
              <td>Prix:</td>
              <td><input name="Prix" class="form-control" /></td>
          </tr>
              <tr>
              <td>Categorie:</td>
              <td><input name="Categorie" class="form-control"  /></td>
          </tr>
          <tr>
              <td colspan="1" >
               
              </td>
              <td >
                     <input type="submit" value="Save Changes" class="btn btn-success"/>
                   
              </td>
          </tr>
      </table>
    <a href="hello.htm">Revenir à la page d'acceuil</a>
    </div>
  </form>
    </body>
</html>
