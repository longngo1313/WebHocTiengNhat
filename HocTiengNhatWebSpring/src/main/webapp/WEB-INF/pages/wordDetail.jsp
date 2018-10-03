<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
 <!DOCTYPE html>
 <html>
  <head>
      <meta charset="UTF-8">
      <title>Word Detail</title>
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
              <tr>
                  <td>${wordDetail.wordJP}</td>
                  <td>${wordDetail.wordCatalog}</td>
                  <td>${wordDetail.wordKanji}</td>
                  <td>${wordDetail.wordKata}</td>       
                  <td>${wordDetail.wordVN}</td>                     
              </tr>               
          </table>
      </div>
  </body>
</html>