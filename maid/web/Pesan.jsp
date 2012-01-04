<%-- 
    Document   : Pesan
    Created on : Nov 17, 2011, 12:17:36 AM
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
  <form method='post' action="Dispatcher?page=bonValidasi">
  <div id="header">
    <h1 id="logo2"><a>Silahkan Pilih Pesanan</a></h1>
  </div>
  <div id="content">
      <table border=0>
        <tr>
          <td width="100">
            Nama Anda
          </td>
          <td width="5">
            :</td>
          <td width="100">
            <%= request.getParameter("namaPelanggan") %></td>
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
            <%= request.getParameter("select") %></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
        </tr>
      </table>
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
        <td>JUMLAH</td>
        <td>HARGA</td>
      </tr>
      <tr align="center">
        <td width="164">Nasi Goreng</td>
        <td width="62">
          <input type="text" name="nasigoyeng" value="" size="10" />
        </td>
        <td width="98">Rp 10.000</td>
      </tr>
      <tr align="center">
        <td>Bakmi Goreng</td>
        <td>
          <label>
            <input name="bakmigoyeng" type="text" value="" size="10" />
          </label>
        </td>
        <td>Rp 10.000</td>
      </tr>
      <tr align="center">
        <td>Gurame Bakar</td>
        <td>
          <label>
            <input name="guramebakar" type="text" value="" size="10" />
          </label>
        </td>
        <td>Rp 25.000</td>
      </tr>
      <tr align="center">
        <td>Ayam Bakar</td>
        <td>
          <label>
            <input name="ayambakar" type="text" value="" size="10" />
          </label>
        </td>
        <td>Rp 33.000</td>
      </tr>
      <tr align="center">
        <td>Nila Bakar</td>
        <td>
          <label>
            <input name="nilabakar" type="text" value="" size="10" />
          </label>
        </td>
        <td>Rp 23.000</td>
      </tr>
      <tr align="center">
        <th>MINUMAN</th>
        <td>JUMLAH</td>
        <td>HAARGA</td>
      </tr>
      <tr align="center">
        <td>Soda Gembira</td>
        <td>
          <label>
            <input name="odagembira" type="text" value="" size="10" />
          </label>
        </td>
        <td>Rp 10.000</td>
      </tr>
      <tr align="center">
        <td>Es Teh</td>
        <td>
          <label>
            <input name="esthe" type="text" value="" size="10" />
          </label>
        </td>
        <td>Rp 2.000</td>
      </tr>
      <tr align="center">
        <td>Es Jeruk</td>
        <td>
          <label>
            <input name="eseyuk" type="text" value="" size="10" />
          </label>
        </td>
        <td>Rp 4.000</td>
      </tr>
      <tr align="center">
        <td>Es Dawet</td>
        <td>
          <label>
            <input name="esawet" type="text" value="" size="10" />
          </label>
        </td>
        <td>Rp 5.000</td>
      </tr>
      </table>
      </div>
        <p>&nbsp;</p>
        <input type='submit' class="elipse" value='Selesai' action="Dispatcher?page=bonValidasi"/> 
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
    