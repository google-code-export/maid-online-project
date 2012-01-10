<%-- 
    Document   : halamankoki
    Created on : Nov 29, 2011, 12:32:13 PM
    Author     : Fahrian09
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
  <form method='post' action="Dispatcher?page=halamankoki">
  <div id="header">
    <h1 id="logo2"><a>Daftar Pesanan Pelanggan</a></h1>
  </div>
  <div id="content">
        
  <table width="200" border="0">
    <tr>
      <td width="100">
        Nama Pelanggan
      </td>
      <td width="5">
        :</td>
      <td width="100">
        ${namaPelanggan}
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
        ${select}
    </tr>
    <tr>
      <td>&nbsp;</td>
    </tr>
  </table>
    <table align="center" width="522" border="1">
      <tr>
        <th align="center" scope="row">DAFTAR YANG DIPESAN</th>
      </tr>
    </table>
    <table width="522" border="1">
      <tr align="center">
        <td width="163"><strong>MAKANAN</strong></td>
        <td width="68">JUMLAH</td>
        <td width="114">HARGA</td>
      </tr>
      <tr align="center">
        <td>Nasi Goreng</td>
        <td>${nasigoyeng}</td>
        <td>Rp 10.000</td>
      </tr>
      <tr align="center">
        <td>Bakmi Goreng</td>
        <td>${bakmigoyeng}</td>
        <td>Rp 10.000</td>
      </tr>
      <tr align="center">
        <td>Gurame Bakar</td>
        <td>${guramebakar}</td>
        <td>Rp 25.000</td>
      </tr>
      <tr align="center">
        <td>Ayam Bakar</td>
        <td>${ayambakar}</td>
        <td>Rp 33.000</td>
      </tr>
      <tr align="center">
        <td>Nila Bakar</td>
        <td>${nilabakar}</td>
        <td>Rp 23.000</td>
      </tr>
      <tr align="center">
        <td><strong>MINUMAN</strong></td>
        <td>JUMLAH</td>
        <td>HARGA</td>
      </tr>
      <tr align="center">
        <td>Soda Gembira</td>
        <td>${odagembira}</td>
        <td>Rp 10.000</td>
      <tr align="center">
        <td>Es Teh</td>
        <td>${esthe}</td>
        <td>Rp 9.000</td>
      </tr>
      <tr align="center">
        <td>Es Jeruk</td>
        <td>${eseyuk}</td>
        <td>Rp 4.000</td>
      </tr>
      <tr align="center">
        <td>Es Dawet</td>
        <td>${esawet}</td>
        <td>Rp 5.000</td>
      </tr>
      
    </table>
    <p>&nbsp;</p>      
    <br><input type='submit' value='Antar' class="elipse" action='Dispatcher?page=halamankoki'/></br>
  </div>
  </form>
  <div id="footer" align="center">
      <ul id="mainNav">
        <li><a href="Dispatcher?page=validasikoki" title="validasi">Validasi</a></li>
        <li><a href="Dispatcher?page=index" title="index">Logout</a></li>
      </ul>
  <ul id="metaLink">
      <li>&copy; copyright 2012 - <a>Kelompok 12 RBPL</a> Maid Online</li>
  </ul>
  </div>
</div>
</body>
</html>
