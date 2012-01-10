<%-- 
    Document   : Pesan
    Created on : Nov 17, 2011, 12:17:36 AM
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
  <form method='post' action='Dispatcher?page=halamankoki'>
  <div id="header">
    <h1 id="logo2"><a>Validasi Pesanan</a></h1>
  </div>
  <div id="content">
      
      <div>
      <table width="535" border="1">
      <tr>
        <th align="center" width="520" scope="row">DAFTAR MAKANAN dan MINUMAN</th>
      </tr>
      </table>
      </div>
      <div>
      <table width="534" border="1">
      <tr align="center">
        <th>MAKANAN</th>
        <th>HARGA</th>
        <th>KETERANGAN</th>
      </tr>
      <tr align="center">
        <td width="164">Nasi Goreng</td>
        <td width="98">Rp 10.000</td>
        <td width="62">
          <input name="validasi1" type=radio id="ada" value="Ada"/><a>Ada</a>      
          <input name="validasi1" type=radio id="habis" value="Habis"/><a>Habis</a>
        </td>
      </tr>
      <tr align="center">
        <td>Bakmi Goreng</td>
        <td>Rp 10.000</td>
        <td width="62">
          <input name="validasi2" type=radio id="ada" value="Ada"><a>Ada</a>      
          <input name="validasi2" type=radio id="habis" value="Habis"/><a>Habis</a>
        </td>
      </tr>
      <tr align="center">
        <td>Gurame Bakar</td>
        <td>Rp 25.000</td>
        <td width="62">
          <input name="validasi3" type=radio id="ada" value="Ada"><a>Ada</a>      
          <input name="validasi3" type=radio id="habis" value="Habis"/><a>Habis</a>
        </td>
      </tr>
      <tr align="center">
        <td>Ayam Bakar</td>
        <td>Rp 33.000</td>
        <td width="62">
          <input name="validasi4" type=radio id="ada" value="Ada"><a>Ada</a>      
          <input name="validasi4" type=radio id="habis" value="Habis"/><a>Habis</a>
        </td>
      </tr>
      <tr align="center">
        <td>Nila Bakar</td>
        <td>Rp 23.000</td>
        <td width="62">
          <input name="validasi5" type=radio id="ada" value="Ada"><a>Ada</a>      
          <input name="validasi5" type=radio id="habis" value="Habis"/><a>Habis</a>
        </td>
      </tr>
      <tr align="center">
        <th>MINUMAN</th>
        <th>HARGA</th>
        <th>KETERANGAN</th>
      </tr>
      <tr align="center">
        <td>Soda Gembira</td>
        <td>Rp 10.000</td>
        <td width="62">
          <input name="validasi6" type=radio id="ada" value="Ada"><a>Ada</a>      
          <input name="validasi6" type=radio id="habis" value="Habis"/><a>Habis</a>
        </td>
      </tr>
      <tr align="center">
        <td>Es Teh</td>
        <td>Rp 2.000</td>
        <td width="62">
          <input name="validasi7" type=radio id="ada" value="Ada"><a>Ada</a>      
          <input name="validasi7" type=radio id="habis" value="Habis"/><a>Habis</a>
        </td>
      </tr>
      <tr align="center">
        <td>Es Jeruk</td>
        <td>Rp 4.000</td>
        <td width="62">
          <input name="validasi8" type=radio id="ada" value="Ada"><a>Ada</a>      
          <input name="validasi8" type=radio id="habis" value="Habis"/><a>Habis</a>
        </td>
      </tr>
      <tr align="center">
        <td>Es Dawet</td>
        <td>Rp 5.000</td>
        <td width="62">
          <input name="validasi9" type=radio id="ada" value="Ada"><a>Ada</a>      
          <input name="validasi9" type=radio id="habis" value="Habis"/><a>Habis</a>
        </td>
      </tr>
      </table>
      </div>
        <p>&nbsp;</p>
        <input type='submit' class="elipse" value='Selesai' action='Dispatcher?page=halamankoki'/> 
        <p>&nbsp;</p>
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
    