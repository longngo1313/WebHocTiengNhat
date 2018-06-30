<%-- 
    Document   : validate
    Created on : Jun 28, 2018, 4:10:55 PM
    Author     : meep
--%>


<%@page import="java.net.URLEncoder"%>
<%@page import="LearnJav.ulity.Word"%>
<!DOCTYPE html>
<%@ page import ="java.sql.*" %>
<%@ page import ="LearnJav.model.*" %>
<%@page import="javax.ejb.EJB"%>

<%@page import="LearnJav.model.wordDAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<%
    request.setCharacterEncoding( "UTF-8" );
        String key = request.getParameter("key");
    
          
        try{
                      
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
        Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=LearnJap","sa","0plm0plm");    
        PreparedStatement pst = conn.prepareStatement("SELECT * FROM word where WordSearch=?");
        pst.setString(1, key);
        ResultSet rs = pst.executeQuery();                        
        
        if(rs.next())     {    
           
       response.sendRedirect("/LearnJav/Search?key=" + URLEncoder.encode(key, "UTF-8"));
   
        
        }
        else 
            response.sendRedirect("error");
   }
   catch(Exception e){       
       
       out.println("Something went wrong !! Please try again");       
   }      
    
    
%>
</head>
</html>