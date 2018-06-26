<%-- 
    Document   : index
    Created on : Aug 22, 2011, 9:50:04 PM
    Author     : bagnes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>word Information</title>
    </head>
    <body>
        <table border="1">
            <td><a href="wordinfo.jsp">Word Info</a></td>
            <td><a href="AllWord">All Word</a></td>            
        </table>
        <br />

        <form action="./WordSevlet" method="POST">
            <table>
                <tr>
                    <td>Word ID:</td>
                    <td><input type="text" name="WordId" value="${word.wordId}"/></td>
                </tr>
                                <tr>
                    <td>Search</td>
                    <td><input  type="text" name="WordSearch" value="${word.wordSearch}"/></td>
                </tr>
                <tr>
                    <td>Catalog</td>
                    <td><input type="text" name="WordCatalog" value="${word.wordCatalog}"/></td>
                </tr>

                <tr>
                    <td>Kanji</td>
                    <td><input type="text" name="WordKanji" value="${word.wordKanji}"/></td>
                </tr>
                <tr>
                    <td>Katakana</td>
                    <td><input type="text" name="WordKata" value="${word.wordKata}"/></td>
                </tr>
              <tr>
                    <td>Mean</td>
                    <td><input type="text" name="WordMean" value="${word.wordMean}"/></td>
                </tr>
                <tr>
                    <td>Location</td>
                    <td><input type="text" name="WordCatalog" value="${word.wordLocation}"/></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="Submit" name="action" value="Add" />
                    <input type="Submit" name="action" value="Edit" />
                    <input type="Submit" name="action" value="Delete" />
                    <input type="Submit" name="action" value="Search" /></td>
                </tr>                
            </table>
        </form>
                
    </body>
</html>
