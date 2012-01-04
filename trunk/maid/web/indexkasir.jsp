<%-- 
    Document   : index
    Created on : Nov 16, 2011, 11:45:31 PM
    Author     : Ricko
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Maid Online</title>
  <link rel="stylesheet" href="css/mainStyle.css" type="text/css" media="screen" />
</head>
<body>
<div id="container">
  <form method='post' action="Dispatcher?page=halamankasir">
  <div id="header">
    <h1 id="logo2"><a>Login Kasir</a></h1>
  </div>
  <div id="content">
        <table border=0>
        <tr>
          <td width="100">
            Username
          </td>
          <td width="5">
            :</td>
          <td width="100">
            <input type=text name="namaPelanggan" value="" /></td>
        </tr>
        <tr>   
        </tr>
        <tr>
          <td width="100">
            Password
          </td>
          <td width="5">
            :</td>
          <td width="100">
            <input type=text name="password" value="" /></td>
        </tr>
        </table>   
      
    <br><input type='submit' value='Login' class="elipse" action='Dispatcher?page=halamankasir'/></br>
  </div>
  </form>
  <div id="footer" align="center">
  <ul id="metaLink">
      <li>&copy; copyright 2012 - <a>Kelompok 12 RBPL</a> Maid Online</li>
  </ul>
  </div>
</div>
</body>
</html>
