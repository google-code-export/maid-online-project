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
  <form method='post' action='Dispatcher?page=bonValidasi'>
  <div id="header">
    <h1 id="logo2"><a>Silahkan Pilih Pesanan</a></h1>
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
            ${namaPelanggan}</td>
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
            ${select}</td>
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
        <td>INFO</td>
        <td>KETERANGAN</td>
      </tr>
      <tr align="center">
        <td width="164">Nasi Goreng</td>
        <td>
          <input name="nasigoyeng" type="text"  value="" size="10" />
        </td>
        <td width="98">Rp 10.000</td>
        <td width="108"><form id="form6" name="form6" method="post" action="">
          <label>
            <input type="submit" name="GAMBAR" id="GAMBAR" value="DETAIL" />
          </label>
        </form></td>
        <td>${validasi1}</td>
      </tr>
      <tr align="center">
        <td>Bakmi Goreng</td>
        <td>
          <input name="bakmigoyeng" type="text"  value="" size="10" />
        </td>
        <td>Rp 10.000</td>
        <td><form id="form7" name="form7" method="post" action="">
          <label>
            <input type="submit" name="GAMBAR2" id="GAMBAR2" value="DETAIL" />
          </label>
        </form></td>
        <td>${validasi2}</td>
      </tr>
      <tr align="center">
        <td>Gurame Bakar</td>
        <td>
          <input name="guramebakar" type="text"  value="" size="10" />
        </td>
        <td>Rp 25.000</td>
        <td><form id="form8" name="form8" method="post" action="">
          <label>
            <input type="submit" name="GAMBAR3" id="GAMBAR3" value="DETAIL" />
          </label>
        </form></td>
        <td>${validasi3}</td>
      </tr>
      <tr align="center">
        <td>Ayam Bakar</td>
        <td>
          <input name="ayambakar" type="text"  value="" size="10" />
        </td>
        <td>Rp 33.000</td>
        <td><form id="form9" name="form9" method="post" action="">
          <label>
            <input type="submit" name="GAMBAR4" id="GAMBAR4" value="DETAIL" />
          </label>
        </form></td>
        <td>${validasi4}</td>
      </tr>
      <tr align="center">
        <td>Nila Bakar</td>
        <td>
          <input name="nilabakar" type="text"  value="" size="10" />
        </td>
        <td>Rp 23.000</td>
        <td><form id="form11" name="form10" method="post" action="">
          <label>
            <input type="submit" name="GAMBAR5" id="GAMBAR6" value="DETAIL" />
          </label>
        </form></td>
        <td>${validasi5}</td>
      </tr>
      <tr align="center">
        <th>MINUMAN</th>
        <th>JUMLAH</th>
        <th>HARGA</th>
        <th>INFO</th>
        <th>KETERANGAN</th>
      </tr>
      <tr align="center">
      <td>Soda Gembira</td>
        <td>
          <input name="odagembira" type="text"  value="" size="10" />
        </td>
        <td>Rp 10.000</td>
        <td><form id="form16" name="form16" method="post" action="">
          <label>
            <input type="submit" name="button" id="button" value="DETAIL" />
          </label>
        </form></td>
        <td>${validasi6}</td>
      </tr>
      <tr align="center">
      <td>Es Teh</td>
        <td>
          <input name="esthe" type="text"  value="" size="10" />
        </td>
        <td>Rp 2.000</td>
        <td><form id="form17" name="form17" method="post" action="">
          <label>
            <input type="submit" name="button2" id="button2" value="DETAIL" />
          </label>
        </form></td>
        <td>${validasi7}</td>
      </tr>
      <tr align="center">
       <td>Es Jeruk</td>
        <td>
          <input name="eseyuk" type="text"  value="" size="10" />
        </td>
        <td>Rp 4.000</td>
        <td><form id="form18" name="form18" method="post" action="">
          <label>
            <input type="submit" name="button3" id="button3" value="DETAIL" />
          </label>
        </form></td>
        <td>${validasi8}</td>
      </tr>
      <tr align="center">
       <td>Es Dawet</td>
        <td>
          <input name="esawet" type="text"  value="" size="10" />
        </td>
        <td>Rp 5.000</td>
        <td><form id="form19" name="form19" method="post" action="">
          <label>
            <input type="submit" name="button4" id="button4" value="DETAIL" />
          </label>
        </form></td>
        <td>${validasi9}</td>
      </tr>
      </table>
      </div>
        <p>&nbsp;</p>
        <input type='submit' class="elipse" value='Selesai' action='Dispatcher?page=bonValidasi'/> 
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
    