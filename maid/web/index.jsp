<%-- 
    Document   : home
    Created on : Dec 30, 2011, 5:44:26 PM
    Author     : olisus
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
  <form method='post' action="Dispatcher?page=loginpelanggan">
  <div id="header">
    <h1 id="logo"><a></a></h1>
  </div>
  <div id="content">
    <br><h3>Selamat datang di Resto Kelompok 12 RBPL</h3></br>
	<br>Kami menyediakan berbagai macam makanan yang lezat dengan harga yang terjangkau. Kualitas masakan yang nikmat berpadu dengan resep yang telah di implementasikan dari jaman nenek moyang, semakin menambah kualitas cita rasa sejati.</br>
	<br>Kami juga menyediakan berbagai minuman yang menyegarkan sekaligus menyehatkan. Semua unsur minuman mengandung bahan-bahan herbal yang dapat meningkatkan kebugaran tubuh.</br>
    <br>Silahkan memesan makanan dan minuman kami dan Selamat Menikmati...[] (^_^)</br>
    <br><input type='submit' value='Klik untuk Pesan Makanan' action='Dispatcher?page=loginpelanggan'/></br>
  </div>
  </form>
  <div id="footer" align="center">
	
  <ul id="mainNav">
    <li><a href="Dispatcher?page=pagekoki" title="Koki">Koki</a></li>
    <li><a href="Dispatcher?page=pagekasir" title="Kasir">Kasir</a></li>
  </ul>
	
  <ul id="metaLink">
      <li>&copy; copyright 2012 - <a>Kelompok 12 RBPL</a> Maid Online</li>
  </ul>
  
  </div>
    
</div>
</body>
</html>