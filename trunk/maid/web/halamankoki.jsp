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
      <tr>
        <td width="163"><strong>MAKANAN</strong></td>
        <td width="68">JUMLAH</td>
        <td width="114">HARGA</td>
        <td width="149">KETERANGAN</td>
      </tr>
      <tr>
        <td>Nasi Goreng</td>
        <td>${nasigoyeng}</td>
        <td>Rp 10.000</td>
        <th>
        <form id="form1" name="form1" method="post" action="">
            <label>
            <input type="submit" name="button" id="button" value="HABIS" />
              <input type="submit" name="button11" id="button11" value="ANTAR" />
            </label>
            </label>
        </form></th>
      </tr>
      <tr>
        <td>Bakmi Goreng</td>
        <td>${bakmigoyeng}</td>
        <td>Rp 10.000</td>
        <td>
        <label>
        <label>
          <input type="submit" name="button2" id="button2" value="HABIS" />
          <input type="submit" name="button12" id="button12" value="ANTAR" />
        </label>
        </label>
        </td>
      </tr>
      <tr>
        <td>Gurame Bakar</td>
        <td>${guramebakar}</td>
        <td>Rp 25.000</td>
        <td><form id="form3" name="form3" method="post" action="">
          <label>
          <label>
        <label>
        <label>
        <label>
        <label>
        <label>
        <label>
            <input type="submit" name="button3" id="button3" value="HABIS" />
            <input type="submit" name="button13" id="button13" value="ANTAR" />
        </label>
        </td>
      </tr>
      <tr>
        <td><strong>MINUMAN</strong></td>
        <td>JUMLAH</td>
        <td>HARGA</td>
        <td>KETERANGAN</td>
      </tr>
      <tr>
        <td>Soda Gembira</td>
        <td>${odagembira}</td>
        <td>Rp 10.000</td>
        <td><form id="form4" name="form4" method="post" action="">
          <label>
          <label>
        <label>
        <label>
        <label>
        <label>
        <label>
        <label>
            <input type="submit" name="button4" id="button4" value="HABIS" />
            <input type="submit" name="button14" id="button14" value="ANTAR" />
          </label>
        </td>
      </tr>
      <tr>
        <td>Es Teh</td>
        <td>${esthe}</td>
        <td>Rp 9.000</td>
        <td><form id="form5" name="form5" method="post" action="">
          <label>
          <label>
        <label>
        <label>
        <label>
        <label>
        <label>
        <label>
            <input type="submit" name="button5" id="button5" value="HABIS" />
          </label>
        <label>
          <input type="submit" name="button15" id="button15" value="ANTAR" />
        </label>
        </form></td>
      </tr>
    </table>
    <p>&nbsp;</p>      
    <br><input type='submit' value='Refresh' class="elipse" action='Dispatcher?page=halamankoki'/></br>
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
