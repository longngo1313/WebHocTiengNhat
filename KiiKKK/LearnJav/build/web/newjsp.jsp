<%@page import="java.sql.*"%>
<html>
<head>
<script type="text/javascript">
function showData(){ 
xmlHttp=GetXmlHttpObject()
    var id=document.getElementById("id").value;
var url="getall";
url=url+"?id="+id;
xmlHttp.onreadystatechange=stateChanged 
xmlHttp.open("GET",url,true)
xmlHttp.send(null);
}
function stateChanged(){ 
if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){ 
    var showdata = xmlHttp.responseText; 
    var strar = showdata.split(":");
      if(strar.length>1){
        var strname = strar[1];
        document.getElementById("type").value= strar[1];
        document.getElementById("price").value= strar[2];
         }
       } 
     }
function GetXmlHttpObject(){
var xmlHttp=null;
try{
  xmlHttp=new XMLHttpRequest();
 }
catch(e){
 try{
  xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
  }
 catch(e){
  xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
 }
return xmlHttp;
}
</script>
</head>
<body>
<br><br>
<table >
<tr><td>ID:</td><td><input type="text" id="id" name="id" onkeyup="showData();"></td></tr>
<tr><td>Product Type:</td><td><input type="text" id="type" name="name"></td></tr>
<tr><td>Price:</td><td><input type="text" id="price" name="address"></td></tr>
</table>
</body>
</html>