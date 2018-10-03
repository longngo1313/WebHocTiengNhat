<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
 <!DOCTYPE html>
 <html>
  <head>
      <meta charset="UTF-8">
      <title>Word List</title>
  </head>
  <body>
      <div align="center">
          <h1>Word List</h1>
          <table border="1">
              <tr>
                <th>Hiragana</th>
                <th>Level</th>
                <th>Kanji</th>
                <th>Katakana</th>
                <th>Nghĩa</th>
              </tr>
              <c:forEach var="word" items="${words}" varStatus="status">
              <tr>
                  <td>${word.wordJP}</td>
                  <td>${word.wordCatalog}</td>
                  <td>${word.wordKanji}</td>
                  <td>${word.wordKata}</td>       
                  <td>${word.wordVN}</td>                     
              </tr>
              </c:forEach>                
          </table>
      </div>
  </body>
</html>