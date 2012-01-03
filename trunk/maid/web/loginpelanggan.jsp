<%-- 
    Document   : index
    Created on : Nov 16, 2011, 11:45:31 PM
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
  <form method='post' action="Dispatcher?page=pesan">
  <div id="header">
    <h1 id="logo2"><a>Silahkan Isikan Nama dan Nomor Meja</a></h1>
  </div>
  <div id="content">
        <table border=0>
        <tr>
          <td width="100">
            Masukkan Nama
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
          <td>
          <select name="nomormeja" value="">
            <option value="" selected>- Silahkan Pilih Meja -</option>
            <option  value="1">1</option>
            <option  value="2">2</option>
            <option  value="3">3</option>
            <option  value="4">4</option>
            <option  value="5">5</option>
            <option  value="6">6</option>
            <option  value="7">7</option>
            <option  value="8">8</option></select>
          </td>
        </tr>
        </table>   
      
    <br><input type='submit' value='Klik untuk Pesan Makanan' action='Dispatcher?page=pesan'/></br>
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
