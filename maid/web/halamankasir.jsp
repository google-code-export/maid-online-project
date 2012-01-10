<%-- 
    Document   : halamankasir
    Created on : Nov 30, 2011, 11:30:50 AM
    Author     : ACER
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
  <form method='post' action="Dispatcher?page=halamankasirnota">
  <div id="header">
    <h1 id="logo2"><a>Cari Pelanggan</a></h1>
  </div>
  <div id="content">
        <table border=0>
        <tr>
          <td width="100">
            Nama Pelanggan
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
            Nomor Meja
          </td>
          <td width="5">
            :</td>
          <td width="100">
            <input type=text name="password" value="" /></td>
        </tr>
        </table>
          
    <br><input type='submit' value='Search' class="elipse" action='Dispatcher?page=halamankasirnota'/></br>
  </div>
  </form>
  <div id="footer" align="center">
      <ul id="mainNav">
        <li><a href="" title=""></a></li>
        <li><a href="Dispatcher?page=index" title="index">Logout</a></li>
      </ul>
  <ul id="metaLink">
      <li>&copy; copyright 2012 - <a>Kelompok 12 RBPL</a> Maid Online</li>
  </ul>
  </div>
</div>
</body>
</html>

