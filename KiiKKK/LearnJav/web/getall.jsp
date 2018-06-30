<%@ page import="java.sql.*" %> 
<%
String id = request.getParameter("id").toString();
System.out.println(id);
String data ="";
try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=LearnJap", "sa", "0plm0plm");
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select * from word where WordSearch='"+id+"'");
while(rs.next())
{
 data = ":" + rs.getString("WordSearch") + ": " + rs.getString("WordMean");
}
  out.println(data);
  System.out.println(data);
}
catch(Exception e) {
System.out.println(e);
}
%>