<%-- 
    Document   : bon_validasi
    Created on : Dec 1, 2011, 11:54:53 AM
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
  <form method='post' action='Dispatcher?page=terimakasih_telahpesan'>    
  <div id="header">
    <h1 id="logo2"><a>Persetujuan</a></h1>
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
            <%= request.getParameter("namaPelanggan") %>
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
            <%= request.getParameter("nomormeja") %>
        </tr>
        <tr>
          <td>&nbsp;</td>
        </tr>
      </table>
        <table width="500" border="1">
          <tr>
            <th align="center"  scope="row">DAFTAR YANG DIPESAN</th>
          </tr>
        </table>  
      </table>
      <table width="500" border="1">
          <tr align="center">
            <td width="135"><strong>MAKANAN</strong></td>
            <td width="66">JUMLAH</td>
            <td width="77">HARGA</td>
            <td width="91">KETERANGAN</td>
          </tr>
          <tr align="center">
            <td>Nasi Goreng</td>
            <td>1</td>
            <td>Rp 10.000</td>
            <th>HABIS</th>
          </tr>
          <tr align="center">
            <td>Bakmi Goreng</td>
            <td>1</td>
            <td>Rp 10.000</td>
            <td>&nbsp;</td>
          </tr>
          <tr align="center">
            <td>Gurame Bakar</td>
            <td>1</td>
            <td>Rp 25.000</td>
            <td>&nbsp;</td>
          </tr>
          <tr align="center">
            <td><strong>MINUMAN</strong></td>
            <td>JUMLAH</td>
            <td>HARGA</td>
            <td>&nbsp;</td>
          </tr>
          <tr align="center">
            <td>Soda Gembira</td>
            <td>1</td>
            <td>Rp 10.000</td>
            <td>&nbsp;</td>
          </tr>
          <tr align="center">
            <td>Milk Shake</td>
            <td>1</td>
            <td>Rp 9.000</td>
            <th>HABIS</th>
          </tr>
      </table>
      <table width="507" border="0">
          <tr id="name">
            <th width="497" scope="row">Apakah Anda Yakin Dengan Pesanan Anda ?</th>
          </tr>
      </table>
        <form id="form1" name="form1" method="post" action="">
          <blockquote>
            <blockquote>
              <blockquote>
                <blockquote>
                  <h1>
                    <input type='submit' class="elipse" value='Ya' action='Dispatcher?page=terimakasih_telahpesan'/>
                    <input type='submit' class="elipse" value='Tidak' action='Dispatcher?page=pesan'/>
                  </h1>
                </blockquote>
              </blockquote>
            </blockquote>
          </blockquote>
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
