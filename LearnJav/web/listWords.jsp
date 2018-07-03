<%-- 
    Document   : listProducts
    Created on : Jun 15, 2018, 7:16:54 PM
    Author     : Lab06
--%>



<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
             <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  
        <title>List Product</title>
    </head>
    <body>
        <table border="1">
            <thead>
            <th>Word ID</th>
            <th>Word</th>
            <th>Catalog</th>
            <th>Kanji</th>
            <th>Katakana</th>
         <th>Mean</th>
         <th>Location</th>
        </thead>
        <tbody>
            <c:forEach items="${requestScope.listWords}" var="wor">
                <tr><td><a href="./SearchWord?WordSearch=${wor.wordSearch}">${wor.wordId}</a><td>
                    <td>${wor.wordSearch}</td>
                    <td>${wor.wordCatalog}</td>
                    <td>${wor.wordKanji}</td>
                    <td>${wor.wordKata}</td>
                    <td>${wor.wordMean}</td>
                    <td>${wor.wordLocation}</td>
                </tr>
            </c:forEach>

        </tbody>
    </table>
</body>
</html>
